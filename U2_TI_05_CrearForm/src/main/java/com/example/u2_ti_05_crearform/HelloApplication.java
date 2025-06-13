package com.example.u2_ti_05_crearform;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label lblnombre = new Label("Nombre: ");
        TextField tfnombre = new TextField();
        Label lblapellido = new Label("Apellido: ");
        TextField tfapellido = new TextField();
        Label lbledad = new Label("Edad: ");
        TextField tfedad = new TextField();
        ObservableList<String> rol = FXCollections.observableArrayList("Estudiante","Profesor","Admin");
        ComboBox<String> cbox = new ComboBox<String>(rol);
        Button btncrear = new Button("Crear");
        Button btnreset = new Button("Reset");
        Label lblresultado = new Label("Resultado: ");

        btncrear.setOnAction(e -> {
            lblresultado.setText("Aceptado!");
        });

        btnreset.setOnAction(e -> {

            lblresultado.setText("Cancelado!");
        });

        GridPane root= new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setStyle("-fx-padding. 20;");

        root.add(lblnombre,0,0);
        root.add(tfnombre,1,0);
        root.add(lblapellido,0,1);
        root.add(tfapellido,1,1);
        root.add(lbledad,0,2);
        root.add(tfedad,1,2);
        root.add(cbox,1,3);
        root.add(btncrear,0,4);
        root.add(btnreset,1,4);
        root.add(lblresultado,0,5,2,1);

        btncrear.setOnAction(e -> {
            String nombre = tfnombre.getText();
            String apellido = tfapellido.getText();
            String edad = tfedad.getText();
            cbox.setItems(rol);
            if(!nombre.isEmpty() && !apellido.isEmpty() && !edad.isEmpty()) {
            root.setStyle("-fx-background-color:lightgreen;-fx-padding. 20;");
            lblresultado.setStyle("-fx-background-color:lightred;-fx-padding. 10;");
            lblresultado.setText("Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad+ "Rol: "+cbox.getValue());
            }else {
                lblresultado.setText("Los campos no estan completos");
                lblresultado.setStyle("-fx-background-color:lightcoral;-fx-padding. 20;");
            }
        });
        btnreset.setOnAction(e -> {
            tfnombre.clear();
            tfapellido.clear();
            tfedad.clear();
            cbox.getSelectionModel().clearSelection();
            lblresultado.setText("");
            lblresultado.setStyle("");
            root.setStyle("-fx-padding: 20;");
        });


        stage.setTitle("Formulario");
        Scene scene = new  Scene(root, 500,500);
        /*Image image = new Image(getClass().getResourceAsStream("/images/cheese.png"));
        stage.getIcons().add(image);*/
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}