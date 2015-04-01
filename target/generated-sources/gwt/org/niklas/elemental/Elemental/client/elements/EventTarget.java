package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "EventTarget"
)
interface EventTarget {
  boolean addEventListener(String type, EventListener callback, boolean capture);

  boolean removeEventListener(String type, EventListener callback, boolean capture);

  Event dispatchEvent(Event event);
}
