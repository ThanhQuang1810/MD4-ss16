package org.example.baitap3.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter



public class Employee {
    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;
}
