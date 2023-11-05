package com.amigoscode.DTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.amigoscode.Entity.Customer}
 */
public class CustomerSaveRequestDTO implements Serializable {
    private final String name;
    private final String email;
    private final int age;

    public CustomerSaveRequestDTO(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerSaveRequestDTO entity = (CustomerSaveRequestDTO) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.age, entity.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "email = " + email + ", " +
                "age = " + age + ")";
    }
}