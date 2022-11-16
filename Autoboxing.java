import java.util.ArrayList;


public class Autoboxing{
    public static void main(String[] args){
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tryshd");
        //List型では基本データ型(intなど)を入れることができない
        //ラッパークラスを作成することで基本データを扱える.
        //ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(10));
        //最初から定義されているラッパークラス
        //Integer integer = Integer.valueOf(11);
        //Double doubleValue = Double.valueOf(11.11);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        intArrayList.add(Integer.valueOf(100));
        intArrayList.add(101);


        ArrayList<Double> DoubleValues = new ArrayList<Double>();
        DoubleValues.add(11.11);
        DoubleValues.add(Double.valueOf(11.12));
    }
}

//このようにラッパークラスを作成
class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}