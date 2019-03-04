package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringToBePadded);
        Integer amountOfSpaces = amountOfPadding - stringBuilder.length();
        for (int i = 0; i < amountOfSpaces; i++) {
            stringBuilder.insert(0," ");

        }


        return stringBuilder.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringToBePadded);
        Integer amountOfSpaces = amountOfPadding - stringBuilder.length();
        for (int i = 0; i < amountOfSpaces; i++) {
            stringBuilder.append(" ");

        }


        return stringBuilder.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat ; i++) {
            stringBuilder.append(stringToBeRepeated);
        }

        return stringBuilder.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        char[] charArray = string.toCharArray();
        for(char thisChar : charArray){
            if(thisChar!= 32 && thisChar < 65 || thisChar > 122 ){
                return false;
            }
            else if(thisChar > 90 && thisChar < 97){
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        char[] charArray = string.toCharArray();
        for(char thisChar : charArray){
            if(thisChar < 48 || thisChar > 57){
                return false;
            }

            }

        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char[] charArray = string.toCharArray();
        for(char thisChar : charArray){
            if(Character.isAlphabetic(thisChar) || Character.isDigit(thisChar)){
                return false;
            }

        }

        return true;
    }
}
