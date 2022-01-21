package com.example.healthcare.hessian.service;

import com.example.healthcare.documents.Doctors;

import java.io.Serializable;

public interface DoctorsService  {
    Doctors getById(String id) ;
}
