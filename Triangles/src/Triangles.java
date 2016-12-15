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

    String printTriangle(int times){
        String answer = "";

        for ( int x = 1; x <= times; x++ ){
            for ( int y = 1; y <= x; y++ ){
                answer = answer.concat("*");
            }
            answer = answer.concat("\n");

        }
        return answer.trim();
    }


    private String printer(int times, String pattern){
        String answer = "";

        for(int x = 0; x<times; x++){
            answer = answer.concat(pattern);
        }

        return answer.trim();
    }
}
