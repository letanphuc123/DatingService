package dating.service.DTO;

public class ResponderDTO {
    
    public String UserName;
    public String Password;
    public String Gender;
    public Integer Age;
    public Float Income;

    public ResponderDTO() {
        this.UserName = "";
        this.Password = "";
        this.Gender = "";
        this.Age = 0;
        this.Income = 0f;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public Float getIncome() {
        return Income;
    }

    public void setIncome(Float Income) {
        this.Income = Income;
    }
    
}
