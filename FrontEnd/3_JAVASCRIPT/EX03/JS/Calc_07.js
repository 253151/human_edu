window.addEventListener("load", function(){
    let btn = document.querySelector("#add");
    btn.onclick = function() {
        let box = document.getElementById("box");
        console.log(box.children);

        let inputX = box.children[0]; 
        let inputY = box.children[1]; 

        let x,y;
        x=parseInt(inputX.value);
        y=parseInt(inputY.value);
        box.children[3].value = x+y;
        
    };    
});