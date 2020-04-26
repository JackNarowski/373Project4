import java.util.Vector;
import java.util.Enumeration;

public class Assembly extends Component {
    private Vector components = new Vector();

    public void add(Component c){
        components.add(c);
    }

    @Override
    public int getTime() {
        Enumeration <Component> e = components.elements();
        int time = 0;
        while (e.hasMoreElements()){
            time+= e.nextElement().getTime();
        }
        return time;
    }
}
