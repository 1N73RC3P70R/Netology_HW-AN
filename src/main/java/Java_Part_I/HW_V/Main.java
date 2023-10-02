package Java_Part_I.HW_V;

public class Main {
    public static void main(String[] args) {
        Author danteAlighieri = new Author("Dante", "Alighieri", 9);
        Book divinaComedia = new Book("Divina Comedia", 1321, danteAlighieri, 988);

        Author robertHeinlein = new Author("Robert", "Heinlein", 7);
        Book starshipTroopers = new Book("Starship Troopers", 1959, robertHeinlein, 263);


        System.out.println(divinaComedia.title);

        int price = divinaComedia.estimatePrice();
        System.out.println(price + " руб.");

        if (divinaComedia.isTooBig()) {
            System.out.println("Divina Comedia книга большая!");
        } else {
            System.out.println("Divina Comedia книга маленькая!");
        }

        if (divinaComedia.isMatches("Dante")) {
            System.out.println("Да, есть в наличии!");
        } else {
            System.out.println("Слово не найдено!");
        }

        System.out.println();
        System.out.println();

        System.out.println(starshipTroopers.title);

        starshipTroopers.estimatePrice();
        System.out.println(price + " руб.");

        if (starshipTroopers.isTooBig()) {
            System.out.println("Starship Troopers большая книга!");
        } else {
            System.out.println("Starship Troopers маленькая книга!");
        }
        if (starshipTroopers.isMatches("Heinlein")) {
            System.out.println("Да, есть в наличии!");
        } else {
            System.out.println("Слово не найдено!");
        }

        if (starshipTroopers.isMatches("AAAA")) {
            System.out.println("Да, есть в наличии!");
        } else {
            System.out.println("Слово не найдено!");
        }
    }
}
