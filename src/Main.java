import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(123L, "Alice", 3);
        Customer c2 = new Customer(234L, "Marco", 2);
        Customer c3 = new Customer(784L, "Matilde", 2);
        Customer c4 = new Customer(324L, "Marco", 4);
        Customer c5 = new Customer(111L, "Sabrina", 1);

        List<Customer> allCustomers = Arrays.asList(c1,c2,c3,c4,c5);


        Product p1 = new Product(112L, "Dior-Sauvage", "Profumeria", 54.6);
        Product p2 = new Product(113L, "Polo-Lacoste", "Boys", 104.5);
        Product p3 = new Product(114L, "DondoloInBambù-MaisonDuMonde", "Baby", 350.8);
        Product p4 = new Product(115L, "ChainsawMan-PlanetManga", "Books", 6.5);
        Product p5 = new Product(116L, "NeonGenesis-Evangelion-ArtBook", "Books", 150.5);
        Product p6 = new Product(117L, "ArmadioKids-Ikea", "Baby", 130.9);
        Product p7 = new Product(118L, "Dolce&Gabbana-LightBlue", "Profumeria", 78.9);
        Product p8 = new Product(119L, "SkinnyJeans-Levi's", "Boys", 130.4);
        Product p9 = new Product(120L, "Homunculus-PaniniComics", "Books", 7.9);
        Product p10 = new Product(121L, "CappottoLungo-MaisonMargela", "Boys", 340.5);


        //Ho creato delle liste con i vari prodotti, trasformandole poi in Arrays con il metodo Arrays.asList
        List<Product> allProducts = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

        List<Product> products1 = Arrays.asList(p1, p6);
        List<Product> products2 = Arrays.asList(p7, p8, p2);
        List<Product> products3 = Arrays.asList(p4, p5, p9);
        List<Product> products4 = Arrays.asList(p3, p6);
        List<Product> product5 = Arrays.asList(p8, p10);

        Order o1 = new Order(331L, "spedito", LocalDate.of(2025, 1, 2), LocalDate.of(2025, 1, 5), products1, c1);
        Order o2 = new Order(332L, "in preparazione", LocalDate.of(2025, 1, 14), LocalDate.of(2025, 1, 17), products2, c2);
        Order o3 = new Order(333L, "consegnato", LocalDate.of(2025, 12, 20), LocalDate.of(2025, 12, 23), products3, c3);
        Order o4 = new Order(334L, "in consegna", LocalDate.of(2025, 1, 9), LocalDate.of(2025, 1, 11), products4, c4);
        Order o5 = new Order(335L, "in transito", LocalDate.of(2025, 1, 11), LocalDate.of(2025, 1, 12), product5, c5);

        List<Order> allOrders = Arrays.asList(o1,o2,o3,o4,o5);
        //Esercizio 2:
        List<Product> listFilterBaby = new ArrayList <Product>();
        Stream<Product> streamFilterBaby = allProducts.stream().filter(i -> "Baby".equals(i.getCategory()));
        streamFilterBaby.forEach(i->listFilterBaby.add(i));
        System.out.println(listFilterBaby);

        //Esercizio 1:
        List <Product> listFilterBooks = new ArrayList<Product>();
        Stream<Product> streamFilterBooks = allProducts.stream().filter(i -> "Books".equals(i.getCategory())&& i.getPrice()<100);
        streamFilterBooks.forEach(i->listFilterBooks.add(i));
        System.out.println(listFilterBooks);

        //Esercizio 3:
        List <Product> listFilterBoysDiscount = new ArrayList<Product>();
        Stream <Product> streamFilterBoysDiscount = allProducts.stream().filter(i-> "Boys".equals(i.getCategory()));
        streamFilterBoysDiscount.forEach(i -> {
            double discountedPrice = i.getPrice() * 0.90;
            listFilterBoysDiscount.add(i);
            System.out.println("Articolo:" + i.getName() + " Prezzo Scontato del 10%:" + discountedPrice);
            ;// Calcolo del prezzo scontato
        });
        System.out.println(listFilterBoysDiscount);

        //Esercizio 4:
        List <Order> listTier2Orders = new ArrayList<Order>();
        Stream<Order> tier2Orders = allOrders.stream().filter(i -> i.getCustomer().getTier() == 2
                && i.getOrderDate().isAfter(LocalDate.of(2025,1,1)) && i.getOrderDate().isBefore(LocalDate.of(2025,1,20))); // Corretto il filtro delle date
        tier2Orders.forEach(i->listTier2Orders.add(i));
        System.out.println(listTier2Orders);
    }


};