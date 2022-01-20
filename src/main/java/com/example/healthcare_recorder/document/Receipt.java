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

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "receipt")
public class Receipt {
    @Id
    private String id;

    @Version
    private Long version;
    @Field(name = "recorder_id")
    private String recorderId;
    @Field(name = "doctor_id")
    private String doctorId;
    @Field(name = "reason")
    private String reason;
    @Field(name = "description")
    private String description;
    @CreatedDate
    private Instant created;
    @LastModifiedDate
    private Instant lastModified;
    @Field(name = "removed")
    private boolean removed;
}
