let s = "Skibidi Toilet!";

let i, l = s.length - 1;

for (i = l; i >= 0; i--) {
    console.log(s.charAt(i));
}

let s2 = "";

for (i = l; i >= 0; i--) {
    s2 += s.charAt(i);
}
alert(s2);