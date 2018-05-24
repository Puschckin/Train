import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Server {
    private final Storage storage = new Storage();

    public Map<ProductType, Integer> getProducts() {
        return storage.getProducts();
    }

    public void tryToBuy(ProductType productType, Integer count) throws BusinessLogicException {
        imitateAnotherClientWork();
        Integer productCount = checkForCount(productType, count);
        storage.changeProductCount(productType, productCount - count);
    }

    private Integer checkForCount(ProductType productType, Integer count) throws BusinessLogicException {
        Integer productCount = storage.getProducts().get(productType);
        if (productCount < count)
            throw new BusinessLogicException("недостаточно товара");
        return productCount;
    }

    private void imitateAnotherClientWork() {
        Random random = new Random();
        if (random.nextInt(4) == 0) {
            Map<ProductType, Integer> products = storage.getProducts();
            for (ProductType productType : ProductType.values()) {
                Integer productCount = products.get(productType);
                storage.changeProductCount(productType, random.nextInt(productCount));
            }
        }
    }
}
