package se.lexicon.samuel;


import se.lexicon.samuel.data.AppUserDAOJDBC;
import se.lexicon.samuel.model.AppUser;

public class App
{
    public static void main( String[] args )
    {

        AppUserDAOJDBC dao = new AppUserDAOJDBC();

        AppUser appUser = new AppUser(
                "Samuel",
                "Adetoye",
                "sbond07",
                "@#$1234asd"
        );


    }
}
