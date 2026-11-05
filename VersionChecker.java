import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class VersionChecker {

    public static void checkVersions() {

        Method[] methods = Software.class.getDeclaredMethods();

        Arrays.sort(methods, Comparator.comparing(Method::getName));

        int count = 0;

        for (Method method : methods) {

            Version version = method.getAnnotation(Version.class);

            if (version != null) {
                System.out.println(
                        "Method: " + method.getName()
                                + ", Version: " + version.number()
                                + ", Author: " + version.author());

                count++;
            }
        }

        System.out.println("Methods without annotation: " + (methods.length - count));
    }
}
