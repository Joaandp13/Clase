"use strict";
let c = [
    [3, 5, 6, 7, 8],
    [2, 4, 5, 7, 9],
    [1, 4, 0, 7, 3],
    [2, 5, 6, 8, 4]
]

function problema1(array) {
    var calrevisio = false;
    var arrayordenat
    for (let i = 0; i < array.length; ++i) {
        for (let j = 0; j < array[i].length; ++j) {
            if (array[i][j] > 8 || array[i][j] < 4) {
                calrevisio = true
            }
        }
    }

    arrayordenat = array.flat()
    arrayordenat.sort((a, b) => a - b)
    arrayordenat = arrayordenat.join(",")
    if (calrevisio) {
        alert("Cal revisar les tensions del cercat!" + "\nTensions del tancat: " + arrayordenat)
    } else {
        alert("El cercat funciona correctament!" + "\nTensions del tancat: " + arrayordenat)
    }
}



let v = ['Frisona,640', 'Llemosina 710', 'Bruna-670'];

function problema2(array) {
    const regles = /^[A-Z][a-z]{4,10}[ ,\-](6\d{2}|7[0-4]\d|750)$/;
    let acumulador = {};

    for (let i = 0; i < array.length; ++i) {

        if (regles.test(array[i]) == false) {
            alert("Hi ha alguna dada erronea ")
            break;
        }

        const separacio = array[i].split(/[ ,\-]/);
        const nombre = separacio[0];
        const numero = parseInt(separacio[1]);

        if (acumulador[nombre] === undefined) {
            acumulador[nombre] = numero;
        } else {
            acumulador[nombre] += numero;
        }
    }


    let resultat = "";
    for (const nombre in acumulador) {
        resultat += nombre + ":" + acumulador[nombre] + "\n";
    }

    alert(resultat)
}
ciutats = ['Barcelona', 'Girona', 'Lleida', 'Tarragona', 'Saragossa', 'Terol']
distancies = [
    [0, 100, 156, 98, 296, 409],
    [100, 0, 256, 198, 396, 509],
    [156, 256, 0, 91, 140, 319],
    [98, 198, 91, 0, 231, 311],
    [296, 396, 140, 231, 0, 181],
    [409, 509, 319, 311, 181, 0]
]

function problema3(a, b) {


    let ciutat1 = prompt("Introdueix la primera ciutat: ")
    let ciutat2 = prompt("Introdueix la segona ciutat: ")
    ciutat1 = ciutat1.charAt(0).toUpperCase() + ciutat1.slice(1).toLowerCase();
    ciutat2 = ciutat2.charAt(0).toUpperCase() + ciutat2.slice(1).toLowerCase();
    let i = a.indexOf(ciutat1)
    let j = a.indexOf(ciutat2)
    if (i === -1 || j === -1) {
        alert("Alguna ciutat no es correcta!")
        return;
    }


    let distancia = b[i][j]
    alert(distancia)
}
problema1(c)
problema2(v)
problema3(ciutats, distancies)