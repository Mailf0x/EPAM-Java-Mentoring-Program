package com.epam;

public class CompositeClass {

    private class PrivateClass {

        public void greet() {
            System.out.println("PrivateClass: hello");
        }
    }

    protected class ProtectedClass {

        public void greet() {
            System.out.println("ProtectedClass: hello");
        }
    }

    public class PublicClass {

        public void greet() {
            System.out.println("PublicClass: hello");
        }
    }
}
