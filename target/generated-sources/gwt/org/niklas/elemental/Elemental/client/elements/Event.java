package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Event"
)
interface Event {
  @JsProperty
  String getType();

  @JsProperty
  EventTarget getTarget();

  @JsProperty
  EventTarget getCurrentTarget();

  @JsProperty
  short getEventPhase();

  @JsProperty
  boolean getBubbles();

  @JsProperty
  boolean getCancelable();

  @JsProperty
  boolean getDefaultPrevented();

  @JsProperty
  boolean getIsTrusted();

  void stopPropagation();

  void stopImmediatePropagation();

  void preventDefault();

  boolean initEvent(String type, boolean bubbles, boolean cancelable);
}
