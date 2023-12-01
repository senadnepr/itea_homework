package sena;

/**
 * @author Sergej Chumakov on 01.12.2023
 */
@FunctionalInterface
public interface Reading {
    void getOrReturn(Book book);
}
