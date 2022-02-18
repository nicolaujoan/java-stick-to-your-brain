package design_patterns;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
