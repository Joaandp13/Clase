console.log('Happy developing ✨')
const hola = document.getElementById('hola');
const img = document.getElementById('imagen');
hola.innerHTML = hola.innerText;

const btn1 = document.getElementById('btn1');
const btn2 = document.getElementById('btn2');
const textoOriginal= hola.innerText;
let bandera= true;
btn1.addEventListener('click', () => {

    if (bandera) {
        hola.innerHTML = "<b>Adios</b>"
        img.style.display = "block";

        bandera = false;
    } else {
        hola.innerHTML = textoOriginal;
        img.style.display = "none";
        bandera =true;
    }
})





