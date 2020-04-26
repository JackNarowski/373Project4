public class FullTime extends Employee {
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}
