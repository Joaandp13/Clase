let cares = 0;
let creus = 0;

let moneda;
for (let i = 1; i <= 1000; ++i) {
    moneda = Math.floor(Math.random() * 2)
    if (moneda == 0) ++cares
    else ++creus;
}

alert("Cares: " + cares + " Creus:" + creus)