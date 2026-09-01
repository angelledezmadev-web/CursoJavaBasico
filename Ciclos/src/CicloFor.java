public class CicloFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println("______________________");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}
