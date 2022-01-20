package com.example.healthcare_recorder.repository;

import com.example.healthcare_recorder.document.Receipt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends MongoRepository<Receipt,String> {
}
