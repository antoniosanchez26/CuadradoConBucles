package es.asdj;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 ; j++) {
                if (i > 0 && i < 9) {
                    if (j > 0 && j < 9 ) {
                        System.out.print("  ");
                    } else {
                        System.out.print(0 + " ");
                    }
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
