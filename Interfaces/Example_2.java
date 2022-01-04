package interfaces;

interface Member{
    public void callback();
}
class Store{
    Member members[] = new Member[10];
    int count = 0;
    void Register(Member m){
        members [count++] = m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++){
            members[i].callback();
        }
    }
}
class Customer implements Member{
    String name;
    Customer(String n){
        name = n;
    }
    public void callback(){
        System.out.println("OK, I will visit, "+name);
    }
}

public class Example_2 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Ayush");
        Customer c2 = new Customer("Anand");
        
        s.Register(c1);
        s.Register(c2);
        s.inviteSale();
    }
}
