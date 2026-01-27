"use strict";
import {} from "../../../libreria.js";
let letras = []
let letrasrev = []
for (let i = 0; i < 10; ++i) {
    letras.push(String.fromCharCode((Math.floor(Math.random() * 25)) + 65))

}
for (let i = 0; i < 10; ++i) {
    letrasrev.push(letras[letras.length - (i + 1)])
}

console.log(letras)

console.log(letrasrev)