package pe.isil.esports.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String roles;

    @Column
    private String type;

    @Column
    private String poster_path;

    @Column
    private String background_path;

    @Column
    private Double strength;

    @Column
    private Double agility;

    @Column
    private Double intelligence;

    @Column
    private Double damage;

    @Column
    private Double move_speed;

    @Column
    private Double armor;
}
