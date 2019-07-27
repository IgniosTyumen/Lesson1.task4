import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] initial = {1,0,0,0,0,1,1,1,0,1};
        System.out.println(Arrays.toString(invert(initial)));
    }

    private static int[] invert(int[] input){
        return Arrays.stream(input).map(element -> element==1 ? 0 : 1).toArray();
    }

}
