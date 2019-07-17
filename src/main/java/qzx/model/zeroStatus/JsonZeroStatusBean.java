package qzx.model.zeroStatus;


public class JsonZeroStatusBean {

    private int opStatus;
    private String opMessage;
    private String opNewMessage;
    private int login;
    private String lessTag;
    private String moreTag;
    private String memo;
    private String amount;
    private String imgUrl;
    private long zeroCountDown;
    private String imgUrlZeroRule;
    private int hasNewUserSeckillQualification;
    private String newUserSeckillRoutUrl;
    private String redpacketPlanId;
    private int hasNewReadpackQualification;
    private String newUserReadpackMoney;
    private Result result;
    private int costTime;

    public void setOpStatus(int opStatus) {
        this.opStatus = opStatus;
    }

    public int getOpStatus() {
        return opStatus;
    }

    public void setOpMessage(String opMessage) {
        this.opMessage = opMessage;
    }

    public String getOpMessage() {
        return opMessage;
    }

    public void setOpNewMessage(String opNewMessage) {
        this.opNewMessage = opNewMessage;
    }

    public String getOpNewMessage() {
        return opNewMessage;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getLogin() {
        return login;
    }

    public void setLessTag(String lessTag) {
        this.lessTag = lessTag;
    }

    public String getLessTag() {
        return lessTag;
    }

    public void setMoreTag(String moreTag) {
        this.moreTag = moreTag;
    }

    public String getMoreTag() {
        return moreTag;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setZeroCountDown(long zeroCountDown) {
        this.zeroCountDown = zeroCountDown;
    }

    public long getZeroCountDown() {
        return zeroCountDown;
    }

    public void setImgUrlZeroRule(String imgUrlZeroRule) {
        this.imgUrlZeroRule = imgUrlZeroRule;
    }

    public String getImgUrlZeroRule() {
        return imgUrlZeroRule;
    }

    public void setHasNewUserSeckillQualification(int hasNewUserSeckillQualification) {
        this.hasNewUserSeckillQualification = hasNewUserSeckillQualification;
    }

    public int getHasNewUserSeckillQualification() {
        return hasNewUserSeckillQualification;
    }

    public void setNewUserSeckillRoutUrl(String newUserSeckillRoutUrl) {
        this.newUserSeckillRoutUrl = newUserSeckillRoutUrl;
    }

    public String getNewUserSeckillRoutUrl() {
        return newUserSeckillRoutUrl;
    }

    public void setRedpacketPlanId(String redpacketPlanId) {
        this.redpacketPlanId = redpacketPlanId;
    }

    public String getRedpacketPlanId() {
        return redpacketPlanId;
    }

    public void setHasNewReadpackQualification(int hasNewReadpackQualification) {
        this.hasNewReadpackQualification = hasNewReadpackQualification;
    }

    public int getHasNewReadpackQualification() {
        return hasNewReadpackQualification;
    }

    public void setNewUserReadpackMoney(String newUserReadpackMoney) {
        this.newUserReadpackMoney = newUserReadpackMoney;
    }

    public String getNewUserReadpackMoney() {
        return newUserReadpackMoney;
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
