
/**
 * Lab 906::Find Mean Median and Mode
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatRunner{
    public static void main(){
        StatTester st = new StatTester();
        st.loadArray();
        st.printArray();
        st.getSum();
        st.getMean();
        st.getMedian();
        st.getMode();
    }
}
