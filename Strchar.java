public class Strchar {
    public static boolean isBlank(String value) {
        return (value == null || value.equals("") || value.equals("null") || value.trim().equals(""));
    }
    public static String normalizeOnlyLettersNumbers(String str) {
        if (!isBlank(str)) {
            return str.replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}]", ""); //is same with "[^\\p{L}\\p{Nd}]" this also print ü,ş,ğ.  "[\\W]|_" = "[^A-Za-z0-9]" --> do not print ş,ğ,ü 
        } else {
            return "";
        }
    }

    public static String safeChar(String input)
{
    char[] allowed = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".toCharArray();
    char[] charArray = input.toString().toCharArray();
    StringBuilder result = new StringBuilder();
    for (char c : charArray)
    {
        for (char a : allowed)
        {
            if(c==a) result.append(a);
        }
    }
    return result.toString();
}
    public static void main(String[] args) {
        System.out.println(normalizeOnlyLettersNumbers("A_y+ 'ş!e.&gül/ü)^m(1'iciğim"));
        System.out.println(safeChar("A_y+ 'ş!e.&gül/ü)^m(1'iciğim"));
    }
}
