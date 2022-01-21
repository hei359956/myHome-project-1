package ch.fhnw.acrm.data.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;


@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Long id;

	//@Column(name = "mail", nullable = false)
	private Long mail;

	//@Column(name = "password", nullable = false)
	private String password;

	//@Column(name = "first_name", nullable = false, length = 30)
	private String firstName;

	//@Column(name = "last_name", nullable = false, length = 30)
	private String lastName;

	//@Temporal(TemporalType.DATE)
	//@Column(name = "birthday", nullable = false)
	private Date birthday;

	//@Column(name = "number", nullable = false)
	private Integer number;
	@ManyToOne
	@JsonIgnore
	private Agent agent;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getMail() {
		return mail;
	}

	public void setMail(Long mail) {
		this.mail = mail;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Agent getAgent() {
		return agent;
	}
}
