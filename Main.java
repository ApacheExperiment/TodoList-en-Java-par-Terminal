import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Forcer l'encodage UTF-8
        System.setProperty("file.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        
        TodoList todoList = new TodoList();
        boolean running = true;

        while (running) {
            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Supprimer une tâche");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Afficher les tâches");
            System.out.println("5. Quitter");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne après l'entrée d'un entier

            switch (choice) {
                case 1:
                    System.out.println("Entrez le titre de la tâche :");
                    String title = scanner.nextLine();
                    todoList.addTask(title);
                    break;
                case 2:
                    System.out.println("Entrez l'index de la tâche à supprimer :");
                    int removeIndex = scanner.nextInt();
                    todoList.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.println("Entrez l'index de la tâche à marquer comme terminée :");
                    int completeIndex = scanner.nextInt();
                    todoList.completeTask(completeIndex);
                    break;
                case 4:
                    todoList.displayTasks();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Au revoir !");
    }
}