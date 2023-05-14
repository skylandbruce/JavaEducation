package printer;
public class GraphicPrint implements InterfacePrinter{

    @Override
    public void print(String document) {
        System.out.println("-Graphic Print-");
        System.out.println(document);
        System.out.println("--------------");
    }
}
