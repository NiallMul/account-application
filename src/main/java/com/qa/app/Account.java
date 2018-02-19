package com.qa.app;

public class Account {
	private String firstName, lastName, acccountNumber;

	public Account() {
		super();
	}

	public Account(String firstName, String lastName, Integer userNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		setAccountNumber(userNum);
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
	
	public void setAccountNumber(Integer userNum) {
		acccountNumber = firstName.substring(0,1)+lastName.substring(0,1)+userNum.toString();
	}

	public String getAcccountNumber() {
		return acccountNumber;
	}

	public void setAcccountNumber(String acccountNumber) {
		this.acccountNumber = acccountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acccountNumber == null) ? 0 : acccountNumber.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (acccountNumber == null) {
			if (other.acccountNumber != null)
				return false;
		} else if (!acccountNumber.equals(other.acccountNumber))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return acccountNumber+"\n"+firstName+"\n"+lastName;
	}
}
