package _5_Queues;

import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> queue;




    public void enquire(final Customer customer, final Category category){

    }
//responces to Customers enquires
    public void processAllEnquires(){

    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processAllEnquires();
    }
}
