package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "WindowEventHandlers"
)
interface WindowEventHandlers {
  @JsProperty
  EventHandlerNonNull getOnafterprint();

  @JsProperty
  void setOnafterprint(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnbeforeprint();

  @JsProperty
  void setOnbeforeprint(EventHandlerNonNull value);

  @JsProperty
  OnBeforeUnloadEventHandlerNonNull getOnbeforeunload();

  @JsProperty
  void setOnbeforeunload(OnBeforeUnloadEventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnhashchange();

  @JsProperty
  void setOnhashchange(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnlanguagechange();

  @JsProperty
  void setOnlanguagechange(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnmessage();

  @JsProperty
  void setOnmessage(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnoffline();

  @JsProperty
  void setOnoffline(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnonline();

  @JsProperty
  void setOnonline(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnpagehide();

  @JsProperty
  void setOnpagehide(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnpageshow();

  @JsProperty
  void setOnpageshow(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnpopstate();

  @JsProperty
  void setOnpopstate(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnstorage();

  @JsProperty
  void setOnstorage(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnunload();

  @JsProperty
  void setOnunload(EventHandlerNonNull value);
}
