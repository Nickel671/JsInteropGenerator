package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "TextTrackCue"
)
interface TextTrackCue extends EventTarget {
  @JsProperty
  TextTrack getTrack();

  @JsProperty
  String getId();

  @JsProperty
  void setId(String value);

  @JsProperty
  double getStartTime();

  @JsProperty
  void setStartTime(double value);

  @JsProperty
  double getEndTime();

  @JsProperty
  void setEndTime(double value);

  @JsProperty
  boolean getPauseOnExit();

  @JsProperty
  void setPauseOnExit(boolean value);

  @JsProperty
  EventHandlerNonNull getOnenter();

  @JsProperty
  void setOnenter(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnexit();

  @JsProperty
  void setOnexit(EventHandlerNonNull value);
}
