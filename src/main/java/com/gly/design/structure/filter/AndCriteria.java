package com.gly.design.structure.filter;

import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> personList = criteria.meetCriteria(list);
        return otherCriteria.meetCriteria(personList);
    }
}
