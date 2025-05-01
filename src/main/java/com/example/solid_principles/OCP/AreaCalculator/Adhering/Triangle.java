package com.example.solid_principles.OCP.AreaCalculator.Adhering;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Triangle implements Shape{
    private double base;
    private double height;

    public double calculateArea() {
        return 0.5 * base * height;
    }

}
