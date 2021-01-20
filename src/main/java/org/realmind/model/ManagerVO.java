package org.realmind.model;

import java.util.Date;

public class ManagerVO {
    private int id;
    private String login_id;
    private String mail;
    private String pw;
    private String manager_name;
    private int auth;
    private Date created_date;
    private Date updated_date;
    private boolean delete_flg;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogin_id() {
        return login_id;
    }
    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getManager_name() {
        return manager_name;
    }
    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }
    public int getAuth() {
        return auth;
    }
    public void setAuth(int auth) {
        this.auth = auth;
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
    public boolean getDeleted_flg() {
        return delete_flg;
    }
    public void setDeleted_flg(boolean delete_flg) {
        this.delete_flg = delete_flg;
    }
    @Override
    public String toString() {
        return "ManagerVO [id=" + id + ", login_id=" + login_id + ", mail=" + mail + ", pw=" + pw + ", manager_name="
                + manager_name + ", auth=" + auth + ", created_date=" + created_date + ", updated_date=" + updated_date
                + ", deleted_flg=" + delete_flg + "]";
    }
    
}
