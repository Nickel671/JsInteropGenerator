package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "EventListener"
)
interface EventListener {
  Event handleEvent(Event event);
}
