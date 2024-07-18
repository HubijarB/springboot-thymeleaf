package com.template.springboot.thymeleafdemo.model;

import com.template.springboot.thymeleafdemo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {


    private String firstName;


    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 messages")
    private String postalCode;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @NotBlank
    private String lastName;

    @Min(value=0, message = "must be greater than or equal to zero ")
    @Max(value = 10, message = "must be greater than or equal to 10")
    @NotNull(message = "is required")
    private Integer freePasses;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Customer(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
}
