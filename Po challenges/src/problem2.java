import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class problem2 {

    static   public int calculateStr(String str){
        int result=0;
        char[] arrStr = str.toCharArray();

        for (char a:arrStr
        ) {if (Character.isDigit(a)){
            result+= Integer.parseInt(String.valueOf(a));
        }

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(calculateStr("yut654ty"));

    }

}
