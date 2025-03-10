package com.taskmaneger.demo.web.dataModel;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Role {

    @Id
    @SequenceGenerator(name = "role_sequence",sequenceName = "role_sequence", initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_sequence")
    private long id;
    private String roleName;


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
