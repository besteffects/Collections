package _5_Queues;

public class Customer {
    public final String name;
    public Customer(final String name) {
        this.name = name;
    }

    public static final Customer JACK = new Customer("Jack");
    public static final Customer JILL = new Customer("Jill");
    public static final Customer MARY = new Customer("Mary");

   public void reply(final String message){
       System.out.printf("%s: %s\n", name, message);
   }
}
