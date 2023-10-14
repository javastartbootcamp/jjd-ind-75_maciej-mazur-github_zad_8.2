package pl.javastart.task;

public class Address {
    private final String city;
    private final String street;
    private final String buildingNo;
    private final String apt;

    public Address(String city, String street, String buildingNo, String apt) {
        this.city = city;
        this.street = street;
        this.buildingNo = buildingNo;
        this.apt = apt;
    }
}
