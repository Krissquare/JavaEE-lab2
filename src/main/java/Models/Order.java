package Models;

import java.util.Date;

public class Order {
    int id;
    int customer_id;
    int shop_id;
    String order_sn;
    int pid;
    String consignee;
    int region_id;
    String address;
    String mobile;
    String message;
    int order_type;
    int freight_price;
    int coupon_id;
    int coupon_activity_id;
    int discount_price;
    int origin_price;
    int presale_id;
    int groupon_discount;
    int rebate_num;
    Date confirm_time;
    String shipment_sn;
    int state;
    int substate;
    int be_deleted;
    Date gmt_create;
    Date gmt_modified;
    int groupon_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getOrder_type() {
        return order_type;
    }

    public void setOrder_type(int order_type) {
        this.order_type = order_type;
    }

    public int getFreight_price() {
        return freight_price;
    }

    public void setFreight_price(int freight_price) {
        this.freight_price = freight_price;
    }

    public int getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
    }

    public int getCoupon_activity_id() {
        return coupon_activity_id;
    }

    public void setCoupon_activity_id(int coupon_activity_id) {
        this.coupon_activity_id = coupon_activity_id;
    }

    public int getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(int discount_price) {
        this.discount_price = discount_price;
    }

    public int getOrigin_price() {
        return origin_price;
    }

    public void setOrigin_price(int origin_price) {
        this.origin_price = origin_price;
    }

    public int getPresale_id() {
        return presale_id;
    }

    public void setPresale_id(int presale_id) {
        this.presale_id = presale_id;
    }

    public int getGroupon_discount() {
        return groupon_discount;
    }

    public void setGroupon_discount(int groupon_discount) {
        this.groupon_discount = groupon_discount;
    }

    public int getRebate_num() {
        return rebate_num;
    }

    public void setRebate_num(int rebate_num) {
        this.rebate_num = rebate_num;
    }

    public Date getConfirm_time() {
        return confirm_time;
    }

    public void setConfirm_time(Date confirm_time) {
        this.confirm_time = confirm_time;
    }

    public String getShipment_sn() {
        return shipment_sn;
    }

    public void setShipment_sn(String shipment_sn) {
        this.shipment_sn = shipment_sn;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSubstate() {
        return substate;
    }

    public void setSubstate(int substate) {
        this.substate = substate;
    }

    public int getBe_deleted() {
        return be_deleted;
    }

    public void setBe_deleted(int be_deleted) {
        this.be_deleted = be_deleted;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public int getGroupon_id() {
        return groupon_id;
    }

    public void setGroupon_id(int groupon_id) {
        this.groupon_id = groupon_id;
    }
}
