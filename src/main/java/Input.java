import java.util.Scanner;




public class Input {
    Scanner scanner = new Scanner(System.in);


    public int getInteger(String message ) {
        System.out.println( message);


        while (true) {
            if( !scanner.hasNextInt() ) {


                System.out.println( message);
                scanner.nextLine(); }
            else {
                int kolichestvo = scanner.nextInt();
                scanner.nextLine();
                if (kolichestvo>1) return kolichestvo;
                System.out.println("Вы указали неверное значение, укажите значение больше 1");


            }
        }
    }
    public String getString (String message) {
        System.out.println( message);

        String nameProduct = scanner.nextLine();


        return nameProduct;

    }



    public double getDouble(String message ) {
        System.out.println( message);

        while (true) {
            if( !scanner.hasNextDouble() ) {


                System.out.println( message);
                scanner.nextLine(); }
            else {
                double cena = scanner.nextDouble();
                scanner.nextLine();
                if (cena>0) return cena;
                else {
                    System.out.println( "Неверно указана цена. Укажите верную цену");


                }
            }
        }
    }


}