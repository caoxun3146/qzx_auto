package qzx.model.homePage;


import java.util.List;
import java.util.Date;


public class JsonHomePageBean{

    private List<ModuleDtoList> moduleDtoList;
    private List<String> newFlashSaleModuleDtoList;
    private TopicModuleDto topicModuleDto;
    private Date currentTime;
    private int isFlashSalePage;
    private int isNewUser;
    private int authorizeInAdvance;
    private String tabThemeBgImg;
    private String tabFontColor;
    private String tabFontSelectedColor;
    private Result result;
    private int costTime;
    public void setModuleDtoList(List<ModuleDtoList> moduleDtoList) {
        this.moduleDtoList = moduleDtoList;
    }
    public List<ModuleDtoList> getModuleDtoList() {
        return moduleDtoList;
    }

    public void setNewFlashSaleModuleDtoList(List<String> newFlashSaleModuleDtoList) {
        this.newFlashSaleModuleDtoList = newFlashSaleModuleDtoList;
    }
    public List<String> getNewFlashSaleModuleDtoList() {
        return newFlashSaleModuleDtoList;
    }

    public void setTopicModuleDto(TopicModuleDto topicModuleDto) {
        this.topicModuleDto = topicModuleDto;
    }
    public TopicModuleDto getTopicModuleDto() {
        return topicModuleDto;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
    public Date getCurrentTime() {
        return currentTime;
    }

    public void setIsFlashSalePage(int isFlashSalePage) {
        this.isFlashSalePage = isFlashSalePage;
    }
    public int getIsFlashSalePage() {
        return isFlashSalePage;
    }

    public void setIsNewUser(int isNewUser) {
        this.isNewUser = isNewUser;
    }
    public int getIsNewUser() {
        return isNewUser;
    }

    public void setAuthorizeInAdvance(int authorizeInAdvance) {
        this.authorizeInAdvance = authorizeInAdvance;
    }
    public int getAuthorizeInAdvance() {
        return authorizeInAdvance;
    }

    public void setTabThemeBgImg(String tabThemeBgImg) {
        this.tabThemeBgImg = tabThemeBgImg;
    }
    public String getTabThemeBgImg() {
        return tabThemeBgImg;
    }

    public void setTabFontColor(String tabFontColor) {
        this.tabFontColor = tabFontColor;
    }
    public String getTabFontColor() {
        return tabFontColor;
    }

    public void setTabFontSelectedColor(String tabFontSelectedColor) {
        this.tabFontSelectedColor = tabFontSelectedColor;
    }
    public String getTabFontSelectedColor() {
        return tabFontSelectedColor;
    }

    public void setResult(Result result) {
        this.result = result;
    }
    public Result getResult() {
        return result;
    }

    public void setCostTime(int costTime) {
        this.costTime = costTime;
    }
    public int getCostTime() {
        return costTime;
    }

    @Override
    public String toString() {
        return "JsonHomePageBean{" +
                "moduleDtoList=" + moduleDtoList +
                ", newFlashSaleModuleDtoList=" + newFlashSaleModuleDtoList +
                ", topicModuleDto=" + topicModuleDto +
                ", currentTime=" + currentTime +
                ", isFlashSalePage=" + isFlashSalePage +
                ", isNewUser=" + isNewUser +
                ", authorizeInAdvance=" + authorizeInAdvance +
                ", tabThemeBgImg='" + tabThemeBgImg + '\'' +
                ", tabFontColor='" + tabFontColor + '\'' +
                ", tabFontSelectedColor='" + tabFontSelectedColor + '\'' +
                ", result=" + result +
                ", costTime=" + costTime +
                '}';
    }
}
