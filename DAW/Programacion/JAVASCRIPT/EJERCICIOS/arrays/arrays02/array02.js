"use strict";
let notas = [];
let aprovades = [];
let mitjana;

function asknotes() {
    for (let i = 1; i <= 10; ++i) {
        let n = parseInt(prompt("Introdueix una nota del 1 al 10: "));
        if (isNaN(n) || n < 1 || n > 10) {
            console.log("Introdueix un número del 1 al 10");
            --i;
            continue;
        }
        notas.push(n);
    }
    procesarnotes(notas);
}

let totalnotas = 0;

function procesarnotes(note) {
    for (let num of note)
        totalnotas += num;
    mitjana = totalnotas / note.length;

    for (let num of note)
        if (num >= 5) {
            aprovades.push(num)
        }
    alert("Aprovades: " + aprovades.length + "\nSuspeses: " + (note.length - aprovades.length) + "\nNotes dels aprovats: " + aprovades + "\nMitjana de les aprovades: " + mitjana)

}

asknotes();