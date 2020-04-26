public class PartTime extends Employee {
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}
