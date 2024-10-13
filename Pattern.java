// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    
    public static void leftHalfPyramid(int n ){
        int i ,j;
        for(i = n;i>= 1;i--){
            for(j = 1 ; j < i  ;j++){
                System.out.print(" ");
            }
            for(j = 1; j <= n - i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        int i ,j;
        for(i = 1;i<=n;i++){
         for(j= 1;j<=i;j++){
             System.out.print("*");
         }   
         for(j=1;j<= 2 * ( n -i);j++){
             System.out.print(" ");
         }
         for(j=1;j<=i;j++){
             System.out.print("*");
         }
         System.out.println();
        }
        for(i =n - 1;i>=1;i--){
            for(j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(j = 1;j<= 2 * (n-i);j++){
                System.out.print(" ");
            }
            for(j = 1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    public static void diamondPattern(int n){
        int i, j;
        for(i=1;i<=n;i++){
            for(j=1 ;j<= n- i;j++){
                System.out.print(" ");
            }
            for(j= 1;j<= 2 *i - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = n- 1;i>=1;i--){
            for(j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j = 1;j<= 2 * i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void hollowSquare(int y){
        for(int i = 0;i<=y;i++){
            for(int j = 0;j<=y;j++){
                if(i==0 || j==0 || i== y || j == y){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void numberTriangle(int n){
         int i ,j;
         for(i = 1 ;i<= n;i++){
             for(j =1;j<= n-i;j++){
                 System.out.print(" ");
             }
             for(j = 1; j <= i; j++){
                 System.out.print(i + " ");
             }
             System.out.println();
         }
    }
    
    public static void numberIncPyramid(int n){
        int i ,j;
        for(i = 1 ; i <= n;i++){
            for(j = 1;j<= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // reverse
        
        for(i = n;i>= 1;i--){
            for(j= 1 ;j<= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
    }
    
    
    public static void numChangePyramid(int n){
        int i ,j,num;
        num = 1;
        for(i = 1;i<= n;i++){
            for(j = 1;j<=i;j++){
                
                System.out.print(num + " ");
                num++ ;
            }
            System.out.println();
        }
    }
    
    public static void zeroOnePyramid(int n){
        int i,j;
        for(i =1 ;i <= n;i++){
            for(j = 1 ;j<= i;j++){
                if((i+j)% 2==0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void palindrome(int n){
        int i , j ;
        for(i = 1;i<= n;i++){
            for(j= 1;j<= 2* (n- i);j++){
                System.out.print(" ");
            }
            for(j = i;j>=1;j--){
                System.out.print(j + " ");
            }
            for(j= 2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
     public static void rhombus(int n ){
        int i ,j;
        for(i = 1;i<=n;i++){
            for(j = 1;j <= n-i;j++){
                System.out.print(" ");
            }
            
            
            for(j = 1;j<= n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        hollowSquare(7);
        numberTriangle(7);
        numberIncPyramid(7);
        numChangePyramid(5);
        zeroOnePyramid(7);
        palindrome(6);
        rhombus(6);
        diamondPattern(6);
        leftHalfPyramid(7);
       butterfly(6);
        int n = 5;
        
         for(int i = 1;i<= n;i++ ){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 
        
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //
        
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //
        
        for(int i = n;i>=1;i--){
            for(int j = 1;j<= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //
        
    
        
        
        
    }
}