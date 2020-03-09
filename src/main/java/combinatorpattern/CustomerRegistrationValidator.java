package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: combinatorpattern
 * @date: 09/03/2020
 */
public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? SUCCES : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid( ){
        return customer -> customer.getPhoneNumber().startsWith("+0") ? SUCCES : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult(){
        return customer ->  Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? SUCCES : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        return  customer -> {
            ValidationResult result = this.apply(customer);
            return  result.equals(SUCCES) ? other.apply(customer) : result;
        };
    }


    enum ValidationResult{
        SUCCES, PHONE_NUMBER_NOT_VALID, EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
