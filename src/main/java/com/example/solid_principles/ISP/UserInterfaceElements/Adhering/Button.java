package com.example.solid_principles.ISP.UserInterfaceElements.Adhering;

public class Button implements Clickable, Hoverable, Focusable, TextDisplay {
    private String text;

    public Button(String text) {
        this.text = text;
    }

    @Override
    public void onClick() {
        System.out.println("Button '" + text + "' clicked.");
    }

    @Override
    public void onHover() {
        System.out.println("Button '" + text + "' hovered.");
    }

    @Override
    public void onFocus() {
        System.out.println("Button '" + text + "' focused.");
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
}
