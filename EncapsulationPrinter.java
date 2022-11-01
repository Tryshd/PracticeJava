import java.util.*;
public class EncapsulationPrinter{
    private int tonerLevel = -1;
    private int pagesPrinted;
    private boolean duplex;
    public EncapsulationPrinter(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    
    public int addToner(int tonerAmount){
        if(this.tonerLevel > 0 && tonerAmount <= 100){
            if((this.tonerLevel+ tonerAmount) > 100){
                return -1;
            }else{
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex == true){
            System.out.println("duplex True");
            pagesToPrint = (pagesToPrint/2) + (pages % 2);
        }else{
            System.out.println("duplex False");
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}