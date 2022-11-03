```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmojiTranslator {
    private static final Map<String, String> emojiMap = new HashMap<>();

    static {
        emojiMap.put(":)", "\uD83D\uDE00");
        emojiMap.put(":(", "\uD83D\uDE1E");
        emojiMap.put(";)", "\uD83D\uDE09");
        emojiMap.put(":D", "\uD83D\uDE04");
        emojiMap.put(":P", "\uD83D\uDE1B");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to translate to emoji:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            String emoji = emojiMap.get(word);
            if (emoji != null) {
                output.append(emoji);
            } else {
                output.append(word);
            }
            output.append(" ");
        }
        System.out.println("Translated text: " + output.toString());
    }
}
```