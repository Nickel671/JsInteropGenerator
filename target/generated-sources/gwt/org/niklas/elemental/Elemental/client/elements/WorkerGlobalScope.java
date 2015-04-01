package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "WorkerGlobalScope"
)
interface WorkerGlobalScope extends ImageBitmapFactories, EventTarget, WindowTimers, WindowBase64 {
  @JsProperty
  WorkerGlobalScope getSelf();

  @JsProperty
  WorkerLocation getLocation();

  @JsProperty
  OnErrorEventHandlerNonNull getOnerror();

  @JsProperty
  void setOnerror(OnErrorEventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnlanguagechange();

  @JsProperty
  void setOnlanguagechange(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnoffline();

  @JsProperty
  void setOnoffline(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnonline();

  @JsProperty
  void setOnonline(EventHandlerNonNull value);

  @JsProperty
  WorkerNavigator getNavigator();

  void close();

  void importScripts(String urls);
}
