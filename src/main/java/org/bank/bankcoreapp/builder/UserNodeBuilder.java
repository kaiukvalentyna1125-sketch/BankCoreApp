package org.bank.bankcoreapp.builder;

public class UserNodeBuilder {

    private final UserNode node = new UserNode();

    public static UserNodeBuilder create() {
        return new UserNodeBuilder();
    }

    public UserNodeBuilder name(String name) {
        node.setName(name);
        return this;
    }

    public UserNodeBuilder id(int id) {
        node.setId(id);
        return this;
    }

    public UserNodeBuilder active(boolean active) {
        node.setActive(active);
        return this;
    }

    public UserNodeBuilder comment(String comment) {
        node.setComment(comment);
        return this;
    }

    public UserNode build() {
        if (node.getName() == null)
            throw new RuntimeException("Name is required");
        if (node.getId() < 0)
            throw new RuntimeException("Invalid negative id");

        return node;
    }
}
