package util;

public class ArrayUtils {

    public static String printArray(int[] target) {
        String log = "";
        for(int i=0; i<target.length;i++) {
            if(log.length()>0) {
            log += ", ";
            }
            log += target[i];
        }
        return log;
    }

    public static void exchange(int[] list, int i, int j) {
        int temp = list[j];
        list[j] = list[i];
        list[i] = temp;
    }
}
