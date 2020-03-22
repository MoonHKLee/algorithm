function getData () {
    var n1 = document.getElementById("name");
    var n2 = document.getElementById("n2");
    var n3 = document.getElementById("n3");
    var n4 = document.getElementById("n4");
    var n5 = document.getElementById("n5");
    var list = [n1,n2,n3,n4,n5];
    var answers = list.filter(v=>v.checked===true).map(v=>v.value);
    return {answers:answers}
}

function submit () {
    var data = getData();
    fetch('/submit', {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(data)
    })
        .then(res => res.json())
        .then(ret => {
            if(ret){
                document.getElementById("result").innerHTML = '정답입니다.';
            }else{
                document.getElementById("result").innerHTML = '오답입니다.';
            }
        })
        .catch(error => console.error('Error:', error));
};