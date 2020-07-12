package com.codecool.minipa;

import java.util.ArrayList;
import java.util.List;

public class Forum {


    private static Forum forum = null;
    List<Topic> allForumEntries = new ArrayList<>();


    private Forum() {
    }

    public static Forum getInstanceOf() {
        if (forum == null) {
            forum = new Forum();
        }
        return forum;
    }

    public static void main(String[] args) {

        Forum theForum = Forum.getInstanceOf();

        List<Topic> allTopics = new ArrayList<>();

        Topic topic1 = new Topic("Where is the green?", "The green is everywhere, you just have to see it. Did you? Did you?");
        allTopics.add(topic1);
        theForum.allForumEntries.add(topic1);
        topic1.addComment("What is greeeen?");
        topic1.addComment("Green is everythiiiing!");
        topic1.addComment("Nothing can be everything!");

        Topic topic2 = new Topic("Where is the blue?", "The blue is everywhere, you just have to hear it. Did you? Did you?");
        allTopics.add(topic2);
        theForum.allForumEntries.add(topic2);
        topic2.addComment("Why is not green anymore?");
        topic2.addComment("It shouldn't be heard as green always!");
        topic2.addComment("Do you really hear the greenness of this moment?");

        Topic topic3 = new Topic("Where is the red?", "The red is everywhere, you just have to smell it. Did you? Did you?");
        allTopics.add(topic2);
        theForum.allForumEntries.add(topic3);
        topic3.addComment("Oh, now it's red!");
        topic3.addComment("It's not, he is just smelling it.");
        topic3.addComment("Reallllllly?");


        topic2.moderateComment();
        topic2.moderateComment();

        System.out.println();
        System.out.println(topic2.toString());

        topic1.moderateComment();
        System.out.println();
        System.out.println(topic1.toString());


    }



}
