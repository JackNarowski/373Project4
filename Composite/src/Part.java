public class Part extends Component {
    public int time;
    public String name;

    Part(String name,int time){
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
