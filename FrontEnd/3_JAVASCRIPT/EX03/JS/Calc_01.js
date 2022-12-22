window.addEventListener("load", function() {
    let btnAdd = window.document.getElementById("add");
    btnAdd.onclick = function(){
        let x,y;
        x=parseInt(document.getElementById("txt1").value);
        y=parseInt(document.getElementById("txt2").value);
        sum.value = x+y;

    };

});