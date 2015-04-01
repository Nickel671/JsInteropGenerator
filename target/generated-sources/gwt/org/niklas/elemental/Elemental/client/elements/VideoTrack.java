package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "VideoTrack"
)
interface VideoTrack {
  @JsProperty
  String getId();

  @JsProperty
  String getKind();

  @JsProperty
  String getLabel();

  @JsProperty
  String getLanguage();

  @JsProperty
  boolean getSelected();

  @JsProperty
  void setSelected(boolean value);
}
