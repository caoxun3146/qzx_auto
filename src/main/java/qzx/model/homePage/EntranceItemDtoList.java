package qzx.model.homePage;

import java.util.Date;
import java.util.List;

public class EntranceItemDtoList {

    private long id;
    private String subImg;
    private int isHint;
    private int dailyShowTimes;
    private Date disappearTime;
    private int redirectType;
    private int limitShowTimes;
    private String itemTags;
    private int type;
    private int rebateMoney;
    private int newUserShare;
    private int oldUserShare;
    private List<String> newTagList;
    private int redirectSecondPage;
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setSubImg(String subImg) {
        this.subImg = subImg;
    }
    public String getSubImg() {
        return subImg;
    }

    public void setIsHint(int isHint) {
        this.isHint = isHint;
    }
    public int getIsHint() {
        return isHint;
    }

    public void setDailyShowTimes(int dailyShowTimes) {
        this.dailyShowTimes = dailyShowTimes;
    }
    public int getDailyShowTimes() {
        return dailyShowTimes;
    }

    public void setDisappearTime(Date disappearTime) {
        this.disappearTime = disappearTime;
    }
    public Date getDisappearTime() {
        return disappearTime;
    }

    public void setRedirectType(int redirectType) {
        this.redirectType = redirectType;
    }
    public int getRedirectType() {
        return redirectType;
    }

    public void setLimitShowTimes(int limitShowTimes) {
        this.limitShowTimes = limitShowTimes;
    }
    public int getLimitShowTimes() {
        return limitShowTimes;
    }

    public void setItemTags(String itemTags) {
        this.itemTags = itemTags;
    }
    public String getItemTags() {
        return itemTags;
    }

    public void setType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }

    public void setRebateMoney(int rebateMoney) {
        this.rebateMoney = rebateMoney;
    }
    public int getRebateMoney() {
        return rebateMoney;
    }

    public void setNewUserShare(int newUserShare) {
        this.newUserShare = newUserShare;
    }
    public int getNewUserShare() {
        return newUserShare;
    }

    public void setOldUserShare(int oldUserShare) {
        this.oldUserShare = oldUserShare;
    }
    public int getOldUserShare() {
        return oldUserShare;
    }

    public void setNewTagList(List<String> newTagList) {
        this.newTagList = newTagList;
    }
    public List<String> getNewTagList() {
        return newTagList;
    }

    public void setRedirectSecondPage(int redirectSecondPage) {
        this.redirectSecondPage = redirectSecondPage;
    }
    public int getRedirectSecondPage() {
        return redirectSecondPage;
    }

}
