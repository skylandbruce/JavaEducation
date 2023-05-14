package printer;
import document.InterfaceDocument;
import paper.InterfacePaper;

public class StringPrint implements InterfacePrinter{
    private InterfacePaper paper;
    private InterfaceDocument document;
    @Override
    public void print() {
        System.out.println(document.getName());
        System.out.println(paper.getLandmark());
        System.out.println(document.getUTF8());
    }

    @Override
    public void setInterfacePaper(InterfacePaper paper) {
        // TODO Auto-generated method stub
        this.paper=paper;
    }

    @Override
    public void setInterfaceDocument(InterfaceDocument document) {
        // TODO Auto-generated method stub
        this.document=document;
    }
    
}
