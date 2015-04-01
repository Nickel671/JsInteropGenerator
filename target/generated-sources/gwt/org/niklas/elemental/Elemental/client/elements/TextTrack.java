package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "TextTrack"
)
interface TextTrack extends EventTarget {
  @JsProperty
  String getKind();

  @JsProperty
  String getLabel();

  @JsProperty
  String getLanguage();

  @JsProperty
  String getId();

  @JsProperty
  String getInBandMetadataTrackDispatchType();

  @JsProperty
  String getMode();

  @JsProperty
  void setMode(String value);

  @JsProperty
  TextTrackCueList getCues();

  @JsProperty
  TextTrackCueList getActiveCues();

  @JsProperty
  EventHandlerNonNull getOncuechange();

  @JsProperty
  void setOncuechange(EventHandlerNonNull value);

  TextTrackCue addCue(TextTrackCue cue);

  TextTrackCue removeCue(TextTrackCue cue);
}
