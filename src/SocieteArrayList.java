import java.util.*;

public class SocieteArrayList implements IGestion<Employee>{


    private final List<Employee> employeeList = new ArrayList<>();


    @Override
    public void ajouterEmpoye(Employee employee) {
           employeeList.add(employee);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee e : employeeList)
            if (e.getNom().equals(nom) )
                return true ;
        return false ;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
      return this.employeeList.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        if (!rechercherEmploye(employee)){
            System.out.println("L'employee n'existe pas ");
            return;
        }
        employeeList.removeIf(e -> e.equals(employee));

    }

    @Override
    public void displayEmploye() {
        this.employeeList.forEach(
                System.out::println
        );

    }

    @Override
    public void trierEmployeParId() {

        Collections.sort(employeeList);

    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        this.employeeList.sort(new EmployeComparator());

    }



}
