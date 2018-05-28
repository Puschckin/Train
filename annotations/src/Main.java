public class Main {
    public static void main(String[] args) {
        showOutVersionHistory(ClassVersion3.class);
    }

    private static void showOutVersionHistory(Class<?> versionedClass) {

        String name = versionedClass.getName();
        Version annotation = versionedClass.getAnnotation(Version.class);
        versionedClass = annotation.previous();
        if (versionedClass != Void.class) {
            showOutVersionHistory(versionedClass);
        }
        System.out.println("\n" + name + ":");
        System.out.println("version: " + annotation.value());
        System.out.println("author: " + annotation.author());
        System.out.println("Date: " + annotation.creationDate().day() + "." + annotation.creationDate().month() + "." + annotation.creationDate().year());


    }
}
