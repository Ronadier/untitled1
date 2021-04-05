import fruits.Apple;
import fruits.Orange;

public class Main {
  public static void main(String[] args) {
    Box<Apple> appleBox = new Box<>();
    appleBox.addFruit(new Apple());
    appleBox.addFruit(new Apple());
    appleBox.addFruit(new Apple());
    appleBox.addFruit(new Apple());
    appleBox.addFruit(new Apple());
    appleBox.addFruit(new Apple());
    appleBox.addFruit(new Apple());
    appleBox.addFruit(new Apple());
    appleBox.addFruit(new Apple());

    Box<Orange> orangeBox = new Box<>();
    Box<Orange> orangeBox2 = new Box<>();
    orangeBox.addFruit(new Orange());
    orangeBox.addFruit(new Orange());
    orangeBox.addFruit(new Orange());
    orangeBox.addFruit(new Orange());
    orangeBox2.addFruit(new Orange());
    orangeBox2.addFruit(new Orange());

    orangeBox2 = orangeBox.peresypka(orangeBox2);

    System.out.println(appleBox.compare(orangeBox2));
  }
}
