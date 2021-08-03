package countvowels;

public class VowelCounter {

    /**
     * Calculates the number of vowels in some given text.
     * Both upper case and lower case vowels count towards the total.
     *
     * @param text The text which to be searched.
     * @return The number of vowels in the given text.
     */
    public int numberVowels(String text) {
       // write your code here
        String lowerText = text.toLowerCase();
        char[] vowels = {'a','e','i','o','u'};
        int numVowels = 0;
        for(int i=0;i<text.length();i++){
            char curchar= lowerText.charAt(i);
            if(curchar == 'a'||curchar=='e'||curchar=='u'||curchar=='o'||curchar=='i'){
                numVowels++;
            }
        }
        return numVowels;
    }
}
