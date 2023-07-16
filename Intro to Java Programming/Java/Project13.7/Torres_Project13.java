public class Torres_Project13 {
  public static void main(String[] args) {
    Object[] objects = {new Chicken(), new Tiger(), new Apple(), new Orange(), new Fish(), new Watermelon()};
    for (int i = 0; i < objects.length; i++) {
      if (objects[i] instanceof Edible)
        System.out.println(((Edible)objects[i]).howToEat());

      else {
        System.out.println("Object is not edible");
      }
    }
  }
}

abstract class Animal {
}

class Chicken extends Animal implements Edible {
  public String howToEat() {
    return "Chicken: Fry it";
  }
}

class Fish extends Animal implements Edible {
	  public String howToEat() {
	    return "Fish: Fillet it";
	  }
	}

class Tiger extends Animal {
  public String sound() {
    return "Tiger: RROOAARR";
  }
}

abstract class Fruit implements Edible {
}

class Apple extends Fruit {
  public String howToEat() {
    return "Apple: Make apple cider";
  }
}

class Orange extends Fruit {
  public String howToEat() {
    return "Orange: Make orange juice";
  }
}

class Watermelon extends Fruit {
	  public String howToEat() {
	    return "Watermelon: carve into slices";
	  }
	}