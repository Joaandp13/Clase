"use strict";

function arraynumerosrandom(min, max, cantidad) {
    let randnum = [];
    for (let i = 0; i < cantidad; ++i) {
        randnum.push(Math.floor(Math.random() * (max - min + 1)) + min);
    }
    return randnum;
}

function comptarnvalorarray(valor, array) {
    let n = 0;
    for (let i = 0; i < array.length; i++) {
        if (array[i] == valor) n++;
    }
    return n;
}

let numeros = arraynumerosrandom(0, 9, 20);

console.log(numeros.join(" "));

for (let i = 0; i <= 9; ++i) {
    let numeroveces = comptarnvalorarray(i, numeros);
    console.log(i + " --> " + numeroveces + " vegades");
}