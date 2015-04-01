package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLFrameElement"
)
interface HTMLFrameElement extends HTMLElement {
  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getScrolling();

  @JsProperty
  void setScrolling(String value);

  @JsProperty
  String getSrc();

  @JsProperty
  void setSrc(String value);

  @JsProperty
  String getFrameBorder();

  @JsProperty
  void setFrameBorder(String value);

  @JsProperty
  String getLongDesc();

  @JsProperty
  void setLongDesc(String value);

  @JsProperty
  boolean getNoResize();

  @JsProperty
  void setNoResize(boolean value);

  @JsProperty
  Document getContentDocument();

  @JsProperty
  String getMarginHeight();

  @JsProperty
  void setMarginHeight(String value);

  @JsProperty
  String getMarginWidth();

  @JsProperty
  void setMarginWidth(String value);
}
