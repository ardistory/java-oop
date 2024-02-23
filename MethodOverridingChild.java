public class MethodOverridingChild extends MethodOverridingParent {
    String getIdentity() {
        return "This Is From Child";
    }

    String getParentIdentity() {
        return super.getIdentity();
    }
}
