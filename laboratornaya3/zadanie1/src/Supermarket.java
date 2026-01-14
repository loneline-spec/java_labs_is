public class Supermarket {
    private String nameOfDepartment;
    private String productCode;
    private String name;
    private String country;
    private double retailPrice;
    private String nameSource;

    public Supermarket() {
    }

    public Supermarket(String nameOfDepartment, String productCode, String name,
            String country, double retailPrice, String nameSource) {
        this.nameOfDepartment = nameOfDepartment;
        this.productCode = productCode;
        this.name = name;
        this.country = country;
        this.retailPrice = retailPrice;
        this.nameSource = nameSource;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getNameSource() {
        return nameSource;
    }

    public void setNameSource(String nameSource) {
        this.nameSource = nameSource;
    }

    @Override
    public String toString() {
        return String.format(
                "Supermarket{department='%s', productCode='%s', name='%s', country='%s', retailPrice=%.2f, source='%s'}",
                nameOfDepartment, productCode, name, country, retailPrice, nameSource);
    }
}
