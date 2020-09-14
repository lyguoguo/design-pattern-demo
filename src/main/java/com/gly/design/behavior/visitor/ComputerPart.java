package com.gly.design.behavior.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
