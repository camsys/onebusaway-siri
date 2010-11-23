package org.onebusaway.siri.repeater.model;

import java.net.URI;
import java.util.Date;

import org.onebusaway.siri.repeater.services.ServiceDeliveryTransformation;

import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.SubscriptionQualifierStructure;

public class SubscriptionTarget {

  private final ParticipantRefStructure _subscriberRef;

  private final SubscriptionQualifierStructure _subscriptionRef;

  private final Date _validUntil;

  private final URI _consumerAddress;

  private final ServiceDeliveryTransformation _filter;

  public SubscriptionTarget(ParticipantRefStructure subscriberRef,
      SubscriptionQualifierStructure subscriptionRef, Date validUntil,
      URI consumerAddress, ServiceDeliveryTransformation filter) {
    _subscriberRef = subscriberRef;
    _subscriptionRef = subscriptionRef;
    _validUntil = validUntil;
    _consumerAddress = consumerAddress;
    _filter = filter;
  }

  public ParticipantRefStructure getSubscriberRef() {
    return _subscriberRef;
  }

  public SubscriptionQualifierStructure getSubscriptionRef() {
    return _subscriptionRef;
  }

  public Date getValidUntil() {
    return _validUntil;
  }

  public URI getConsumerAddress() {
    return _consumerAddress;
  }

  public ServiceDeliveryTransformation getFilter() {
    return _filter;
  }
}
