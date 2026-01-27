let edat;

introduirDades();
let edat2 = processarDades(edat);
mostrarResultats();

function introduirDades() {
    // Codi per demanar les dades
    prompt("Introdueix la edat")
}

function processarDades(e) {
    // Codi per processar les dades
    return e * 2;
}
console.log(e)

function mostrarResultats() {
    // Codi per mostrar el resultat
    alert("Tens " + edat + " anys")
    alert("Tens " + edat2 + " anys")
}