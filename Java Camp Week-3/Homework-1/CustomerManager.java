public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;
    public  CustomerManager (Customer _customer){
        this._customer = _customer;
    }
    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }

    public void save(){
        System.out.println("Müşteri kaydedildi " );
    }
    public void delete(){
        System.out.println("Müşteri silindi " );
    }
    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi");
    }
}