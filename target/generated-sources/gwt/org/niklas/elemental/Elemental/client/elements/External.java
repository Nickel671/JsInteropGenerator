package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "External"
)
interface External {
  String AddSearchProvider(String engineURL);

  String IsSearchProviderInstalled(String engineURL);
}
