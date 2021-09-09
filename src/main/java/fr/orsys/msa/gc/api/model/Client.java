package fr.orsys.msa.gc.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="client")
@Getter
@Setter
public class Client {

    @Id
    private Integer id;

    @JsonProperty(value="last_name")
    private String lastname;

    @JsonProperty(value="first_name")
    private String firstname;
    private String address;
    private String city;
    private String zipCode;

}
