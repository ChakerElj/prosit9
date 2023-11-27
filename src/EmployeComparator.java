import java.util.Comparator;

public class EmployeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int départementComparison = o1.getDep().compareTo(o2.getDep());
        if (départementComparison != 0) {
            return départementComparison;
        }


        return Integer.compare(o1.getGrade(), o2.getGrade());
    }
}
