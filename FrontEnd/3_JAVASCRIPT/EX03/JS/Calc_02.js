window.addEventListener("load",function(){
    let btn = document.getElementById("add");
    btn.onclick = function() {

        let section = this.document.getElementById("section1");
        let inputs = section.getElementsByTagName ("input");
        console.log(inputs);
        console.log(inputs[0]);

        let x,y;
        x=parseInt(inputs[0].value);
        y=parseInt(inputs[1].value);

        sum.value = x+y;
    };
});