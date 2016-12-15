/**
 * Created by fergyo on 15/12/2016.
 */
public class Triangles {

    String printOne(){
        return "*";
    }

    String printHLine(int times){
        String answer = "";

        for(int x = 0; x<times; x++){
            answer = answer.concat("*");
        }

        return answer;
    }

    String printVLine(int times){
        String answer = "";

        for(int x = 0; x<times; x++){
            answer = answer.concat("*\n");
        }

        return answer.trim();
    }
}
