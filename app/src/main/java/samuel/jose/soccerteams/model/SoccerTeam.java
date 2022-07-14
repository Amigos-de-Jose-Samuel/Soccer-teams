package samuel.jose.soccerteams.model;

public class SoccerTeam {
    private int img;
    private String name, city, state, history;

    public SoccerTeam() {

    }

    public SoccerTeam(String name, String city, String state, String history, int img) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.history = history;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
