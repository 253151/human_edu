window.addEventListener("load",function(){
    let btn = document.querySelector("#add");
    btn.onclick = function() {

        let section = document.querySelector("#section1");
        let inputX = section.querySelector ("#txt1");
        let inputY = section.querySelector ("#txt2");
        console.log(inputX);
        console.log(inputX.value);

        let x,y;
        x=parseInt(inputX);
        y=parseInt(inputY);
        sum.value = x+y;


    };
});