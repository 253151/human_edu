window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
    let imgs = section.querySelectorAll(".imgs");
    let currentImg = section.querySelector("#current-img");
    let imgList = section.querySelector("#img-list");

    imgList.onclick = function(e) {
        // 버블링 효과로 인해서 하위 객체에서 발생한 event를
        // 상위객체에서 확인 가능함.
        console.log(e);
        if (e.target.tagName == 'IMG') {
            currentImg.src = e.target.src;
        }

    }

});