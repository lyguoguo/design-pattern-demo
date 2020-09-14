package com.gly.design.structure.filter;

import java.util.Collections;
import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> personList = criteria.meetCriteria(list);
        List<Person> otherPersonList = otherCriteria.meetCriteria(list);

        otherPersonList.forEach(person -> {
            if(!personList.contains(person)){
                personList.add(person);
            }
        });
        return personList;
    }
}