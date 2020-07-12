package com.codecool.minipa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Topic extends Entry {


    List<Comment> unModeratedComments = new ArrayList<>();
    List<Comment> moderatedComments = new ArrayList<>();

    private int id;
    private static int currentTopicId = 1;
    private String title;

    public Topic(String title, String message) {
        super(message);
        this.setMessage(message);
        this.title = title;
        this.id = generateNextId();
    }


    public List<Comment> getUnmoderatedComments() {
        return unModeratedComments;
    }

    public List<Comment> getModeratedComments() {
        return moderatedComments;
    }

    public String showMessage() {
        return this.getMessage();
    }

    public int generateNextId() {
        return currentTopicId++;
    }

    public void addComment(String message) {
        Comment newComment = new Comment(message);
        unModeratedComments.add(newComment);
    }

    public void populateModeratedComments() {
        moderatedComments = unModeratedComments.stream()
                                .filter(comment -> comment.isModerated() == true)
                                .collect(Collectors.toList());
    }

    public void moderateComment() {
        Random rand = new Random();
        int randomModeratedComment = rand.nextInt(this.getUnmoderatedComments().size());
        this.getUnmoderatedComments().get(randomModeratedComment).toggleModerated();
        populateModeratedComments();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return ("TOPIC: " + this.getTitle() + "\r\n"  + "TOPIC MESSAGE: " + this.showMessage() + "\r\n" + "THE COMMENT(S): " + this.getModeratedComments());
    }


}


