"use strict";

export function arraynumerosrandom(min, max, cantidad) {
    //Esta funcion crea un array con numeros random
    let randnum = [];
    for (let i = 0; i < cantidad; ++i) {
        randnum.push(Math.floor(Math.random() * ((max + 1) - min)) + min)
    }
    return randnum;

}


export function comptarnvalorarray(valor, array) {
    var n = 0;
    for (let i = 0; i < array.length; i++) {
        if (array[i] == valor) n++;
    }
    return n;
}

export function generarArrayBi(f, c) {

    let a = [];

    for (let i = 0; i < f; ++i) {
        a[i] = [];
        for (let j = 0; j < c; ++j) {
            a[i][j] = 0;
        }
    }

    return a;
}