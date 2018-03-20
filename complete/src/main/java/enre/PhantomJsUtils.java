package enre;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


class PhantomJsUtils {
    private static String filePath = "data/temp/";

    public static Document renderPage(String filePath) {
        System.setProperty("phantomjs.binary.path", "libs/phantomjs"); // path to bin file. NOTE: platform dependent
        WebDriver ghostDriver = new PhantomJSDriver();
        try {
            ghostDriver.get(filePath);
            return Jsoup.parse(ghostDriver.getPageSource());
        } finally {
            ghostDriver.quit();
        }
    }

    public static Document renderPage(Document doc) {
        String tmpFileName = "$filePath${Calendar.getInstance().timeInMillis}.html";
        //FileUtils.writeToFile(tmpFileName, doc.toString());
        return renderPage(tmpFileName);
    }
}