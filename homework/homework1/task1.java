import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.printf("Please enter the text: ");
        String text = sc.nextLine();
        sc.close();
        System.out.println("Inverted text: " + ReverseText(text));
    }

    /**
     * @apiNote При наличии входной строки измените порядок слов на противоположный.
     * @param text Начальный текст
     * @return Возвращает строку слов в обратном порядке, объединенных одним пробелом.
     */
    public static String ReverseText(String text) {
        text = text.trim();
        String[] arText = text.split(" ");
        String resText = "";
        for (int i = arText.length - 1; i >= 0; i--) {
            if(!" ".contains(arText[i])){
                if(i != 0) resText += arText[i] + " ";
                else resText += arText[i];
            }
        }
        return resText;
    }
}