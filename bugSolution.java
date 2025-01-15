public class MyClass {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++; // Increment i before continuing to the next iteration
                continue; 
            }
            System.out.println(i);
            i++;
        }
    }
}