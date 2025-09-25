public class ejercicio {
    public static void main(String[] args) {
        System.out.println(empiezaConMinuscula("marialis"));
    }
    public static boolean empiezaConMinuscula(String s) {
        var primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }
}
