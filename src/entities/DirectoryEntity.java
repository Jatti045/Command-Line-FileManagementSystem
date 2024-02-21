package entities;

import java.util.ArrayList;
import java.util.List;
public class DirectoryEntity extends FileSystemEntity {
    private List<FileSystemEntity> contents; //List to hold files and directories

    public DirectoryEntity(String name, String path) {
        super(name, path);
        this.contents = new ArrayList<>();
    }

}
