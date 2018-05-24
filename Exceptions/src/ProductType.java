public enum ProductType {
    SPICE("spice"),
    POTATO("potato"),
    CUCUMBER("cucumber"),
    TOMATOES("tomatoes");

    private final String product;
    public String getProduct(){
        return product;
    }
    ProductType(String product){
        this.product = product;
    }
}

