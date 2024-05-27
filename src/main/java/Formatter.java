 public class Formatter{
    public String formate(double price) {
        price=Math.floor(price);
        if ( price % 10 == 1 && price  % 100 !=11 ){
          return("рубль");
        }

        else if (( price % 10 == 2 ||  price % 10 == 3 ||  price % 10 == 4  ) && (price  % 100 !=12 && price % 100 !=13 && price  % 100 !=14 )) {
            return ("рубля");
        }

        else {
            return ("рублей");

        }

    }

    }

