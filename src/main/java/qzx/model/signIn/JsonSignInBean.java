package qzx.model.signIn;


public class JsonSignInBean {

    private Account account;
    private int isHadTeacher;
    private int isNeedInsurance;
    private Result result;
    private int costTime;
    public void setAccount(Account account) {
        this.account = account;
    }
    public Account getAccount() {
        return account;
    }

    public void setIsHadTeacher(int isHadTeacher) {
        this.isHadTeacher = isHadTeacher;
    }
    public int getIsHadTeacher() {
        return isHadTeacher;
    }

    public void setIsNeedInsurance(int isNeedInsurance) {
        this.isNeedInsurance = isNeedInsurance;
    }
    public int getIsNeedInsurance() {
        return isNeedInsurance;
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
