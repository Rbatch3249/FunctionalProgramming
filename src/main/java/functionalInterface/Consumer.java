package functionalInterface;

public class Consumer {
    public static void main(String[] args) {
    //normal java function
        Customer maria = new Customer("Maria","99999");

    greetCustomer(maria);
    greetCustomerV2(maria,false);
    //Functional interface
    greetCustomerConsumer.accept(maria);

    greetCustomerConsumerV2.accept(maria,false);
    }
    static java.util.function.BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    ( showPhoneNumber ? customer.customerPhoneNumber : "******"));



        static java.util.function.Consumer<Customer> greetCustomerConsumer = customer ->
                System.out.println("Hello " + customer.customerName +
                        ", thanks for registering phone number " +
                        customer.customerPhoneNumber);

        static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber);
    }
    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                ( showPhoneNumber ? customer.customerPhoneNumber : "******"));

    }
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
