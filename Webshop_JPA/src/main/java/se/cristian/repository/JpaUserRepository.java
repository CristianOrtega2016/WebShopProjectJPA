package se.cristian.repository;

import static java.util.function.Function.*;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import se.cristian.model.User;

public class JpaUserRepository extends AbstractJpaRepository<User> implements UserRepository
{
	public JpaUserRepository(final EntityManagerFactory factory)
	{
		super(factory, User.class);
	}

	@Override
	public List<User> fetchAll()
	{
		return fetchMany("User.FetchAll", identity());
	}

	@Override
	public List<User> fetchUsersByUsername(final String username)
	{
		return fetchMany("User.FetchUserByUsername", queryFunction -> queryFunction.setParameter("username", username));	
	}
}
