package document;

public class DocumentA implements InterfaceDocument{
    private String name="Document A";
    private String document="Title: About Interface A";
    
    @Override
    public String getName() {
        return name;
    }
    
    private String transUnicode(){
        document+=" Unicode encoded";
        return document;
    }
    private String transUTF8(){
        document+=" UTF8 encoded";
        return document;
    }
    @Override
    public String getUnicode() {
        // TODO Auto-generated method stub
        return transUnicode();
    }

    @Override
    public String getUTF8() {
        // TODO Auto-generated method stub
        return transUTF8();
    }

}
