package top.vanbyz.pojo;

public class Blogger {
    private String bloggerName;

    private String bloggerPassword;

    private String bloggerAddress;

    private String bloggerSignature;

    private String bloggerEmail;

    public String getBloggerName() {
        return bloggerName;
    }

    public void setBloggerName(String bloggerName) {
        this.bloggerName = bloggerName == null ? null : bloggerName.trim();
    }

    public String getBloggerPassword() {
        return bloggerPassword;
    }

    public void setBloggerPassword(String bloggerPassword) {
        this.bloggerPassword = bloggerPassword == null ? null : bloggerPassword.trim();
    }

    public String getBloggerAddress() {
        return bloggerAddress;
    }

    public void setBloggerAddress(String bloggerAddress) {
        this.bloggerAddress = bloggerAddress == null ? null : bloggerAddress.trim();
    }

    public String getBloggerSignature() {
        return bloggerSignature;
    }

    public void setBloggerSignature(String bloggerSignature) {
        this.bloggerSignature = bloggerSignature == null ? null : bloggerSignature.trim();
    }

    public String getBloggerEmail() {
        return bloggerEmail;
    }

    public void setBloggerEmail(String bloggerEmail) {
        this.bloggerEmail = bloggerEmail == null ? null : bloggerEmail.trim();
    }
}