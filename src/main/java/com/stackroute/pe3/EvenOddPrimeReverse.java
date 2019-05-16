

import java.util.Scanner;
public class EvenOddPrimeReverse {
    public static void EvenOddCheck(int[] a, int Size)
    {
        for (int i = 0; i < Size; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("even:" + a[i]);

            } else {
                System.out.println("Odd :" + a[i]);

            }
        }
    }
    public static void primeNumber(int a[],int  Size)
    {
        int j;
        int[] tmp = new int[Size];

        for( int i=0;i<Size;i++) {
            // boolean status = true;
            for (j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    //status = false;
                    tmp[i] = a[i];
                    break;
                }


            }
        }
        System.out.println();
        System.out.println("Array with no primes");


        for(int i=0;i<tmp.length;i++)
        {
            if(tmp[i]!=0) {
                System.out.println(tmp[i]);



            }
        }



        /*printing the reversed array*/
        System.out.println();
        System.out.println("Reverse Array with no primes");
        for (int i = tmp.length-1; i >= 0; i--) {
            if(tmp[i]!=0)

                System.out.print(tmp[i] + " ");
        }


    }


    public static void main(String[] args) {
        int Size, i;
        int evenCount = 0, oddCount = 0;
        Scanner  sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();

        int[] a = new int[Size];


        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++) {
            a[i] = sc.nextInt();
        }
        EvenOddCheck(a,Size);
        primeNumber(a,Size);




//Replace Array Elements of a[i] with b[i]




    }
}