package se.lexicon.samuel;


import se.lexicon.samuel.data.AppUserDaoJDBC;
import se.lexicon.samuel.model.AppUser;

public class App
{
    public static void main( String[] args )
    {

        AppUserDaoJDBC dao = new AppUserDaoJDBC();
        AppUser erik = dao.findById(1).orElseThrow(RuntimeException::new);
        erik.setPassword("fredrick");

        erik = dao.update(erik);
        System.out.println(erik.getPassword());




    }
}


//    AppUser appUser = new AppUser(
//            "Samuel",
//            "Adetoye",
//            "sbond07",
//            "@#$1234asd"
//    );
//
//        System.out.println(dao.create(appUser));