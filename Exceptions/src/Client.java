import java.util.Scanner;

public class Client {
    private final Scanner in = new Scanner(System.in);
    private final Server server;

    public Client(Server server) {
        this.server = server;
    }

    public void start() {
        while (true) {
            showoutMenu();
            server.getProducts();
            in.nextInt()

            // ToDO: что и сколько
            try {
                server.tryToBuy(ProductType.SPICE, 1);
            } catch (BusinessLogicException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
