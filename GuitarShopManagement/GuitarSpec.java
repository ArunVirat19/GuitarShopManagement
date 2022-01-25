public class GuitarSpec {
    int numStrings;
    String model;
    Builder builder;
    Type type;
    Wood backWood,topWood;
    public GuitarSpec(String model,Type type,int numStrings,Builder builder,Wood backWood,Wood topWood) {
        this.model=model;
        this.builder=builder;
        this.type=type;
        this.numStrings=numStrings;
        this.backWood=backWood;
        this.topWood=topWood;
    }
    public boolean matches(GuitarSpec guitar) {
        if(builder!=guitar.builder)
            return false;
        if((model!=null) && (!model.equals("")) && (!model.equals(guitar.model)))
            return false;
        if(type!=guitar.type)
            return false;
        if(numStrings!=guitar.numStrings)
            return false;
        if(backWood!=guitar.backWood)
            return false;
        if(topWood!=guitar.topWood)
            return false;
        return true;
    }
    public String getModel() {
        return model;
    }
    public Builder getBuilder() {
        return builder;
    }
    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }
    public int getNumStrings() { return numStrings; }
}
