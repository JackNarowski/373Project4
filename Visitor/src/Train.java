public class Train implements Visitor {

    //Println are placeholders for actual functions

    @Override
    public void visit(PartTime e) {
        System.out.println("Trained PartTime employee " + e.name);
    }

    @Override
    public void visit(FullTime e) {
        System.out.println("Trained FullTime employee " + e.name);
    }
}
