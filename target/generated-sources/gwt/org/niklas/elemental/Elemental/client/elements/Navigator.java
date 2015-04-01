package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Navigator"
)
interface Navigator extends NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorContentUtils, NavigatorStorageUtils, NavigatorPlugins {
}
