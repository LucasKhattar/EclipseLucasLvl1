import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpamALot {
	static final String FAKE_USERNAME = "jeffjowbutt@gmail.com";
	static final String FAKE_PASSWORD = "code4life";
public static void main(String[] args) {
	SpamALot spam = new SpamALot();
	spam.CreateUI();
}
public void CreateUI() {
	sendSpam("keith.groves@jointheleague.org", "Spam!!!", "You got spamed!");
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton butto = new JButton();
	JPanel panel = new JPanel();
	JTextField field = new JTextField(20);
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(450,65);
	panel.add(field);
	panel.add(button);
	panel.add(butto);
	button.setText("Bad");
	butto.setText("Good");
}
private boolean sendSpam(String recipient, String subject, String content) {

Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.port", "587");

Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
		return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
	}
});

try {

	Message message = new MimeMessage(session);
	message.setFrom(new InternetAddress(FAKE_USERNAME));
	message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
	message.setSubject(subject);
	message.setText(content);
	Transport.send(message);
	return true;

} catch (MessagingException e) {
e.printStackTrace();
return false;
}
}

}
