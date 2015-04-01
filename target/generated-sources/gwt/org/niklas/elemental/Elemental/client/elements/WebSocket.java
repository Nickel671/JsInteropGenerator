package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "WebSocket"
)
interface WebSocket extends EventTarget {
  @JsProperty
  String getUrl();

  @JsProperty
  short getReadyState();

  @JsProperty
  int getBufferedAmount();

  @JsProperty
  EventHandlerNonNull getOnopen();

  @JsProperty
  void setOnopen(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnerror();

  @JsProperty
  void setOnerror(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnclose();

  @JsProperty
  void setOnclose(EventHandlerNonNull value);

  @JsProperty
  String getExtensions();

  @JsProperty
  String getProtocol();

  @JsProperty
  EventHandlerNonNull getOnmessage();

  @JsProperty
  void setOnmessage(EventHandlerNonNull value);

  @JsProperty
  String getBinaryType();

  @JsProperty
  void setBinaryType(String value);
}
