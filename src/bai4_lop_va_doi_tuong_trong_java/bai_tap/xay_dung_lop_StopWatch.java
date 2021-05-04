package bai4_lop_va_doi_tuong_trong_java.bai_tap;
import java.util.Arrays;

public class xay_dung_lop_StopWatch {

    private static xay_dung_lop_StopWatch main;

    public static class StopWatch {
        private double startTime;
        private double endTime;

        public StopWatch(double startTime) {
            this.startTime = startTime;
        }

        public double getStartTime() {
            return this.startTime;
        }

        public double getEndTime() {
            return this.endTime;
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.endTime = System.currentTimeMillis();
        }

        public double getElapsedTime() {
            return this.endTime - this.startTime;
        }


    }


        public static void main(String[] args) {
            double currentSystemTime = System.currentTimeMillis();
            StopWatch stopWatch = new StopWatch(currentSystemTime);
            stopWatch.start();


            main.sortArray(100000);

            stopWatch.stop();
            System.out.println(stopWatch.getElapsedTime());
        }
        public static void sortArray(int size){
            int[] array =new  int[size];
            for (int i = 0; i < size;i++){
                array[i] = (int) (Math.random() * size);
            }
            Arrays.sort(array);
        }
    

}
