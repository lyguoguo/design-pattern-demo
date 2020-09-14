package com.gly.design.behavior.interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String date){
        this.data = date;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
