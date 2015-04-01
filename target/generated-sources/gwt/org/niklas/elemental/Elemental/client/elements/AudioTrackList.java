package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "AudioTrackList"
)
interface AudioTrackList extends EventTarget {
  @JsProperty
  int getLength();

  @JsProperty
  EventHandlerNonNull getOnchange();

  @JsProperty
  void setOnchange(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnaddtrack();

  @JsProperty
  void setOnaddtrack(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnremovetrack();

  @JsProperty
  void setOnremovetrack(EventHandlerNonNull value);

  String getTrackById(String id);
}
