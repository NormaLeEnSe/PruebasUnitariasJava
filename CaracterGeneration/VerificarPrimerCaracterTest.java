package CaracterGeneration;

import org.junit.Test;

public class VerificarPrimerCaracterTest {
	@Test
	public void VerificarPrimerCaracter() {
		String[] palabras = { "12 street", "Hola", "crayoli", "#ch30", " ", null };

		for (String palabra : palabras) {
			String tipo = VerificarPrimerCaracter.verificarPrimerCaracter(palabra);
			System.out
					.println("La palabra \"" + (palabra != null ? palabra : "null") + "\" es un tipo \"" + tipo + "\"");
		}
	}
}
