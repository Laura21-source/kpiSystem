package ru.gbuac.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employee")
public class Employee extends NamedEntity {

    @SafeHtml
    @Column(name = "firstname")
    private String firstname;

    @SafeHtml
    @Column(name = "lastname")
    private String lastname;

    @SafeHtml
    @Column(name = "patronym")
    private String patronym;

    @SafeHtml
    @Column(name = "position")
    private String position;

    @SafeHtml
    @Column(name = "email")
    private String email;

    @SafeHtml
    @Column(name = "phone")
    private String phone;


}
