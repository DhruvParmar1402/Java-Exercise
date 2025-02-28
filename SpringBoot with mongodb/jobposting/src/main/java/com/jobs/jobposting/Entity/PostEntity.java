package com.jobs.jobposting.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "jobspost")  // Ensure this matches your MongoDB collection name
public class PostEntity {

    @Id
    private String id;  // ✅ Changed from int to String

    private String description;
    private String profile;
    private String[] techs;
    private int experience;

    public PostEntity(String id, String description, String profile, String[] techs, int experience) {
        this.id = id;
        this.description = description;
        this.profile = profile;
        this.techs = techs;
        this.experience = experience;
    }

    public PostEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "PostEntity{" +
                "id='" + id + '\'' +  // ✅ Ensure id is treated as String
                ", description='" + description + '\'' +
                ", profile='" + profile + '\'' +
                ", techs=" + Arrays.toString(techs) +
                ", experience=" + experience +
                '}';
    }
}
