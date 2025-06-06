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
    }
}