package alexandr_samohvalov;

public class StringsMain {
    // Count the number of characters in a given string.
    public static void CountNumberChar(String[] CountNumberChar) {
        String txt = "I hope I am right ";
        System.out.println(txt.length());
    }


    // Convert a string to uppercase.
    public static void ConvertStrUppercase(String[] ConvertStrUppercase) {
        String txt = "I hope I am right ";
        System.out.println(txt.toUpperCase());
    }

    //  Check if a string contains a specific substring.
    public static void StrContainsSpecificSubStr(String[] StrContainsSpecificSubStr) {
        String txt = "I hope I am right ";
        System.out.println(txt.endsWith(" "));
    }


    //  Remove all whitespace characters from a string.
    public static void RemoveWhiteSpace(String[] RemoveWhiteSpace) {
        String txt = "    I hope I am right     ";
        System.out.println(txt.trim());
    }

    //  Extract a substring from a string.
    public static void ExtractSubStrFromStr(String[] ExtractSubStrFromStr) {
        String txt = "I hope I am right";
        System.out.println(txt.substring(2, 7));
    }
}