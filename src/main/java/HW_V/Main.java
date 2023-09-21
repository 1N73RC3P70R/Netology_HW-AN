package HW_V;

public class Main {
    public static void main(String[] args) {
        Author danteAlighieri = new Author("Dante", "Alighieri", 9);
        Book divinaComedia = new Book("Divina Comedia", 1321, danteAlighieri, 988);

        Author robertHeinlein = new Author("Robert", "Heinlein", 7);
        Book starshipTroopers = new Book("Starship Troopers", 1959, robertHeinlein, 263);


        System.out.println(divinaComedia.title);
        divinaComedia.estimatePrice();
        divinaComedia.isTooBig();
        divinaComedia.matches("Dante");
        System.out.println();
        System.out.println();
        System.out.println(starshipTroopers.title);
        starshipTroopers.estimatePrice();
        starshipTroopers.isTooBig();
        starshipTroopers.matches("Heinlein");
        starshipTroopers.matches("AAAA");
    }
}
