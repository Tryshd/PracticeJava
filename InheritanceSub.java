public class InheritanceSub{
    private String name;
    private int size;
    private int weight;
    
    public InheritanceSub(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("good taste!");
    }

    public void move(){

    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    
}