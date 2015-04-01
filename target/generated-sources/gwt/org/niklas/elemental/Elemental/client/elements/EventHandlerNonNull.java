package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "EventHandlerNonNull"
)
interface EventHandlerNonNull {
  Object run(Event event);
}
