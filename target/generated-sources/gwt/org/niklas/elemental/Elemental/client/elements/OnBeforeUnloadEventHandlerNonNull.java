package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "OnBeforeUnloadEventHandlerNonNull"
)
interface OnBeforeUnloadEventHandlerNonNull {
  String run(Event event);
}
