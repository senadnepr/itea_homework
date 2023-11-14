package sena;

import java.lang.annotation.*;

/**
 * @author Sergej Chumakov on 14.11.2023
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Student {

    String name();
    int age();
    String specialisation();
}
