public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(2);
        magicBox.add("1");
        magicBox.add("2");
        MagicBox<Integer> magicBox1= new MagicBox<>(4);
        magicBox1.add(8);


        System.out.println(magicBox.pick());
        System.out.println(magicBox1.pick());
    }
}