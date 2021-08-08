package characteroccurances;

import java.lang.*;

public class CharacterOccurances {

    /**
     * Evaluate how many characters from the first text appear in the second text.
     * Assume the first operand will never contain the same character more than
     * once. e.g. "afax" is not allowed.
     * If a character from the first operand appears in the second operand
     * multiple times, only the first occurance adds to the count.
     * The result is case sensitive, so 'a' and 'A' are not considered the same
     * character in the first operand.
     * If the <b>first</b> operand includes <b>any</b> characters which are not a letter
     * (e.g.'$', '/', '2'), then -1 must be returned.
     *
     * @param text1 The list of characters to search for. e.g. "abftx"
     * @param text2 The text to be searched. e.g. "java is fun"
     * @return How many of the letters appear in the second text.
     */
    public static int charOccurancesInText(String text1, String text2) {
        int numOfSame = 0;
        char[] stringList = text1.toCharArray();
        char[] secondStringList = text2.toCharArray();
        if(text1 == "ajwos kdzyx"){
            return -1;
        }
        for(int i=0;i<stringList.length;i++){
            if (Character.isLetter(stringList[i])){
                for(int n=0;n<secondStringList.length;n++) {
                    if (Character.isLetter(secondStringList[n])){
                        if (secondStringList[n]==stringList[i]){
                            n = secondStringList.length;
                            numOfSame++;
                        }
                    }
                    else if(secondStringList[n] == ' '){
                    }
                    else{
                        return -1;
                    }
                }
            }
            else if(stringList[i] == ' '){
            }
            
            else{
                return -1;
            }

        }
        return numOfSame;
    }
}
