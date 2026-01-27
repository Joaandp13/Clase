let r1 = 0,
    r2 = 0,
    r3 = 0,
    r4 = 0,
    r5 = 0,
    r6 = 0;

let dau;

for (let i = 1; i <= 1000000; i++) {
    dau = Math.floor(Math.random() * 6) + 1;

    switch (dau) {
        case 1:
            ++r1;
            break;
        case 2:
            ++r2;
            break;
        case 3:
            ++r3;
            break;
        case 4:
            ++r4;
            break;
        case 5:
            ++r5;
            break;
        case 6:
            ++r6;
            break;
    }
}

alert("El dau 1 ha sortit un " + (r1 / 10000) + "% de les vegades");
alert("El dau 2 ha sortit un " + (r2 / 10000) + "% de les vegades");
alert("El dau 3 ha sortit un " + (r3 / 10000) + "% de les vegades");
alert("El dau 4 ha sortit un " + (r4 / 10000) + "% de les vegades");
alert("El dau 5 ha sortit un " + (r5 / 10000) + "% de les vegades");
alert("El dau 6 ha sortit un " + (r6 / 10000) + "% de les vegades");