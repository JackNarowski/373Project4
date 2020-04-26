public abstract class Employee {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void acceptVisitor(Visitor visitor);
}
