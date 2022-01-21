package com.example.healthcare.documents;

import com.example.healthcare.configs.utils.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Doctors implements Serializable {

    private String id;
    private Long version;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String specialProfession;
    private String awards;
    private String biography;
    private Availability availability;
//    private Instant createdAt;
//    private Instant lastModified;
    private boolean removed;
    private Integer experience;
    private DOCTOR_STATUS doctorStatus;
    private String doctoralCode = "doctors_code_8988998991111_UUUU_LLL)*(&(((JKHJH%";
    private String emailCode;
    private String authorities = UserType.DOCTOR.getLabel();

    public enum DOCTOR_STATUS {
        REGISTERED, ACTIVE, BLOCKED;
    }

    public Doctors(String firstName, String lastName, String username, String password, String specialProfession, String awards, String biography) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.specialProfession = specialProfession;
        this.awards = awards;
        this.biography = biography;
    }
}
