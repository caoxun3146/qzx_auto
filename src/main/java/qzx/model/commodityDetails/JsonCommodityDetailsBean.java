package qzx.model.commodityDetails;


public class JsonCommodityDetailsBean {

    private ProductInfo productInfo;
    private ProductMediaInfos productMediaInfos;
    private ShopInfo shopInfo;
    private int zeroCountDown;
    private int jumpType;
    private Result result;
    private int costTime;

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductMediaInfos(ProductMediaInfos productMediaInfos) {
        this.productMediaInfos = productMediaInfos;
    }

    public ProductMediaInfos getProductMediaInfos() {
        return productMediaInfos;
    }

    public void setShopInfo(ShopInfo shopInfo) {
        this.shopInfo = shopInfo;
    }

    public ShopInfo getShopInfo() {
        return shopInfo;
    }

    public void setZeroCountDown(int zeroCountDown) {
        this.zeroCountDown = zeroCountDown;
    }

    public int getZeroCountDown() {
        return zeroCountDown;
    }

    public void setJumpType(int jumpType) {
        this.jumpType = jumpType;
    }

    public int getJumpType() {
        return jumpType;
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

}
