package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NavigatorPlugins"
)
interface NavigatorPlugins {
  @JsProperty
  PluginArray getPlugins();

  @JsProperty
  MimeTypeArray getMimeTypes();

  @JsProperty
  boolean getJavaEnabled();
}
