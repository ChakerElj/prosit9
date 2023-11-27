import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashSet<Departement> departements = new HashSet<>();
        DepartementHashSet departementService = new DepartementHashSet(departements);
        Departement d = new Departement(1,"informatique",10);
        Departement d2 = new Departement(1,"informatique",10);
        departementService.ajouterDepartement(d);
        departementService.ajouterDepartement(d2); // should not added to hash set duplicate
        departementService.displayDepartement();

        Departement d3 = new Departement(0,"finance",20);
        departementService.ajouterDepartement(d3);
        System.out.println(departementService.trierDepartementById()); // output : departement id: 0 -> departement id : 1




    }
}