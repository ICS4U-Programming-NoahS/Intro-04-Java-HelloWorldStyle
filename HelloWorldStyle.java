/**
* The HelloWorld program greets my brother and asks him how school is going.
*
* @author Noah Smith
* @version 1.0
* @since 2025-02-06
*/
final class HelloWorldStyle {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println("Hi Ben!");
        System.out.println("How is school going?");
    }
}
