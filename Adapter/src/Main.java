public class Main {
    public static void main(String[] args) {
        String title = "World";
        String message = "Hello!";

        Notification emailNotification = new EmailNotification("admin@example.com");
        emailNotification.send(title, message);

        SlackAPI slackApi = new SlackAPI("slack_user", "api_key_12345");
        Notification slackNotification = new SlackNotificationAdapter(slackApi, "chat_room_01");
        slackNotification.send(title, message);

        SmsAPI smsApi = new SmsAPI("+1234567890", "CompanyService");
        Notification smsNotification = new SmsNotificationAdapter(smsApi);
        smsNotification.send(title, message);
    }
}