package qzx.model.homePage;

import java.util.List;

public class ModuleDtoList {

    private int moduleId;
    private String title;
    private boolean isMore;
    private String moreAction;
    private int type;
    private List<EntranceItemDtoList> entranceItemDtoList;
    private int showNumber;
    private String bgImg;
    private int personal;
    private int isFlashSale;
    private int sorted;
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

    public void setIsMore(boolean isMore) {
        this.isMore = isMore;
    }
    public boolean getIsMore() {
        return isMore;
    }

    public void setMoreAction(String moreAction) {
        this.moreAction = moreAction;
    }
    public String getMoreAction() {
        return moreAction;
    }

    public void setType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }

    public void setEntranceItemDtoList(List<EntranceItemDtoList> entranceItemDtoList) {
        this.entranceItemDtoList = entranceItemDtoList;
    }
    public List<EntranceItemDtoList> getEntranceItemDtoList() {
        return entranceItemDtoList;
    }

    public void setShowNumber(int showNumber) {
        this.showNumber = showNumber;
    }
    public int getShowNumber() {
        return showNumber;
    }

    public void setBgImg(String bgImg) {
        this.bgImg = bgImg;
    }
    public String getBgImg() {
        return bgImg;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }
    public int getPersonal() {
        return personal;
    }

    public void setIsFlashSale(int isFlashSale) {
        this.isFlashSale = isFlashSale;
    }
    public int getIsFlashSale() {
        return isFlashSale;
    }

    public void setSorted(int sorted) {
        this.sorted = sorted;
    }
    public int getSorted() {
        return sorted;
    }

}
