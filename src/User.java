public class User {
    String username;
    int age;
    double salary;
    boolean isMarried;
    int homeCapacity;
    String livingPlace;
public User( ){}
    public User(String username, int age, double salary, boolean isMarried, int homeCapacity, String livingPlace) {
        this.username = username;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        this.homeCapacity = homeCapacity;
        this.livingPlace = livingPlace;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getHomeCapacity() {
        return homeCapacity;
    }

    public void setHomeCapacity(int homeCapacity) {
        this.homeCapacity = homeCapacity;
    }

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }
}
