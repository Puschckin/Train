import java.util.*;

public class MapUiHandler implements UiHandler {
    private final Scanner in = new Scanner(System.in);
    private final Map map = new HashMap();

    public void call() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Список всех элементов: " + map);
                    break;

                case 2:
                    System.out.println("Map.isEmpty() == " + map.isEmpty());
                    break;

                case 3: {
                    System.out.println("получение элемента коллекции, либо null в случае отсутствия");
                    String key = in.next();
                    System.out.println(String.format("Map.get(%s) == %s", key, map.get(key)));
                }
                break;

                case 4: {
                    System.out.println("Добавление элемента в коллекцию (key, value) ");
                    map.put(in.next(), in.next());
                }
                break;

                case 5: {
                    System.out.println("удаление элемента из коллекции (key)");
                    String key = in.next();
                    System.out.println(String.format("Map.remove(%s) == (%s)", key, map.remove(key)));

                }
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
        System.out.println("3.Get");
        System.out.println("4.Put");
        System.out.println("5.Remove");
        System.out.println("6.GoToMainMenu");
    }

}