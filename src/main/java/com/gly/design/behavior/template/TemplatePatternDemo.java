package com.gly.design.behavior.template;

import com.gly.design.structure.filter.Criteria;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.play();

        System.out.println();

        Football football = new Football();
        football.play();
    }
}
