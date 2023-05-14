package View;
public class GraphicPrint implements InterfacePrint{

    @Override
    public void press(String document) {
        System.out.println("---------");
        System.out.println(document);
        System.out.println("Graphic Print");
        System.out.println("---------");
    }
    
}
