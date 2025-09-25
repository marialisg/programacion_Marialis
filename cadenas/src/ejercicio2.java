public class ejercicio2 {
        public static void main(String[] args) {
            System.out.println(pluralizar(2, "código"));
        }
        public static String pluralizar(int conteo, String s) {
            return (conteo < 2) ? s : String.format("%d %ss", conteo, s);
        }
}
