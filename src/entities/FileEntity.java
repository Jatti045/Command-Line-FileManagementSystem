package entities;

import java.io.File;

public class FileEntity extends FileSystemEntity {

    private String content; //Content of the file

    public FileEntity(String name, String path) {
        super(name, path);
        this.content = ""; //Initialize with empty content
    }

    //Getters and Setters

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
