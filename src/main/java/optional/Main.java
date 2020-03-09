package optional;

import java.util.Optional;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: optional
 * @date: 09/03/2020
 */
public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("john@gmail.com")
            .ifPresentOrElse(
                    email -> System.out.println("Sending email to "+ email),
                    () -> System.out.println("Cannot send email"));
    }
}
