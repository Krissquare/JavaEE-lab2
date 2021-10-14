package Services;

import Mappers.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    Object queryCompleteOrder(int id){
        return null;
    }

    void addNewOrder(Object orderInfo){

    }

}
