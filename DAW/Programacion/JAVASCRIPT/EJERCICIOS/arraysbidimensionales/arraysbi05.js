"use strict";
let mensajefinalfalse = "No és quadrat magic.";
let totsumafila = 0;
let sumafila = true;
let currentfila = 0;
let m = 0;
let sumadiag = true;
let flagfila;
let flagcol;
let flagdiag;
let flagmxm;
let matriz;

function funsumafila() {
    for (let i = 0; i < matriz.length; ++i) {
        for (let j = 0; j < matriz.length; ++j) {
            if (i === 0) {
                totsumafila += matriz[i][j];
            }
            currentfila += matriz[i][j];
        }
        if (totsumafila !== currentfila) {
            sumafila = false;
        }
        currentfila = 0;
    }
    if (!sumafila) {
        mensajefinalfalse += ("\n- La suma de les files no és igual.");
    }
    return sumafila;
}

function funsumacol() {
    var totsumacol = 0;
    var currentcol = 0;
    let sumacol = true;
    for (let j = 0; j < matriz.length; ++j) {
        for (let i = 0; i < matriz.length; ++i) {
            if (j === 0) {
                totsumacol += matriz[i][j];
            }
            currentcol += matriz[i][j];
        }
        if (totsumacol !== currentcol) {
            sumacol = false;
        }
        currentcol = 0;
    }
    if (!sumacol) {
        mensajefinalfalse += ("\n- La suma de les columnes no és igual.")
    }
    return sumacol;
}

function fundiageq() {
    var sumaDP = 0;
    var sumaDInv = 0;

    for (let i = 0; i < matriz.length; i++) {
        sumaDP += matriz[i][i];
    }
    for (let i = 0; i < matriz.length; i++) {
        sumaDInv += matriz[i][matriz.length - 1 - i];
    }
    if (sumaDP != sumaDInv) {
        sumadiag = false;
        mensajefinalfalse += ("\n- La suma de les diagonals no és igual.")
    }
    return sumadiag;
}

function funmxm() {
    let necessaris = new Set();
    for (let i = 1; i <= m * m; i++) necessaris.add(i);

    for (let i = 0; i < m; i++) {
        for (let j = 0; j < m; j++) {
            necessaris.delete(matriz[i][j]);
        }
    }

    if (necessaris.size > 0) {
        mensajefinalfalse += "\n- No conté tots els números de l'1 al MxM.";
        return false;
    }
    return true;
}


do {
    m = prompt("Introdueix el numero de files i columnes: ");
    matriz = [];

    for (let i = 0; i < m; ++i) {
        matriz[i] = [];
        for (let j = 0; j < m; ++j) {
            matriz[i][j] = Number(prompt("Introdueix el següent número: "));
        }
    }

    mensajefinalfalse = "No és quadrat magic.";
    sumafila = true;
    sumadiag = true;
    totsumafila = 0;
    currentfila = 0;

    flagfila = funsumafila();
    flagcol = funsumacol();
    flagdiag = fundiageq();
    flagmxm = funmxm();

    if (!flagfila || !flagcol || !flagdiag || !flagmxm)
        console.log(mensajefinalfalse);
    else {
        console.log("El quadrat es màgic.")
    }

} while (m != 0);