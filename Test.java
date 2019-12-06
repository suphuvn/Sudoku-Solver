public class Test {
    static boolean VERBOSE = false;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // use AC3 & backtracking
        //new AC3(Node.getNodes("data9"));

        // use forward checking & backtracking
        new Backtracking(Node.getNodes("data9"));

        long endTime = System.currentTimeMillis();
        System.out.println("\r\ntotal running time:" + (endTime - startTime) + "ms");
    }
}
