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
        int big = array[1] ;
        int second = array[0] ;
        if (second>=big){
            int temp = second;
            second = big;
            big = temp;
        }
        for (int i = 2; i < n; i++) {
            if (array[i] > big) {
                second = big;
                big = array[i];
            } else if (array[i] > second && array[i] <= big) {
                second = array[i];
            }
        }

        return second;

    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:

        for (int i = 0; i < array1.length; i++) {
            boolean found1 = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found1 = true;
                    break;
                }
            }
            if (!found1) {
                return false;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            boolean found2 = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    found2 = true;
                    break;
                }
            }
            if (!found2) {
                return false;
            }
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
