package finalsection;

import java.util.function.Consumer;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: finalsection
 * @date: 09/03/2020
 */
public class CallBacks {
    public static void main(String[] args) {
        hello("John", null, value -> System.out.println("no last name  provided for " + value));
        hello2("John", null, () -> System.out.println("no last name  provided for"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null)
            System.out.println(lastName);
        else callback.accept(firstName);
    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if(lastName != null)
            System.out.println(lastName);
        else callback.run();
    }
}
