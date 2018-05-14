import java.util.Scanner;

public class Main {
    private final Scanner in = new Scanner(System.in);
    private final VotingUiHandler votingUiHandler = new VotingUiHandler();

    private void start(){
        while(true){
            showMenu();
            switch (in.nextInt()){
                case 1:
                    votingUiHandler.start();
                    break;

                case 2:
                    // ToDo:
                    break;

                default:
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println("1 – Проголосовать");
        System.out.println("2 – Вывести статистику");
        System.out.println("3 – Выход");
    }

    public static void main(String args[]) {
        new Main().start();
    }
}

