package us.va.yauheni.utils;

public class GenerateString {
    private static String string;
    private static Integer random;

    public static Integer randomint(Integer min, Integer max){
        random = (int)(Math.round(Math.random()*(max-min)+min));
    return random;
    }

    public static String generateString(Integer length){
        string = "";
        String set1 = "aeiouy";
        char[] char1 = set1.toCharArray();
        String set2 = "bcdfghjklmnpqrstvwxz";
        char[] char2 = set2.toCharArray();
        int i = 0;
        while (i < length){
            string = string +char2[randomint(0,19)];
            string = string +char2[randomint(0,19)];
            string = string +char1[randomint(0,5)];
            i = i + 3;
        }
        String first = string.substring(0,1).toUpperCase();
        String all = string.substring(1);
        return string = first + all;
    }
}
