public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println(extension("/the.dot/file.java"));
    }

    static String extension(String ruta) {
        int punto = ruta.lastIndexOf('.');
        return punto == -1 ? "" : ruta.substring(punto + 1);
    }
}
