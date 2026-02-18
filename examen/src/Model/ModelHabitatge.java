package Model;

import java.util.ArrayList;

/**
 * Classe ModelHabitatge.
 * Gestiona una llista d'habitatges i permet afegir, cercar i eliminar habitatges.
 */
public class ModelHabitatge {
    private ArrayList<Habitatge> habitatges;

    /**
     * Constructor de la classe.
     * Inicialitza l'ArrayList intern d'habitatges.
     */
    public ModelHabitatge() {
        habitatges = new ArrayList<>();
    }

    /**
     * Afegeix un habitatge a la llista.
     * @param h Habitatge a afegir
     */
    public void AfegirHabitatge(Habitatge h) {
        habitatges.add(h);
    }

    /**
     * Retorna tots els habitatges guardats.
     * @return ArrayList d'habitatges
     */
    public ArrayList<Habitatge> getHabitatges() {
        return habitatges;
    }

    /**
     * Recorre l'ArrayList i retorna l'habitatge que coincideix amb el propietari i l'adreça indicats.
     * @param propietari Nom del propietari a buscar
     * @param adreca Adreça de l'habitatge a buscar
     * @return Habitatge trobat, o null si no hi ha coincidències
     */
    public Habitatge buscarHabitatge(String propietari, String adreca) {
        for (Habitatge h : habitatges) {
            if (h.getPropietari().equalsIgnoreCase(propietari) &&
                    h.getAdreca().equalsIgnoreCase(adreca)) {
                return h;
            }
        }
        return null; // No trobat
    }

    /**
     * Elimina l'habitatge que coincideixi amb el propietari i l'adreça indicats.
     * @param propietari Nom del propietari de l'habitatge a eliminar
     * @param adreca Adreça de l'habitatge a eliminar
     * @return Sempre retorna null (es pot modificar si es vol retornar l'habitatge eliminat)
     */
    public Habitatge eliminarHabitatge(String propietari, String adreca) {
        for (Habitatge h : habitatges) {
            if (h.getPropietari().equalsIgnoreCase(propietari) &&
                    h.getAdreca().equalsIgnoreCase(adreca)) {
                habitatges.remove(h);
                break; // Surt del bucle després d'eliminar
            }
        }
        return null;
    }
}
