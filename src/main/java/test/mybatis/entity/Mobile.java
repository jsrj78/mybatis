package test.mybatis.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias(value = "mobile")
public class Mobile implements Serializable {

    private static final long serialVersionUID = -5438339795954006852L;

    private String os;
    private String brand;
    private String model;
    private int price;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
