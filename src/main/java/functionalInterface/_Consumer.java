package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: functionalInterface
 * @date: 09/03/2020
 */
public class _Consumer {

    public static void main(String[] args) {
        // Normal java function
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);

        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria,false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) ->  System.out.println("Hello "+ customer.customerName +
                    ", thanks for registering phone numner "+ (showPhoneNumber ? (customer.customerPhoneNumber) : "*****" ));

    static Consumer<Customer> greetCustomerConsumer =
            customer ->  System.out.println("Hello "+ customer.customerName +
                    ", thanks for registering phone numner "+ customer.customerPhoneNumber);


    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.customerName +
                ", thanks for registering phone numner "+ customer.customerPhoneNumber);
    }

    static class  Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
