public class JavaRush_8 {
    public static void main(String[] args) {
    /*
    This task is about cubic calculator. We need to find a cube of long integer.
    Then after we need to find a cube of the cube.
    Program won't ask input and won't give an output. Propose: to make clear about
    return statement.
    */
    }
    //write your code here
    public static long cube(long a){
        return a*a*a;
    }

    //write your code here
    public static long ninthDegree(long x) {
        return cube(cube(x));
    }
}
