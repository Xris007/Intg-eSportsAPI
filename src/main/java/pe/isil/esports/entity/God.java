package pe.isil.esports.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class God {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @Column
    public String title;

    @Column
    public String pantheon;

    @Column
    public String type;

    @Column
    public String class_god;

    @Column
    public String attribute;

    @Column
    private String poster_path;

    @Column
    private String background_path;

    @Column
    private Double health;

    @Column
    private Double mana;

    @Column
    private Double speed;

    @Column
    private Double range;

    @Column
    private Double attack_speed;

    @Column
    private Double damage;

    @Column
    private Double physical_protection;

    @Column
    private Double magic_protection;

    @Column
    private Double hp_regeneration;

    @Column
    private Double mp_regeneration;
}
