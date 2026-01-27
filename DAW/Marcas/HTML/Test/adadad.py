import os
import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin, urlparse
import zipfile

# URL base
base_url = 'https://sapalomera.cat/moodlecf/apunts/daw/prog/uf1/exercicis'

# Carpeta para guardar HTML
folder = 'html_files'
os.makedirs(folder, exist_ok=True)

# Función para guardar contenido HTML en archivo
def save_html(url, folder):
    try:
        r = requests.get(url)
        r.raise_for_status()
        # Crear un nombre de archivo a partir de la url
        path = urlparse(url).path
        if path.endswith('/'):
            path += 'index.html'
        filename = path.strip('/').replace('/', '_')
        if not filename.endswith('.html'):
            filename += '.html'
        filepath = os.path.join(folder, filename)

        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(r.text)
        print(f"Guardado: {url} como {filename}")
        return filepath, r.text
    except Exception as e:
        print(f"Error al descargar {url}: {e}")
        return None, None

# Descargar la página principal
main_path, main_html = save_html(base_url, folder)

# Extraer todos los enlaces a archivos HTML relativos o absolutos dentro del dominio
soup = BeautifulSoup(main_html, 'html.parser')
links = set()
for a in soup.find_all('a', href=True):
    href = a['href']
    # Construir URL absoluta
    full_url = urljoin(base_url, href)
    # Filtrar solo URLs que estén dentro del dominio y terminen en .html o no tengan extensión (posiblemente html)
    if full_url.startswith('https://sapalomera.cat/moodlecf/apunts/daw/prog/uf1/exercicis'):
        parsed_href = urlparse(full_url).path
        if parsed_href.endswith('.html') or parsed_href.endswith('/'):
            links.add(full_url)

# Descargar cada página HTML enlazada
for link in links:
    save_html(link, folder)

# Crear ZIP con los archivos HTML
zip_name = 'html_files.zip'
with zipfile.ZipFile(zip_name, 'w') as zipf:
    for root, dirs, files in os.walk(folder):
        for file in files:
            if file.endswith('.html'):
                zipf.write(os.path.join(root, file))

print(f"\nTodos los archivos HTML se han comprimido en {zip_name}")
