package sena.homework.hw04.hw0401;

/**
 * @author Sergej Chumakov on 18.09.2023
 */
public class Book {
    public Author author;
    public Content content;
    public Title title;

    public Book() {
        author = new Author();
        content = new Content();
        title = new Title();
    }
}
