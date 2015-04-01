package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTrackElement"
)
interface HTMLTrackElement extends HTMLElement {
  @JsProperty
  String getKind();

  @JsProperty
  void setKind(String value);

  @JsProperty
  String getSrc();

  @JsProperty
  void setSrc(String value);

  @JsProperty
  String getSrclang();

  @JsProperty
  void setSrclang(String value);

  @JsProperty
  String getLabel();

  @JsProperty
  void setLabel(String value);

  @JsProperty
  boolean getDefault();

  @JsProperty
  void setDefault(boolean value);

  @JsProperty
  short getReadyState();

  @JsProperty
  TextTrack getTrack();
}
