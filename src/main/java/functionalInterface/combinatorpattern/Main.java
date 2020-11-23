package functionalInterface.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@mail.com",
                "098933823",
                LocalDate.of(2000,1,1)
        );
        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
