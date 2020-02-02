package lesson05;

public class WithThreading {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void withThreading() {
        float[] a1 = new float[size];
        float[] a2 = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();





        Runnable firstThread = new Runnable() {
            @Override
            public void run() {
                System.arraycopy(arr, 0, a1, 0, h);
                for (int i = 0; i < a1.length - 1; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(a1, 0, arr, 0, h);
                System.out.println("END 1");
            }
        };

        Runnable secondThread = new Runnable() {
            @Override
            public void run() {
                System.arraycopy(arr, h, a2, 0, h);
                for (int i = 0; i < a2.length - 1; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(a2, 0, arr, h, h);
                System.out.println("END 2");
            }

        };

        Thread t1 = new Thread(firstThread, "firstThread");
        Thread t2 = new Thread(secondThread, "secondThread");

        t1.start();
        t2.start();
        try {
            t1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(System.currentTimeMillis() - a);
    }
}
