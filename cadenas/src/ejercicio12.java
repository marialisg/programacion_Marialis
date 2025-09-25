public class ejercicio12 {
    public static void main(String[] args) {
        System.out.println(correoElectronicoValido("a@c@me.com"));
    }

    static boolean correoElectronicoValido(String correo) {
    var partes = correo.split("@");
    return partes.length == 2 &&
    partes[0].length() > 0 &&
    partes[1].indexOf('.') != -1 &&
    partes[1].indexOf('.') != 0 &&
    partes[1].indexOf('.') != partes[1].length() - 1 &&
    partes[1].indexOf('.') == partes[1].lastIndexOf('.');
    }
}
