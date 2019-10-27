package interfservices;

import java.util.List;

import javax.ejb.Remote;

import entities.Tache;
import entities.User;

@Remote
public interface UserServiceRemote 
{
	public void ajouterUser(User user);
	public User getLogin(String Login, String Mdp);
	public List<User> getAllUsers();
	public List<Tache> getTachesByUser(int id) ;
}
