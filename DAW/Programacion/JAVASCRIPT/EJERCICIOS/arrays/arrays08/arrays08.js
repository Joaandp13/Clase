"use strict";


let llista = [22, 34, 33, 2, 1, 444, 555, 33, 22]

for (let i = 0; i < llista.length - 1; ++i) {
    console.log((llista[i] + llista[i + 1]))
}
console.log("")

for (let i = 0; i < llista.length / 2; ++i) {
    console.log((llista[i] + llista[llista.length - 1 - i]))
}