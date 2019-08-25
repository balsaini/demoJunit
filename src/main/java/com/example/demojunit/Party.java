package com.example.demojunit;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "PARTY")
public class Party {

    @Id
    private String id;

    @Field("PARTY_ID")
    @JsonProperty("PARTY_ID")
    private String partyId;

    @Field("FIRST_NAME")
    @JsonProperty("FIRST_NAME")
    private String firstName;

    @Field("LAST_NAME")
    @JsonProperty("LAST_NAME")
    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
