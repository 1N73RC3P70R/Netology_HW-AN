package Java_Part_II;

public class PasswordChecker {
    private int minLength, maxRepeats;
    private int counterRepeats = 0;
    private char letterPrevious = ' ';

    public void setMinLength(int minLength) {
        if (minLength <= 0) {
            throw new IllegalArgumentException("Пароль слишком короткий.");
        }
        this.minLength = minLength;
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Количество должно быть положительным.");
        }
        this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) {
        if (minLength <= 0 || maxRepeats <= 0) {
            throw new IllegalArgumentException("Параметры не установлены.");
        }

        if (password.length() < minLength) {
            return false;
        }

        for (char character : password.toCharArray()) {
            if (character == letterPrevious) {
                counterRepeats++;
            } else {
                counterRepeats = 1;
            }

            if (counterRepeats > maxRepeats) {
                return false;
            }

            letterPrevious = character;
        }

        return true;
    }
}