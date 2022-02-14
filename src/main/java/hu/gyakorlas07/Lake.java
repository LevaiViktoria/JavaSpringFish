package hu.gyakorlas07;


import org.springframework.beans.factory.annotation.Autowired;

public class Lake {

    private Fish fish;
    private Fisherman fisherman;

    @Autowired
    public void setFish(Fish fish) {
        this.fish = fish;
    }

    @Autowired
    public Fish getFish() {
        return fish;
    }

    @Autowired
    public Fisherman getFisherman(){
        return fisherman;
    }
}
