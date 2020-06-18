package pe.isil.esports.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String title;

    @Column
    private String primary_rol;

    @Column
    private String secondary_rol;

    @Column
    private String poster_path;

    @Column
    private String background_path;

    @Column
    private Double health;

    @Column
    private Double regeneration;

    @Column
    private Double move_speed;

    @Column
    private Double attack_damage;

    @Column
    private Double attack_speed;

    @Column
    private Double range;

    @Column
    private Double armor;

    @Column
    private Double magic_resistance;
}
