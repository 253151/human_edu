window.addEventListener("load",function() {
    let section =document.querySelector("#section");
    let cloneButton =document.querySelector("#clone-button");
    let inputButton =document.querySelector("#input-button");
    let templateButton =document.querySelector("#templete-button");
    let noticeList = section.querySelector(".notice-list");
    let tbodyNode = section.querySelector("tboody");

    let notices = [
                {"id":5, "title":"가입인사2", "contents":"안녕하세요1", "writer":"강@혁"},
                {"id":6, "title":"가입인사3", "contents":"안녕하세요2", "writer":"강@우"}
                ];
    templateButton.onclick = function() {
        let tempNode = section.querySelector("template");   // template 태그를 선택
        console.log(tempNode);
        let cloneNode = document.importNode(tempNode.content, true);
        console.log(cloneNode);
    }
});