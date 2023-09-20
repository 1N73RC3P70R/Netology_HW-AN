package Objects;

public class Main {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < TEXT.length(); i++) {
            for (int j = 0; j < PATTERN.length(); j++) {
                if ((TEXT.charAt(i) == PATTERN.charAt(j)) && (TEXT.charAt(i + 1) == PATTERN.charAt(j + 1)) && (TEXT.charAt(i + 2) == PATTERN.charAt(j + 2))) {
                    count++;
                } else {
                    break;
                }
            }
        }

        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}