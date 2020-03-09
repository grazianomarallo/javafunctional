package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: combinatorpattern
 * @date: 09/03/2020
 */
public class Main {
    public static void main(String[] args) {
        Customer customer =new Customer(
                "Alice",
                "alice@gmail.com",
                "+08968594839",
                LocalDate.of(2000,1,1)
        );
        //CustomerValidatorService customerValidatorService = new CustomerValidatorService();
       // System.out.println(customerValidatorService.isValid(customer));

        // We can store customer in db


        //Using combinator pattern
        ValidationResult isValid = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
        System.out.println(isValid);

        if(isValid != ValidationResult.SUCCES){
            throw new IllegalStateException(isValid.name());
        }

    }
}
