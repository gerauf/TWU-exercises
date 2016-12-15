
/**
 * Created by fergyo on 15/12/2016.
 */
public class Triangles {

    String printOne(){
        return "*";
    }

    String printHLine(int times){
        return strRepeat("*", times);
    }

    String printVLine(int times){
        String answer = strRepeat("*\n", times);
        return removeLast(answer);
    }

    String printTriangle(int times){
        String answer = "";

        for ( int x = 1; x <= times; x++ ){
            answer = answer + strRepeat("*", x) + "\n";
        }
        return removeLast(answer);
    }

    String printIsoTriangle(int times){
        String answer = "";

        for (int x = 1; x<=times; x++ ){
            int spaceLength = times - x;
            int starLength = 2 * x - 1;
            answer = answer + strRepeat(" ", spaceLength) + strRepeat("*", starLength) + strRepeat(" ", spaceLength) + "\n";
        }

        return removeLast(answer);
    }


    private String strRepeat(String pattern, int times){
        String answer = "";

        for(int x = 0; x<times; x++){
            answer = answer.concat(pattern);
        }

        return answer;
    }

    private String removeLast(String someString){
        return someString.substring(0,someString.length()-1);
    }
}
