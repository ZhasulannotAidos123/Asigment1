
public class Main {
    /*
    *
    * */
    public static double getMean(int currIndex, int[] m,double sum) {
        if (currIndex == m.length) {
            return (double) sum / m.length;
        }
        return getMean(currIndex + 1,m,m[currIndex]+sum);
    }

    public static double getMean()
    {
        int[] m={3,4,1,5,-12};
        return getMean(0,m,0);
    }
    public static void main(String[] args) {
        double startTime=System.nanoTime();
        double result = getMean();
        double endTime =System.nanoTime();
        double duration =(endTime-startTime)/1000000;
        System.out.println("mean number "+result);
        System.out.println("Duration "+duration);
    }
}