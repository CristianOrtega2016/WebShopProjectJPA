package se.cristian.repository;

import static java.util.function.Function.*;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import se.cristian.model.Order;
import se.cristian.model.User;
import se.cristian.model.status.OrderStatus;

public class JpaOrderRepository extends AbstractJpaRepository<Order> implements OrderRepository
{


	public JpaOrderRepository(final EntityManagerFactory factory)
	{
		super(factory, Order.class);
	}

	@Override
	public List<Order> fetchAll()
	{
		return fetchMany("Order.FetchAll", identity());
	}

	@Override
	public List<Order> fetchOrdersByUser(final User user)
	{
		return fetchMany("Order.FetchOrdersByUser", queryFunction -> queryFunction.setParameter("id", user.getId()));
	}

	@Override
	public List<Order> fetchOrdersByStatus(final OrderStatus status)
	{
		return fetchMany("Order.FetchOrdersByStatus", queryFunction -> queryFunction.setParameter("status", status));
	}

	@Override
	public List<Order> fetchOrdersByMinimumValue(final Double minimumValue)
	{
		return fetchMany("Order.FetchOrdersByMinimumValue", queryFunction -> queryFunction.setParameter("totalPrice", minimumValue));
	}
}
