package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("f26-05");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("f26-05"));
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Brandon Y"), "Team should contain Brandon Y");
        assertTrue(t.getMembers().contains("Calvin"), "Team should contain Calvin");
        assertTrue(t.getMembers().contains("Jerek"), "Team should contain Jerek");
        assertTrue(t.getMembers().contains("Jovia"), "Team should contain Jovia");
        assertTrue(t.getMembers().contains("Noah N"), "Team should contain Noah N");
        assertTrue(t.getMembers().contains("Tara"), "Team should contain Tara");
        assertEquals(6, t.getMembers().size(), "Team should have exactly 6 members");
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
