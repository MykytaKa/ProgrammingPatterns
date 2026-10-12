public class SmsNotificationAdapter implements Notification {
    private SmsAPI smsApi;

    public SmsNotificationAdapter(SmsAPI smsApi) {
        this.smsApi = smsApi;
    }

    @Override
    public void send(String title, String message) {
        String smsText = title + " - " + message;
        this.smsApi.sendSms(smsText);
    }
}