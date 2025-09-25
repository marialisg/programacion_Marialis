public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esPalindrome("Aa"));
    }

    static boolean esPalindrome(String texto) {
        var primera = Character.toLowerCase(texto.charAt(0));
        var segunda = Character.toLowerCase(texto.charAt(1));
        return primera == segunda;
    }
}
