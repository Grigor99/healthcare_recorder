package com.example.healthcare_recorder.migration;


import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@ChangeLog(order = "201")
public class Logs {

    private final String DOCTORS_COLLECTION = "doctors";

    @ChangeSet(order = "201", id = "create recorder collection", author = "mongock")
    public void createRecorderCollection(MongockTemplate db) {
        if (!db.collectionExists("recorder")) {
            db.createCollection("recorder");
        }
    }
    @ChangeSet(order = "201", id = "create receipt collection", author = "mongock")
    public void createReceiptCollection(MongockTemplate db) {
        if (!db.collectionExists("receipt")) {
            db.createCollection("receipt");
        }
    }

}
