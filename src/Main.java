
public class Main {
    public static int lowestNumber(int legnth,int[] m,int lowest) {
        if(legnth==0)
        {
            return lowest;
        }
        if(m[legnth]<lowest)
        {
            lowest=m[legnth];
        }
        return lowestNumber(legnth-1,m,lowest);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}