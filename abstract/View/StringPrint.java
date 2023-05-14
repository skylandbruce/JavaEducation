package View;
public class StringPrint implements InterfacePrint{

    @Override
    public void press(String document) {
        System.out.println(document);
        System.out.println("String Print");
    }
    
}
