package sena;

/**
 * @author Sergej Chumakov on 29.11.2023
 */
public class Book {
    private String title;
    private String autor;
    private int year;
    private boolean isReading;

    public Book(String title, String autor, int year) {
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

    public boolean isReading() {
        return isReading;
    }

    public void setReading(boolean reading) {
        isReading = reading;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", year=" + year +
                ", isReading=" + isReading +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}
