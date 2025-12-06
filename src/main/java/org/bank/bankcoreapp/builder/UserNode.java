package org.bank.bankcoreapp.builder;

import lombok.Setter;

@Setter
public class UserNode {

    private String name;
    private int id;
    private boolean active;
    private String comment;

    public UserNode() {}

    public UserNode(String name, int id, boolean active, String comment) {
        this.name = name;
        this.id = id;
        this.active = active;
        this.comment = comment;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public boolean isActive() { return active; }
    public String getComment() { return comment; }

    @Override
    public String toString() {
        return "UserNode{name='%s', id=%d, active=%s, comment='%s'}"
                .formatted(name, id, active, comment);
    }
}
