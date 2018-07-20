

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program extends Application {



    public void start(Stage primaryStage) throws Exception {
        Numbers G = new Numbers();
        GridPane root = new GridPane();
        root.setHgap(3);root.setVgap(3);
        root.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);

        Button btn1 = new Button("+");btn1.setAlignment(Pos.CENTER);btn1.setPrefSize(100,30);
        Button btn2 = new Button("-");btn2.setAlignment(Pos.CENTER);btn2.setPrefSize(100,30);
        Button btn3 = new Button("*");btn3.setAlignment(Pos.CENTER);btn3.setPrefSize(100,30);
        Button btn4 = new Button("/");btn4.setAlignment(Pos.CENTER);btn4.setPrefSize(100,30);

        TextField N = new TextField();N.setPromptText("N");N.setPrefSize(100,30);
        TextField M = new TextField();M.setPromptText("M");M.setPrefSize(100,30);
        TextField R = new TextField();R.setPromptText("RESULT");R.setPrefSize(203,30);

        final double[] X = new double[1];
        final double[] Y = new double[1];



        root.setConstraints(N,0,0);root.setConstraints(M,1,0);
        root.setConstraints(R,0,1);
        root.setConstraints(btn1,0,2);root.setConstraints(btn3,1,2);
        root.setConstraints(btn2,0,3);root.setConstraints(btn4,1,3);

        root.setColumnSpan(btn1,1);root.setColumnSpan(btn2,1);
        root.setColumnSpan(btn3,1);root.setColumnSpan(btn4,1);
        root.setColumnSpan(R,2);

        root.setHalignment(btn1, HPos.CENTER); root.setHalignment(btn2, HPos.CENTER);
        root.setHalignment(btn3, HPos.CENTER); root.setHalignment(btn4, HPos.CENTER);


        btn1.setOnAction(event -> {
            R.setText(null);
            if(N.getText() != null || M.getText() != null) {
                try {
                    X[0] = Double.parseDouble(N.getText());
                    Y[0] = Double.parseDouble(M.getText());
                    R.setText(String.valueOf(G.SUM(X[0], Y[0])));
                    X[0] = 0.0f;
                    N.setText(null);
                    Y[0] = 0.0f;
                    M.setText(null);
                }catch (NumberFormatException e){
                    e.getStackTrace();
                }
            }else {
                R.setText(null);
            }
        });

        btn2.setOnAction(event -> {
            R.setText(null);
            if(N.getText() != null || M.getText() != null) {
                try {
                    X[0] = Double.parseDouble(N.getText());
                    Y[0] = Double.parseDouble(M.getText());
                    R.setText(String.valueOf(G.DIFF(X[0], Y[0])));
                    X[0] = 0.0f;
                    N.setText(null);
                    Y[0] = 0.0f;
                    M.setText(null);
                }catch (NumberFormatException e){
                    e.getStackTrace();
                }
            }else {
                R.setText(null);
            }
        });

        btn3.setOnAction(event -> {
            R.setText(null);
            if(N.getText() != null || M.getText() != null) {
                try {
                    X[0] = Double.parseDouble(N.getText());
                    Y[0] = Double.parseDouble(M.getText());
                    R.setText(String.valueOf(G.MULTIPLY(X[0], Y[0])));
                    X[0] = 0.0f;
                    N.setText(null);
                    Y[0] = 0.0f;
                    M.setText(null);
                }catch (NumberFormatException e){
                    e.getStackTrace();
                }
            }else {
                R.setText(null);
            }
        });

        btn4.setOnAction(event -> {
            R.setText(null);
            if(N.getText() != null || M.getText() != null) {
                try {
                    X[0] = Double.parseDouble(N.getText());
                    Y[0] = Double.parseDouble(M.getText());
                    R.setText(String.valueOf(G.DIVIDE(X[0], Y[0])));
                    X[0] = 0.0f;
                    N.setText(null);
                    Y[0] = 0.0f;
                    M.setText(null);
                }catch (NumberFormatException e){
                    e.getStackTrace();
                }
            }else {
                R.setText(null);
            }
        });




        root.getChildren().addAll(btn1,btn2,btn3,btn4,N,M,R);
        root.setAlignment(Pos.CENTER);
        Scene scn = new Scene(root, 300,250);
        primaryStage.setScene(scn);
        primaryStage.setTitle("testProject1");
        primaryStage.show();


    }

    public static void main(String[] args){

        launch(args);


    }


}
