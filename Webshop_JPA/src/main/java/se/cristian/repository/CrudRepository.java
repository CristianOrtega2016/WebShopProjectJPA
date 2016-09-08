package se.cristian.repository;

import java.util.List;
import java.util.function.Function;

import javax.persistence.TypedQuery;

import se.cristian.model.AbstractEntity;

public interface CrudRepository<E extends AbstractEntity>
{
	 E findById(Long id);
	 List<E> fetchMany(String queryName, Function<TypedQuery<E>, TypedQuery<E>> queryFunction);
	 E saveOrUpdate(E entity);
	 E merge(E entiry);
}
