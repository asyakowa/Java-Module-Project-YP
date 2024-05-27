public class Product {
  String nameProduct;
  double priceProduct  ;

 public Product (String nameProduct, double priceProduct) {
    this.nameProduct = nameProduct;
    this.priceProduct= priceProduct;

 }

    @Override
    public String toString() {
     Formatter formatter = new Formatter();
        return
                "Имя='" + nameProduct + '\'' +
                ", Цена=" + priceProduct + " " + formatter.formate(priceProduct) ;


    }

    public String getNameProduct() {
    return nameProduct; }

    public double getPriceProduct() {
        return priceProduct;
    } }
