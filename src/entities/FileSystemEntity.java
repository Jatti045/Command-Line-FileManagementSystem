package entities;

import java.time.LocalDateTime;

public abstract class FileSystemEntity { //Abstract Class -> Cannot create an instance of the class FileSystemEntity
    protected String name; //Name of file or directory
    protected String path; //Location of the entity within the file
    protected LocalDateTime creationDate; //Date the entity was created
    protected LocalDateTime modificationDate; //Date the entity was modified;

    //Parameterized Constructor
    public FileSystemEntity(String name, String path) {
        this.name = name;
        this.path = path;
        this.creationDate = LocalDateTime.now();
        this.modificationDate = LocalDateTime.now();
    }

    //Getters and Setters
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LocalDateTime getCreationDate() {    //No setters since creationDate is a set time
        return this.creationDate;
    }

    public LocalDateTime getModificationDate() { //No setters since modificationData is a set time
        return this.modificationDate;
    }
}


