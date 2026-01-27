let naster = prompt("Quants asteriscos vols?");
let resultat = "";

for (let i = 1; i <= naster; i++) {
    for (let z = 1; z <= i; z++) {
        resultat += "*";
    }
    resultat += "<br>";
}

document.getElementById("hola").innerHTML = resultat;