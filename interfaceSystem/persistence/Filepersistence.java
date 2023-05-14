package persistence;
import document.InterfaceDocument;

public class Filepersistence implements InterfacePersistence{

    @Override
    public void create(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("create file");
    }

    @Override
    public void update(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("update file");
    }

    @Override
    public void read(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("read file");
    }

    @Override
    public void delete(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("delete file");
    }

    @Override
    public void save(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("save file");
    }

    
}
