package com.epam;

public class Runner {

    public static void main(String[] args) {

        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.err.println("Catched ArithmeticException");
        } catch (RuntimeException e) {
            System.err.println("Catched RuntimeException");
        } catch (Exception e) {
            System.err.println("Catched Exception");
        }
    }
}
