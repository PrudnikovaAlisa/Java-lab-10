public class Test {

    @MyAnnotation(value = "My first annotation")
    public void testMethod() {
        System.out.println("Test method");
    }

    public void normalMethod() {
        System.out.println("Normal method");
    }
}