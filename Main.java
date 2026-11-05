import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        Test test = new Test();

        Method method = Test.class.getDeclaredMethod("testMethod");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

        if (annotation != null) {
            System.out.println("MyAnnotation: " + annotation.value());
        }

        Method normalMethod = Test.class.getDeclaredMethod("normalMethod");
        MyAnnotation normalAnnotation = normalMethod.getAnnotation(MyAnnotation.class);

        if (normalAnnotation == null) {
            System.out.println("Normal method has no annotation");
        }

        test.testMethod();

        Example example = new Example();
        example.oldMethod();

        System.out.println();

        Software software = new Software();

        software.featureOne();
        software.featureTwo();
        software.featureThree();

        System.out.println();

        VersionChecker.checkVersions();
    }
}