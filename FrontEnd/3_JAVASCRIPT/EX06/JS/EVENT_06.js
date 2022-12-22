window.addEventListener("load",function(){
    let section = document.querySelector("#section1");
    let container = section.querySelector("#container");
    let box = section.querySelector("#box");
    let dragging = false;
    let boxXY = {x:0, y:0};

    container.onmousedown = function(e) {
        if (e.target == box) {
            // 선택된 것이 box일 경우만 dragging 가능토록 함.
            dragging = true;
        }
    }
    container.onmouseup = function(e) {
        dragging = false;
    }
    container.onmousemove = function(e) {
        if (dragging) {
            box.style.left = e.x - boxXY.x + "px";
            box.style.top = e.y - boxXY.y + "px";
        }
    }
    box.onmousedown = function(e) {
        boxXY.x = e.offsetX;
        boxXY.y = e.offsetY;
    }
})