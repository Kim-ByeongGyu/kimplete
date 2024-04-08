let basicDatas = [
    {id : 1, title: "Todo1", done: false},
    {id : 2, title: "Todo2", done: true},
];
const todoBtn = document.getElementById('todoBtn');
const ul = document.querySelector('ul');
const todo = document.getElementById('input');

todoBtn.addEventListener('click',() => {            
    const li = document.createElement('li');
    const text = document.createTextNode(todo.value);
    basicDatas.push({id : basicDatas.length + 1, title : text, done : false});
    li.appendChild(text);
    ul.appendChild(li);
    todo.value = "할 일...";
    basicDatas.forEach(data => {
        console.log(data.title);
    })
});

const list = document.getElementsByTagName('li')
for (let i = 0; i < list.length; i++){
    list[i].addEventListener('click',(e) => {
        console.log(i);
        if(basicDatas[i].done === false){
            basicDatas[i].done = true;
            list[i].classList.add("checked");
            basicDatas.forEach(data => {
                console.log(data.done);
            });
        }
        else{
            basicDatas[i].done = false;
            list[i].classList.remove("checked");
            basicDatas.forEach(data => {
                console.log(data.done);
            });
        }
        e.stopPropagation();
    });
}
