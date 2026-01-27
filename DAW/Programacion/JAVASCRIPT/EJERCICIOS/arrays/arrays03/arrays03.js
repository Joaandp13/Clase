import {
    arraynumerosrandom
} from "../../../libreria.js";




let randnum = arraynumerosrandom(10000, 100, 1000);
let pares = [];
for (let i = 0; i < randnum.length; ++i) {
    if (randnum[i] % 2 == 0) {
        pares.push(randnum[i])
    }
    if (pares.length == 10)
        break;
}

console.log(pares)