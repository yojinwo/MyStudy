public class ExerciseBook {
    
    public static void main(String[] args) {
        
        int[] array; 
        array = new int[]{1,2,3,4,5};

       arrayMethod(new int[] {1,2,3,4,5});
    }

    static void arrayMethod (int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }



}



    
