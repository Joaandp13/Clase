let any, x

function entradadades() {
    any = prompt("Introdueix un any a comprobar: ")
    return any;
}

function comprovar() {
    if ((any % 4) == 0) {
        x = true

    }
    return x;
}

function salida() {
    if (x == true) {
        alert(any + " és un any de traspàs.")
    } else(alert(any + " no és un any de traspàs."))
}
entradadades();
comprovar();
salida();