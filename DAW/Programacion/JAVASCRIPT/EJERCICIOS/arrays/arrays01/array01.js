"use strict";

let notes = [];

function asknotes() {
    for (let i = 1; i <= 6; i++) {
        let nota = parseFloat(prompt("Introdueix nota UF" + i + " entre 1 i 10: "));
        while (isNaN(nota) || nota < 1 || nota > 10) {
            nota = parseFloat(prompt("Introdueix una nota vàlida per a UF" + i + " (entre 1 i 10): "));
        }
        notes.push(nota);
    }
    return notes;
}

let suma;
let media;

function procesarnotes() {
    if (Math.min(...notes) < 5) {
        alert("No aproves el mòdul");
    } else {
        suma = 0;
        for (const num of notes) {
            suma += num;
        }
        media = suma / notes.length;
        mostrarnotes();
        return media;
    }
}

function mostrarnotes() {
    alert(
        "Nota mínima: " + Math.min(...notes) + "\n" +
        "Nota màxima: " + Math.max(...notes) + "\n" +
        "Nota mitjana: " + media.toFixed(2)
    );
}

asknotes();
procesarnotes();