package printer;
public class StringPrint implements InterfacePrinter{

    @Override
    public void print(String document) {
        System.out.println("String Print");
        System.out.println(document);
    }
}
