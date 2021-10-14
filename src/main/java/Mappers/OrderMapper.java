package Mappers;

import Models.Order;
import Models.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface OrderMapper {

    Order selectOrderById(int id);

    ArrayList<OrderItem> selectAllOrderItems(int pid);

    void insertNewOrder(Object o);

    void insertNewOrderItem(Object o);

}
