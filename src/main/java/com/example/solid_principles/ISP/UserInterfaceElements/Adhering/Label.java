package com.example.solid_principles.ISP.UserInterfaceElements.Adhering;

public class Label implements TextDisplay, Hoverable {
    private String text;

    public Label(String text) {
        this.text = text;
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
    public void onHover() {
        System.out.println("Label '" + text + "' hovered.");
    }
}
