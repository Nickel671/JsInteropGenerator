package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTemplateElement"
)
interface HTMLTemplateElement extends HTMLElement {
  @JsProperty
  DocumentFragment getContent();
}
