package swcs.gof.creational.singleton.eager;

class Client {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().toString());
        System.out.println(Singleton.getInstance().toString());
    }
}
