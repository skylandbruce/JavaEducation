package View;
public class StringPrinter implements InterfacePrinter{

    @Override
    public void print(String document) {
        System.out.println(document);
        System.out.println("String Print");
    }
    
}
