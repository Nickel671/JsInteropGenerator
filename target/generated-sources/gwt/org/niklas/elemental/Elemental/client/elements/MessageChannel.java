package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MessageChannel"
)
interface MessageChannel {
  @JsProperty
  MessagePort getPort1();

  @JsProperty
  MessagePort getPort2();
}
