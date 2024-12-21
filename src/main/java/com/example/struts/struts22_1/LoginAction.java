package com.example.struts.struts22_1;

import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Pattern;

public class LoginAction extends ActionSupport {
    private String name;
    private String gender;
    private String tel;

    public String getName() {return name;}
    public String getGender() {return gender;}
    public String getTel() {return tel;}
    public void setName(String name) {this.name = name;}
    public void setGender(String gender) {this.gender = gender;}
    public void setTel(String tel) {this.tel = tel;}

    @Override
    public void validate(){
        if(name == null || "".equals(name.trim())){
            addFieldError("name","姓名不能为空");
        }
        if(tel == null || "".equals(tel.trim())){
            addFieldError("tel","电话不能为空");
        }
        else if (!Pattern.matches("^1[34578]\\d{9}$",tel)){
            addFieldError("tel","电话格式错误");
        }
    }
    public String execute() {
        System.out.println("execute");
        System.out.println("姓名是"+name);
        System.out.println("电话是"+tel);
        return "success";
    }
}
