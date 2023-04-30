package com.example.myProjectBattery.data;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class LightDevice {

    int id;

    String name;
    int voltage;

    int power;

    // int[] Capacity= new int []{1,2,4,5,9,10,15,20,25,30,35,40,45,50 };

    int number;

}
