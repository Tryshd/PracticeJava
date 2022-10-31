public class CompositionLamp{
    private String style;
    private boolean battery;
    private int globRating;

    public CompositionLamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    
    public void turnOn(){
        System.out.println("Lighting ");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    
}