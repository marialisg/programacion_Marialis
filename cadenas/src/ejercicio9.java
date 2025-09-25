public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println(domain("https://jcp.org") );
    }

    static String domain(String url) {
        String sinProtocolo = url.substring(8);
        int barra = sinProtocolo.indexOf('/');
        return barra == -1 ? sinProtocolo : sinProtocolo.substring(0, barra);
    }
}
