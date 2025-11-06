interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}

class Product2<T extends Category> {
    double price;
    Product2(double p){price=p;}
    double getPrice(){return price;}
}

class Discount {
    public static <T extends Product2<?>> void applyDiscount(T product, double percentage){
        System.out.println("Discounted Price = " + (product.getPrice() - (product.getPrice()*percentage/100)));
    }
}
