import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class CalcolatorePeso {
    private double _mass;
    private double _gravity;
    Dictionary<String, Double> _d = new Hashtable<>();
    d.put("Sole", 274)
    d.put("Earth", 9.81)


    public double get_gravity() {
        return _gravity;
    }

    public void set_gravity(double _gravity) {
        this._gravity = _gravity;
    }

    public double get_mass() {
        return _mass;
    }

    public void set_mass(double _mass) {
        this._mass = _mass;
    }

    public CalcolatorePeso(double _mass, double _gravity) {
        this._mass = _mass;
        this._gravity = _gravity;
    }

}
