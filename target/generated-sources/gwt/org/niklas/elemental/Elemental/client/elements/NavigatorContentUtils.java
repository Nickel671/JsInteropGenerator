package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NavigatorContentUtils"
)
interface NavigatorContentUtils {
  void registerProtocolHandler(String scheme, String url, String title);

  void registerContentHandler(String mimeType, String url, String title);

  String isProtocolHandlerRegistered(String scheme, String url);

  String isContentHandlerRegistered(String mimeType, String url);

  void unregisterProtocolHandler(String scheme, String url);

  void unregisterContentHandler(String mimeType, String url);
}
