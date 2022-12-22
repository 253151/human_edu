window.addEventListener("load", function() {
    let section = document.querySelector("#section1");
    let upButton = section.querySelector("#up-button");
    let downButton = section.querySelector("#down-button");
    let noticeList = section.querySelector(".notice-list");

    let tbodyNode = section.querySelector("tbody");
    let currentNode = tbodyNode.firstElementChild;
    // firstElementChild는 첫번째 자식 엘리먼트.
    // currentNode는 style이 적용된 <tr> 태그를 의미함.

    upButton.onclick = function() {
        let prevNode = currentNode.previousElementSibling;
        tbodyNode.insertBefore(currentNode,prevNode);
    };
    downButton.onclick = function() {
        // 아래로의 버튼은 다음 형제 태그와 자리를 바꾸는 것을 의미함.
        let nextNode = currentNode.nextElementSibling;
        // nextNode는 다음 형제의 태그인 두번째 <tr>노드를 의미함.
        if (nextNode == null) {
            alert("더이상 이동할 수 없습니다.");
            return
        }
        tbodyNode.insertBefore(nextNode,currentNode);
        // insertBefore는 nextNode를 currentNode 앞으로 가져옴.
    };
})