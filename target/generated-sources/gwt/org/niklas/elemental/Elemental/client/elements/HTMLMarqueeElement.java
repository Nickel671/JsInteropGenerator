package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLMarqueeElement"
)
interface HTMLMarqueeElement extends HTMLElement {
  @JsProperty
  String getBehavior();

  @JsProperty
  void setBehavior(String value);

  @JsProperty
  String getBgColor();

  @JsProperty
  void setBgColor(String value);

  @JsProperty
  String getDirection();

  @JsProperty
  void setDirection(String value);

  @JsProperty
  String getHeight();

  @JsProperty
  void setHeight(String value);

  @JsProperty
  int getHspace();

  @JsProperty
  void setHspace(int value);

  @JsProperty
  int getLoop();

  @JsProperty
  void setLoop(int value);

  @JsProperty
  int getScrollAmount();

  @JsProperty
  void setScrollAmount(int value);

  @JsProperty
  int getScrollDelay();

  @JsProperty
  void setScrollDelay(int value);

  @JsProperty
  boolean getTrueSpeed();

  @JsProperty
  void setTrueSpeed(boolean value);

  @JsProperty
  int getVspace();

  @JsProperty
  void setVspace(int value);

  @JsProperty
  String getWidth();

  @JsProperty
  void setWidth(String value);

  @JsProperty
  EventHandlerNonNull getOnbounce();

  @JsProperty
  void setOnbounce(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnfinish();

  @JsProperty
  void setOnfinish(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnstart();

  @JsProperty
  void setOnstart(EventHandlerNonNull value);

  void start();

  void stop();
}
