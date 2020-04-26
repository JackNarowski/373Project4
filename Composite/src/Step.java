public class Step extends Component {
    public int time;
    public String name;

    Step(String name, int time){
        this.name = name;
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getTime(){
        return time;
    }
}
