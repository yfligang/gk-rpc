import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser;


public class PlayWrightDemo {
    public static void main(String[] args){
        try (Playwright playwright = Playwright.create()) {
            BrowserType chromium = playwright.chromium();
            Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
            Page page = browser.newPage();
            page.navigate("https://www.baidu.com");
            Thread.sleep(5000);
            System.out.println(page.title());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
