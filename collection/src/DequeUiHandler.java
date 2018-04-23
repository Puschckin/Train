import java.util.*;

public class DequeUiHandler implements UiHandler  {
    private final Scanner in = new Scanner(System.in);
    private final Deque deque = new LinkedList();

    public void call() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Список всех элементов: " + deque);
                    break;

                case 2:
                    System.out.println("Deque.isEmpty() == " + deque.isEmpty());
                    break;

                case 3: {
                    System.out.println("Проверить введенный элемент на содержание в коллекции");
                    String item = in.next();
                    System.out.println(String.format("Deque.contains(%d) == %b", item, deque.contains(item)));
                }
                break;

                case 4: {
                    System.out.println("Добавление элемента в начало коллекции");
                    deque.addFirst(in.next());
                }
                break;

                case 5: {
                    System.out.println("Добавление элемента в конец коллекции");
                    deque.addLast(in.next());
                }
                break;
                case 6:
                    getFirst();
                    break;

                case 7:
                    getLast();
                    break;

                case 8:
                    removeFirst();
                    break;

                case 9:
                    removeLast();
                    break;


                case 10: {
                    System.out.println("получить первый элемент коллекции");
                    deque.pollFirst();
                }
                break;

                case 11: {
                    System.out.println("получить первый элемент коллекции");
                    deque.pollLast();
                }
                break;

                default:
                    return;
            }
        }
    }

    private void getLast() {
        try {
            Object getLast = deque.getLast();
            System.out.println("Deque.getLast() == " + getLast);
        } catch (NoSuchElementException e) {
            System.out.println("Deque.getLast() == " + e);
        }
    }

    private void getFirst() {
        try {
            Object getFirst = deque.getFirst();
            System.out.println("Deque.getFirst() == " + getFirst);
        } catch (NoSuchElementException e) {
            System.out.println("Deque.getFirst() == " + e);
        }
    }

    private void removeLast() {
        try {
            Object removeLast = deque.removeLast();
            System.out.println("Deque.removeLast() == " + removeLast);
        } catch (NoSuchElementException e) {
            System.out.println("Deque.removeLast() == " + e);
        }
    }

    private void removeFirst() {
        try {
            Object removeFirst = deque.removeFirst();
            System.out.println("Deque.removeFirst() == " + removeFirst);
        } catch (NoSuchElementException e) {
            System.out.println("Deque.removeFirst() == " + e);
        }
    }

    public void showMenu() {
        System.out.println("Выберите действия над коллекцией:");
        System.out.println("1.ShowItems");
        System.out.println("2.IsEmpty");
        System.out.println("3.Contatins");
        System.out.println("4.AddFirst");
        System.out.println("5.AddLast");
        System.out.println("6.getFirst");
        System.out.println("7.GetLast");
        System.out.println("8.RemoveFirst");
        System.out.println("9.RemoveLast");
        System.out.println("10.PollFirst");
        System.out.println("11.PoolLast");
        System.out.println("12.GoToMainMenu");
    }

}