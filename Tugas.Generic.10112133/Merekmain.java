public class Merekmain {
    public static void main(String[] args) {
        
        Merekmobil<Integer> integer_object;
        integer_object = new Merekmobil<>(777);
        integer_object.showType();

        int v = integer_object.getob();
        System.out.println("value: " + v);

        System.out.println();

        Merekmobil<String> string_object = new Merekmobil<>("Merek suzuki");

        string_object.showType();

        String str = string_object.getob();
        System.out.println("value: " + str);
    }
}