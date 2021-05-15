import java.util.ArrayList;
import java.util.List;

public class Todo {

    String id;
    String tittle;
    String text;
    Person assignee;
    boolean completed = false;

    public Todo(String id, String tittle, String text, Person assignee) {
        this.id = id;
        this.tittle = tittle;
        this.text = text;
        this.assignee = assignee;
    }

    public void editTodoItem(Todo todo)   {
       todo.setAssignee(todo.getAssignee());
       todo.setText(todo.getText());
       todo.setTittle(todo.getTittle());
       if (todo.isCompleted()) {
           return;
       }
       todo.setCompleted(true);
    }

    public void sendNotification(Person person, Todo todo) {
        if (todo.isCompleted()) {
            notify();
        }
    }

    public List<Todo> getTodoList() {
        Todo todoA= new Todo("123", "Meeting", "Test 234", getAssignee());
        Todo todoB= new Todo("124", "Meeting A", "Test 234", getAssignee());
        Todo todoC= new Todo("125", "Meeting B", "Test 234", getAssignee());
        List<Todo> todoList = new ArrayList<>();
        todoList.add(todoA);
        todoList.add(todoB);
        todoList.add(todoB);
        return todoList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
