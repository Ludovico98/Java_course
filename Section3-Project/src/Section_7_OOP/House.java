package Section_7_OOP;

public class House {
    private int numStories;
    private int numWindows;
    private String colour;

    //noArgContractor
    public House() {
        numStories = 1;
        numWindows = 4;
        colour = "grey";
    }

    //parameterized constractor
    public House(int numStories, int numWindows, String colour) {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.colour = colour;
    }

    public int getNumStories() {
        return numStories;
    }

    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



}
