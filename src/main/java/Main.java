import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Input input = new Input();

        int quantity;
        quantity = input.getInteger("Введите количество людей, на которое хотите разделить счет");

        System.out.println("Добавлено в список гостей : " + quantity);
        ArrayList<Product> productList = new ArrayList<>();

        String nameProduct;
        double priceProduct;

     Formatter formatter = new Formatter();

      Calculate calculate = new Calculate(0);


        while (true) {
            nameProduct = input.getString("Укажите название товара. Название можно указать любое, принимаются цифры, буквы на русском и английском языках, и другие символы");

            if( nameProduct.equalsIgnoreCase("Завершить")){
                break; }
            priceProduct = input.getDouble("Введите стоимость. Стоимость должна быть больше 0, дробную цену можно записать через точку/запятую. Например, 2,15 или 2.15");
            productList.add(new Product(nameProduct, priceProduct));
            calculate.addsum( priceProduct );

            String messageTemplate = "Товар %s со стоимостью %.2f " + formatter.formate(priceProduct) + " был добавлен в список товаров. ";
            System.out.printf(messageTemplate, nameProduct, priceProduct);



            System.out.println( "\n"+ "Список добавленных товаров : " ) ;
                for ( int i = 0; i< productList.size(); i++) { System.out.println( productList.get(i));

                }
            String messageTemplatee = "Общая стоимость всех товаров: %.2f " + " " + formatter.formate(calculate.getSumma());
            System.out.printf( messageTemplatee, calculate.getSumma()  );
            System.out.println( "\n"+ "Хотите добавить еще товар? Если да, то введите в новой строке данные о новом товаре. Если нет, то введите Завершить" );
        }
         calculate.calculate( quantity);

    } }
