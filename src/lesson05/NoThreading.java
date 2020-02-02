package lesson05;

public class NoThreading  {
    static final int size = 10000000;
    static float[] arr = new float[size];

    public static void noThreading(){
        for(int i=0; i < size; i++){
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);


    }

}
