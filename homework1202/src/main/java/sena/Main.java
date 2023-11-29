package sena;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sergej Chumakov on 27.11.2023
 */
public class Main {
    public static void main(String[] args) {

        List<Book> library = Arrays.asList(
                new Book("Learn Linux Shell Scripting", "Sebastiaan Tammer" , 2018),
                new Book("Bash Quick Start Guide", "Tom Ryder" , 2018),
                new Book("Slaughterhouse-Five", "Kurt Vonnegut" , 1975)
        );

        library.forEach(Book::print);
    }
}
