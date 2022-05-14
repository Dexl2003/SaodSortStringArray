import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {


        String[] strArray = new String[]{"Каждый","Охотник","Желает","Знать","Где","Сидит","Фазан"};

        int[] intNumArray = new int[strArray.length];


        for (int i = 0; i < strArray.length; i++){
            intNumArray[i] = i;
        }
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(intNumArray));
        for (int i = strArray.length-1; i > 0 ; i--) {


//            System.out.println(first.charAt(0) + "\n" + second.charAt(0) );
            for (int j = 0; j < i; j++) {
                if (strArray[intNumArray[j]].charAt(0) > strArray[intNumArray[j + 1]].charAt(0)) {
                    int tmp = intNumArray[j];
                    intNumArray[j] = intNumArray[j + 1];
                    intNumArray[j + 1] = tmp;
//                System.out.println(first.charAt(0) + "\n" + second.charAt(0) );


                }
            }

        }

        System.out.println(Arrays.toString(intNumArray));

        String[] curSortStrArray = new String[strArray.length];

        for (int i = 0; i < intNumArray.length; i++){
            curSortStrArray[i] = strArray[intNumArray[i]];
        }

        System.out.println(Arrays.toString(curSortStrArray));










    }
}
