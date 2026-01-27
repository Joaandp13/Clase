from graphviz import Digraph

# Crear diagrama
dot = Digraph(comment="Esquema E/R Eleccions", format="png")
dot.attr(rankdir="LR", size="10")

# Entitats principals
dot.node("Partit", "Partit\n(PK: Sigles)")
dot.node("Provincia", "Província\n(PK: CodiProvíncia)")
dot.node("Circ", "Circumscripció\n(PK: NomCirc)\nNºEscons")
dot.node("Municipi", "Municipi\n(PK: CodiMunicipi)")
dot.node("Ciutada", "Ciutadà\n(PK: DNI)")
dot.node("Mesa", "Mesa Electoral\n(PK: CodiMunicipi, Districte, Secció, Mesa)")
dot.node("Llista", "Llista\n(PK: IdLlista)")
dot.node("Candidat", "Candidat\n(PK: DNI)")
dot.node("Vots", "Vots\n(PK: Mesa,Llista)")

# Relacions
dot.edge("Circ", "Provincia", label="1:1")
dot.edge("Municipi", "Provincia", label="N:1")
dot.edge("Ciutada", "Municipi", label="N:1")
dot.edge("Mesa", "Municipi", label="N:1")
dot.edge("Ciutada", "Mesa", label="N:1 (assignat)")
dot.edge("Ciutada", "Llista", label="N:1 (vota)")
dot.edge("Llista", "Partit", label="N:1")
dot.edge("Llista", "Circ", label="N:1")
dot.edge("Candidat", "Llista", label="N:1")
dot.edge("Candidat", "Partit", label="N:1")
dot.edge("Partit", "Candidat", label="1:1 (President)")
dot.edge("Vots", "Mesa", label="N:1")
dot.edge("Vots", "Llista", label="N:1")

# Exportar
output_path = "/mnt/data/esquema_er_eleccions"
dot.render(output_path, format="png", cleanup=True)

output_path + ".png"
