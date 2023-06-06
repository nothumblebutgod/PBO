//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1
//Deskripsi : pengelola DAO dalam program

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
