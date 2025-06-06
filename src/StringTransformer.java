public class StringTransformer {

    public static int longestStr(String... strings) {
        int lonInt = 0;
        for (String string : strings) {
            if(string.length() > lonInt){
                lonInt = string.length();
            }
        }
        return lonInt;
    }

    public static int shortestStr(String... strings) {
        int shInt = 0;
        for (String string : strings) {
            if(shInt == 0){
                shInt = string.length();
            }
            if(string.length() < shInt){
                shInt = string.length();
            }
        }
        return shInt;
    }

    public static void outLongestString(String... strings){
        for(String string : strings){
            if(string.length() == StringTransformer.longestStr(strings)){
                System.out.println(string);
            }
        }
    }

    public static void outShortestString(String... strings){
        for(String string : strings){
            if(string.length() == StringTransformer.shortestStr(strings)){
                System.out.println(string);
            }
        }
    }

    public static void arrangeStrings(String... strings){
        int count = 0;
        String memory = "";
        while (count != strings.length){
            for(String string : strings){
                if(string.length() == StringTransformer.shortestStr(strings) && string != memory){
                    System.out.println(string);
                    memory = string;
                }
            }
            count++;
        }
    }
}
