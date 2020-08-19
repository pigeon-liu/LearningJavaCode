import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestClientDemo {
    public static void main(String[] args) {
        String SERVER_HOST = "www.baidu.com";
        int SERVER_PORT = 80;

        try (Socket socket = new Socket(SERVER_HOST,SERVER_PORT)){
            //GET 方法的请求，不包含请求体
            String request = "GET /s?wd=java HTTP/1.0\r\nHost:www.baidu.com\r\n\r\n";
            //成功发送请求
            PrintWriter writer = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream(),"utf-8")
            );
            //成功发送请求
            writer.println(request);
            writer.flush();

            //等待响应
            Scanner scanner = new Scanner(socket.getInputStream(),"utf-8");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
