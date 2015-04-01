package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "RelatedEvent"
)
interface RelatedEvent extends Event {
  @JsProperty
  EventTarget getRelatedTarget();
}
