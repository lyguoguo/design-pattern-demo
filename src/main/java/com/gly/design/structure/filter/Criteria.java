package com.gly.design.structure.filter;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> list);
}
