package com.example.healthcare_recorder.util.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DocDto implements Serializable {
    private String firstName;
    private String lastName;
    private String specialty;
}
