package HW_V;

public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }


    public boolean isTooBig() {
        return pages >= 300;
    }

    public boolean isMatches(String word) {

        return (title.contains(word)) || (author.surname.contains(word) || (author.name.contains(word)));
    }

    public int estimatePrice() {
        int result = (int) Math.floor((3 * pages) * Math.sqrt(author.rating));
        return result >= 250 ? result : 250;
    }
}
