public class Fibanaci {

    public static void main(String[] args) {
        int i = 10;
        int result = Fibanaci.getFifi(i);
        System.out.println("result" + result);
    }

    public static int getFifi(int i) {

        return getFifi(i - 1) * getFifi(i - 2);
    }
}
