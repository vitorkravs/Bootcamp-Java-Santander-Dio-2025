import java.io.FileNotFoundException;

public class Exceptions {
    public static void main(String[] args) {

    }

    private static void test() {
                                    new Throwable(); //pai de exceptions e errors
                                        //       \\
                                new Exception(); new Error();
                                    //              \\
                        new RuntimeException(); new FileNotFoundException();


    }
}
