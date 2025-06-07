public class StringTransformer {

    public static int longestStr(String... strings) {
        int lonInt = 0;
        for (String string : strings) {
            if (string.length() > lonInt) {
                lonInt = string.length();
            }
        }
        return lonInt;
    }

    public static int shortestStr(String... strings) {
        int shInt = 0;
        for (String string : strings) {
            if (shInt == 0) {
                shInt = string.length();
            }
            if (string.length() < shInt) {
                shInt = string.length();
            }
        }
        return shInt;
    }

    public static void outLongestString(String... strings) {
        for (String string : strings) {
            if (string.length() == StringTransformer.longestStr(strings)) {
                System.out.println(string);
            }
        }
    }

    public static void outShortestString(String... strings) {
        for (String string : strings) {
            if (string.length() == StringTransformer.shortestStr(strings)) {
                System.out.println(string);
            }
        }
    }

    public static void arrangeStrings(String... strings) {
        int memoryLength = 0;
        int count = 0;

        while (count != strings.length) {
            int outCount = -1;
            int length = longestStr(strings);
            for (String string : strings) {
                if (string.length() < length && string.length() > memoryLength) {
                    length = string.length();
                }
            }
            memoryLength = length;
            for (String string : strings) {
                if (string.length() == memoryLength) {
                    System.out.println(string);
                    outCount++;
                }
            }
            count = count + 1 + outCount;
        }
    }

    public static void lengthLessThanAverage(String... strings) {
        int avgLength = 0;
        int sumOfLengths = 0;

        for (String string : strings) {
            sumOfLengths = string.length() + sumOfLengths;
        }

        avgLength = sumOfLengths / strings.length;

        for (String string : strings) {
            if (string.length() < avgLength) {
                System.out.println(string);
            }
        }
    }

    public static void diffSimbols(String... strings) {
        for (String string : strings) {
            boolean flag = false;
            int memoryCount = 0;
            for (; memoryCount < string.length() - 1; memoryCount++) {
                int count = memoryCount + 1;
                for (; count < string.length(); count++) {
                    if (string.charAt(memoryCount) == string.charAt(count)) {
                       flag = true;
                       break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(!flag){
                System.out.println(string);
                break;
            }
        }
    }

    public static void stringDoubler(String string){
        for(int count = 0; count< string.length(); count++){
            System.out.print(string.charAt(count));
            System.out.print(string.charAt(count));
        }
    }
}
