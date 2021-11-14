package unit6.Task3;

public class Phone {

    private String number;
    private boolean isMobile;

    public Phone(String number, boolean isMobile) {
        this.number = number;
        this.isMobile = isMobile;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", isMobile=" + isMobile +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public void setMobile(boolean mobile) {
        isMobile = mobile;
    }
}
