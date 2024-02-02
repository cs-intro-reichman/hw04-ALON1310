public class ArrayOps {
    public static void main(String [] args) {
         System.out.println(findMissingInt(new int[] {1, 3, 5, 2}));
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int n = array.length ;
        int a = 0 ;

        for (int i = 0 ; i <= n  ; i++) {
            boolean missing = false;
            for (int j = 0; j < n; j++) {
                if (i == array[j]) {
                    missing = true;
                    break;
                }
            }
            if (!missing) {
                a = i;
                return a;
            }
        }
        return (array[0]+1)%2;

    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int n = array.length ;

        if(n<2) return -1;

        int biggest = array[0];
        int second = array[0];

        for (int i = 0 ; i < n ; i ++) {

            if (biggest < array[i]){
                second = biggest;
                biggest = array[i];
           }
             else if (second<array[i] && array[i]!=biggest) second = array[i] ;
        }

        return second;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        for (int i = 0; i < array2.length; i++) {
            boolean itIs = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    itIs = true;
                    break;
                }

            }

            if (!itIs) return false;

    }

        for(int i=0;i<array1.length;i++){
            boolean itIs2 = false ;
            for(int j=0;j<array2.length;j++){
                if(array1[j]==array2[i]){
                    itIs2 = true;
                    break;
                }

            }
            if(!itIs2) return false;

        }

        return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        int n = array.length ;
        boolean master = false;
        boolean check1 =true ;
        boolean check2 = true ;
        int b = array[0];
        int c = array[n-1];
        for (int i = 1 ; i < n ; i++){
            if (b<=array[i]){
                b=array[i];
            }
            else check1=false ;
            if (check1==false) break;
        }

        for (int i = 1 ; i < n ; i ++){
            if (c<=array[n-1-i]) c =array[n-1-i];

            else check2=false;
            if (check2==false) break;

        }
        if (check1==true||check2==true) master=true;


        return master ;
    }

}
