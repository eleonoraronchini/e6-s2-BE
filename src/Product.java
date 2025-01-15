public class Product {
   private Long id;
   private String name;
   private String category;
   private Double price;

    public Product(Long id, String name, String category, Double price){
        this.id = id;
        this.name= name;
        this.category=category;
        this.price=price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (double) price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return
                "id:" + id +
                        " name:" + name +
                        " category:" + category +
                        " price:" + price
                ;
    }
}
