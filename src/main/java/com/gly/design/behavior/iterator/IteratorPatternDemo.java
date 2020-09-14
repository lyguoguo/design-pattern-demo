package com.gly.design.behavior.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for(Iterator iterator = nameRepository.getIterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
