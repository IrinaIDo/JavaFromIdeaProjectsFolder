package naming_conventions;

public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;

    public SomeClass(String name) {
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
