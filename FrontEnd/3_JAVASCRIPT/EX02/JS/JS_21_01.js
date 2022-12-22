// window.onload = function() {
window.addEventListener("load",function() {
let btn = window.document.getElementById("btnInput");
btnInput.onclick = function() {
let x,y;
x=eval(prompt("x값입력"),0);
y=eval(prompt("y값입력"),0);

btnInput.value = x+y;
btnInput.type = "text";
};
});