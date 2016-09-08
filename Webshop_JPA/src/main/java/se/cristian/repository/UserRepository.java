package se.cristian.repository;

import java.util.List;

import se.cristian.model.User;

public interface UserRepository extends CrudRepository<User>
{
	List<User> fetchAll();
	List<User> fetchUsersByUsername(final String username);
}
