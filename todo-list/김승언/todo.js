// HTML 문서가 로드될 때 실행될 함수 정의
document.addEventListener("DOMContentLoaded", function () {
  const todoInput = document.getElementById("todoInput"); // 할일 입력 필드
  const addTodoBtn = document.getElementById("addTodoBtn"); // 추가 버튼
  const todoList = document.getElementById("todoList"); // 할일 목록
  // 초기 할일 목록
  let basicDatas = [
    { id: 1, title: "Todo 1", done: false },
    { id: 2, title: "Todo 2", done: true },
  ];

  //
  function showTodos() {
    todoList.innerHTML = "";
    basicDatas.forEach((todo) => {
      const li = document.createElement("li");
      li.textContent = todo.title;
      if (todo.done) {
        li.style.textDecoration = "line-through";
        li.style.color = "#adb5bd";
      }
      const deleteBtn = document.createElement("button");
      deleteBtn.textContent = "X";
      deleteBtn.classList.add("delete-btn");
      deleteBtn.addEventListener("click", () => deleteTodo(todo.id));
      li.appendChild(deleteBtn);
      li.addEventListener("click", () => toggleDone(todo.id));
      todoList.appendChild(li);
    });
  }

  // 추가
  function addTodo() {
    const newTodoTitle = todoInput.value;
    if (newTodoTitle) {
      const newTodo = {
        id: basicDatas.length + 1,
        title: newTodoTitle,
        done: false,
      };
      basicDatas.push(newTodo);
      showTodos();
      todoInput.value = "";
    }
  }

  // Done 토글
  function toggleDone(id) {
    const todoIndex = basicDatas.findIndex((todo) => todo.id === id);
    if (todoIndex !== -1) {
      // 현재의 done 상태를 반대로 변경
      basicDatas[todoIndex].done = !basicDatas[todoIndex].done;
      showTodos();
    }
  }

  // 삭제
  function deleteTodo(id) {
    basicDatas = basicDatas.filter((todo) => todo.id !== id);
    showTodos();
  }

  addTodoBtn.addEventListener("click", addTodo);

  // enter키 입력으로 할일 추가
  todoInput.addEventListener("keydown", function (event) {
    if (event.key === "Enter") {
      addTodo();
    }
  });

  showTodos();
});
