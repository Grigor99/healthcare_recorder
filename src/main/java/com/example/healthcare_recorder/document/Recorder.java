package com.example.healthcare_recorder.document;

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
@Document(collection = "recorder")
public class Recorder implements Serializable {

    @Id
    private String id;

    @Version
    private Long version;
    @Field(name = "first_name")
    private String firstName;
    @Field(name = "last_name")
    private String lastName;
    @Field(name = "username")
    private String username;
    @Field(name = "password")
    private String password;
    private String recorderCode = "RECORDER_UNIQUE_@)@@@BJHGGHFGRTYYRYTRYTR!VS";

    @CreatedDate
    private Instant created;
    @LastModifiedDate
    private Instant lastModified;
    @Field(name = "removed")
    private boolean removed;
}
