package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "EventSource"
)
interface EventSource extends EventTarget {
  @JsProperty
  String getUrl();

  @JsProperty
  boolean getWithCredentials();

  @JsProperty
  short getReadyState();

  @JsProperty
  EventHandlerNonNull getOnopen();

  @JsProperty
  void setOnopen(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnmessage();

  @JsProperty
  void setOnmessage(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnerror();

  @JsProperty
  void setOnerror(EventHandlerNonNull value);

  void close();
}
