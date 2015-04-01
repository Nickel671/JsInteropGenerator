package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "OnErrorEventHandlerNonNull"
)
interface OnErrorEventHandlerNonNull {
  Object run(Object event, String source, int lineno, int column, Object error);
}
