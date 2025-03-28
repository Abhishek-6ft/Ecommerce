package com.Abhishek.Ecommerce.Repo;

import com.Abhishek.Ecommerce.Entity_Model.Orders;
import com.Abhishek.Ecommerce.Entity_Model.User;
import org.hibernate.query.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Long> {

    @Query("SELECT o from Orders o JOIN FETCH o.user")
    List<Orders> findAllOrdersWithUsers();

    List<Orders> findByUser(User user);
}
