"use strict";
import {} from "../../../libreria.js";

let lista = []
let asc = false;
let desc = false;
let unor = false;
for (let i = 0; i < 10; ++i) {
    lista.push(parseInt(prompt("Introdueix un número: ")))
}
/*
for (let i = 0; i < 10; ++i) {
    if (lista[i] > lista[i + 1]) {
        desc = true;
        asc = false;
    }
    if (lista[i] < lista[i + 1]){
        asc =true;
        desc=false
    }
}
    */

for (let i = 0; i < 10; ++i) {
    if (lista[i] < lista[i + 1]) {
        asc = true;
    }
    if (lista[i] > lista[i + 1]) {
        desc = true;
    }
}

if (asc == true && desc == false) {
    console.log("La llista es ascendent.")
}
if (desc == true && asc == false) {
    console.log("La llista es descendent.")
}
if (asc == true && desc == true) {
    console.log("La llista està desordenada.")
}
if (asc == false && desc == false) {
    console.log("Tots els números son iguals.")
}
console.log(lista)