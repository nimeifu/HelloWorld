package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Prompt Payment Interest Rates");
        final NumberAxis xAxis=new NumberAxis();
        final NumberAxis yAxis=new NumberAxis();
        xAxis.setLabel("Fiscal Year");
        final LineChart<Number,Number> lineChart=new LineChart<Number,Number>(xAxis,yAxis);

        XYChart.Series series=new XYChart.Series();
        series.getData().add(new XYChart.Data("7/2012","1.75%"));
        series.getData().add(new XYChart.Data("1/2013","1.38%"));
        series.getData().add(new XYChart.Data("7/2013","1.75%"));
        series.getData().add(new XYChart.Data("1/2014","2.13%"));
        series.getData().add(new XYChart.Data("7/2014","2%"));
        series.getData().add(new XYChart.Data("1/2015","2.13%"));



        primaryStage.setScene(new Scene(root, 1000, 1000));
        lineChart.getData().add(series);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
