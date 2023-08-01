public class Task_2 {
    public static void main(String[] args) {
        int[] intArray = new int[12];
        sum(intArray, 11, 3);

    }
    public static void sum(int[] intArray, int index, int d){
        try {

        double caughtRes1 = (double) intArray[index] / d;
        System.out.println("caughtRes1 = " + caughtRes1);

        }
        catch (ArithmeticException e) {
            System.err.println("Catching exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(" exception: " + e);
        }
    }
}
