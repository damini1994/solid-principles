package com.example.solid_principles.ISP.UserInterfaceElements.Violation;

public class Button  implements UIElement {
    private String text = "Click Me";

    @Override
    public void onClick() {
        System.out.println("Button clicked.");
    }

    @Override
    public void onHover() {
        System.out.println("Button hovered.");
    }

    @Override
    public void onFocus() {
        System.out.println("Button focused.");
    }

    @Override
    public void onKeyPress(char key) {
        throw new UnsupportedOperationException("Button does not handle key press directly.");
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
        System.out.println("Button text set to: " + text);
    }

    @Override
    public String getValue() {
        throw new UnsupportedOperationException("Button does not have a value.");
    }

    @Override
    public void setValue(String value) {
        throw new UnsupportedOperationException("Button cannot set a value.");
    }
}
