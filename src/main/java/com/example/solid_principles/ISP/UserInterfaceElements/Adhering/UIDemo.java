package com.example.solid_principles.ISP.UserInterfaceElements.Adhering;

public class UIDemo {
    public static void main(String[] args) {
        Button submitButton = new Button("Submit");
        submitButton.onClick();
        submitButton.onHover();
        submitButton.setText("Click to Submit");
        System.out.println("Button Text: " + submitButton.getText());
        System.out.println();

        TextField nameField = new TextField("Enter Name");
        nameField.onClick();
        nameField.onKeyPress('J');
        nameField.onKeyPress('o');
        nameField.onKeyPress('h');
        System.out.println("Text Field Value: " + nameField.getValue());
        nameField.setValue("Jane");
        System.out.println("Text Field Value: " + nameField.getValue());
        System.out.println();

        Label titleLabel = new Label("User Details");
        System.out.println("Label Text: " + titleLabel.getText());
        titleLabel.onHover();
    }
}
