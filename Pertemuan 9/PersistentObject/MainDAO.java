//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1
//Deskripsi: Main program untuk akses DAO

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person ("Boy");
        DAOManager m = new DAOManager();
        m.setPersonDAO (new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   