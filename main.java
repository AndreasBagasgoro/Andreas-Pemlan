public class main {
    public static void main(String[] args) {
        Generic<String> objGeneric = new Generic<String>("Hello");
        String input = objGeneric.getDataT();
        System.out.println(input);
        objGeneric.displayType();
    }
}
