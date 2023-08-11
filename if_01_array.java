public class if_01_array {


    public static void main(String[] args) {
        
        
        String control = "w";
        int n = 0;

        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                n += 1;
            } else if (control.charAt(i) == 'a') {
                n -= 10;
            } else if (control.charAt(i) == 's') {
                n -= 1;
            } else if (control.charAt(i) == 'd') {
                n += 10;
            }    
        }
        // System.out.println(control.substring(1, 2));
        System.out.println(n);
    }
}
