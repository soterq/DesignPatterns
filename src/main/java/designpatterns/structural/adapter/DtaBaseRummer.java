package designpatterns.structural.adapter;

public class DtaBaseRummer {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();
        dataBase.insert();
        dataBase.select();
        dataBase.update();
        dataBase.remove();
    }
}
