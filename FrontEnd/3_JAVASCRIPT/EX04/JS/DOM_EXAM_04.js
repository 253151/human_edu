window.addEventListener("load", function(){
    let section = document.getElementById("section1");
    let srcInput = section.querySelector("#src-input");
    let imgList = section.querySelector("#img-list");
    let changeButton = section.querySelector("#change-button");
    let img = section.querySelector(".img");
    let colorInput = section.querySelector("#color-input");
    

    changeButton.onclick = function() {
        // img.src = srcInput.value;
        img.src = "IMGS/" + srcInput.value +".jpg";
        img.style['border-color'] = colorInput.value;
        console.log(img.style);
        console.log(img.style['border-color']);
      
    }
});