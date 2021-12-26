package com.epam;

public class Runner {

    public static void main(String[] args) {
        CompositeClass comp = new CompositeClass();
        CompositeClass.PublicClass pbl = comp.new PublicClass();

        // No acces
        //CompositeClass.PrivateClass prv = comp.new PrivateClass();

        // No acces
        //CompositeClass.ProtectedClass prt = comp.new ProtectedClass();

        pbl.greet();
        //prv.greet();
        //prt.greet();
    }
}
