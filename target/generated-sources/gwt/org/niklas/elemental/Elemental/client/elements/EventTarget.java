package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "EventTarget"
)
interface EventTarget {
  void addEventListener(String type, EventListener callback, boolean capture);

  void removeEventListener(String type, EventListener callback, boolean capture);

  boolean dispatchEvent(Event event);
}
