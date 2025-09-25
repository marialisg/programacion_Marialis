public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println(terminaEnS("sábado") ); // false
    }

    static boolean terminaEnS(String texto) {
        var ultimoCaracter = texto.charAt(texto.length()- 1);
        return (ultimoCaracter == 's') || (ultimoCaracter == 'S');
    }
}
