public class StringPerformanceTest {
    public static void main(String[] args) {
        int n = 100000;
        
        long startTime, endTime;
        
        // String
        String str = "A";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            str = str + "B";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time with String: " + (endTime - startTime) + " ms");

        // StringBuffer
        StringBuffer sbuff = new StringBuffer("A");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sbuff.append("B");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time with StringBuffer: " + (endTime - startTime) + " ms");

        // StringBuilder
        StringBuilder sbuilder = new StringBuilder("A");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sbuilder.append("B");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (endTime - startTime) + " ms");
    }
}
