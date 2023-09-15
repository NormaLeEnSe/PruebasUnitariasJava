package CaracterGeneration;

public class VerificarPrimerCaracter {
	public static String verificarPrimerCaracter(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return "Other"; 
        }

        char primerCaracter = palabra.charAt(0);

        if (Character.isDigit(primerCaracter)) {
            return "Number";
        } else if (Character.isUpperCase(primerCaracter)) {
            return "Mayus";
        } else if (Character.isLowerCase(primerCaracter)) {
            return "Minus";
        } else {
            return "Other";
        }
    }
}
