package com.example.myProjectBattery.data;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Battery {
 @Id
   private int id;
    private String name;
    private int voltage;
    private int capacity;
    private int number;

 public Battery() {
 }

 public Battery (String name) {
     this.name=name;
    }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
}

