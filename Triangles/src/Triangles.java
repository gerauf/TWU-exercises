/**
 * Created by fergyo on 15/12/2016.
 */
public class Triangles {

    String printOne(){
        return "*";
    }

    String printHLine(int times){
        return printer(times, "*");
    }

    String printVLine(int times){
        return printer(times, "*\n");
    }


    private String printer(int times, String pattern){
        String answer = "";

        for(int x = 0; x<times; x++){
            answer = answer.concat(pattern);
        }

        return answer.trim();
    }
}
