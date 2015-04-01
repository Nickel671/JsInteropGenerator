package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "EventListener"
)
interface EventListener {
  void handleEvent(Event event);
}
