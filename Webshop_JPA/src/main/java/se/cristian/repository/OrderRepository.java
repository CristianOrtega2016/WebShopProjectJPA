package se.cristian.repository;

import java.util.List;

import se.cristian.model.Order;
import se.cristian.model.User;
import se.cristian.model.status.OrderStatus;

public interface OrderRepository extends CrudRepository<Order>
{
	List<Order> fetchAll();
	List<Order> fetchOrdersByUser(final User user);
	List<Order> fetchOrdersByStatus(final OrderStatus status);
	List<Order> fetchOrdersByMinimumValue(final Double minimumValue);
}
