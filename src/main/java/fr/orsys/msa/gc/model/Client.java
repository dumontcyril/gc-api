package fr.orsys.msa.gc.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Client {

    @Id
    private Integer id;

    private String lastname;
    private String firstname;
    private String address;
    private String city;
    private String zipCode;

}
