package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Noah N";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "N-Nicholls";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f26-05");
        team.addMember("BRANDON");
        team.addMember("CALVIN");
        team.addMember("JAREK");
        team.addMember("JOVIA");
        team.addMember("NOAH PAUL");
        team.addMember("TARA");
        return team;
    }

}
