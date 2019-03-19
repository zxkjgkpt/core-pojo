package com.yfny.corepojo.entity.demandform.model.login;



import com.yfny.corepojo.entity.demandform.application.ShiroUser;
import com.yfny.corepojo.entity.demandform.model.Jsxx;
import com.yfny.corepojo.entity.demandform.model.XqdYhxx;

import java.util.List;

public class UserInfo {
    List<Jsxx> jsxxList;
    List<XtgnExp> xtgnList;

    private String id;//用户ID
    private String name;//用户的中文名秿
    private Integer lx;//用户类型＿电力交易中心用户＿发电厂用户，2用电用户
    private String password;//用户密码
    private String loginName;//登录名

    private String NXuuid;// 能讯uuid
    private String serverURL;// 能讯服务器地址
    private String currentSystemId;// 当前系统id，对应着能讯系统id
    private ShiroUser currentShirUser;// 当前用户所有信息

    public ShiroUser getCurrentShirUser() {
        return currentShirUser;
    }

    public void setCurrentShirUser(ShiroUser currentShirUser) {
        this.currentShirUser = currentShirUser;
    }

    public String getNXuuid() {
        return NXuuid;
    }

    public String getCurrentSystemId() {
        return currentSystemId;
    }

    public void setCurrentSystemId(String currentSystemId) {
        this.currentSystemId = currentSystemId;
    }

    public void setNXuuid(String NXuuid) {
        this.NXuuid = NXuuid;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLx() {
        return lx;
    }

    public void setLx(Integer lx) {
        this.lx = lx;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo() {
    }

    public UserInfo(XqdYhxx user) {
        this.setId(user.getYhm());
        this.setLx(null);
        this.setName(user.getYhxm());
        this.setPassword(user.getMm());
    }

    public List<Jsxx> getJsxxList() {
        return jsxxList;
    }

    public void setJsxxList(List<Jsxx> jsxxList) {
        this.jsxxList = jsxxList;
    }

    public List<XtgnExp> getXtgnList() {
        return xtgnList;
    }

    public void setXtgnList(List<XtgnExp> xtgnList) {
        this.xtgnList = xtgnList;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
