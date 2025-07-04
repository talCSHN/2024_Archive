package com.dto;

public class PaymentDTO {
    private String paymentid;
    private String tdetailid;
    private String paymentmethod_yn;
    private int total;
    private String userid;
    private String paymentdate;

    public PaymentDTO() {
    }

    public PaymentDTO(String paymentid, String tdetailid, String paymentmethod_yn, int total, String userid, String paymentdate) {
        this.paymentid = paymentid;
        this.tdetailid = tdetailid;
        this.paymentmethod_yn = paymentmethod_yn;
        this.total = total;
        this.userid = userid;
        this.paymentdate = paymentdate;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getTdetailid() {
        return tdetailid;
    }

    public void setTdetailid(String tdetailid) {
        this.tdetailid = tdetailid;
    }

    public String getPaymentmethod_yn() {
        return paymentmethod_yn;
    }

    public void setPaymentmethod_yn(String paymentmethod_yn) {
        this.paymentmethod_yn = paymentmethod_yn;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate;
    }




}