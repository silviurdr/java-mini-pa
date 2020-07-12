package com.codecool.minipa;

public class Comment extends Entry {

    private int id;
    private static int currentCommentId = 0;
    private boolean moderated = false;
    public String message;

    public Comment(String message) {
        super(message);
        this.id = generateNextId();
        this.message = message;
    }

    public boolean isModerated() {
        return moderated;
    }

    public int generateNextId() {
        return currentCommentId++;
    }

    public void toggleModerated() {
        if (this.moderated == false) {
            this.moderated = true;
        } else this.moderated = false;
    }

    public String getMessage() {
        return this.message;
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ("The comment with id " + this.getId() + ": '" + this.getMessage() + "', with creation date: " + this.getCreationDate());
    }

}
