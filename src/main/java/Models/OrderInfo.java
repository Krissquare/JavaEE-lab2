package Models;

import java.util.ArrayList;

public class OrderInfo {
    ArrayList<oItem> orderItems;
    String consignee;
    Integer regionId;
    String address;
    String mobile;
    String message;
    Integer couponId;
    Integer presaleId;
    Integer groupId;
}

class oItem{
    Integer skuId;
    Integer quantity;
    Integer couponActId;
}
