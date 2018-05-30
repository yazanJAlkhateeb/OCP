package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.UsingResourceBundle.CreatingPropertyFileResourceBundle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConvertResourceBundleToPropertiesClass {
    public static void main(String[] args) throws IOException {
        Locale us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);

        Properties props = new Properties();
        FileInputStream fileInputStream = new FileInputStream("/home/yazan/IdeaProjects/OCP/src/main/resources/Zoo_en.properties");
props.load(fileInputStream);
        System.out.println(props.getProperty("hello"));
        System.out.println(props.getProperty("hello2","Hx"));

    }
}
