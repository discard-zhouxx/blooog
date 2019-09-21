package top.vanbyz.pojo;

public class MessageBoard {
    private Integer messageId;

    private String messageContent;

    private String reviewName;

    private String reviewContact;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName == null ? null : reviewName.trim();
    }

    public String getReviewContact() {
        return reviewContact;
    }

    public void setReviewContact(String reviewContact) {
        this.reviewContact = reviewContact == null ? null : reviewContact.trim();
    }
}