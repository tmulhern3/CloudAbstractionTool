package com.tmulhern3.models.resources;

import java.util.Optional;

/**
 * Created by Tim on 8/5/2016.
 */
public class Server {

    private String id;
    private Optional<String> image;
    private Optional<String> size;

    public Server(String id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = Optional.of(image);
    }

    public Optional<String> getImage() {
        return image;
    }

    public void setSize(String size) {
        this.size = Optional.of(size);
    }

    public Optional<String> getSize() {
        return size;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
