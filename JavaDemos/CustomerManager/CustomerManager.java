package JavaDemos.CustomerManager;

public class CustomerManager extends PersonManager {

    @Override
    public void list() {
        System.out.println("Customer listed");
    }

    @Override
    public void add() {
        System.out.println("Customer added");
    }

    public void delete(){
        System.out.println("Customer deleted");
    }

    public void update(){
        System.out.println("Customer updated");
    }
}
