import java.util.*;

//https://www.hackerrank.com/challenges/grading/problem

public class Grades {

    static int[] solve(int[] grades){        
    	int[] result = new int[grades.length];
    	for(int i=0;i<grades.length;i++) {
    		if(grades[i]<38) result[i] = grades[i];
    		else {
    			int r = grades[i] % 5;
    			int d = grades[i] / 5;
    			if(r>2) result[i] = 5 * (d+1);
    			else result[i] = grades[i]; 
    		} 
    	}
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        in.close();        

    }
}
