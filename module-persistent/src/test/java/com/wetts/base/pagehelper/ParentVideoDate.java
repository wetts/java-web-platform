package com.wetts.base.pagehelper;

import java.util.Date;

public class ParentVideoDate {
    private Integer id;

    private Integer kindergartenId;

    private String userUuid;

    private Date videoStartDate;

    private Date videoEndDate;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public ParentVideoDate(Integer id, Integer kindergartenId, String userUuid, Date videoStartDate, Date videoEndDate, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.kindergartenId = kindergartenId;
        this.userUuid = userUuid;
        this.videoStartDate = videoStartDate;
        this.videoEndDate = videoEndDate;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public ParentVideoDate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKindergartenId() {
        return kindergartenId;
    }

    public void setKindergartenId(Integer kindergartenId) {
        this.kindergartenId = kindergartenId;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public Date getVideoStartDate() {
        return videoStartDate;
    }

    public void setVideoStartDate(Date videoStartDate) {
        this.videoStartDate = videoStartDate;
    }

    public Date getVideoEndDate() {
        return videoEndDate;
    }

    public void setVideoEndDate(Date videoEndDate) {
        this.videoEndDate = videoEndDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}