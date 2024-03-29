package at.htl.leonding.model;

import io.vertx.core.cli.annotations.Name;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Cat.findAll", query = "select c from Cat c"),
        @NamedQuery(name = "Cat.findByName", query = "select c from Cat c where c.name = :name"),
        @NamedQuery(name = "Cat.findByAge", query = "select c from Cat c where c.age = :age")
})
public class Cat extends Pet{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //region Constructors
    public Cat() {
    }

    public Cat(String breed, int age, double weight, String name, double price) {
        super(breed, age, weight, name, price);
    }
    //endregion constructors

    @Override
    public Long getId() {
        return id;
    }
}
