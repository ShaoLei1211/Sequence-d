public class Main {

    public static void main(String[] args) {
	// perfect square
        System.out.print("First 10 Square Number: ");
        Square(1);

        System.out.print("\nFirst 10 Cube Number:");
        Cube(1);

        System.out.print("\nFirst 10 Fibonacci Number:");
        Fibonacci(0,1,1);

        System.out.print("\nFirst 10 Prime Number:");
        Prime(1,1);

        System.out.print("\nFirst 10 Triangle Number:");
        Triangle(1);



        }

        public static void Square(int a) {
            while (a <= 10) {

                int output = a * a;
                System.out.print(output + " ");
                a=a+1;

            }
        }
        public static void Cube(int a){
                while (a <= 10) {
                    int output = a * a * a;
                    System.out.print(output + " ");
                    a = a + 1;
                }
            }
        public static void Fibonacci(int a,int b, int n) {
            while (n<=10){
                int output =a+b;
                System.out.print(output + " ");
                a=b;
                b=output;
                n=n+1;

        }

        }
        public static void Prime(int a,int n){

            while(n<=10){
                while (a<30) {
                    a++;
                    boolean prime = true;
                    int x = 1;
                    while (x<=a/3) {
                        x=x+1;
                        if (a%x==0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime) {
                        System.out.print(a + " ");
                    }
                }
                n=n+1;
            }

        }

        public static void Triangle(int a){
        while (a<=10){
            int output = (a*(a+1))/2;
            System.out.print(output + " ");
            a=a+1;
        }
        }
}
