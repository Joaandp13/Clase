"use strict";
let posicions = []

function arraynumerosrandom(min, max, cantidad) {
    //Esta funcion crea un array con numeros random
    let randnum = [];
    for (let i = 0; i < cantidad; ++i) {
        randnum.push(Math.floor(Math.random() * ((max + 1) - min)) + min)
    }
    return randnum;

}

function comptarnvalorarray(valor, array) {
    var n = 0;
    for (let i = 0; i < array.length; i++) {
        if (array[i] == valor) n++, posicions.push(i);

    }
    return n;
}

let arrayabuscar = arraynumerosrandom(0, 9, 40)

let n = prompt("Introdueix quin número entre 0 i 9 vols buscar:")

console.log(arrayabuscar)

console.log(comptarnvalorarray(n, arrayabuscar))

for (let i = 0; i < posicions.length; ++i) {
    console.log("Apareix a la posició: " + posicions[i])
}