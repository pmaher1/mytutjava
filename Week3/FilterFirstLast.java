package stringfilterfirstlast;

public class FilterFirstLast {
    /** Searches text for the first and last instances of a given character.
     * Returns the text with the first and last instances of character removed.
     * If the character does not appear in the text, the whole text must be returned intact.
     * If the character only appears in the text once, then then the text must
     * be returned with the first instance of character removed.
     * e.g. "revere" and 'e' would return "rver"
     * @param text Text to be searched.
     * @param searchingFor A character to search for in the text.
     * @return Text with first and last instances of character removed.
     * */
    public static String filterFirstLast(String text, char searchingFor) {
        int[] arr;
        
        
        
        
        StringBuilder input1 = new StringBuilder();
        input1.append(text);
        input1.reverse();
        String s1=input1.toString();
        
        int num = text.indexOf(searchingFor);
        int num2 = text.length() -1 - s1.indexOf(searchingFor);
       
        String s=Integer.toString(num);
        String s2=Integer.toString(num2);
        
        if(num==-1){
            return text;
        }
        else if(num==num2){
            return text.substring(0,num)+
                text.substring(num+1,text.length());
        }
        else{
            return text.substring(0,num)+
                text.substring(num+1,num2)+
                text.substring(num2+1,text.length());
        }
        //return s+s2+"  "+text.substring(num+1,num2);
        
        
    }
}
