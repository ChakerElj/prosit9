import java.util.*;

public class AffectationHashMap {
    private final Map<Employee,Departement> employeeDepartementMap = new HashMap<>() ;


    public Map<Employee, Departement> getEmployeeDepartementMap() {
        return employeeDepartementMap;
    }

    public void ajouterEmployeeDepartement(Employee e, Departement d){
        employeeDepartementMap.put(e,d);
        
    }
    public void afficherEmployesEtDepartement(){
        for (Map.Entry<Employee,Departement> employeeDepartementEntry : employeeDepartementMap.entrySet()
        ){
            System.out.println(employeeDepartementEntry.getKey() + " --> "+employeeDepartementEntry.getValue());
        }
    }
    public void supprimerEmployee(Employee e)  {

            employeeDepartementMap.remove(e);


    }

    public  void supprimerEmployeeEtDepartement(Employee e, Departement d){
        if(employeeDepartementMap.remove(e,d))
             employeeDepartementMap.remove(e,d);
        else
            System.out.println(e.getPrenom()+" don't exit or don't work in this department "+d.getNom());
    }
    public void afficherEmployees(){
       employeeDepartementMap.keySet().forEach(System.out::println);
    }
    public void afficherDepartements(){
        employeeDepartementMap.values().forEach(System.out::println);
    }
    public boolean rechercherEmployee(Employee e){
        if (!employeeDepartementMap.containsKey(e))
            System.out.println("Employee don't exist");
        System.out.println("Employee founded this is the departement " + employeeDepartementMap.get(e));
        return employeeDepartementMap.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d){
        Collection<Departement> allDepartements = employeeDepartementMap.values();
        if (allDepartements.contains(d)){
            System.out.println("Departement "+ d.getNom()+ "is founded");
            return true ;
        }
        System.out.println("Departement "+ d.getNom() + "Not founded");
          return false ;
    }
    public TreeMap<Employee,Departement> trierMap() {
        return new TreeMap<>(employeeDepartementMap);
    }

}
