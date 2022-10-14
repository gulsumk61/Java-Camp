public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.city = "Trabzon";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.taxNumber = "10000";
        company.companyName = "Arçelik";
        company.id = 100;

        CustomerManager customerManager2 = new CustomerManager(new Company());

        Person person = new Person();
        person.nationalIdentity = "12455";

        Customer c1 = new Customer();
        Customer c2 = new Company();
        Customer c3 = new Person();
    }
}