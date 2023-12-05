import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>
{

    private int id;
    private String prenom ;
    private String nom;
    private Departement dep;
    private int grade ;

    public Employee() {
    }

    public Employee(int id, String prenom, String nom, Departement dep, int grade) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.dep = dep;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Departement getDep() {
        return dep;
    }

    public void setDep(Departement dep) {
        this.dep = dep;
    }

    public int getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", dep='" + dep + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id,o.getId());
    }
}
