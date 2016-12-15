
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
        return removeLast(strRepeat("*\n", times));
    }

    String printTriangle(int times){
        String answer = "";

        for ( int x = 1; x <= times; x++ ){
            answer = answer + strRepeat("*", x) + "\n";
        }
        return removeLast(answer);
    }

    String printIsoTriangle(int times){

        return removeLast(isoHelper(times, true, ""));
    }

    String printDiamond(int times){
        String answer = "";
        answer = answer + isoHelper(times, true, "") + isoHelper(times - 1, false, " ");
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

    private String isoHelper(int times, boolean ascending, String buffer){
        String answer = "";
        if(ascending){
            for ( int x = 1; x <= times; x++ ) {
                answer = answer + centeredLine(times - x, 2 * x - 1, buffer);
            }
        }else {
            for ( int x = times; x >= 1; x-- ) {
                answer = answer + centeredLine(times - x, 2 * x - 1, buffer);
            }
        }
        return answer;
    }

    private String centeredLine(int spaceLength, int starLength, String buffer){
        return buffer
                + strRepeat(" ", spaceLength)
                + strRepeat("*", starLength)
                + strRepeat(" ", spaceLength)
                + buffer + "\n";
    }
}
