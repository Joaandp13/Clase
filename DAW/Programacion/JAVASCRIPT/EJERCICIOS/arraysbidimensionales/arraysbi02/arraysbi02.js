"use strict";

let notes = [];

for (let i = 0; i < 6; i++) {
    notes[i] = [];
    for (let j = 0; j < 4; ++j) {
        notes[i][j] = Math.floor(Math.random() * 11)
    }
}

console.log("            UF1  UF2  UF3  UF4");
for (let i = 0; i < 6; ++i) {
    let fila = `Alumne ${i + 1}   `;
    for (let j = 0; j < 4; ++j) {
        fila += notes[i][j].toString().padStart(4)
    }
    console.log(fila);
}

let mitjanaAlumnes = [];

for (let i = 0; i < 6; i++) {
    let suma = notes[i].reduce((acc, n) => acc + n, 0);
    mitjanaAlumnes[i] = suma / 4
}

console.log("\nMitjanes alumnes");
for (let i = 0; i < 6; i++) {
    console.log(`Alumne ${i+ 1}   ${mitjanaAlumnes[i].toFixed(1)}`);
}

let mitjanaUF = [];
for (let j = 0; j < 4; j++) {
    let suma = 0;
    for (let i = 0; i < 6; ++i) {
        suma += notes[i][j];
    }
    mitjanaUF[j] = suma / 6;
}

console.log("\nMitjanes UFs");
for (let j = 0; j < 4; j++) {
    console.log(`UF ${j+1}   ${mitjanaUF[j].toFixed(1)}`);
}