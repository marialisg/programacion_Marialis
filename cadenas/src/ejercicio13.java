public class ejercicio13 {
    public static void main(String[] args) {
        System.out.println(elipsificar("Java is fun", 20));
    }

    static String elipsificar(String texto, int maxLongitud) {
        return texto.length() <= maxLongitud ? texto :
                texto.indexOf(" ", maxLongitud) == -1 ? texto :
                        texto.substring(0, texto.indexOf(" ", maxLongitud)) + "…";
    }
}
