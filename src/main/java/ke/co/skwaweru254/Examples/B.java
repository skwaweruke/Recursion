package ke.co.skwaweru254.Examples;

public class B {

    public static void main(String[] args) {

        print(1);

    }

    static int print(int z){

        //Base condition to prevent stackoverflow error

        if (z==100){

            System.out.println(z);
            //            System.out.println(z);
            return z;
        }

        System.out.println(z);

        return print(z+1);
    }
}

