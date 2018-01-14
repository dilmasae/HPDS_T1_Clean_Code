package not_clean.dry;

public class Man {
    
    private String name;
    private int age;
    private String sex;

    public Man(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Tu nombre es = " + name + ", tu edad es = " + age + " y tu sexo es = " + sex;
    }
    
    
}
