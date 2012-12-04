package org.sqlproc.sample.simple.model;
  
import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public Person() {
  }
  
  public Person(String name) {
    this.name = name;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public Person _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
    
  public Person _setName(String name) {
    this.name = name;
    return this;
  }
  
  private String passport;
    
  public String getPassport() {
    return passport;
  }
    
  public void setPassport(String passport) {
    this.passport = passport;
  }
    
  public Person _setPassport(String passport) {
    this.passport = passport;
    return this;
  }
  
  private List<Media> library = new ArrayList<Media>();
    
  public List<Media> getLibrary() {
    return library;
  }
    
  public void setLibrary(List<Media> library) {
    this.library = library;
  }
    
  public Person _setLibrary(List<Media> library) {
    this.library = library;
    return this;
  }
  
  private List<Contact> contacts = new ArrayList<Contact>();
    
  public List<Contact> getContacts() {
    return contacts;
  }
    
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }
    
  public Person _setContacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (id != other.id)
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }  
  
  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", passport=" + passport + "]";
  }
  
  public String toStringFull() {
    return "Person [id=" + id + ", name=" + name + ", passport=" + passport + "]";
  }
}
