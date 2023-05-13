import java.time.LocalDate;

public class Package {

    private String trackingNumber;
    private Address senderAddress;
    private Address recipientAddress;
    private LocalDate estimatedDeliveryDate;

    public Package(String trackingNumber, Address senderAddress, Address recipientAddress, LocalDate estimatedDeliveryDate) {
        this.trackingNumber = trackingNumber;
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public Address getSenderAddress() {
        return senderAddress;
    }

    public Address getRecipientAddress() {
        return recipientAddress;
    }

    public LocalDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    @Override
    public String toString() {
        return "Tracking number: " + trackingNumber +
                "\nSenderAddres:" + senderAddress +
                "\nRecipient Address" + recipientAddress +
                "\nYear: " + estimatedDeliveryDate.getYear() +
                "\nMonth: " + estimatedDeliveryDate.getMonth() +
                "\nDay: " + estimatedDeliveryDate.getDayOfMonth() + "";

    }
}
