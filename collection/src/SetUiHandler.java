import java.util.*;

public class SetUiHandler implements UiHandler  {
    private final Scanner in = new Scanner(System.in);
    private final Set set = new HashSet();

    public void call() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 2:
                    System.out.println("Set.isEmpty() == " + set.isEmpty());
                    break;
                case 4: {
                    System.out.println("добавление элемента в конец списка");
                    String item = in.next();
                    System.out.println(String.format("Set.add(%s) == (%b)", item, set.add(item)));
                }
                break;

                case 3: {
                    System.out.println("Проверить введенный элемент на содержание в коллекции");
                    String item = in.next();
                    System.out.println(String.format("List.contains(%s) == %b", item, set.contains(item)));
                    System.out.println("List.contains(" + item + ") == " + set.contains(item));
                }
                break;
                case 5: {
                    System.out.println("удаление элемента из коллекции");
                    set.remove(in.next());
                }
                break;
                case 1:
                    System.out.println("Список всех элементов: " + set);
                    break;
                default:
                    return;
            }
        }
    }

    public void showMenu() {
        System.out.println("Выберите действия над коллекцией:");
        System.out.println("1.ShowItems");
        System.out.println("2.IsEmpty");
        System.out.println("3.Contains");
        System.out.println("4.Add");
        System.out.println("5.Remove");
        System.out.println("6.GoToMainMenu");
    }
}
