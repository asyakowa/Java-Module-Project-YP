public class Calculate {
    double summa;
    public void addsum ( double price) {
        this.summa = summa + price;

    }

public void calculate (int quantity) {
   Formatter formatter = new Formatter();
    double floortotalPrice = (this.summa / quantity);
    String messageTemplate = "Сумма к оплате с одного человека: %.2f "+ " " + formatter.formate(floortotalPrice);
   System.out.printf(messageTemplate, floortotalPrice ) ;

}

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    public Calculate(double summa) {
        this.summa = summa;

    }

    public double getPrice() {

        double price;
        price = 0;
        return price;
    }

}

