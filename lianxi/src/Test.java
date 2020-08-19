
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String[] URL = {
                "https://blog.csdn.net/weixin_44170482/article/details/107534216",
                "http://blog.csdn.net/weixin_44170482/",
                "https://www.baidu.com/",
                "https://fanyi.baidu.com/#en/zh/TERMINATED",
                "http://locahost:8080/liugezi"
        };
        for (String url:URL) {
            parseUrl(url);
            System.out.println("=================");
        }
        //String[] str1 = str.split("://");
        //System.out.println("协议名为" + str1[0]);
    }

    //默认端口
    private static Map<String,Integer> schemaDefaultPortMap = new HashMap<>();
    static {
        schemaDefaultPortMap.put("http",80);
        schemaDefaultPortMap.put("https",443);
    }
    private static void parseUrl(String url){
        int pos = url.indexOf("://");
        String schema = url.substring(0,pos);
        System.out.println("协议部分:" + schema);

        //跳过：//
        String remain = url.substring(pos+3);
        pos = remain.indexOf("/");

        String service = remain.substring(0,pos);
        System.out.println("服务端：" + service);

        //通过service找到host和port部分
        int i = service.indexOf(":");
        String host = null;
        Integer port = -1;
        if (i == -1){
            host = service;
            //没有写明port，则port信息使用协议的默认信息
           port = schemaDefaultPortMap.get(schema);
        } else {
            host = service.substring(0,i);
            port = Integer.parseInt(service.substring(i+1));
        }

        System.out.println("服务端主机信息："+host);
        System.out.println("服务端端口信息：" + port);

        remain = remain.substring(pos);
        port = remain.indexOf("?");
        if (pos == -1){
            System.out.println("路径部分：" +remain);
        } else {
            String path = remain.substring(0,pos);
            String queryString = remain.substring(pos+1);
            System.out.println("路径部分：" +path);
            System.out.println("查询字符串部分:" +queryString);
        }



    }
}
