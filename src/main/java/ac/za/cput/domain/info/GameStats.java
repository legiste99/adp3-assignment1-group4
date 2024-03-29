/**
 * Game Stats.java
 * Game Stats Entity
 * Author: Melisa Bhixa 217131085
 * Date: 31 March 2022
 */

package ac.za.cput.domain.info;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@Table(name = "game_stats")
public class GameStats {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private String fixtureId;
    private String teamId;
    private String teamName;
    private int goalsScored;
    private int goalsConceded;
    private int corners;
    private int yellowCards;
    private int redCards;
    private int freeKicks;
/*
    @ManyToMany(mappedBy = "fixtureGameStats")
    private Set<Fixture> fixtureGameStats = new HashSet<>();*/


    public GameStats(Builder builder) {
        this.id = builder.id;
        this.fixtureId = builder.fixtureId;
        this.teamId = builder.teamId;
        this.teamName = builder.teamName;
        this.goalsScored = builder.goalsScored;
        this.goalsConceded = builder.goalsConceded;
        this.corners = builder.corners;
        this.yellowCards = builder.yellowCards;
        this.redCards = builder.redCards;
        this.freeKicks = builder.freeKicks;
    }

    public GameStats() {

    }


    public static class Builder{
        private String id;
        private String fixtureId;
        private String teamId;
        private String teamName;
        private int goalsScored;
        private int goalsConceded;
        private int corners;
        private int yellowCards;
        private int redCards;
        private int freeKicks;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFixtureId(String fixtureId) {
            this.fixtureId = fixtureId;
            return this;
        }

        public Builder setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public Builder setGoalsScored(int goalsScored) {
            this.goalsScored = goalsScored;
            return this;
        }

        public Builder setGoalsConceded(int goalsConceded) {
            this.goalsConceded = goalsConceded;
            return this;
        }

        public Builder setCorners(int corners) {
            this.corners = corners;
            return this;
        }

        public Builder setYellowCards(int yellowCards) {
            this.yellowCards = yellowCards;
            return this;
        }

        public Builder setRedCards(int redCards) {
            this.redCards = redCards;
            return this;
        }

        public Builder setFreeKicks(int freeKicks) {
            this.freeKicks = freeKicks;
            return this;
        }

        public Builder copy(GameStats gs){
            this.id = gs.id;
            this.fixtureId = gs.fixtureId;
            this.teamId = gs.teamId;
            this.teamName = gs.teamName;
            this.goalsScored = gs.goalsScored;
            this.goalsConceded = gs.goalsConceded;
            this.corners = gs.corners;
            this.yellowCards = gs.yellowCards;
            this.redCards = gs.redCards;
            this.freeKicks = gs.freeKicks;
            return this;
        }

        public GameStats build(){
            return new GameStats(this);
        }
    }
}

