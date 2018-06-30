package Java200;

/**
 * Created by jeonghyonkim on 2017. 2. 16..
 */
public class NestedFor {
    public static void main(String[] args) {
        int count = 5;

        printButterfly(count);
        printDiamond(count);
    }
    private static void printChar(int n) {
        int inters = n;
        for(int i=0;i<inters;i++){
            for(int j=0;j<inters-1-i;j++) {
                System.out.print(" ");
            }

            for(int m=0; m<=i;m++) {
                System.out.print((char)('a'+m));
            }

            for(int k=inters-1-i;k<=inters-1;k++){
                System.out.print((char)('a'+inters-1-k));
            }

            System.out.println();
        }
    }

    private static void printButterflyChar(int n) {
        int inters=n;
        for(int i=0; i<inters;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for(int m=0;m<=inters-1-i;m++) {
                System.out.print((char)('a'+m));
            }
            for(int k=inters-1-i;k>=0;k--){
                System.out.print((char)('a'+k));
            }
            System.out.println();
        }
    }
    private static void printButterfly(int n) {
        printButterflyChar(n);
        printChar(n);
        System.out.println("---------------------");
    }

    private static void printDiamond(int n) {
        printChar(n);
        printButterflyChar(n);
        System.out.println("---------------------");
    }
}
