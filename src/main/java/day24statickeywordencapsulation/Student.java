package day24statickeywordencapsulation;

public class Student {
    //encapsulation:"Data hiding" (gizlemek)
    //niçin gizlersiniz:Datayı dış etkenlerden korumak için
    //nasıl gizlersin: Access modifierini private yaparak gizlerim
    //datayı gizledikten sonra başka classlardan okumak istersen ne yaparsın
    //get metodlar(getters) oluşturarak gizlediğimiz dataları okunur hale getirebiliriz
    //datayı gizledikten sonra başka classlardan değiştirmek istersen ne yaparsın
    //set metodlar (setter)oluşturarak gizlediğimiz dataları değiştirebiliriz
    //Variablenin data type ile get metodun return type aynı olmalıdır
    //get metodları isimlendirirken get+variable name şeklinde ancak variable boolean olursa "is + variable name olur
    public String stdName ="Tom Hanks";
    private String stdId="TH202201";
    private Double gpa=3.8;
    private boolean retired =false;

    public String getStdId() {
        return stdId;
    }

    public Double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
