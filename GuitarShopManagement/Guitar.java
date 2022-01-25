import java.util.*;
public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec spec;
    public Guitar(String serialNumber,double price,GuitarSpec spec) {
        this.serialNumber=serialNumber;
        this.price=price;
        this.spec=spec;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public Type getType() {
        return spec.type;
    }
    public String getModel() {
        return spec.model;
    }
    public Builder getBuilder() {
        return spec.builder;
    }
    public Wood getBackWood() {
        return spec.backWood;
    }
    public Wood getTopWood() {
        return spec.topWood;
    }
    public int numStrings() {
        return spec.numStrings;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public GuitarSpec getSpec() {
        return new GuitarSpec(spec.model,spec.type,spec.numStrings,spec.builder,spec.backWood,spec.topWood);
    }
}
