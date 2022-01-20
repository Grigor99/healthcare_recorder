package com.example.healthcare_recorder.repository;

import com.example.healthcare_recorder.document.Recorder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface recorderRepository extends MongoRepository<Recorder,String> {
}
