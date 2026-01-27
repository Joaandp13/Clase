"use strict";

function generarArrayBi(f, c) {

    let a = [];

    for (let i = 0; i < f; ++i) {
        a[i] = [];
        for (let j = 0; j < c; ++j) {
            a[i][j] = 0;
        }
    }

    return a;

}
let menjars = [];
let hobbies = [];

let taula = generarArrayBi(5, 3);

while (menjars.length != 6) {
    menjars.push(prompt("Introdueix un menjar: "));
}

while (hobbies.length != 4) {
    hobbies.push(prompt("Introdueix un hobby: "));
}

for (let i = 0; i < 5; i++) {
    for (let j = 0; j < 3; j++) {
        let randhob = Math.floor(Math.random() * 4);
        let randmen = Math.floor(Math.random() * 6);
        taula[i][j] = menjars[randmen] + " | " + hobbies[randhob];
    }
}

// -------------------------------
//    MOSTRAR TAULA EN CONSOLA
// -------------------------------

let dies = ["Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres"];
let menjades = ["Esmorzar", "Dinar", "Sopar"];

let tablaConsole = [];

for (let i = 0; i < 5; i++) {
    let fila = {
        Dia: dies[i]
    };
    for (let j = 0; j < 3; j++) {
        fila[menjades[j]] = taula[i][j];
    }
    tablaConsole.push(fila);
}

console.table(tablaConsole);