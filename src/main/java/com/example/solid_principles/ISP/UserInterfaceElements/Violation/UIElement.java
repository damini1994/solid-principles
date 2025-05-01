package com.example.solid_principles.ISP.UserInterfaceElements.Violation;

public interface UIElement {
    void onClick();
    void onHover();
    void onFocus();
    void onKeyPress(char key);
    String getText();
    void setText(String text);
    String getValue();
    void setValue(String value);
}
