import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;

    // Constructeur
    public TodoList() {
        tasks = new ArrayList<>();
    }

    // Ajouter une tâche
    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    // Supprimer une tâche par son index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Index invalide");
        }
    }

    // Marquer une tâche comme terminée
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        } else {
            System.out.println("Index invalide");
        }
    }

    // Afficher toutes les tâches
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("La liste est vide.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }
}
