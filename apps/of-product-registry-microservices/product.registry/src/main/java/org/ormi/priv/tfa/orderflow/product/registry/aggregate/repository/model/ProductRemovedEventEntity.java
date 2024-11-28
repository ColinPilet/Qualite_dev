package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

public class ProductRemovedEventEntity extends ProductRegistryEventEntity {
  static final String EVENT_TYPE = "ProductRemoved";

  /**
   * Payload for the event.
   */
  public record Payload(String productId) {}

  /**
   * The payload for the event.
   */
  private Payload payload;

  /**
   * Returns the payload for the event.
   * 
   * @return The payload for the event.
   */
  public Payload getPayload() {
    return payload;
  }

  /**
   * Sets the payload for the event.
   * 
   * @param payload The payload to set.
   */
  public void setPayload(Payload payload) {
    this.payload = payload;
  }

  @Override
  public String getEventType() {
    return EVENT_TYPE;
  }
  
}
