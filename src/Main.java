import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
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

        AffectationHashMap affectationHashMap = new AffectationHashMap();
        Map<Employee, Departement> employeeDepartementMap = affectationHashMap.getEmployeeDepartementMap();
        Departement info = new Departement(1,"INFO",100);
        Departement rh = new Departement(2,"RH",20);
        Employee e1 = new Employee(1,"Chaker","Elj",info,5);
        Employee e2 = new Employee(2,"Ezzdine","Binzbiba",rh,10);
        Employee e3 = new Employee(0,"Ali","Belhaj",info,5);


        affectationHashMap.ajouterEmployeeDepartement(e1, e1.getDep() );
        affectationHashMap.ajouterEmployeeDepartement(e2, e2.getDep() );
        affectationHashMap.afficherEmployesEtDepartement();
        affectationHashMap.supprimerEmployee(e3);
        affectationHashMap.supprimerEmployeeEtDepartement(e1,info);
        affectationHashMap.supprimerEmployeeEtDepartement(e2,info);
        System.out.println("Affichage : ");
        affectationHashMap.afficherEmployees();
        affectationHashMap.afficherDepartements();
        System.out.println("End affichage ");
        affectationHashMap.ajouterEmployeeDepartement(e3,info);
        System.out.println("This the sorted map : ");
        affectationHashMap.trierMap().forEach((employee, departement) -> System.out.println(employee.getPrenom() +"-id:"+ employee.getId() + " -> " + departement.getNom()));
    }
}