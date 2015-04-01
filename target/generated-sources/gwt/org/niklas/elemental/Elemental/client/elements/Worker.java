package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Worker"
)
interface Worker extends EventTarget, AbstractWorker {
  @JsProperty
  EventHandlerNonNull getOnmessage();

  @JsProperty
  void setOnmessage(EventHandlerNonNull value);

  void terminate();
}
