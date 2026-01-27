function process(casos) {
    for (let n of casos) {

        if ((n != 0 || n >= 1000)) {
            if (n % 2 == 0) {
                console.log("DERECHA")
            } else console.log("IZQUIERDA");
        }
    }
}

process([2, 15, 1, 2, 33, 3, 6])