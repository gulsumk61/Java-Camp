import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
       CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
       customerManager.add();
    }
}