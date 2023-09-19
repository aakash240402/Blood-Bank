package developer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application 
{
	
 public void start(Stage primaryStage) 
   {
		try {
				Parent root=(Parent)FXMLLoader.load(getClass().getResource("developerView.fxml")); 
				
				Scene scene = new Scene(root,600,600);
				//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Developer View");
				primaryStage.setScene(scene);
				primaryStage.initStyle(StageStyle.UTILITY);
				primaryStage.show();
				

		    } 
		catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}

