package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: finalsection
 * @date: 09/03/2020
 */
public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String,Integer,String> upperCaseName = (name, age) -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return  name.toUpperCase();
        };

        String upperCasedName = upperCaseName.apply("Alex", 20);
        System.out.println(upperCasedName);
    }

}
