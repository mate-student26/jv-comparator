package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = Comparator
                .comparing(Employee::getAge)
                .thenComparing(Employee::getName);

        TreeSet<Employee> sortedSet = new TreeSet<>(employeeComparator);
        sortedSet.addAll(employees);
        return sortedSet;
    }
}

