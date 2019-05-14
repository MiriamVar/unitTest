import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

public class Methods {

    public double checkTriangle(double a, double b, double c){
        if (!(a== 0 || b==0 || c==0)){
            if((a+b)>c && (b+c)>a && (c+a)>b){
                return a+b+c;
            }
            return -1;
        }
        return -1;
    }

    public String formatText(String text){
        String text2 = text.toLowerCase();
        Character.toUpperCase(text2.charAt(0));
        return text2;
    }


    public MongoDatabase getConnectionToMongoDB(){
        try {
            //conection
            MongoClient client = new MongoClient("localhost", 27017);
            //access
            MongoDatabase database = client.getDatabase("unitTest");
            return database;

        }catch (Exception e){
                System.out.println(e);
            }
            return null;
        }

        String pin;

    public void validDateMain(){
        MongoDatabase database = getConnectionToMongoDB();
        MongoCollection<Document>  collectionPID = database.getCollection("user_pid");
        ArrayList<Document> documentsPID = collectionPID.find().into(new ArrayList<>());
        for(Document document : documentsPID){
            System.out.println(document);
            pin= document.get("pid").toString();
            generateDOB(pin);
        }

    }
    public String generateDOB(String personalNum){
        String year = String.valueOf(personalNum.charAt(0))+String.valueOf(personalNum.charAt(1));
        String month = String.valueOf(personalNum.charAt(2))+String.valueOf(personalNum.charAt(3));
        String day = String.valueOf(personalNum.charAt(4))+String.valueOf(personalNum.charAt(5));

        System.out.println(day+"."+month+"."+year);
        return day+"."+month+"."+year;
    }


}
