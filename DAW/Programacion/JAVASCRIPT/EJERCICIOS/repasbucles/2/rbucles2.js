let cara2 = 0;
let creu2 = 0;
let caraCreu = 0;
let moneda1;
moneda2;

for (let i = 0; i < 1000000; ++i) {
    moneda1 = Math.floor(Math.random() * 2)
    moneda2 = Math.floor(Math.random() * 2)

    if (moneda1 == 0 && moneda2 == 0) ++cara2;
    else if (moneda1 == 1 && moneda2 == 1) ++creu2;
    else ++caraCreu;

}

alert("Cares: " + cara2 * 100 / 1000000)
alert("Creus: " + creu2 * 100 / 1000000)
alert("Cara i creu:" + caraCreu * 100 / 1000000)