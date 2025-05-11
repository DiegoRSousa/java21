package org.example.virtualthreads;

public class Address {
    private String streetName;
    private String number;

    public Address() {
    }

    public Address(String streetName, String number) {
        this.streetName = streetName;
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return streetName.equals(address.streetName) && number.equals(address.number);
    }

    @Override
    public int hashCode() {
        int result = streetName.hashCode();
        result = 31 * result + number.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

}
