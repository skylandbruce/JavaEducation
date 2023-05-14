package persistence;
import document.InterfaceDocument;

public class DBpersistence implements InterfacePersistence{

    @Override
    public void create(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("create db");
    }

    @Override
    public void update(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("update db");
    }

    @Override
    public void read(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("read db");
    }

    @Override
    public void delete(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("delete db");
    }

    @Override
    public void save(InterfaceDocument document) {
        // TODO Auto-generated method stub
        System.out.println("save db");
    }
    
}
