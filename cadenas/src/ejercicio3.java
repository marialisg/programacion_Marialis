public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println(esVocal('@')); // false
    }

    static boolean esVocal(char letra) {
        var letraMinuscula = Character.toLowerCase(letra);
        return "aeiou".contains(Character.toString(letraMinuscula));
    }
}
