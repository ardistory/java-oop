public class MethodOverridingApp {
    public static void main(String[] args) {
        MethodOverridingParent parent = new MethodOverridingParent();
        System.out.println(parent.getIdentity());

        MethodOverridingChild child = new MethodOverridingChild();
        System.out.println(child.getIdentity());
        System.out.println(child.getParentIdentity());
    }
}
