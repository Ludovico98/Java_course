public class Arithmetic {
        public static void main(String[] args) { //psvm shortcut to print line
            int a = 10;
            int b = 15;

            //BINARY operators
            int result = a + b;
            int difference = a - b;
            int product = a * b;
            int quotient = a / b;
            int reminder = a % b;

            System.out.println("the result is " + result ); //sout shortcut to print line
            System.out.println("the difference is " + difference );
            System.out.println("the product is " + product );
            System.out.println("the quotient is " + quotient );
            System.out.println("the reminder is " + reminder );

            result += 20; //result = result + 20

            System.out.println("the new result is "+ result);

            //UNARY operators
            result++;

            System.out.println(result);

            result--;

            System.out.println(result);


            product *= 2;


            System.out.println(product);


        }
}
