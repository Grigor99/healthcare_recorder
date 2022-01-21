package com.example.healthcare_recorder.controller;

import com.example.healthcare.hessian.service.DoctorsService;
import com.example.healthcare_recorder.util.dto.DocDto;
import com.example.healthcare_recorder.util.uri.DocURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorsController {

    @Autowired
    private DoctorsService doctorsService;

    @PostMapping
    public ResponseEntity<?> searchDocs(@RequestBody DocDto dto) {
        return null;
    }

    @GetMapping(DocURI.DOCTOR)
    public ResponseEntity<?> getById(@PathVariable(value = "id") String id) {
        return ResponseEntity.ok(doctorsService.getById(id));
    }
}
