package com.example.solid_principles.ISP.UserInterfaceElements.Violation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextField  implements UIElement {
    private String value = "Initial Value";

    @Override
    public void onClick() {
        System.out.println("Text field clicked (gained focus).");
    }

    @Override
    public void onHover() {
        System.out.println("Text field hovered.");
    }

    @Override
    public void onFocus() {
        System.out.println("Text field focused.");
    }

    @Override
    public void onKeyPress(char key) {
        value += key;
        System.out.println("Key '" + key + "' pressed in text field. Current value: " + value);
    }

    @Override
    public String getText() {
        return getValue();
    }

    @Override
    public void setText(String text) {
        setValue(text);
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
        System.out.println("Text field value set to: " + value);
    }
}
