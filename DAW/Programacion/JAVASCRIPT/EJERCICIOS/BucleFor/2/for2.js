for (let i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
        alert(i + " és múltiple de 2")
    }
    if (i % 3 == 0) {
        alert(i + " és multiple de 3")
    }
    if (i % 5 == 0) {
        alert(i + " és multiple de 5")
    }
}

for (let i = 1; i <= 100; i++) {
    if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
        alert(i + " és multiple de 2, 3 i 5")
    }
}