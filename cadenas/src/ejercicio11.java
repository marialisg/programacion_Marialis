public class ejercicio11 {
    public static void main(String[] args) {
        System.out.println(hexString(12, 15, 77) );
    }

    static String hexString(int r, int g, int b) {
        return String.format("%02X%02X%02X", r, g, b);
    }
}
