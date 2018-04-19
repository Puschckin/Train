import java.util.Scanner;

public class Main {
    public static final String GET_LIST = "1.List";
    public static final String GET_SET = "2.Set";
    public static final String GET_DEQUE = "3.Deque";
    public static final String GET_MAP = "4.Map";

    private final ListUiHandler listUiHandler = new ListUiHandler();

    public static void main(String[] args) {
        new Main().call();

    }

    public void showMenu() {
        System.out.println("Выберите тип коллекции");
        System.out.println(GET_LIST);
        System.out.println(GET_SET);
        System.out.println(GET_DEQUE);
        System.out.println(GET_MAP);
    }

    public void call() {
        Scanner in = new Scanner(System.in);
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    listUiHandler.call();

                default:
                    return;

            }
        }
    }
}