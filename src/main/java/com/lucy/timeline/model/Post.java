package com.lucy.timeline.model;

public class Post {

    private Long post_no;
    private Long user_no;
    private String contents;

    public Post() { }

    public Long getPost_no() {
        return post_no;
    }

    public void setPost_no(Long post_no) {
        this.post_no = post_no;
    }

    public Long getUser_no() {
        return user_no;
    }

    public void setUser_no(Long user_no) {
        this.user_no = user_no;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
