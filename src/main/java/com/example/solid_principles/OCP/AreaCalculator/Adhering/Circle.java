package com.example.solid_principles.OCP.AreaCalculator.Adhering;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Circle implements Shape{
    private double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
