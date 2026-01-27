"use strict";

let lista1 = [5, 5, 5, 5, 5, 5, 5]
let lista2 = [6, 6, 6, 6]

let listacombi = []


let max = Math.max(lista1.length, lista2.length)

for (let i = 0; i < max; i++) {
    if (i < lista1.length) listacombi.push(lista1[i])
    if (i < lista2.length) listacombi.push(lista2[i])
}

alert(listacombi)