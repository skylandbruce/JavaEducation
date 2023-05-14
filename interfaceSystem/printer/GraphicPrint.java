package printer;
import document.InterfaceDocument;
import paper.InterfacePaper;

public class GraphicPrint implements InterfacePrinter{
    private InterfacePaper paper;
    private InterfaceDocument document;
    
    @Override
    public void print() {
        System.out.println("---------");
        System.out.println(document.getName());
        System.out.println(paper.getLandmark());
        System.out.println(document.getUnicode());
        System.out.println("---------");
    }

    @Override
    public void setInterfacePaper(InterfacePaper paper) {
        // TODO Auto-generated method stub
        this.paper=paper;
    }

    public void setInterfaceDocument(InterfaceDocument document) {
        this.document = document;
    }
    
}
