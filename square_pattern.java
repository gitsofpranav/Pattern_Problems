public class all_pattern{
    public static void squarePattern(int n){
        //   ****
        //   ****
        //   ****
        //   ****
        //Outer loop
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void  triangle_Pattern(int n){
        //outer loop
// *
// **
// ***
// ****
// *****
        for(int i=1; i<=n; i++){
            //inner loop;
            for(int star = 1; star <= i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
     
    }
    public static void numberTriangle(int n){
        // 1
        // 12
        // 123
        // 1234    
        //outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void rotated_triangle(int n){
        // ****
        // ***
        // **
        // *    
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void num_pattern(int n){
        // 1
        // 22
        // 333 
        // 4444
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void rotated_num(int n){
        // 1234
        // 123
        // 12
        // 1    
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void half_diamond(int n){
    //      *
    //     ***
    //    *****
    //   *******
    // first half for half diamond
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int star = 1; star<=(2*i)-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second half for full diamond
    //      *
    //     ***
    //    *****
    //   *******
    //   *******
    //    *****
    //     ***
    //      *
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int star = 1; star<=(2*i)-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


        public static void nStarTriangle(int n) {
            // Write your code here
            // *
            // **
            // ***
            // ****
            // ***
            // **
            // *    
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    
            //2nd part
            for(int i=n-1; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    

    public static void main(String[] args) {
        int n =4;
        //squarePattern(n);
        //triangle_Pattern(n);
        //numberTriangle(n);
        //num_pattern(n);
        //rotated_triangle(n);
        //rotated_num(n);
        //half_diamond(n);
        nStarTriangle(n);
    }
}
