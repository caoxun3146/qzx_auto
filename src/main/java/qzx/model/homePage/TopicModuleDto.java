package qzx.model.homePage;


import java.util.List;


public class TopicModuleDto {

    private int moduleId;
    private String title;
    private String titleImg;
    private String titleBgColor;
    private int topicPageId;
    private int topicStyle;
    private List<TopicInfoList> topicInfoList;
    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }
    public int getModuleId() {
        return moduleId;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }
    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleBgColor(String titleBgColor) {
        this.titleBgColor = titleBgColor;
    }
    public String getTitleBgColor() {
        return titleBgColor;
    }

    public void setTopicPageId(int topicPageId) {
        this.topicPageId = topicPageId;
    }
    public int getTopicPageId() {
        return topicPageId;
    }

    public void setTopicStyle(int topicStyle) {
        this.topicStyle = topicStyle;
    }
    public int getTopicStyle() {
        return topicStyle;
    }

    public void setTopicInfoList(List<TopicInfoList> topicInfoList) {
        this.topicInfoList = topicInfoList;
    }
    public List<TopicInfoList> getTopicInfoList() {
        return topicInfoList;
    }

}
