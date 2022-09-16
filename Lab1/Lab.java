class Lab {
    public static void main(String[] args) {
        // Объявление и заполнение первого массива
        final int SIZE = 11;

        long[] a = new long[SIZE];

        for (int i = 0; i < SIZE; i++) {
            a[i] = 5 + 2 * i;
        }
        // Объявление и заполнение второго массива

        float[] x = new float[SIZE];
        float MIN_RANGE = -7.00f;
        float MAX_RANGE = 13.00f;

        for (int i = 0; i < SIZE; i++) {
            x[i] = (float) ((Math.random() * (MAX_RANGE - MIN_RANGE)) + MIN_RANGE);
        }

        // Объявление и заполнение третьего (итогового) массива

        double[][] a2 = new double[SIZE][SIZE];
        double cache;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                if (a[i] == 25) {
                    cache = 1 + Math.E * (x[j] + 3) / 2;
                    cache = Math.cos(Math.atan(cache));
                    cache = Math.pow(Math.cos(cache), 2);
                    cache = Math.log(cache);

                } else if (a[i] == 9 || a[i] == 17 || a[i] == 19 || a[i] == 21 || a[i] == 23) {
                    cache = 0.25 * Math.sin(x[j]);
                    cache = Math.atan(cache);

                } else {
                    cache = Math.PI * (Math.abs(x[j]) + 1) / 2;
                    cache = Math.pow(cache, 3);
                    cache = Math.cos(Math.log(cache));
                }

                a2[i][j] = cache;
            }
        }

        // Вывод третьего (итогового) массива
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%.5f ", a2[i][j]);
            }
            System.out.println();
        }
    }
}