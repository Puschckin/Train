import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingUiHandler {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        showMenu();
        List list1 = new ArrayList();
        while (true) {
            int action = scanner.nextInt();


        }
    }

    private void showMenu() {
        System.out.println("1 – Кандидат №1");
        System.out.println("2 – Кандидат №2");
        System.out.println("3 – Кандидат №3");
    }
}
