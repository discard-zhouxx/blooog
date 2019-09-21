package top.vanbyz.pojo;

public class PostType {
    private Byte postTypeId;

    private String postTypeName;

    public Byte getPostTypeId() {
        return postTypeId;
    }

    public void setPostTypeId(Byte postTypeId) {
        this.postTypeId = postTypeId;
    }

    public String getPostTypeName() {
        return postTypeName;
    }

    public void setPostTypeName(String postTypeName) {
        this.postTypeName = postTypeName == null ? null : postTypeName.trim();
    }
}