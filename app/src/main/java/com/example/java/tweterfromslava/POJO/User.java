package com.example.java.tweterfromslava.POJO;

public class User {
    private Long id;
    private String imageUrl;
    private String name;
    private String nick;
    private String description;
    private String location;
    private int followingCount;
    private int followerCount;

    public User(Long id, String imageUrl, String name, String nick, String description, String location, int followingCount, int followerCount) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.nick = nick;
        this.description = description;
        this.location = location;
        this.followingCount = followingCount;
        this.followerCount = followerCount;
    }

    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (followingCount != user.followingCount) return false;
        if (followerCount != user.followerCount) return false;
        if (!id.equals(user.id)) return false;
        if (!imageUrl.equals(user.imageUrl)) return false;
        if (!name.equals(user.name)) return false;
        if (!nick.equals(user.nick)) return false;
        if (!description.equals(user.description)) return false;
        return location.equals(user.location);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + imageUrl.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + nick.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + followingCount;
        result = 31 * result + followerCount;
        return result;
    }
}
