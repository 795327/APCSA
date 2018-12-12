
/**
 * ReviewRunner
 *
 * @author (Noel Salmeron)
 * @version (1211)
 */
import static java.lang.System.out; // for printing by just using 'out.print()'
import java.util.ArrayList;
public class ReviewRunner{
    private int x = 78;

    public ReviewRunner(){
        x = 99;
    }

    public ReviewRunner(int y) {
        x = y;
    }

    public static void main(){
        // #1
        int ap = 789;
        ap = ap % 10;
        System.out.println("#1: " + ap); // 9

        // #2 
        // a. this

        // #3
        System.out.println("#3: " + 3 + 3 * 3); // 12

        // #4
        // b. Java123 ---> can't start w/ numbers; or be a type

        // #5
        System.out.println("#5: " + "\\dog\\cat"); // \dog\cat

        // #6
        System.out.println("#6: " + getIt(9)); // 6 --> adds 4 at end of big if statement

        // #7
        System.out.println("#7: " + getIt(3)); // 7

        // #8
        int[] list1 = {2,12,11,45,52,36,5,3,1};
        System.out.println("#8: " + go(list1)); // 71.0 --> returns decimal bc of double type 
        //                                                    & adds every other int in array

        // #9
        int[] list2 = {2,12,11,45,52,36};
        System.out.println("#9: " + go(list2)); // 65.0

        // #10 --> working to locate the smallest int in an array
        // public static int go(int[] ray){
        // int val = Integer.MIN_VALUE;
        // for (int i=0; i < ray.length; i++)
        // if (ray[i] > val)
        // val = ray[i];
        // return val;
        // }

        // #11
        int[] list3 = {3, 6, 9, 2, 4, 5};
        System.out.println("#11: " + go2(list3)); // 29

        // #12
        System.out.println("#12: " + "rsteva".substring(3,4)); // e --> doesn't include second param

        // #13
        int x = 4; // 17 --> int acts as string when being added to string
        if (x >= 2){
            System.out.print("#13: " + "1" + 7);
            if (x >= 7)
                System.out.print("#13: " + "2" + 4);
        } else {
            System.out.print("#13: " + "3" + 9);
        }

        // #14 --> onetwoonetwoone (no spaces between each 'one' and 'two')
        ReviewRunner test = new ReviewRunner();
        System.out.println("\n#14: ");
        test.one();
        test.two();
        test.two();

        // #15 --> onetwooneone
        ReviewRunner go = new ReviewRunner();
        System.out.println("\n#15: ");
        go.one();
        go.two();
        go.one();

        // #16 --> 12345678910
        System.out.println("\n#16: ");
        for(int h = 1; h <= 10; h++)
            System.out.print(h);

        // #17 --> 4 -1 6 --> indexOf() returns -1 if string not found
        String a = "abcdefsdfg";
        String b = "ems";
        System.out.println("\n#17: ");
        for (int i = 0; i < b.length(); i++){
            out.print(a.indexOf(b.substring(i, i+1)));
            out.print(" ");
        }

        // #18 --> problem: ArrayList<String> aList = ___________ 
        //                  (note: need '()' after making new ArrayList)
        ArrayList<String> aList = new ArrayList<String>();

        // #19
        out.println("\n#19: " + check(99)); // false

        // #20 
        String s = "computers";
        String t = s.substring(3,7);
        int x2 = s.indexOf(t + s.substring(7, 8));
        out.println("#20: " + x2); // 3

        // #21
        ArrayList<String> bList = new ArrayList();
        bList.add(0,"one");
        bList.add("two");
        bList.set(0,"three");
        bList.add(1,"four");
        bList.set(1,"five");
        System.out.println("#21: " + bList.get(0).substring(0,1)); // t

        // #22
        ArrayList<Integer> cList = new ArrayList<Integer>();
        cList.add(0,1);
        cList.add(2);
        cList.set(0,3);
        cList.add(1, 4);
        cList.set(1, 5);
        int i = cList.get(0);
        System.out.println("#22: " + i); // 3

        // #23
        ReviewRunner anIt = new ReviewRunner();
        System.out.println("#23: " + anIt); // 99

        // #24
        ArrayList<ReviewRunner> itList = new ArrayList<ReviewRunner>();
        itList.add(new ReviewRunner()); // creates based off constructor so x = 99
        itList.add(new ReviewRunner(8));
        System.out.println("#24: " + itList); // [99, 8] (note: can print ArrayList normally)

        // #25
        ArrayList<Integer> dList = new ArrayList<Integer>();
        dList.add(8);
        dList.add(2);
        dList.add(0,5);
        dList.add(0,6);
        dList.add(9);
        System.out.println("#25: " + dList); // [6, 5, 8, 2, 9]

        // #26
        // System.out.println("#26: ");
        // int out = 0; 
        // int in = 0;
        // for (out = 1; out < 4; out++){
        // for (in = 1; in < 3; in++){
        // in ++;
        // out --;
        // }
        // }
        // System.out.println(out*in); // -36

        // #27
        int[] list = {1,2,3,4,5,6};
        System.out.println("#27: " + go3(list)); // 3.5

        // #28
        double wNum = 5 / 2;
        wNum = wNum * 5.0;
        System.out.println("#28: " + wNum); // 10.0 --> '5/2' only does int which is 2, not 2.5

        // #29
        // System.out.println("#29: ");
        // int out = 0, in = 0;
        // for (out = 1; out < 4; out++){
        // for (in = 1; in < 3; in++){
        // in++;
        // out--;
        // }
        // }
        // System.out.println(out*in);

        // #30
        int[][] mat = {{2,3,4,5},
                {6,7,8,9,10}};
        System.out.println("#30: ");
        System.out.print(mat[1].length + " "); // 5
        System.out.print(mat.length + " "); // 2 --> number of arrays, not length of both arrays added
        System.out.print(mat[0].length + " "); // 4

        // #31
        // blank: list[i] > big
        // additional test
        double[] listDouble = {1.0, 2.0, 3.5, 6.7};
        System.out.println("\n#31: " + findBig(listDouble)); // 6.7

        // #32
        out.println("#32: " + check2(92)); // true

        // #33
        int[][] mat2 = {{2,3,4,5},
                       {6,7,8,9,10}};
        System.out.println("#33: " + (mat2[1][1] * mat2[0][2])); // 28 --> (7 * 4)
    }

    public static boolean check2(int x){
        return (x % 2 == 0);
    }

    public static double findBig( double[] list ){
        double big = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++){
            if (list[i] > big)
                big = list[i];
        }
        return big;
    }

    public static double go3(int[] ray){
        int val = 0;
        for (int i = 0; i < ray.length; i++)
            val = val + ray[i];
        double ans = (double)val / ray.length;
        return ans;
    }

    public String toString(){
        return "" + x;
    }

    public static boolean check(int x){
        return (x % 2 == 0);
    }

    public void one(){
        System.out.print("one");
    }

    public void two(){
        System.out.print("two");
        one();
    }

    public static int go2(int[] ray){
        int val = 0;
        for (int i = 0; i < ray.length; i++)
            val = val + ray[i];
        return val;
    }

    public static double go(int[] ray){
        int val = 0;
        for (int i = 0; i < ray.length; i = i + 2)
            val = val + ray[i];
        return val;
    }

    public static int getIt(int num){
        int ans = 0;
        if (num >= 2)
        {
            if (num >= 7)
                ans += 2;
            else
                ans += 3;
        }
        ans += 4;
        return ans;
    }
}

