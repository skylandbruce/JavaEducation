package persistence;
import document.InterfaceDocument;

public interface InterfacePersistence {
    // CURD
    void create(InterfaceDocument document);
    void update(InterfaceDocument document);
    void read(InterfaceDocument document);
    void delete(InterfaceDocument document);
    void save(InterfaceDocument document);
    
}
