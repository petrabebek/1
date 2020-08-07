package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{

        /*Table.create(tip_korisnika.class);
        Table.create(korisnik.class);
        Table.create(autor.class);
        Table.create(knjiga.class);
        Table.create(rezervacija.class);*/


       /*tip_korisnika tk = new tip_korisnika();
        tk.setIme_uloge("Admin");
       tk.save();*/

     /*tip_korisnika tk = new tip_korisnika();
     tk.setIme_uloge("Korisnik");
     tk.save();*/


        /*korisnik admin = new korisnik();
        admin.setIme("admin");
        admin.setPrezime("admin");
        admin.setKorisnicko_ime("admin1");
        admin.setSifra("1234");
        admin.setEmail("admin@fpmoz.sum.ba");
        admin.setId_tipa_korisnika(1);*/
        //admin.save();


        Main.primaryStage = primaryStage;
        Main.showWindow(
                getClass(),
                "../view/Login.fxml",
                "Prijavte se na sustav", 600, 300);
    }

    public static void showWindow(Class windowClass, String viewName, String title, int w, int h) throws IOException {
        Parent root = FXMLLoader.load(windowClass.getResource(viewName));
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root, w, h));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
