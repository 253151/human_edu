window.addEventListener("load",function(){
    let section = document.querySelector("#section1");
    let fileButton = section.querySelector ("#file-button");
    let fileTrigger = section.querySelector ("#file-trigger");

    fileButton.onclick=function(e) {

    }
    fileTrigger.onclick = function(e) {
        console.log(e);
        let event = new MouseEvent("click",{
            'view' : window,
            'bubbles' : true, //버블링 처리를 하는 이벤트
            'cancelable' : true // 취소가 가능한지?
        });
        fileButton.dispatchEvent(event);
        // 이런 방식을 trigger라고 함.
    }
});