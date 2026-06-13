package com.vacaciones;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class VacacionesController {

    @FXML private TextField nombreField;
    @FXML private TextField departamentoField;
    @FXML private TextField cargoField;
    @FXML private TextField motivoField;
    @FXML private DatePicker inicioPicker;
    @FXML private DatePicker finPicker;
    @FXML private Button guardarBtn;
    @FXML private Button limpiarBtn;

    @FXML
    private void initialize() {
        // Acción del botón Guardar
        guardarBtn.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registro exitoso");
            alert.setHeaderText(null);
            alert.setContentText("La solicitud de vacaciones fue registrada correctamente.");
            alert.showAndWait();

            limpiarCampos(); // limpiar después de guardar
        });

        // Acción del botón Limpiar
        limpiarBtn.setOnAction(e -> limpiarCampos());
    }

    // Método reutilizable para limpiar campos
    private void limpiarCampos() {
        nombreField.clear();
        departamentoField.clear();
        cargoField.clear();
        motivoField.clear();
        inicioPicker.setValue(null);
        finPicker.setValue(null);
    }
}
