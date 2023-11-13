package sena;

import java.lang.annotation.*;

/**
 * @author Sergej Chumakov on 13.11.2023
 *
 * анотація з параметрами за замовченням та знаком операції
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyArguments {

    double a();
    double b();
    String sign();
}
