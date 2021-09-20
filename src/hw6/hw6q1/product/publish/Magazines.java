package hw6.hw6q1.product.publish;

public class Magazines extends Publish {

    private int version;
    private String company;

    public Magazines(String name, String company, int version, int price) {
        super(name, price);
        this.version = version;
        this.company = company;
    }

    public int getVersion() {
        return version;
    }

    public String getCompany() {
        return company;
    }
}
