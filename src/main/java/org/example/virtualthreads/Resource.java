package org.example.virtualthreads;

import java.util.Objects;

public class Resource {

    private Address address;

    public Resource() {
    }

    public Resource(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return Objects.equals(address, resource.address);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(address);
    }

    @Override
    public String toString() {
        return "Resource{" +
                "address=" + address +
                '}';
    }
}

