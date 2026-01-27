function generarArrayBi() {
    let fc = prompt("Introdueix el nombre de files i columnes de la matriu: ");
    let [f, c] = fc.split(" ").map(Number);

    let a = [];

    for (let i = 0; i < f; ++i) {
        a[i] = [];
        for (let j = 0; j < c; ++j) {
            a[i][j] = i * j;
        }
    }

    return a;
}

let a = generarArrayBi();
console.log(a);