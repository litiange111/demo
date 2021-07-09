package com.example.demo.queuearray数组模拟队列;

public class AddressDemo {
    private String address;
    private int num;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }




    public AddressDemo(String address, int num) {
        super();
        this.address =address;
        this.num =num;
    }



    @Override
    public String toString() {
        return "AddressDemo{" +
                "address='" + address + '\'' +
                ", num=" + num +
                '}';
    }
}
