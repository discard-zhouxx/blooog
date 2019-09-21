package top.vanbyz.pojo;

import java.util.Date;

public class Comment {
    private Integer postId;

    private Date commentTime;

    private Integer commentListId;

    private String commentContent;

    private String reviewer;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getCommentListId() {
        return commentListId;
    }

    public void setCommentListId(Integer commentListId) {
        this.commentListId = commentListId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer == null ? null : reviewer.trim();
    }
}