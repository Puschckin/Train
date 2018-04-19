import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUiHandler {
    private final Scanner in = new Scanner(System.in);
    private final List list = new ArrayList();

    public void call() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("List.isEmpty() == " + list.isEmpty());
                    break;

                case 2: {
                    System.out.println("Проверить введенный элемент на содержание в коллекции");
                    String item = in.next();
                    System.out.println(String.format("List.contains(%s) == %b", item, list.contains(item)));
                    System.out.println("List.contains(" + item + ") == " + list.contains(item));
                }
                break;

                case 3: {
                    System.out.println("Добавление элемента в конец списка");
                    String item = in.next();
                    System.out.println(String.format("List.add(%s) == (%b)", item, list.add(in.next())));
                }
                break;

                case 4: {
                    System.out.println("Добавление элемента на заданную позицию");
                    list.add(in.nextInt(), in.next());
                }
                break;
                case 5: {
                    System.out.println("Удаление заданного элемента");
                    list.remove(in.next());
                }
                break;
                case 6: {
                    System.out.println("Удалить элемент на заданеной позиции ");
                    list.remove(in.nextInt());
                }
                break;
                case 7:
                    System.out.println("Список всех элементов: " + list);
                    break;
                default:
                    return;
            }
        }
    }

    public void showMenu() {
        System.out.println("Выберите действия над коллекцией:");
        System.out.println("1.IsEmpty");
        System.out.println("2.Contains");
        System.out.println("3.Add");
        System.out.println("4.AddByIndex");
        System.out.println("5.Remove");
        System.out.println("6.RemoveByIndex");
        System.out.println("7.ShowItems");
        System.out.println("8.GoToMainMenu");
    }
}
