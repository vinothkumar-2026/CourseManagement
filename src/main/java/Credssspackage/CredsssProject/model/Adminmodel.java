package Credssspackage.CredsssProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "admin")
public class Adminmodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_no")
    private int serialno;

    @Column(name = "admin_id")
    private String adminid;

    @Column(name = "admin_name")
    private String adminname;

    @Column(name = "password")
    private String password;

    public Adminmodel() {
    }

    public Adminmodel(String adminid, String adminname, String password) {
        this.adminid = adminid;
        this.adminname = adminname;
        this.password = password;
    }

    public int getSerialno() {
        return serialno;
    }

    public void setSerialno(int serialno) {
        this.serialno = serialno;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}