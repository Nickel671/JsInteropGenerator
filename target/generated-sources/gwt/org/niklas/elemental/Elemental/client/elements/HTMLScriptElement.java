package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLScriptElement"
)
interface HTMLScriptElement extends HTMLElement {
  @JsProperty
  String getSrc();

  @JsProperty
  void setSrc(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  String getCharset();

  @JsProperty
  void setCharset(String value);

  @JsProperty
  boolean getAsync();

  @JsProperty
  void setAsync(boolean value);

  @JsProperty
  boolean getDefer();

  @JsProperty
  void setDefer(boolean value);

  @JsProperty
  String getCrossOrigin();

  @JsProperty
  void setCrossOrigin(String value);

  @JsProperty
  String getText();

  @JsProperty
  void setText(String value);

  @JsProperty
  String getEvent();

  @JsProperty
  void setEvent(String value);

  @JsProperty
  String getHtmlFor();

  @JsProperty
  void setHtmlFor(String value);
}
