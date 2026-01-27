"use strict";

let mettip;
let capacitat;
let bandeja;
let totalb;
let cumplemet, cumpletipus;

function demanardades() {
    while (true) {
        mettip = prompt("Introdueix la quantitat màxima dictada pel metge i quants tipus de polvorons hi ha (ex: '5 3')").split(" ").map(Number);

        if (mettip[mettip.length - 2] === 0 && mettip[mettip.length - 1] === 0) {
            alert("Sortint...");
            break;
        }

        totalb = 0;
        cumplemet = false;
        cumpletipus = false;

        capacitat = [];
        while (capacitat.length != mettip[1]) {
            capacitat = prompt(`Introdueix la capacitat màxima de cada tipus separada per espais (necessites ${mettip[1]} valors):`).split(" ").map(Number);
        }

        bandeja = [];
        while (bandeja.length != mettip[1]) {
            bandeja = prompt(`Introdueix la quantitat de polvorons de cada tipus a la bandeja (necessites ${mettip[1]} valors):`).split(" ").map(Number);
        }

        for (let n of bandeja) {
            totalb += n;
        }

        if (totalb > mettip[0]) cumplemet = true;

        for (let i = 0; i < capacitat.length; i++) {
            if (bandeja[i] > capacitat[i]) cumpletipus = true;
        }

        if (cumplemet || cumpletipus) {
            console.log("NO");
        } else {
            console.log("SI");
        }
    }

    return mettip;
}

demanardades();
console.log(mettip);