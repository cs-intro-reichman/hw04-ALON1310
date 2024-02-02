public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {



    }
    public static char upperCase (char ch){
        if(ch>='a'&& ch<='z') {
            return (char) (ch - 32);
        }
        return ch;
    }
    public static char lowerCase (char ch){
        if(ch>='A'&& ch<='Z') {
            return  (char)(ch + 32);
        }
        return ch;
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String s = "aeiou";
        String master = "";

        for (int i = 0; i < string.length(); i++) {
            if (s.indexOf(string.charAt(i)) != -1 || s.indexOf(string.charAt(i) + 32) != -1) {
                master += upperCase(string.charAt(i));
            } else {
                master += lowerCase(string.charAt(i));
            }


        }
        return master;
    }


    public static String camelCase (String string) {
        // Write your code here:
        String master = "";
        boolean space = false;
        boolean first = true;

        for (int i = 0; i < string.length(); i++) {

            char currentChar = string.charAt(i);

            if (currentChar != ' ' ) {
                if(!space){
                    if(currentChar<='z' && currentChar>='a'){
                        master+=currentChar;
                    } else if (currentChar<='Z' && currentChar>='A'){
                        master += lowerCase(currentChar);
                    }
                    space = false ;

                }
                else if (space){
                    if(currentChar <= 'z' && currentChar >= 'a'){
                        if(first){
                            master+=currentChar;
                            first = false;
                        }
                        else if(!first){
                            master += upperCase(currentChar);
                        }
                    } else if (currentChar<='Z' && currentChar>='A') {
                        if(first){
                            master+=lowerCase(currentChar);
                            first = false;
                        }else if(!first) {
                            master+=currentChar;
                        }

                    }
                    space = false;
                }

            }
            else if(currentChar==' '){
                space = true;
            }

        }

        return master;
    }



    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int count = 0 ;
        int place = 0 ;


        for (int i =0 ; i < string.length();i++){

            if (chr == string.charAt(i)) count ++;

        }


        int [] array = new int[count];


        for (int t = 0 ; t<string.length();t++){
            if (string.charAt(t) == chr) array[place++]= t;

        }

        return array;
    }
}
