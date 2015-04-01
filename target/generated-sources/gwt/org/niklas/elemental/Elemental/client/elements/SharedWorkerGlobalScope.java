package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "SharedWorkerGlobalScope"
)
interface SharedWorkerGlobalScope extends WorkerGlobalScope {
  @JsProperty
  String getName();

  @JsProperty
  ApplicationCache getApplicationCache();

  @JsProperty
  EventHandlerNonNull getOnconnect();

  @JsProperty
  void setOnconnect(EventHandlerNonNull value);
}
