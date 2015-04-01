package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "ApplicationCache"
)
interface ApplicationCache extends EventTarget {
  @JsProperty
  short getStatus();

  @JsProperty
  EventHandlerNonNull getOnchecking();

  @JsProperty
  void setOnchecking(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnerror();

  @JsProperty
  void setOnerror(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnnoupdate();

  @JsProperty
  void setOnnoupdate(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOndownloading();

  @JsProperty
  void setOndownloading(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnprogress();

  @JsProperty
  void setOnprogress(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnupdateready();

  @JsProperty
  void setOnupdateready(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOncached();

  @JsProperty
  void setOncached(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnobsolete();

  @JsProperty
  void setOnobsolete(EventHandlerNonNull value);

  void update();

  void abort();

  void swapCache();
}
