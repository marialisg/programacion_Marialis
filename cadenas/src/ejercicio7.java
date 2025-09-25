public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println(esExterno("/definetely-internal"));
    }

    static boolean esExterno(String enlace) {
        return (enlace.charAt(0) == '/') ? false
                : (enlace.length() >= 5 && enlace.substring(0, 5).equals("http:")) ? true
                : (enlace.length() >= 6 && enlace.substring(0, 6).equals("https:")) ? true
                : false;
    }
}
