package bilgeadam.jpa2;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Country implements Serializable {

    private static final long serialVersionUID = 1234567L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    // OneToMany , ManytoMany ---> (default) LAZY
    // ManyToOne , OneToOne ---> (default) EAGER
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "countryId")
    private Set<City> cities;

    public Country(String name, Set<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }


}
