public class VariableExample {

    // Static variable
    private static int staticVariable = 0;

    // Instance variable
    private int instanceVariable;

    // Constructor
    public VariableExample(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // Method to demonstrate local, instance, and static variables
    public void demonstrateVariables() {
        // Local variable
        int localVariable = 10;

        // Modifying instance variable
        instanceVariable += 5;

        // Modifying static variable
        staticVariable += 1;

        // Displaying values
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Creating first instance of VariableExample
        VariableExample example1 = new VariableExample(20);
        example1.demonstrateVariables();
        
        // Creating second instance of VariableExample
        VariableExample example2 = new VariableExample(30);
        example2.demonstrateVariables();
        
        // Static variable accessed via class name
        System.out.println("Static Variable accessed via class name: " + VariableExample.staticVariable);
    }
}
