/**
 * Interface generated from UML model.
 * Represents action resolution operations in the LARPHub system.
 */
public interface IRozstrzyganie {
    boolean sprawdzWarunkiAkcji(int idAkcji, int idPostaci);
    EfektAkcji wykonajAkcje(int idAkcji, int idPostaci);
    WynikRozstrzygniecia rozstrzygnijEfekt(int idEfektu, Decyzja decyzja);
}
