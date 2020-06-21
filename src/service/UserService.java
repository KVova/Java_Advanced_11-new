package service;

import domain.User;
import shared.AbstractCRUD;

<<<<<<< HEAD
public interface UserService extends AbstractCRUD<User> {
	User getUserByEmail(String email);
}
=======
public interface UserService extends AbstractCRUD<User>{
	User readByEmail(String eMail);
}
>>>>>>> branch 'project-1-jsp-servlets-jdbc' of https://github.com/KVova/Java_Advanced_11-new.git
