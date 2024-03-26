package emsi.tp2_spring;

import emsi.tp2_spring.entities.Product;
import emsi.tp2_spring.repository.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Tp2SpringApplication implements CommandLineRunner {
    @Autowired
    private IProduct iproduct;
    public static void main(String[] args) {

        SpringApplication.run(Tp2SpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        iproduct.save(new Product(null,"Ananas",500,100));
        iproduct.save(new Product(null,"Fraise",750,80));
        iproduct.save(new Product(null,"Pomme",1500,110));
        List<Product> productsList = iproduct.chercherProduits(100,70);
        List <Product> products = iproduct.findAll();
        productsList.forEach(p->{
                    System.out.println("----------------------------------------------------");
                    System.out.println(p.getId());
                    System.out.println(p.getName());
                    System.out.println(p.getPrice());
                    System.out.println(p.getQuantity());
                }
        );
        Product p = iproduct.findById(3L).orElse(null);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(p.getId()+"*********"+p.getPrice()+"*********"+p.getName()+"*********"+p.getQuantity());
        p.setQuantity(10);
        iproduct.save(p);
    }

}
