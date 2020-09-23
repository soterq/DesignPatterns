package designpatterns.structural.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements DataBase{

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
    updateObject();
    }

    @Override
    public void remove() {
        removeObject();
    }

    @Override
    public void select() {
        loadObject();
    }
}
