package qzx.model.homePage;


import java.util.Date;


public class TopicInfoList {

    private int id;
    private String title;
    private String subtitle;
    private int isCategory;
    private int status;
    private int activityType;
    private Date endTime;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public String getSubtitle() {
        return subtitle;
    }

    public void setIsCategory(int isCategory) {
        this.isCategory = isCategory;
    }
    public int getIsCategory() {
        return isCategory;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }
    public int getActivityType() {
        return activityType;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public Date getEndTime() {
        return endTime;
    }

}
