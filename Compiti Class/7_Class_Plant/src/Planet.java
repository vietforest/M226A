public class Planet {
    private String _name;
    private double _mass;
    private double _volume;
    private double _density;
    private double _radius;
    private boolean _life;
    private double _population;
    private boolean _gasGiant;
    private double _albeddo;

    public String getName(){
        return _name;
    }
    public void setName ( String newName) {
        this._name = newName;
    }

    public double getMass(){ return _mass;}
    public void setMass( double newMass) {this._mass = newMass;}

    public double getVolume(){ return _volume;}
    public void setVolume( double newVolume) {this._volume = newVolume;}

    public double getDensity(){ return _density;}
    public void setDensity( double newDensity) {this._density = newDensity;}

    public double getRadius(){ return _radius;}
    public void setRadius( double newRadius) {this._radius = newRadius;}

    public boolean getLife(){ return _life;}
    public void setLife( boolean newLife) {this._life = newLife;}

    public double getPopulation(){ return _population;}
    public void setPopulation( double newPopulation) {this._population = newPopulation;}

    public boolean getGasGiant(){ return _gasGiant;}
    public void getGasGiant( boolean newGasGiant) {this._gasGiant = newGasGiant;}

    public double getAlbeddo(){ return _albeddo;}
    public void setAlbeddo( double newAlbeddo) {this._albeddo = newAlbeddo;}

    public Planet(String name
            ,double mass
            ,double volume
            ,double density
            ,double radius
            ,boolean life
            ,double population
            ,boolean gasGiant
            ,double albeddo)
    {
        this._name = name;
        this._mass = mass;
        this._volume = volume;
        this._density = density;
        this._radius = radius;
        this._life = life;
        this._population = population;
        this._gasGiant = gasGiant;
        this._albeddo = albeddo;
    }

}
