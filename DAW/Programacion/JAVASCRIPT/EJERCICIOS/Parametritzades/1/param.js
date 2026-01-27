let sinici = 0,
    hores, minuts, segons, estring;

function demanarparam() {

    do {
        sinici = parseInt(prompt("Introdueix el número de segons a convertir a format HH:MM:SS : "), 10);
    } while (sinici <= 0 || sinici >= 360000);

    return sinici;
}

function convertinum() {
    let hores = Math.floor(sinici / 3600);
    let minuts = Math.floor((sinici % 3600) / 60);
    let segons = sinici % 60;
    estring = (hores + ":" + minuts + ":" + segons)
    return segons;

}

function mostrar() {
    alert(estring);
}
demanarparam();
convertinum();
mostrar();