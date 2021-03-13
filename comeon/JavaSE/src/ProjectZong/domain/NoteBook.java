package ProjectZong.domain;

// DATE: 2021/1/31-9:39  Happy Every Day


public class NoteBook implements Equipment{
    private String model;//型号
    private double price;//价格

    public NoteBook(){}
    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model+'('+price+')';
    }

    @Override
    public String toString() {
        return model+"("+ price+")";
    }
}
