package com.example.solid_principles.ISP.UserInterfaceElements.Violation;

public class UIViolationDemo {
    public static void main(String[] args) {
        Button submitButton = new Button();
        try {
            submitButton.onKeyPress('a'); // Button doesn't handle key press well
            System.out.println("Button Value: " + submitButton.getValue()); // Button doesn't have a value
        } catch (UnsupportedOperationException e) {
            System.out.println("Error with Button: " + e.getMessage());
        }

        TextField nameField = new TextField("Enter Name");
        nameField.setText("John");

        Label titleLabel = new Label("User Details");
        titleLabel.setValue("Some Value"); // Label doesn't have a value
    }

}
