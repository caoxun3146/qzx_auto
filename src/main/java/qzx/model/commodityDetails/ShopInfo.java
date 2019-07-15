package qzx.model.commodityDetails;


public class ShopInfo {

    private String sourceId;
    private long shopId;
    private String shopName;
    private String shopDsr;
    private int shopType;
    private String certIcon;
    private boolean isShowCertIcon;
    private boolean showShopLinkIcon;
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
    public String getSourceId() {
        return sourceId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }
    public long getShopId() {
        return shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getShopName() {
        return shopName;
    }

    public void setShopDsr(String shopDsr) {
        this.shopDsr = shopDsr;
    }
    public String getShopDsr() {
        return shopDsr;
    }

    public void setShopType(int shopType) {
        this.shopType = shopType;
    }
    public int getShopType() {
        return shopType;
    }

    public void setCertIcon(String certIcon) {
        this.certIcon = certIcon;
    }
    public String getCertIcon() {
        return certIcon;
    }

    public void setIsShowCertIcon(boolean isShowCertIcon) {
        this.isShowCertIcon = isShowCertIcon;
    }
    public boolean getIsShowCertIcon() {
        return isShowCertIcon;
    }

    public void setShowShopLinkIcon(boolean showShopLinkIcon) {
        this.showShopLinkIcon = showShopLinkIcon;
    }
    public boolean getShowShopLinkIcon() {
        return showShopLinkIcon;
    }

}
