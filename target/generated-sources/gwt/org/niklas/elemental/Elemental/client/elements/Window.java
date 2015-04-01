package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Window"
)
interface Window extends EventTarget, GlobalEventHandlers, WindowEventHandlers, WindowBase64, WindowTimers, ImageBitmapFactories, WindowSessionStorage, WindowLocalStorage {
  @JsProperty
  Document getDocument();

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  Location getLocation();

  @JsProperty
  History getHistory();

  @JsProperty
  BarProp getLocationbar();

  @JsProperty
  BarProp getMenubar();

  @JsProperty
  BarProp getPersonalbar();

  @JsProperty
  BarProp getScrollbars();

  @JsProperty
  BarProp getStatusbar();

  @JsProperty
  BarProp getToolbar();

  @JsProperty
  String getStatus();

  @JsProperty
  void setStatus(String value);

  @JsProperty
  boolean getClosed();

  @JsProperty
  int getLength();

  @JsProperty
  Element getFrameElement();

  @JsProperty
  Navigator getNavigator();

  @JsProperty
  External getExternal();

  @JsProperty
  ApplicationCache getApplicationCache();

  void close();

  void stop();

  void focus();

  void blur();

  void alert();

  void alert(String message);

  boolean confirm(String message);

  String prompt(String message, String default_);

  void print();

  void cancelAnimationFrame(int handle);

  void captureEvents();

  void releaseEvents();
}
