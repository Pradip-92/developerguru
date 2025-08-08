package com.dev.guru.developerguru.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private int sid;
    private String name;
    private String gender;
    private int age;
}
