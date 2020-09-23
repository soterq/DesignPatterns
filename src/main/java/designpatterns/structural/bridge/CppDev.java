package designpatterns.structural.bridge;

public class CppDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("cpp dev write cpp code ...");
    }
}
