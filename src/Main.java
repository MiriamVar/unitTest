public class Main {
    public static void main(String[] args) {
        Methods metody = new Methods();
        System.out.println(metody.checkTriangle(4,2,2));
        System.out.println(metody.formatText("0tomas"));
        metody.getConnectionToMongoDB();
        metody.validDateMain();
    }
}
