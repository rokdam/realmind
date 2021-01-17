package org.zerock.domain;

import java.util.Date;

public class PortfolioVO {
    
    private int user_id;
    private int contents_type;
    private String contents;
    private boolean delete_flg;
    private Date created_date;
    private Date updated_date;
    
    
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public int getContents_type() {
        return contents_type;
    }
    public void setContents_type(int contents_type) {
        this.contents_type = contents_type;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public boolean isDelete_flg() {
        return delete_flg;
    }
    public void setDelete_flg(boolean delete_flg) {
        this.delete_flg = delete_flg;
    }
    public Date getCreated_date() {
        return created_date;
    }
    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
    public Date getUpdated_date() {
        return updated_date;
    }
    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
    @Override
    public String toString() {
        return "PortfolioVO [user_id=" + user_id + ", contents_type=" + contents_type + ", contents=" + contents
                + ", delete_flg=" + delete_flg + ", created_date=" + created_date + ", updated_date=" + updated_date
                + "]";
    }
    
}
