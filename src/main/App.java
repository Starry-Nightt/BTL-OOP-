package main;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start (Stage stage) throws Exception{
        stage.setTitle("Program");
        stage.show();
    }
    public static void main(String[] args)  {
        launch(args);
    }
}
