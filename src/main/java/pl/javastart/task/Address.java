package pl.javastart.task;

public class Address {
    private String city;
    private String street;
    private String buildingNo;
    private String apt;

    public Address(String city, String street, String buildingNo, String apt) {
        this.city = city;
        this.street = street;
        this.buildingNo = buildingNo;
        this.apt = apt;
    }
}
