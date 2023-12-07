import com.oracle.tools.packager.Log;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.logging.Logger;

public class HttpClientDemo {

    public void getMethod() throws IOException {
        //创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建HttpGet请求
        HttpGet httpGet = new HttpGet("https://dev-minipro.jikezhida.com/miniapi/ia/resume/detail/1715655592550670360");
        //响应对象
        CloseableHttpResponse httpResponse = null;
        //添加Token
        httpGet.addHeader("Authorization","eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJVU0VSX0xPR0lOX1RPS0VOIiwidXNlcklkIjoxNzI5NjcxODM0ODE5MTc0NDAwLCJSRU5FV0FMX1RJTUUiOjE3MDE3MjUzNjMyOTYsImV4cCI6MTcwMjAyNzc2M30.gffFdEs9e3bGVPI7f-xOid3Lz5HK2Dhf5EtBB390VV0");

        //使用HttpClient发起请求
        httpResponse = httpClient.execute(httpGet);
        //判断响应状态码是否为 200
        if (httpResponse.getStatusLine().getStatusCode() == 200){
            //获取返回数据
            HttpEntity httpEntity = httpResponse.getEntity();
            String content = EntityUtils.toString(httpEntity,"UTF-8");
            System.out.println(content);
        }else {
            httpResponse.close();
        }
        httpClient.close();

    }

    public static void main(String[] args) throws IOException {
        HttpClientDemo httpClientDemo = new HttpClientDemo();
        httpClientDemo.getMethod();

        //创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建HttpGet请求
        HttpGet httpGet = new HttpGet("https://minipro.jikezhida.com/miniapi/ia/merchant/detail/1000207");

        //响应对象
        CloseableHttpResponse httpResponse = null;

        try {
            //使用HttpClient发起请求
            httpResponse = httpClient.execute(httpGet);
            //判断响应状态码是否为200
            if (httpResponse.getStatusLine().getStatusCode() == 200){
                //获取返回数据
                HttpEntity httpEntity = httpResponse.getEntity();
                String content = EntityUtils.toString(httpEntity,"UTF-8");
                //打印数据长度
                Log.info("content:{ " + content + "}");
                System.out.println(content);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放链接
            if (httpResponse != null){
                httpResponse.close();
            }

            httpClient.close();
        }


    }
}
