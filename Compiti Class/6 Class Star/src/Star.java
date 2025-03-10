public class Star {
    private String name;
    private double luminosity;
    private double mass;
    private double volume;
    private double age;

    public Star(String name, double luminosity, double mass, double volume, double age) {
        this.name = name;
        this.luminosity = luminosity;
        this.mass = mass;
        this.volume = volume;
        this.age = age;
    }

    public Star() {
        this.name = "Sun";
        this.luminosity = 3.28e26;
        this.mass = 1.9885e30;
        this.volume = 1.14e18;
        this.age = 4.6e9;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double newAge) {
        this.age = newAge;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double newMass) {
        this.mass = newMass;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double newVolume) {
        this.volume = newVolume;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLuminosity() {
        return luminosity;
    }
    public void setLuminosity(double newLuminosity) {
        this.luminosity = newLuminosity;
    }

    public String toString() {
        return "*************************************+++++++++++++++++++\n" +
                "Stella: " + name + ", " + "cd= "+ luminosity + ", " + "m= " + mass + ", " + "V= "+volume + ", " + "Age: "+age + "\n" +
                "****************************************++++++++++++++++";
    }
}
