import fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
  List<T> fruits = new ArrayList<>();
  private float getWeight () {
    float res = 0.0f;
    for (T fruit: fruits) {
      res += fruit.getWeight();
    }
    return res;
  }

  public void addFruit (T fruit) {
    this.fruits.add(fruit);
  }

  public boolean compare(Box<?> anotherBox) {
    return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
  }

  public Box peresypka (Box anotherBox) {
    anotherBox.fruits.addAll(this.fruits);
    this.fruits = null;
    return anotherBox;
  }

}
