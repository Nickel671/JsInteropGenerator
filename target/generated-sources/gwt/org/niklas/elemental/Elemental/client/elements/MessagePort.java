package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MessagePort"
)
interface MessagePort extends EventTarget {
  @JsProperty
  EventHandlerNonNull getOnmessage();

  @JsProperty
  void setOnmessage(EventHandlerNonNull value);

  void start();

  void close();
}
