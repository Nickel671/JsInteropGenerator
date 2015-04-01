package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NavigatorContentUtils"
)
interface NavigatorContentUtils {
  String registerProtocolHandler(String scheme, String url, String title);

  String registerContentHandler(String mimeType, String url, String title);

  String isProtocolHandlerRegistered(String scheme, String url);

  String isContentHandlerRegistered(String mimeType, String url);

  String unregisterProtocolHandler(String scheme, String url);

  String unregisterContentHandler(String mimeType, String url);
}
