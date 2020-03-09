package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: functionalInterface
 * @date: 09/03/2020
 */
public class _Function {
    public static void main(String[] args) {
        //Function takes 1 arg and produces 1 resutl
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = muliplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(muliplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        //BiFunction  takes 2 arg and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));


    }

    static Function<Integer,Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer,Integer> muliplyBy10Function =
            number -> number * 10;


    static int incrementByOne(int number){
        return  number + 1;
    }

    static BiFunction<Integer,Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return  (number + 1) * numToMultiplyBy;
    }
}
