public class CompositionMain{
    public static void main(String[] args){
        CompositionWall Wall1 = new CompositionWall("West");
        CompositionWall Wall2 = new CompositionWall("East");
        CompositionWall Wall3 = new CompositionWall("South");
        CompositionWall Wall4 = new CompositionWall("North");
        
        CompositionCeiling ceiling = new CompositionCeiling(12, 55);
        
        CompositionBed bed = new CompositionBed("Modern", 4, 3, 2, 1);
        
        CompositionLamp lamp = new CompositionLamp("Classic", false, 75);
        
        CompositionBedroom bedRoom = new CompositionBedroom("YOUR NAME HERE", Wall1, Wall2, Wall3, Wall4, ceiling,bed, lamp);
        bedRoom.makeBed();
        
        bedRoom.getLamp().turnOn();
    }
}