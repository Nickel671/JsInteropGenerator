package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MessageEvent"
)
interface MessageEvent extends Event {
  @JsProperty
  String getOrigin();

  @JsProperty
  String getLastEventId();
}
