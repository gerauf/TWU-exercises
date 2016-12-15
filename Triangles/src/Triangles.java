/**
 * Created by fergyo on 15/12/2016.
 */
public class Triangles {

    String printOne(){
        return "*";
    }

    String printN(int times){
        int x = 0;
        String answer = "";
        while(x<times){
            answer = answer.concat("*");
            x++;
        }
        return answer;
    }
}
