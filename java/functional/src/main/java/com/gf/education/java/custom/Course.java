package com.gf.education.java.custom;

import lombok.Data;

@Data
public class Course {
  private String name;
  private String category;
  private int reviewScore;
  private int noStudents;
}
