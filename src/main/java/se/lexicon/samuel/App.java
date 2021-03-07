package se.lexicon.samuel;


import se.lexicon.samuel.data.AppUserDaoJDBC;
import se.lexicon.samuel.model.AppUser;

public class App
{
    public static void main( String[] args )
    {

        AppUserDaoJDBC dao = new AppUserDaoJDBC();

        AppUser appUser = dao.create(new AppUser("John", "wick", "jwick", "1234"));
        System.out.println(appUser);



    }
}

//for the create method
//    AppUser appUser = new AppUser(
//            "Samuel",
//            "Adetoye",
//            "sbond07",
//            "@#$1234asd"
//    );
//
//        System.out.println(dao.create(appUser));


//for the findbyID method

//    AppUser erik = dao.findById(1).orElseThrow(RuntimeException::new);
//        erik.setPassword("fredrick");
//
//                erik = dao.update(erik);
//                System.out.println(erik.getPassword());


//for the delete run
//System.out.println(dao.delete(1));