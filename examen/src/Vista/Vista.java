package Vista;

import Model.*;
import java.util.Scanner;

/**
 * Classe Vista.
 * Gestiona les interaccions amb l'usuari mostrant menús i demanant dades.
 */
public class Vista {
    Scanner scanner = new Scanner(System.in);

    /**
     * Mostra el menú inicial amb les opcions disponibles.
     */
    public void mostrarmenuinicial() {
        System.out.println(
                "MENU:" +
                        "\n1. Crear automàticament 10 habitatges (5 cases 5 pisos)" +
                        "\n2. Cercar dades habitatge" +
                        "\n3. Esborrar habitatge" +
                        "\n4. Llistar cases o pisos");
    }

    /**
     * Demana una opció numèrica a l'usuari.
     * @param frase Missatge que es mostrarà per demanar l'opció
     * @return L'opció introduïda per l'usuari
     * @throws Exception Si hi ha un error llegint l'entrada
     */
    public int askOpcio(String frase) throws Exception {
        System.out.println(frase);
        return scanner.nextInt();
    }

    /**
     * Demana una cadena de text a l'usuari.
     * @param frase Missatge que es mostrarà per demanar la cadena
     * @return La cadena introduïda per l'usuari
     */
    public String askString(String frase) {
        System.out.println(frase);
        String a;
        return a = scanner.nextLine();
    }

    /**
     * Mostra el submenú per crear 10 habitatges automàticament.
     */
    public void submenu1() {
        System.out.println("Creant 10 habitatges...");
    }

    /**
     * Mostra el submenú per cercar un habitatge.
     */
    public void submenu2() {
        System.out.println("Introdueix el nom del propietari i l'adreça");
    }

    /**
     * Mostra el submenú per esborrar un habitatge.
     */
    public void submenu3() {
        System.out.println("Introdueix el nom del propietari i l'adreça del habitatge que desitges esborrar:");
    }

    /**
     * Mostra el submenú per llistar cases o pisos.
     */
    public void submenu4() {
        System.out.println("Quin tipus d'habitatge vols veure?:" + "\n1.Cases" + "\n2.Pisos");
    }
}
