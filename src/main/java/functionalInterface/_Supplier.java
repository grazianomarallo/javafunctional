package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: functionalInterface
 * @date: 09/03/2020
 */
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static  String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
    static Supplier<List<String>> getDBConnectionUrlSupplier = ()
            -> List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customer");


}
