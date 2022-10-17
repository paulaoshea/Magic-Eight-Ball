import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.util.Random;


// 
public class MagicEightBall extends Application
{
    private TextField answer; 
    
    public void start(Stage primaryStage)
    {
        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: lemonchiffon");
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        //gridPane.setGridLinesVisible(true);

        ImageView logo = new ImageView(new Image("magicball.jpg"));
       
        //logo.setImage(image);
        logo.setFitWidth(200);
        logo.setPreserveRatio(true);
        logo.setSmooth(true);
        logo.setCache(true);
         
        //gridPane.add(logo, 0, 0, 1, 3);
                 gridPane.add(logo, 0, 0);
 
        Text title = new Text("JENNY!!! .... Welcome to Magic Eight Ball!");
        title.setFont(new Font(24));
        gridPane.setHalignment(title, HPos.CENTER);
        gridPane.add(title, 1, 0, 2, 1);
        
        Label userLabel = new Label("Ask a question :");
        userLabel.setFont(new Font(18));
        GridPane.setHalignment(userLabel, HPos.RIGHT);
        gridPane.add(userLabel, 1, 1);
        
        TextField userName = new TextField();
        userName.setPrefColumnCount(40);
        gridPane.add(userName, 2, 1);
        userName.setOnAction(this::processReturn);

        
        answer = new TextField();
        gridPane.add(answer, 2, 2);
        
        Scene scene = new Scene(gridPane, 1000 , 450);
        
        primaryStage.setTitle("Magic Eight Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
       
    //--------------------------------------------------------------------
    //  
    //  
    //--------------------------------------------------------------------
    public void processReturn(ActionEvent event)
    {
        int randomNumber;
        
        Random generator = new Random();
        randomNumber = generator.nextInt(28);
        String stringNumber = Integer.toString(randomNumber);
        
        //if ((returnedName.length() >= 2) && (returnedDate.length() == 6)) 
         //   outputLabel.setText("Your password is : " + 
          //                      returnedName.substring(0,2) +
           //                     "." +
            //                    randomNumber +
             //                   returnedDate.substring(2,6));
        //else answer.setText("Name or date is invalid"); 
        //answer.setText(stringNumber); 
         switch (randomNumber)
         {
            case 0:
               answer.setText("It is certain");
               break;
            case 1:
               answer.setText("You wish");
               break;
            case 2:
               answer.setText("My sources say no, but they also said" +
                              " yogurt tubes were delicious");
               break;
            case 3:
               answer.setText("Seven billion people on the planet and you ask me that");
               break;
            case 4:
               answer.setText("Absolutely not");
               break;
            case 5:
               answer.setText("How about I ask you a question for a change?");
               break;
            case 6:
               answer.setText("Hey, no one said I know everything");
               break;
            case 7:
               answer.setText("Yes Amigo, yes");
               break;
            case 8:
               answer.setText("ERROR : Ask someone else sucker");
               break;
            case 9:
               answer.setText("Yes, you are drunk on apple juice");
               break;
            case 10:
               answer.setText("You have got to be kidding");
               break;
            case 11:
               answer.setText("YASSSSSS");
               break;
            case 12:
               answer.setText("Uh-huh");
               break;
            case 13:
               answer.setText("Nah");
               break;
            case 14:
               answer.setText("No way Jose");
               break;
            case 15:
               answer.setText("My mind is still thinking, ask again later");
               break;
            case 16:
               answer.setText("That's the best question you could think of!");
               break;
            case 17:
               answer.setText("That isn't even a question!");
               break;
            case 18:
               answer.setText("Sigh ....");
               break;
            case 19:
               answer.setText("Hee, hee, hee, the answer is yes");
               break;
            case 20:
               answer.setText("How in the world do I know");
               break;
            case 21:
               answer.setText("What a dumb question");
               break;
            case 22:
               answer.setText("I'll tell you the answer if you get me cookies and OJ");
               break;
            case 23:
               answer.setText("You think I'm going to say no but the answer is YES");
               break;
            case 24:
               answer.setText("You went to \"see How to train your dragon\", so no");
               break;
            case 25:
               answer.setText("I know you secretly love Justin Bieber, so no");
               break;
            case 26:
               answer.setText("I could recite the answer in my sleep - YES, YES, YES");
               break;
            case 27:
               answer.setText("I couldn't be more certain");
               break;
            default:
               answer.setText("Well I really dont know");     
         }
    }                   



    public static void main(String[] args)
    {
        launch(args);
    }
}
