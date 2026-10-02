package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
        assertTrue(t.getMembers().contains("Jarek"), "Team should contain Jarek");
        assertTrue(t.getMembers().contains("Jovia"), "Team should contain Jovia");
        assertTrue(t.getMembers().contains("Noah N"), "Team should contain Noah N");
        assertTrue(t.getMembers().contains("Tara"), "Team should contain Tara");
        assertEquals(6, t.getMembers().size(), "Team should have exactly 6 members");
    }


    // same object
    @Test void equals_returns_true(){
        Team t = Developer.getTeam();
        assertTrue(t.equals(t));
    }

    // same class
    @Test
    void equals_returns_false_for_non_team_object() {
        Team t = Developer.getTeam();
        assertFalse(t.equals("not a team"));
        assertFalse(t.equals(new Object()));
    }

    // cast and compare fields?
    @Test
    void equals_returns_false_for_null() {
        assertFalse(Developer.getTeam().equals(null));
    }

    //
    @Test
    void equals_returns_true_for_equal_but_distinct_teams() {
        assertTrue(Developer.getTeam().equals(Developer.getTeam()));  
    }

    @Test
    void equals_returns_false_for_different_name() {
        Team a = new Team("a");
        Team b = new Team("b");
        assertFalse(a.equals(b));  // name differs
    }

    @Test
    void equals_returns_false_for_different_members() {
        Team a = new Team("a");
        Team b = new Team("a");
        b.addMember("Tara");
        assertFalse(a.equals(b));  // members differ
    }

    @Test 
    void toString_returns_proper_name() {
        Team a = new Team("a");
        assertTrue(a.toString().equals("Team(name=a, members=[])"));
    }

    @Test
    void hashCode_returns_true_for_team() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    void hashCode_returns_not_true_for_different_teams(){
        Team t1 = new Team("a");
        Team t2 = new Team("b");
        assertFalse(t1.hashCode() == t2.hashCode());
    }

    @Test 
    void hashCode_returns_not_true_for_zero() {
        Team t1 = new Team();
        assertNotEquals(0, t1.hashCode());
    }
}
