package com.example.solid_principles.ISP.UserInterfaceElements.Violation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Label  implements UIElement {
    private String text = "This is a label";

    @Override
    public void onClick() {
        // Labels are typically not clickable
        System.out.println("Label clicked (no action).");
    }

    @Override
    public void onHover() {
        System.out.println("Label hovered.");
    }

    @Override
    public void onFocus() {
        // Labels typically don't receive focus
        System.out.println("Label focused (no action).");
    }

    @Override
    public void onKeyPress(char key) {
        throw new UnsupportedOperationException("Label does not handle key press.");
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
        System.out.println("Label text set to: " + text);
    }

    @Override
    public String getValue() {
        throw new UnsupportedOperationException("Label does not have a value.");
    }

    @Override
    public void setValue(String value) {
        throw new UnsupportedOperationException("Label cannot set a value.");
    }
}
