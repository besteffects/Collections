package _5_Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class PriorityHelpDesk {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category type) {
        enquiries.offer(new Enquiry(customer, type));
    }

    public void processAllEnquires() {
        Enquiry enquiry;
        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args) {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARY, Category.COMPUTER);

        helpDesk.processAllEnquires();
    }


}
