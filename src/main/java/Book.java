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
        if (pages >= 300) {
            System.out.println("Книга большая!");
            return true;
        } else {
            System.out.println("Книга маленькая!");
            return false;
        }
    }

    public void matches(String word) {

        if ((title.contains(word)) || (author.surname.contains(word) || (author.name.contains(word)))) {
            System.out.println("Да, есть в наличии!");
        } else
            System.out.println("Ничего не найдено!");
    }

    public void estimatePrice() {
        int result = (int) Math.floor((3 * pages) * Math.sqrt(author.rating));
        if (result >= 250) {
            System.out.println(result + " руб.");
        } else {
            System.out.println(250 + " руб.");
        }
    }
}
