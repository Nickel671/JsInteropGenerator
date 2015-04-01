package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "AbstractWorker"
)
interface AbstractWorker {
  @JsProperty
  EventHandlerNonNull getOnerror();

  @JsProperty
  void setOnerror(EventHandlerNonNull value);
}
