import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        System.out.println(StringTransformer.longestStr(s1,s2,s3));
        System.out.println(StringTransformer.shortestStr(s1,s2,s3));
        StringTransformer.outLongestString(s1, s2, s3);
        StringTransformer.outShortestString(s1, s2, s3);
        System.out.println();
        StringTransformer.arrangeStrings(s1, s2, s3);
        StringTransformer.lengthLessThanAverage(s1, s2, s3);
        StringTransformer.diffSimbols(s1, s2, s3);
        StringTransformer.stringDoubler(s1);

        System.out.println("Введите произвольные слова");
        String s4 = scanner.nextLine();
        System.out.println("Введите номер слова");
        int num = scanner.nextInt();
        StringTransformer.isPalindrom(s4, num);

        System.out.println("Введите строку");
        String text = scanner.nextLine();
        RegEx.outAbbr(text);
        System.out.println("Введите email, номер документ(а/ов) и номер телефона");
        String text1 = scanner.nextLine();
        RegEx.outInfo(text1);
    }
}