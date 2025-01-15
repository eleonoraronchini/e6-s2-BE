import java.time.LocalDate;
import java.util.List;

public class Order {
    Long id;
    String status;
    LocalDate orderDate;
    LocalDate deliveryDate;
    List<Product> products;
    Customer customer;

    public Order (Long id, String status, LocalDate orderDate, LocalDate deliveryDate,List<Product> products,Customer customer){
        this.id=id;
        this.status=status;
        this.orderDate=orderDate;
        this.deliveryDate=deliveryDate;
        this.products=products;
        this.customer=customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                " status:" + status + '\'' +
                " orderDate:" + orderDate +
                " deliveryDate:" + deliveryDate +
                " products:" + products +
                " customer:" + customer
                ;
    }
}
