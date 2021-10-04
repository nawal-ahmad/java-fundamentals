package inheritance;

import java.util.ArrayList;

public class Shop extends ReviewForm {
    private String name;
    private String desc;
    private int dollarSigns;

    public Shop(String name, String desc, int dollarSigns) {
        this.name = name;
        this.desc = desc;
        this.dollarSigns = dollarSigns;
        this.reviews = new ArrayList<Review>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDollarSigns() {
        return dollarSigns;
    }

    public void setDollarSigns(int dollarSigns) {
        this.dollarSigns = dollarSigns;
    }


    @Override
    public String toString() {
        String dollar = "";
        for (int i = 0; i < dollarSigns; i++) {
            dollar += "$";
        }

        return "Shop{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", dollarSigns=" + dollarSigns +'\'' +
                ", rstars="+ stars + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
