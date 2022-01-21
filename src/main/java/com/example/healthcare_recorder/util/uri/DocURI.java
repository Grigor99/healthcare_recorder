package com.example.healthcare_recorder.util.uri;

public interface DocURI {
    String BASE = "/healthcare_records/api/v3";
    String DOCTORS = BASE + "/doctors";
    String DOCTOR = DOCTORS + "/{id}";
}
