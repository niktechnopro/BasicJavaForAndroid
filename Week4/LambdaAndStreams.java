import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.text.DecimalFormat;

public class Main {
    
    public static void main(String[] args) throws Exception {

        List<Product> store = new LinkedList<Product>(
            Arrays.asList(
                //          ID  Name    Department     Price
                new Product(0,"Laptop","Electronics", 1099.99f),
                new Product(1,"Hat","Clothes", 5f),
                new Product(2,"Stove","Kitchen", 800.70f),
                new Product(3,"Camera","Electronics", 50.50f),
                new Product(4,"Fridge","Kitchen", 960.25f),
                new Product(5,"Sweater","Clothes", 25f),
                new Product(6,"Scanner","Electronics", 346.60f),
                new Product(7,"Microwave","Kitchen", 490.10f),
                new Product(8,"Pants","Clothes", 10.30f)
            )
        );

        //Print each of the products
            System.out.println("\nOriginal List: ");
            // for(int i=0; i<store.size(); i++){
            //     System.out.println(store.get(i));
            // }
            store.forEach(product -> System.out.println(product));
        



        //Filter and print the Products which belongs to the Electronics department
            System.out.println("\nonly Electronics department: ");
            Predicate<Product> electronicsSelector = (Product product) -> (product.department).equals("Electronics");
            List onlyElectronics = store.stream().filter(electronicsSelector).collect( Collectors.toList());
            onlyElectronics.forEach(product -> {
                System.out.println(product);
            });
            
        //Print products that are chepear than $800.00
            System.out.println("\n\nCheap products:");
            List<Product> cheapProduct = store.stream()
            .filter((Product x)-> x.price < 800.00f)
            .collect(Collectors.toList());
            cheapProduct.forEach(product -> System.out.println(product));
            
        //Remove Products that more expensive than $700.00
            Predicate<Product> expensiveSelector = (Product product) -> product.price > 700.00f;
            store.removeIf(expensiveSelector);
            //Print each of the products
            System.out.println("\n\nWithout Expensive products, list:");
            store.forEach(product -> System.out.println(product));

        //Remove Products which belongs to the Kitchen department
            Predicate<Product> kitchenSelector = (Product product) -> (product.department).equals("Kitchen");
            store.removeIf(kitchenSelector);
            
        //Print each of the products
            System.out.println("\n\nWithout Kitchen department, list:");
            store.forEach(product -> System.out.println(product));

    }
}

class Product {
    public int id;
    public String name, department;
    public float price;
    
    public Product(int id, String name, String department, float price) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.price = price;
    }
    
    public String toString(){
        return ( this.name + (new DecimalFormat(" $0.00")).format(this.price) );
    }
}