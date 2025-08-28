package no.hiof.prog2.oblig3.model;

public class Role {
    private String roleFirstName;
    private String roleLastName;
    private Person actor;

    public Role(String roleFirstName, String roleLastName, Person actor) {
        this.roleFirstName = roleFirstName;
        this.roleLastName = roleLastName;
        this.actor = actor;
    }

    public String getRoleFullName() {
        return roleFirstName + " " + roleLastName;
    }

    public Person getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Role: " + getRoleFullName() + " played by " + actor.getFullName();
    }
}