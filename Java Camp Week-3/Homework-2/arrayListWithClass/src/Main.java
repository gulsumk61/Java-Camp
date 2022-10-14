import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer Gulsum = new Customer(1, "Gulsum", "Köktaş" );
        customers.add(Gulsum);
        customers.add(new Customer(2, "Sena", "Çetinkaya"));
        customers.add(new Customer(3, "Hilal", "Öztürk"));

        customers.remove(Gulsum);
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}