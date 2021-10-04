package inheritance;

public class Shop {
    private String name;
    private String desc;
    private int dollarSigns;

    public Shop(String name, String desc, int dollarSigns) {
        this.name = name;
        this.desc = desc;
        this.dollarSigns = dollarSigns;
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
                ", dollarSigns=" + dollarSigns +
                '}';
    }
}
