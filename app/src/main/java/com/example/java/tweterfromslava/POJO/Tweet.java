package com.example.java.tweterfromslava.POJO;

public class Tweet {
    private User user;
    private Long id;
    private String data;
    private String textContentTweet;
    private Long retweet;
    private Long like;
    private String imageUrl;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tweet tweet = (Tweet) o;

        if (!user.equals(tweet.user)) return false;
        if (!id.equals(tweet.id)) return false;
        if (!data.equals(tweet.data)) return false;
        if (!textContentTweet.equals(tweet.textContentTweet)) return false;
        if (!retweet.equals(tweet.retweet)) return false;
        if (!like.equals(tweet.like)) return false;
        return imageUrl != null ? imageUrl.equals(tweet.imageUrl) : tweet.imageUrl == null;
    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + data.hashCode();
        result = 31 * result + textContentTweet.hashCode();
        result = 31 * result + retweet.hashCode();
        result = 31 * result + like.hashCode();
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }

    public Tweet(User user, Long id, String data, String textContentTweet, Long retweet, Long like, String imageUrl) {
        this.user = user;
        this.id = id;
        this.data = data;
        this.textContentTweet = textContentTweet;
        this.retweet = retweet;
        this.like = like;
        this.imageUrl = imageUrl;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getTextContentTweet() {
        return textContentTweet;
    }

    public Long getRetweet() {
        return retweet;
    }

    public Long getLike() {
        return like;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
