public class CompositionBedroom{
    private String name;
    private CompositionWall wall1;
    private CompositionWall wall2;
    private CompositionWall wall3;
    private CompositionWall wall4;
    private CompositionCeiling ceiling;
    private CompositionBed bed;
    private CompositionLamp lamp;
    public CompositionBedroom(String name, CompositionWall wall1, CompositionWall wall2, CompositionWall wall3,
            CompositionWall wall4, CompositionCeiling ceiling, CompositionBed bed, CompositionLamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public CompositionLamp getLamp(){
        return this.lamp;
    }

    public void makeBed(){
        bed.make();
    }
}