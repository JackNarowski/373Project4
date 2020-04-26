public class Pay implements Visitor {

    //Println are placeholders for actual functions

    @Override
    public void visit(PartTime e) {
        System.out.println("Paid PartTime Employee " + e.name);
    }

    @Override
    public void visit(FullTime e) {
        System.out.println("Paid FullTimeEmployee " + e.name);
    }
}
