package pe.isil.esports;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pe.isil.esports.entity.Champion;
import pe.isil.esports.entity.God;
import pe.isil.esports.entity.Hero;
import pe.isil.esports.service.ChampionService;
import pe.isil.esports.service.GodService;
import pe.isil.esports.service.HeroService;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    ChampionService championService;

    @Autowired
    GodService godService;

    @Autowired
    HeroService heroService;

    @Override
    public void run(String... args) throws Exception {

        Champion champion = new Champion();
        champion.setName("Aatrox");
        champion.setTitle("The Darkin Blade");
        champion.setPrimary_rol("Fighter");
        champion.setSecondary_rol("Tank");
        champion.setPoster_path("https://gamepedia.cursecdn.com/lolesports_gamepedia_en/c/cc/AatroxSquare.png");
        champion.setBackground_path("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg");
        champion.setHealth(580.0);
        champion.setRegeneration(3.0);
        champion.setMove_speed(345.0);
        champion.setAttack_damage(60.0);
        champion.setAttack_speed(0.651);
        champion.setRange(175.0);
        champion.setArmor(38.0);
        champion.setMagic_resistance(32.1);
        championService.create(champion);

        God god = new God();
        god.setName("Achilles");
        god.setTitle("Hero of the Trojan War");
        god.setPantheon("Greek");
        god.setType("Physical");
        god.setClass_god("Warrior");
        god.setPoster_path("https://gamepedia.cursecdn.com/smite_gamepedia/thumb/6/66/SkinArt_Achilles_Default.jpg/375px-SkinArt_Achilles_Default.jpg");
        god.setBackground_path("https://web2.hirez.com/smite-media//wp-content/uploads/2018/02/Smite-Web-Achilles-Header-2560x917.jpg");
        god.setHealth(475.0);
        god.setMana(205.0);
        god.setSpeed(370.0);
        god.setRange(16.0);
        god.setAttack_speed(0.95);
        god.setDamage(38.0);
        god.setPhysical_protection(17.0);
        god.setMagic_protection(30.0);
        god.setHp_regeneration(9.0);
        god.setMp_regeneration(4.7);
        godService.create(god);

        Hero hero = new Hero();
        hero.setName("Abaddon");
        hero.setRoles("Support - Carry - Durable");
        hero.setType("Melee");
        hero.setPoster_path("https://cdn.cloudflare.steamstatic.com/apps/dota2/images/heroes/abaddon_vert.jpg");
        hero.setBackground_path("https://cdn.cloudflare.steamstatic.com/apps/dota2/images/heroes/abaddon_full.png");
        hero.setStrength(23.0);
        hero.setAgility(23.0);
        hero.setIntelligence(18.0);
        hero.setDamage(28.0);
        hero.setMove_speed(325.0);
        hero.setArmor(2.22);
        heroService.create(hero);
    }
}
