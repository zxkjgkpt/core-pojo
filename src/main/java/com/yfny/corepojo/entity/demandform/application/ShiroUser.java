package com.yfny.corepojo.entity.demandform.application;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Shiro用户，主要是让Shiro能够支持多字段的方式登录系统。 目前实现账号、联系电话、和邮箱三种登录方式。 如果还不能满足需求可以扩展该类。
 *
 * @author chenenbang
 */
public class ShiroUser implements Serializable {

    public ShiroUser() {
        super();
    }

    private static final long serialVersionUID = 573154901435223916L;
    /**
     * 用户账号ID
     **/
    private String userID;

    /**
     * 用户账号
     **/
    private String userAccount;
    /**
     * 显示名称
     **/
    private String name;
    /**
     * 电子邮箱
     **/
    private String email;
    /**
     * 主要联系电话
     **/
    private String telPhone;
    /**
     * 是否管理员
     **/
    private Boolean isAdmin;
    /**
     * 是否内置
     **/
    private Boolean isSystem;
    /**
     * 4A用户信息
     **/
    private SSOUser ssoUser;

    /**
     * Shiro的realName
     */
    private String realName;

    /**
     * 默认角色id
     */
    private String defaultRoleId;

    /**
     * 默认角色名
     */
    private String defaultRoleDesc;

    /**
     * 当前角色id
     *
     * @param userAccount
     */
    private String currentRoleId;

    /**
     * 当前角色名称
     */
    private String currentRoleName;

    /**
     * 当前角色别名
     */
    private String currentRoleAliasName;

    /**
     * 当前部门id
     */
    private String currentDeptId;

    /**
     * 当前部门名称
     */
    private String currentDeptName;

    /**
     * 当前单位id
     */
    private String currentCorpId;

    private String userCorpId;
    private String userCorpName;
    private String userDeptId;
    private String userDeptName;

    /**
     * 当前单位名称
     */
    private String currentCorpName;

    private String defaultTemplateId;

    private String defaultTempleteName;

    /**
     * 当前主题
     */
    private String currentTheme;

    private String ssoToken;

    private Map<String, Serializable> attributes = new HashMap<String, Serializable>();


    public Map<String, Serializable> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Serializable> attributes) {
        this.attributes = attributes;
    }

    public String getCurrentTheme() {
        return currentTheme;
    }

    public void setCurrentTheme(String currentTheme) {
        this.currentTheme = currentTheme;
    }

    public ShiroUser(String userAccount) {
        super();
        this.userAccount = userAccount;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelePhone() {
        return telPhone;
    }

    public void setTelePhone(String telePhone) {
        this.telPhone = telePhone;
    }

    @Override
    public String toString() {
        if (userAccount != null && !userAccount.isEmpty()) {
            return userAccount;
        }
        return super.toString();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public SSOUser getSsoUser() {
        return ssoUser;
    }

    public void setSsoUser(SSOUser ssoUser) {
        this.ssoUser = ssoUser;
    }

    public String getDefaultRoleId() {
        return defaultRoleId;
    }

    public void setDefaultRoleId(String defaultRoleId) {
        this.defaultRoleId = defaultRoleId;
    }

    public String getDefaultRoleDesc() {
        return defaultRoleDesc;
    }

    public void setDefaultRoleDesc(String defaultRoleDesc) {
        this.defaultRoleDesc = defaultRoleDesc;
    }

    public String getCurrentRoleId() {
        return currentRoleId;
    }

    public void setCurrentRoleId(String currentRoleId) {
        this.currentRoleId = currentRoleId;
    }

    public String getCurrentRoleName() {
        return currentRoleName;
    }

    public void setCurrentRoleName(String currentRoleName) {
        this.currentRoleName = currentRoleName;
    }

    public String getCurrentDeptId() {
        return currentDeptId;
    }

    public void setCurrentDeptId(String currentDeptId) {
        this.currentDeptId = currentDeptId;
    }

    public String getCurrentDeptName() {
        return currentDeptName;
    }

    public void setCurrentDeptName(String currentDeptName) {
        this.currentDeptName = currentDeptName;
    }

    public String getCurrentCorpId() {
        return currentCorpId;
    }

    public void setCurrentCorpId(String currentCorpId) {
        this.currentCorpId = currentCorpId;
    }

    public String getCurrentCorpName() {
        return currentCorpName;
    }

    public void setCurrentCorpName(String currentCorpName) {
        this.currentCorpName = currentCorpName;
    }

    public String getDefaultTemplateId() {
        return defaultTemplateId;
    }

    public void setDefaultTemplateId(String defaultTemplateId) {
        this.defaultTemplateId = defaultTemplateId;
    }

    public String getDefaultTempleteName() {
        return defaultTempleteName;
    }

    public void setDefaultTempleteName(String defaultTempleteName) {
        this.defaultTempleteName = defaultTempleteName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSsoToken() {
        return ssoToken;
    }

    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
    }

    public String getCurrentRoleAliasName() {
        return currentRoleAliasName;
    }

    public void setCurrentRoleAliasName(String currentRoleAliasName) {
        this.currentRoleAliasName = currentRoleAliasName;
    }

    public String getUserCorpId() {
        return userCorpId;
    }

    public void setUserCorpId(String userCorpId) {
        this.userCorpId = userCorpId;
    }

    public String getUserCorpName() {
        return userCorpName;
    }

    public void setUserCorpName(String userCorpName) {
        this.userCorpName = userCorpName;
    }

    public String getUserDeptId() {
        return userDeptId;
    }

    public void setUserDeptId(String userDeptId) {
        this.userDeptId = userDeptId;
    }

    public String getUserDeptName() {
        return userDeptName;
    }

    public void setUserDeptName(String userDeptName) {
        this.userDeptName = userDeptName;
    }
}
