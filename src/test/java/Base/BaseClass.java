package Base;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public WebDriver driver;
    public String URL="https://demowebshop.tricentis.com//";

    public String link_computer_xpath="(//a[@ href='/computers'])[3]";

    public String link_notebooks_xpath="(//a[@ href='/notebooks'])[4]";

    public String link_picture_xpath="//div[@class='picture']";

    public String item_title_xpath="//h1";

    public String Expected_item_title="14.1-inch Laptop";
}
