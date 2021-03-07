package se.lexicon.samuel.data;

import se.lexicon.samuel.App;
import se.lexicon.samuel.model.AppUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class AppUserDAOJDBC {

    //CREATE
    public AppUser create(AppUser appUser){
        if(appUser == null) throw new NullPointerException("appUser was: null");
        if(appUser.getAppUserId() != 0 ) throw new IllegalArgumentException("Aborted because appUser is already persisted");
        AppUser persisted = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet keySet = null;

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement("INSERT INTO app_user (first_name, last_name, username, password) VALUES " +
                    "(?,?,?,?)", statement.RETURN_GENERATED_KEYS);
            statement.setString(1, appUser.getFristName().trim());
            statement.setString(2, appUser.getLastName().trim());
            statement.setString(3, appUser.getUserName().trim());
            statement.setString(4, appUser.getPassword().trim());
            statement.execute();

            keySet = statement.getGeneratedKeys();
            while (keySet.next()){
                persisted = new AppUser(
                        appUser.getFirstname(),
                        appUser.getLastname(),
                        appUser.getUsername(),
                        appUser.getPassword()
                );
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }finally {

        }
            return null;
    }

    //READ
    public Optional<AppUser> findById(int appUserId){
        return Optional.empty();
    }

    //UPDATE
    public AppUser update(AppUser appUser){
        return null;
    }

    //DELETE
    public boolean delete(int appUserId){
        return false;
    }
}
