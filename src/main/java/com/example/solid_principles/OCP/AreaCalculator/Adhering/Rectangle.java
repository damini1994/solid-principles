package com.example.solid_principles.OCP.AreaCalculator.Adhering;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle implements Shape{
    private double height;
    private double width;

    public double calculateArea() {
        return width * height;
    }
}
