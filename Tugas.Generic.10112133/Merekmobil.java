public class Merekmobil<T> {
  T ob; // declare an object of type T

  Merekmobil(T o) {
    ob = o;
  }

  T getob() {
    return ob;
  }

  void showType() {
    System.out.println("Type of T is " + ob.getClass().getName());
  }
}
