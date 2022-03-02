package aw01;
import aw01.asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        AsciiPanel panel = ctx.getBean("myPanel",AsciiPanel.class);
        System.out.println(panel.getAsciiFont().getFontFilename());
    }
}
