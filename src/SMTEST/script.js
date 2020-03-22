// const challenge = {
//     addData: async function(name, description) {
//         fetch('/api/todolist', {
//             method: 'PUT',
//             headers: {
//                 'Content-Type': 'application/json'
//             },
//             body: JSON.stringify({
//                 name: document.getElementById("name").value,
//                 description: document.getElementById("description").value,
//             })
//         }).then(function(response) {
//             return response.json();
//         }).then(function(data) {
//             const tr = document.createElement('tr');
//             tr.setAttribute('index',data)
//             const td1 = document.createElement('td').innerHTML = document.getElementById("name").value;
//             const td2 = document.createElement('td').innerHTML = document.getElementById("description").value;
//             const td3 =
//         });
//     },
//
//     removeData: function(index) {
//         // 먼저 서버 쪽에 데이터 삭제 요청을 합니다.
//         //
//         fetch('/api/todolist/:index', {
//             method: 'DELETE',
//             headers: {
//                 'Content-Type': 'application/json'
//             },
//             body: JSON.stringify({
//
//             })
//         }).then(function(response) {
//             return response.json();
//         }).then(function(data) {
//             // Table에서 index 값으로 찾아 데이터를 삭제해줍니다.
//             //
//         });
//     }
// }