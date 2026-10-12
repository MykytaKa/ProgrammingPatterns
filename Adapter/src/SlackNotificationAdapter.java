public class SlackNotificationAdapter implements Notification {
    private SlackAPI slackApi;
    private String chatId;

    public SlackNotificationAdapter(SlackAPI slackApi, String chatId) {
        this.slackApi = slackApi;
        this.chatId = chatId;
    }

    @Override
    public void send(String title, String message) {
        this.slackApi.logIn();
        String slackText = title + ": " + message;
        this.slackApi.sendMessage(this.chatId, slackText);
    }
}