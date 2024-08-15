public class Task {
    private String title;
    private boolean isCompleted;

    // Constructeur
    public Task(String title) {
        this.title = title;
        this.isCompleted = false; // Par défaut, la tâche n'est pas terminée
    }

    // Méthodes getter et setter
    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    // Méthode pour afficher la tâche
    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + title;
    }
}
