import javax.mail.MessagingException;

public class JavaMail {
    public static void main(String[] args) {
        try {
            JavaMailUtil.sendMail("dev.ha.osman@gmail.com");
        } catch (MessagingException e) {
            System.out.println(e.getMessage());
        }
    }
}
