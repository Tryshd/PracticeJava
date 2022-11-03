import java.util.ArrayList;
public class ListGrocery{
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addList(String item){
        groceryList.add(item);
    }

    public void PrintList(){
        System.out.println(groceryList.size() + "items");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println( i + "." + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("position" +position +" is assigned " + newItem);
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        System.out.println("removing " + theItem);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(exists && position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}