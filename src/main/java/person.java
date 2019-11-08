import java.sql.SQLOutput;

public class person  {
    private String  name;
    private String speak;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
    public void showInfo(){
        System.out.println(name+"说"+speak);
    }
}
