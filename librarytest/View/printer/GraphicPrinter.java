package View.printer;

import View.InterfacePrinter;

public class GraphicPrinter implements InterfacePrinter{

    @Override
    public void print(String document) {
        System.out.println("---------");
        System.out.println(document);
        System.out.println("Graphic Print");
        System.out.println("---------");
    }
    
}
