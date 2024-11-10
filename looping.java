public class looping {

    public static void main(String[] args) {
        for (int i = 3; i >= 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print(" S ");
            }
            for (int b = i; b <= 3; b++) {
                System.out.print(" 0 ");
            }
            System.out.println();
        }
    }
}