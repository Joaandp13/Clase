"use strict";

let m = 4

let array = []
let contador = 1

// Primera parte: diagonal major
for (let i = 0; i < m; i++) {
    array[i] = []
    for (let j = 0; j < m; j++) {
        array[i][j] = contador
        contador++
        if (i == j) {
            array[i][j] = 1
        } else {
            array[i][j] = Math.abs(i - j) + 1;
        }
    }
}

let sumadiagonal = 0;

for (let i = 0; i < m; i++) {
    sumadiagonal += array[i][i]
}
console.table(array)
console.log("La suma de la diagonal major es: " + sumadiagonal)

let sumatrisup = 0;
let sumatriinf = 0;

for (let i = 0; i < m; i++) {
    for (let j = 0; j < m; j++) {
        if (j > i) {
            sumatrisup += array[i][j]
        }
    }
}

for (let i = 0; i < m; i++) {
    for (let j = 0; j < m; j++) {
        if (j < i) {
            sumatriinf += array[i][j]
        }
    }
}

console.log("La suma del triangle superior es: " + sumatrisup)
console.log("La suma del triangle inferior es: " + sumatriinf)

// Triangle superior amb 0
for (let i = 0; i < m; ++i) {
    for (let j = 0; j < m; ++j) {
        if (j > i) {
            array[i][j] = 0
        }
    }
}
console.table(array)

// Triangle inferior amb 0
for (let i = 0; i < m; i++) {
    for (let j = 0; j < m; j++) {
        if (j < i) {
            array[i][j] = 0
        }
    }
}
console.table(array)


// ---------------------------------------------------------------------------
//                          DIAGONAL INVERSA (NUEVA PARTE)
// ---------------------------------------------------------------------------

console.log("=== DIAGONAL INVERSA ===")

let array2 = []

// Rellenar segun diagonal inversa
for (let i = 0; i < m; i++) {
    array2[i] = []
    for (let j = 0; j < m; j++) {

        if (i + j == m - 1) {
            array2[i][j] = 1 // diagonal inversa
        } else {
            array2[i][j] = Math.abs((m - 1 - i) - j) + 1
        }

    }
}

console.table(array2)


// Suma diagonal inversa
let sumadiaginv = 0

for (let i = 0; i < m; i++) {
    sumadiaginv += array2[i][m - 1 - i]
}

console.log("La suma de la diagonal inversa es: " + sumadiaginv)


// Suma triangle superior (respecte diagonal inversa)
let sumatrisupinv = 0

for (let i = 0; i < m; i++) {
    for (let j = 0; j < m; j++) {
        if (j < (m - 1 - i)) {
            sumatrisupinv += array2[i][j]
        }
    }
}

console.log("La suma del triangle superior invers es: " + sumatrisupinv)


// Suma triangle inferior (respecte diagonal inversa)
let sumatriinfinv = 0

for (let i = 0; i < m; i++) {
    for (let j = 0; j < m; j++) {
        if (j > (m - 1 - i)) {
            sumatriinfinv += array2[i][j]
        }
    }
}

console.log("La suma del triangle inferior invers es: " + sumatriinfinv)


// Triangle superior inversa amb 0
for (let i = 0; i < m; i++) {
    for (let j = 0; j < m; j++) {
        if (j < (m - 1 - i)) {
            array2[i][j] = 0
        }
    }
}

console.table(array2)


// Triangle inferior inversa amb 0
for (let i = 0; i < m; i++) {
    for (let j = 0; j < m; j++) {
        if (j > (m - 1 - i)) {
            array2[i][j] = 0
        }
    }
}

console.table(array2)