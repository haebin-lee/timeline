package com.lucy.timeline.model;

public class Follow {

    private Long follow_no;
    private Long user_no;
    private Long follow_user_no;

    public Follow() {
    }

    public Long getFollow_no() {
        return follow_no;
    }

    public void setFollow_no(Long follow_no) {
        this.follow_no = follow_no;
    }

    public Long getUser_no() {
        return user_no;
    }

    public void setUser_no(Long user_no) {
        this.user_no = user_no;
    }

    public Long getFollow_user_no() {
        return follow_user_no;
    }

    public void setFollow_user_no(Long follow_user_no) {
        this.follow_user_no = follow_user_no;
    }
}
