package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Subscriber;

@Pojo
@SuppressWarnings("all")
public abstract class BillingDetails implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static int ORDER_BY_ID = 1;
  
  public final static int ORDER_BY_SUBSCRIBER = 2;
  
  public BillingDetails() {
  }
  
  public BillingDetails(final Subscriber subscriber, final String type) {
    super();
    setSubscriber(subscriber);
    setType(type);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public BillingDetails _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Subscriber subscriber;
  
  public Subscriber getSubscriber() {
    return this.subscriber;
  }
  
  public void setSubscriber(final Subscriber subscriber) {
    this.subscriber = subscriber;
  }
  
  public BillingDetails _setSubscriber(final Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }
  
  private String type;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(final String type) {
    this.type = type;
  }
  
  public BillingDetails _setType(final String type) {
    this.type = type;
    return this;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
    	return false;
    BillingDetails other = (BillingDetails) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id != null) ? id.hashCode() : 0);
    return result;
  }
  
  @Override
  public String toString() {
    return "BillingDetails [id=" + id + ", type=" + type + "]";
  }
  
  public String toStringFull() {
    return "BillingDetails [id=" + id + ", subscriber=" + subscriber + ", type=" + type + "]";
  }
}
