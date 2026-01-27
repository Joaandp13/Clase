let n = parseInt(prompt("Introdueix un número enter positiu"))

for (let i = 1; i <= 10; i++) {
    document.getElementById("hola").innerHTML += (n + " x " + i + " = " + (n * i) + "<br>");
}