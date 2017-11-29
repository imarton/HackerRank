import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/apple-and-orange/problem

public class AppleAndOrange {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("AppleAndOrange.txt"));
        //System.out.println(in.next());
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int aCount = 0, oCount = 0;
        for(int f:apple) {
        	if(a+f>=s && a+f<=t) aCount++;
        }
        for (int o : orange) {
        	if(b+o>=s && b+o<=t) oCount++;
		}
        System.out.println(aCount);
        System.out.println(oCount);
        in.close();
    }    
}
