interface Example {
  // this is an IDL definition
};
typedef (Int8Array or Uint8Array or Uint8ClampedArray or
         Int16Array or Uint16Array or
         Int32Array or Uint32Array or
         Float32Array or Float64Array or
         DataView) ArrayBufferView;
interface HTMLAllCollection : HTMLCollection {
  // inherits length and 'getter'
  Element? item(unsigned long index);
  (HTMLCollection or Element)? item(DOMString name);
  legacycaller getter (HTMLCollection or Element)? namedItem(DOMString name); // shadows inherited namedItem()
};
interface HTMLFormControlsCollection : HTMLCollection {
  // inherits length and item()
  legacycaller getter (RadioNodeList or Element)? namedItem(DOMString name); // shadows inherited namedItem()
};

interface RadioNodeList : NodeList {
  attribute DOMString value;
};
interface HTMLOptionsCollection : HTMLCollection {
  // inherits item()
  attribute unsigned long length; // shadows inherited length
  legacycaller HTMLOptionElement? (DOMString name);
  setter creator void (unsigned long index, HTMLOptionElement? option);
  void add((HTMLOptionElement or HTMLOptGroupElement) element, optional (HTMLElement or long)? before = null);
  void remove(long index);
  attribute long selectedIndex;
};
interface HTMLPropertiesCollection : HTMLCollection {
  // inherits length and item()
  getter PropertyNodeList? namedItem(DOMString name); // shadows inherited namedItem()
  [SameObject] readonly attribute DOMString[] names;
};

typedef sequence<any> PropertyValueArray;

interface PropertyNodeList : NodeList {
  PropertyValueArray getValues();
};
[OverrideBuiltins, Exposed=(Window,Worker)]
interface DOMStringMap {
  getter DOMString (DOMString name);
  setter creator void (DOMString name, DOMString value);
  deleter void (DOMString name);
};
interface DOMElementMap {
  getter Element (DOMString name);
  setter creator void (DOMString name, Element value);
  deleter void (DOMString name);
};
typedef (ArrayBuffer or CanvasProxy or MessagePort) Transferable;
callback FileCallback = void (File file);
enum DocumentReadyState { "loading", "interactive", "complete" };

[OverrideBuiltins]
partial /*sealed*/ interface Document {
  // resource metadata management
  [PutForwards=href, Unforgeable] readonly attribute Location? location;
  attribute DOMString domain;
  readonly attribute DOMString referrer;
  attribute DOMString cookie;
  readonly attribute DOMString lastModified;
  readonly attribute DocumentReadyState readyState;

  // DOM tree accessors
  getter object (DOMString name);
  attribute DOMString title;
  attribute DOMString dir;
  attribute HTMLElement? body;
  readonly attribute HTMLHeadElement? head;
  [SameObject] readonly attribute HTMLCollection images;
  [SameObject] readonly attribute HTMLCollection embeds;
  [SameObject] readonly attribute HTMLCollection plugins;
  [SameObject] readonly attribute HTMLCollection links;
  [SameObject] readonly attribute HTMLCollection forms;
  [SameObject] readonly attribute HTMLCollection scripts;
  NodeList getElementsByName(DOMString elementName);
  NodeList getItems(optional DOMString typeNames = ""); // microdata
  [SameObject] readonly attribute DOMElementMap cssElementMap;
  readonly attribute HTMLScriptElement? currentScript;

  // dynamic markup insertion
  Document open(optional DOMString type = "text/html", optional DOMString replace = "");
  WindowProxy open(DOMString url, DOMString name, DOMString features, optional boolean replace = false);
  void close();
  void write(DOMString... text);
  void writeln(DOMString... text);

  // user interaction
  readonly attribute WindowProxy? defaultView;
  readonly attribute Element? activeElement;
  boolean hasFocus();
  attribute DOMString designMode;
  boolean execCommand(DOMString commandId, optional boolean showUI = false, optional DOMString value = "");
  boolean queryCommandEnabled(DOMString commandId);
  boolean queryCommandIndeterm(DOMString commandId);
  boolean queryCommandState(DOMString commandId);
  boolean queryCommandSupported(DOMString commandId);
  DOMString queryCommandValue(DOMString commandId);
  readonly attribute HTMLCollection commands;

  // special event handler IDL attributes that only apply to Document objects
  [LenientThis] attribute EventHandler onreadystatechange;

  // also has obsolete members
};
Document implements GlobalEventHandlers;
partial interface XMLDocument {
  boolean load(DOMString url);
};
interface HTMLElement : Element {
  // metadata attributes
  attribute DOMString title;
  attribute DOMString lang;
  attribute boolean translate;
  attribute DOMString dir;
  [SameObject] readonly attribute DOMStringMap dataset;

  // microdata
  attribute boolean itemScope;
  [PutForwards=value] readonly attribute DOMSettableTokenList itemType;
  attribute DOMString itemId;
  [PutForwards=value] readonly attribute DOMSettableTokenList itemRef;
  [PutForwards=value] readonly attribute DOMSettableTokenList itemProp;
  readonly attribute HTMLPropertiesCollection properties;
  attribute any itemValue; // acts as DOMString on setting

  // user interaction
  attribute boolean hidden;
  void click();
  attribute long tabIndex;
  void focus();
  void blur();
  attribute DOMString accessKey;
  readonly attribute DOMString accessKeyLabel;
  attribute boolean draggable;
  [PutForwards=value] readonly attribute DOMSettableTokenList dropzone;
  attribute HTMLMenuElement? contextMenu;
  attribute boolean spellcheck;
  void forceSpellCheck();

  // command API
  readonly attribute DOMString? commandType;
  readonly attribute DOMString? commandLabel;
  readonly attribute DOMString? commandIcon;
  readonly attribute boolean? commandHidden;
  readonly attribute boolean? commandDisabled;
  readonly attribute boolean? commandChecked;
};
HTMLElement implements GlobalEventHandlers;
HTMLElement implements ElementContentEditable;

interface HTMLUnknownElement : HTMLElement { };
interface HTMLHtmlElement : HTMLElement {
  // also has obsolete members
};
interface HTMLHeadElement : HTMLElement {};
interface HTMLTitleElement : HTMLElement {
  attribute DOMString text;
};
interface HTMLBaseElement : HTMLElement {
  attribute DOMString href;
  attribute DOMString target;
};
interface HTMLLinkElement : HTMLElement {
  attribute DOMString href;
  attribute DOMString? crossOrigin;
  attribute DOMString rel;
  readonly attribute DOMTokenList relList;
  attribute DOMString media;
  attribute DOMString hreflang;
  attribute DOMString type;
  [PutForwards=value] readonly attribute DOMSettableTokenList sizes;

  // also has obsolete members
};
HTMLLinkElement implements LinkStyle;
interface HTMLMetaElement : HTMLElement {
  attribute DOMString name;
  attribute DOMString httpEquiv;
  attribute DOMString content;

  // also has obsolete members
};
interface HTMLStyleElement : HTMLElement {
  attribute DOMString media;
  attribute DOMString type;
  attribute boolean scoped;
};
HTMLStyleElement implements LinkStyle;
interface HTMLBodyElement : HTMLElement {

  // also has obsolete members
};
HTMLBodyElement implements WindowEventHandlers;
interface HTMLHeadingElement : HTMLElement {
  // also has obsolete members
};
interface HTMLParagraphElement : HTMLElement {
  // also has obsolete members
};
interface HTMLHRElement : HTMLElement {
  // also has obsolete members
};
interface HTMLPreElement : HTMLElement {
  // also has obsolete members
};
interface HTMLQuoteElement : HTMLElement {
  attribute DOMString cite;
};
interface HTMLOListElement : HTMLElement {
  attribute boolean reversed;
  attribute long start;
  attribute DOMString type;

  // also has obsolete members
};
interface HTMLUListElement : HTMLElement {
  // also has obsolete members
};
interface HTMLLIElement : HTMLElement {
  attribute long value;

  // also has obsolete members
};
interface HTMLDListElement : HTMLElement {
  // also has obsolete members
};
interface HTMLDivElement : HTMLElement {
  // also has obsolete members
};
interface HTMLAnchorElement : HTMLElement {
  attribute DOMString target;
  attribute DOMString download;
  [PutForwards=value] attribute DOMSettableTokenList ping;
  attribute DOMString rel;
  readonly attribute DOMTokenList relList;
  attribute DOMString hreflang;
  attribute DOMString type;

  attribute DOMString text;

  // also has obsolete members
};
HTMLAnchorElement implements URLUtils;
interface HTMLDataElement : HTMLElement {
  attribute DOMString value;
};
interface HTMLTimeElement : HTMLElement {
  attribute DOMString dateTime;
};
interface HTMLSpanElement : HTMLElement {};
interface HTMLBRElement : HTMLElement {
  // also has obsolete members
};
interface HTMLModElement : HTMLElement {
  attribute DOMString cite;
  attribute DOMString dateTime;
};
interface HTMLPictureElement : HTMLElement {};
partial interface HTMLSourceElement {
           attribute DOMString srcset;
           attribute DOMString sizes;
           attribute DOMString media;
};
[NamedConstructor=Image(optional unsigned long width, optional unsigned long height)]
interface HTMLImageElement : HTMLElement {
           attribute DOMString alt;
           attribute DOMString src;
           attribute DOMString srcset;
           attribute DOMString sizes;
           attribute DOMString? crossOrigin;
           attribute DOMString useMap;
           attribute boolean isMap;
           attribute unsigned long width;
           attribute unsigned long height;
  readonly attribute unsigned long naturalWidth;
  readonly attribute unsigned long naturalHeight;
  readonly attribute boolean complete;
  readonly attribute DOMString currentSrc;

  // also has obsolete members
};
interface HTMLIFrameElement : HTMLElement {
  attribute DOMString src;
  attribute DOMString srcdoc;
  attribute DOMString name;
  [PutForwards=value] readonly attribute DOMSettableTokenList sandbox;
  attribute boolean seamless;
  attribute boolean allowFullscreen;
  attribute DOMString width;
  attribute DOMString height;
  readonly attribute Document? contentDocument;
  readonly attribute WindowProxy? contentWindow;
  Document? getSVGDocument();

  // also has obsolete members
};
interface HTMLEmbedElement : HTMLElement {
  attribute DOMString src;
  attribute DOMString type;
  attribute DOMString width;
  attribute DOMString height;
  Document? getSVGDocument();
  legacycaller any (any... arguments);

  // also has obsolete members
};
interface HTMLObjectElement : HTMLElement {
  attribute DOMString data;
  attribute DOMString type;
  attribute boolean typeMustMatch;
  attribute DOMString name;
  attribute DOMString useMap;
  readonly attribute HTMLFormElement? form;
  attribute DOMString width;
  attribute DOMString height;
  readonly attribute Document? contentDocument;
  readonly attribute WindowProxy? contentWindow;
  Document? getSVGDocument();

  readonly attribute boolean willValidate;
  readonly attribute ValidityState validity;
  readonly attribute DOMString validationMessage;
  boolean checkValidity();
  boolean reportValidity();
  void setCustomValidity(DOMString error);

  legacycaller any (any... arguments);

  // also has obsolete members
};
interface HTMLParamElement : HTMLElement {
  attribute DOMString name;
  attribute DOMString value;

  // also has obsolete members
};
interface HTMLVideoElement : HTMLMediaElement {
  attribute unsigned long width;
  attribute unsigned long height;
  readonly attribute unsigned long videoWidth;
  readonly attribute unsigned long videoHeight;
  attribute DOMString poster;
};
[NamedConstructor=Audio(optional DOMString src)]
interface HTMLAudioElement : HTMLMediaElement {};
interface HTMLSourceElement : HTMLElement {
  attribute DOMString src;
  attribute DOMString type;

  // also has obsolete members
};
interface HTMLTrackElement : HTMLElement {
  attribute DOMString kind;
  attribute DOMString src;
  attribute DOMString srclang;
  attribute DOMString label;
  attribute boolean default;

  const unsigned short NONE = 0;
  const unsigned short LOADING = 1;
  const unsigned short LOADED = 2;
  const unsigned short ERROR = 3;
  readonly attribute unsigned short readyState;

  readonly attribute TextTrack track;
};
enum CanPlayTypeResult { "" /* empty string */, "maybe", "probably" };
typedef (MediaStream or MediaSource or Blob) MediaProvider;
interface HTMLMediaElement : HTMLElement {

  // error state
  readonly attribute MediaError? error;

  // network state
  attribute DOMString src;
  attribute MediaProvider? srcObject;
  readonly attribute DOMString currentSrc;
  attribute DOMString? crossOrigin;
  const unsigned short NETWORK_EMPTY = 0;
  const unsigned short NETWORK_IDLE = 1;
  const unsigned short NETWORK_LOADING = 2;
  const unsigned short NETWORK_NO_SOURCE = 3;
  readonly attribute unsigned short networkState;
  attribute DOMString preload;
  readonly attribute TimeRanges buffered;
  void load();
  CanPlayTypeResult canPlayType(DOMString type);

  // ready state
  const unsigned short HAVE_NOTHING = 0;
  const unsigned short HAVE_METADATA = 1;
  const unsigned short HAVE_CURRENT_DATA = 2;
  const unsigned short HAVE_FUTURE_DATA = 3;
  const unsigned short HAVE_ENOUGH_DATA = 4;
  readonly attribute unsigned short readyState;
  readonly attribute boolean seeking;

  // playback state
  attribute double currentTime;
  void fastSeek(double time);
  readonly attribute unrestricted double duration;
  Date getStartDate();
  readonly attribute boolean paused;
  attribute double defaultPlaybackRate;
  attribute double playbackRate;
  readonly attribute TimeRanges played;
  readonly attribute TimeRanges seekable;
  readonly attribute boolean ended;
  attribute boolean autoplay;
  attribute boolean loop;
  void play();
  void pause();

  // media controller
  attribute DOMString mediaGroup;
  attribute MediaController? controller;

  // controls
  attribute boolean controls;
  attribute double volume;
  attribute boolean muted;
  attribute boolean defaultMuted;

  // tracks
  [SameObject] readonly attribute AudioTrackList audioTracks;
  [SameObject] readonly attribute VideoTrackList videoTracks;
  [SameObject] readonly attribute TextTrackList textTracks;
  TextTrack addTextTrack(TextTrackKind kind, optional DOMString label = "", optional DOMString language = "");
};
interface MediaError {
  const unsigned short MEDIA_ERR_ABORTED = 1;
  const unsigned short MEDIA_ERR_NETWORK = 2;
  const unsigned short MEDIA_ERR_DECODE = 3;
  const unsigned short MEDIA_ERR_SRC_NOT_SUPPORTED = 4;
  readonly attribute unsigned short code;
};
interface AudioTrackList : EventTarget {
  readonly attribute unsigned long length;
  getter AudioTrack (unsigned long index);
  AudioTrack? getTrackById(DOMString id);

  attribute EventHandler onchange;
  attribute EventHandler onaddtrack;
  attribute EventHandler onremovetrack;
};

interface AudioTrack {
  readonly attribute DOMString id;
  readonly attribute DOMString kind;
  readonly attribute DOMString label;
  readonly attribute DOMString language;
  attribute boolean enabled;
};

interface VideoTrackList : EventTarget {
  readonly attribute unsigned long length;
  getter VideoTrack (unsigned long index);
  VideoTrack? getTrackById(DOMString id);
  readonly attribute long selectedIndex;

  attribute EventHandler onchange;
  attribute EventHandler onaddtrack;
  attribute EventHandler onremovetrack;
};

interface VideoTrack {
  readonly attribute DOMString id;
  readonly attribute DOMString kind;
  readonly attribute DOMString label;
  readonly attribute DOMString language;
  attribute boolean selected;
};
enum MediaControllerPlaybackState { "waiting", "playing", "ended" };
[Constructor]
interface MediaController : EventTarget {
  readonly attribute unsigned short readyState; // uses HTMLMediaElement.readyState's values

  readonly attribute TimeRanges buffered;
  readonly attribute TimeRanges seekable;
  readonly attribute unrestricted double duration;
  attribute double currentTime;

  readonly attribute boolean paused;
  readonly attribute MediaControllerPlaybackState playbackState;
  readonly attribute TimeRanges played;
  void pause();
  void unpause();
  void play(); // calls play() on all media elements as well

  attribute double defaultPlaybackRate;
  attribute double playbackRate;

  attribute double volume;
  attribute boolean muted;

  attribute EventHandler onemptied;
  attribute EventHandler onloadedmetadata;
  attribute EventHandler onloadeddata;
  attribute EventHandler oncanplay;
  attribute EventHandler oncanplaythrough;
  attribute EventHandler onplaying;
  attribute EventHandler onended;
  attribute EventHandler onwaiting;

  attribute EventHandler ondurationchange;
  attribute EventHandler ontimeupdate;
  attribute EventHandler onplay;
  attribute EventHandler onpause;
  attribute EventHandler onratechange;
  attribute EventHandler onvolumechange;
};
interface TextTrackList : EventTarget {
  readonly attribute unsigned long length;
  getter TextTrack (unsigned long index);
  TextTrack? getTrackById(DOMString id);

  attribute EventHandler onchange;
  attribute EventHandler onaddtrack;
  attribute EventHandler onremovetrack;
};
enum TextTrackMode { "disabled",  "hidden",  "showing" };
enum TextTrackKind { "subtitles",  "captions",  "descriptions",  "chapters",  "metadata" };
interface TextTrack : EventTarget {
  readonly attribute TextTrackKind kind;
  readonly attribute DOMString label;
  readonly attribute DOMString language;

  readonly attribute DOMString id;
  readonly attribute DOMString inBandMetadataTrackDispatchType;

  attribute TextTrackMode mode;

  readonly attribute TextTrackCueList? cues;
  readonly attribute TextTrackCueList? activeCues;

  void addCue(TextTrackCue cue);
  void removeCue(TextTrackCue cue);

  attribute EventHandler oncuechange;
};
interface TextTrackCueList {
  readonly attribute unsigned long length;
  getter TextTrackCue (unsigned long index);
  TextTrackCue? getCueById(DOMString id);
};
interface TextTrackCue : EventTarget {
  readonly attribute TextTrack? track;

  attribute DOMString id;
  attribute double startTime;
  attribute double endTime;
  attribute boolean pauseOnExit;

  attribute EventHandler onenter;
  attribute EventHandler onexit;
};
interface TimeRanges {
  readonly attribute unsigned long length;
  double start(unsigned long index);
  double end(unsigned long index);
};
[Constructor(DOMString type, optional TrackEventInit eventInitDict)]
interface TrackEvent : Event {
  readonly attribute (VideoTrack or AudioTrack or TextTrack)? track;
};

dictionary TrackEventInit : EventInit {
  (VideoTrack or AudioTrack or TextTrack)? track;
};
interface HTMLMapElement : HTMLElement {
  attribute DOMString name;
  readonly attribute HTMLCollection areas;
  readonly attribute HTMLCollection images;
};
interface HTMLAreaElement : HTMLElement {
  attribute DOMString alt;
  attribute DOMString coords;
  attribute DOMString shape;
  attribute DOMString target;
  attribute DOMString download;
  [PutForwards=value] attribute DOMSettableTokenList ping;
  attribute DOMString rel;
  readonly attribute DOMTokenList relList;
  attribute DOMString hreflang;
  attribute DOMString type;

  // also has obsolete members
};
HTMLAreaElement implements URLUtils;
interface HTMLTableElement : HTMLElement {
  attribute HTMLTableCaptionElement? caption;
  HTMLElement createCaption();
  void deleteCaption();
  attribute HTMLTableSectionElement? tHead;
  HTMLElement createTHead();
  void deleteTHead();
  attribute HTMLTableSectionElement? tFoot;
  HTMLElement createTFoot();
  void deleteTFoot();
  readonly attribute HTMLCollection tBodies;
  HTMLElement createTBody();
  readonly attribute HTMLCollection rows;
  HTMLElement insertRow(optional long index = -1);
  void deleteRow(long index);
  attribute boolean sortable;
  void stopSorting();

  // also has obsolete members
};
interface HTMLTableCaptionElement : HTMLElement {
  // also has obsolete members
};
interface HTMLTableColElement : HTMLElement {
  attribute unsigned long span;

  // also has obsolete members
};
interface HTMLTableSectionElement : HTMLElement {
  readonly attribute HTMLCollection rows;
  HTMLElement insertRow(optional long index = -1);
  void deleteRow(long index);

  // also has obsolete members
};
interface HTMLTableRowElement : HTMLElement {
  readonly attribute long rowIndex;
  readonly attribute long sectionRowIndex;
  readonly attribute HTMLCollection cells;
  HTMLElement insertCell(optional long index = -1);
  void deleteCell(long index);

  // also has obsolete members
};
interface HTMLTableDataCellElement : HTMLTableCellElement {
  // also has obsolete members
};
interface HTMLTableHeaderCellElement : HTMLTableCellElement {
  attribute DOMString scope;
  attribute DOMString abbr;
  attribute DOMString sorted;
  void sort();
};
interface HTMLTableCellElement : HTMLElement {
  attribute unsigned long colSpan;
  attribute unsigned long rowSpan;
  [PutForwards=value] readonly attribute DOMSettableTokenList headers;
  readonly attribute long cellIndex;

  // also has obsolete members
};
[OverrideBuiltins]
interface HTMLFormElement : HTMLElement {
  attribute DOMString acceptCharset;
  attribute DOMString action;
  attribute DOMString autocomplete;
  attribute DOMString enctype;
  attribute DOMString encoding;
  attribute DOMString method;
  attribute DOMString name;
  attribute boolean noValidate;
  attribute DOMString target;

  readonly attribute HTMLFormControlsCollection elements;
  readonly attribute long length;
  getter Element (unsigned long index);
  getter (RadioNodeList or Element) (DOMString name);

  void submit();
  void reset();
  boolean checkValidity();
  boolean reportValidity();

  void requestAutocomplete();
};
interface HTMLLabelElement : HTMLElement {
  readonly attribute HTMLFormElement? form;
  attribute DOMString htmlFor;
  readonly attribute HTMLElement? control;
};
interface HTMLInputElement : HTMLElement {
  attribute DOMString accept;
  attribute DOMString alt;
  attribute DOMString autocomplete;
  attribute boolean autofocus;
  attribute boolean defaultChecked;
  attribute boolean checked;
  attribute DOMString dirName;
  attribute boolean disabled;
  readonly attribute HTMLFormElement? form;
  readonly attribute FileList? files;
  attribute DOMString formAction;
  attribute DOMString formEnctype;
  attribute DOMString formMethod;
  attribute boolean formNoValidate;
  attribute DOMString formTarget;
  attribute unsigned long height;
  attribute boolean indeterminate;
  attribute DOMString inputMode;
  readonly attribute HTMLElement? list;
  attribute DOMString max;
  attribute long maxLength;
  attribute DOMString min;
  attribute long minLength;
  attribute boolean multiple;
  attribute DOMString name;
  attribute DOMString pattern;
  attribute DOMString placeholder;
  attribute boolean readOnly;
  attribute boolean required;
  attribute unsigned long size;
  attribute DOMString src;
  attribute DOMString step;
  attribute DOMString type;
  attribute DOMString defaultValue;
  [TreatNullAs=EmptyString] attribute DOMString value;
  attribute Date? valueAsDate;
  attribute unrestricted double valueAsNumber;
  attribute double valueLow;
  attribute double valueHigh;
  attribute unsigned long width;

  void stepUp(optional long n = 1);
  void stepDown(optional long n = 1);

  readonly attribute boolean willValidate;
  readonly attribute ValidityState validity;
  readonly attribute DOMString validationMessage;
  boolean checkValidity();
  boolean reportValidity();
  void setCustomValidity(DOMString error);

  readonly attribute NodeList labels;

  void select();
  attribute unsigned long selectionStart;
  attribute unsigned long selectionEnd;
  attribute DOMString selectionDirection;
  void setRangeText(DOMString replacement);
  void setRangeText(DOMString replacement, unsigned long start, unsigned long end, optional SelectionMode selectionMode = "preserve");
  void setSelectionRange(unsigned long start, unsigned long end, optional DOMString direction);

  // also has obsolete members
};
interface HTMLButtonElement : HTMLElement {
  attribute boolean autofocus;
  attribute boolean disabled;
  readonly attribute HTMLFormElement? form;
  attribute DOMString formAction;
  attribute DOMString formEnctype;
  attribute DOMString formMethod;
  attribute boolean formNoValidate;
  attribute DOMString formTarget;
  attribute DOMString name;
  attribute DOMString type;
  attribute DOMString value;
  attribute HTMLMenuElement? menu;

  readonly attribute boolean willValidate;
  readonly attribute ValidityState validity;
  readonly attribute DOMString validationMessage;
  boolean checkValidity();
  boolean reportValidity();
  void setCustomValidity(DOMString error);

  readonly attribute NodeList labels;
};
interface HTMLSelectElement : HTMLElement {
  attribute DOMString autocomplete;
  attribute boolean autofocus;
  attribute boolean disabled;
  readonly attribute HTMLFormElement? form;
  attribute boolean multiple;
  attribute DOMString name;
  attribute boolean required;
  attribute unsigned long size;

  readonly attribute DOMString type;

  readonly attribute HTMLOptionsCollection options;
  attribute unsigned long length;
  getter Element? item(unsigned long index);
  HTMLOptionElement? namedItem(DOMString name);
  void add((HTMLOptionElement or HTMLOptGroupElement) element, optional (HTMLElement or long)? before = null);
  void remove(); // ChildNode overload
  void remove(long index);
  setter creator void (unsigned long index, HTMLOptionElement? option);

  readonly attribute HTMLCollection selectedOptions;
  attribute long selectedIndex;
  attribute DOMString value;

  readonly attribute boolean willValidate;
  readonly attribute ValidityState validity;
  readonly attribute DOMString validationMessage;
  boolean checkValidity();
  boolean reportValidity();
  void setCustomValidity(DOMString error);

  readonly attribute NodeList labels;
};
interface HTMLDataListElement : HTMLElement {
  readonly attribute HTMLCollection options;
};
interface HTMLOptGroupElement : HTMLElement {
  attribute boolean disabled;
  attribute DOMString label;
};
[NamedConstructor=Option(optional DOMString text = "", optional DOMString value, optional boolean defaultSelected = false, optional boolean selected = false)]
interface HTMLOptionElement : HTMLElement {
  attribute boolean disabled;
  readonly attribute HTMLFormElement? form;
  attribute DOMString label;
  attribute boolean defaultSelected;
  attribute boolean selected;
  attribute DOMString value;

  attribute DOMString text;
  readonly attribute long index;
};
interface HTMLTextAreaElement : HTMLElement {
  attribute DOMString autocomplete;
  attribute boolean autofocus;
  attribute unsigned long cols;
  attribute DOMString dirName;
  attribute boolean disabled;
  readonly attribute HTMLFormElement? form;
  attribute DOMString inputMode;
  attribute long maxLength;
  attribute long minLength;
  attribute DOMString name;
  attribute DOMString placeholder;
  attribute boolean readOnly;
  attribute boolean required;
  attribute unsigned long rows;
  attribute DOMString wrap;

  readonly attribute DOMString type;
  attribute DOMString defaultValue;
  [TreatNullAs=EmptyString] attribute DOMString value;
  readonly attribute unsigned long textLength;

  readonly attribute boolean willValidate;
  readonly attribute ValidityState validity;
  readonly attribute DOMString validationMessage;
  boolean checkValidity();
  boolean reportValidity();
  void setCustomValidity(DOMString error);

  readonly attribute NodeList labels;

  void select();
  attribute unsigned long selectionStart;
  attribute unsigned long selectionEnd;
  attribute DOMString selectionDirection;
  void setRangeText(DOMString replacement);
  void setRangeText(DOMString replacement, unsigned long start, unsigned long end, optional SelectionMode selectionMode = "preserve");
  void setSelectionRange(unsigned long start, unsigned long end, optional DOMString direction);
};
interface HTMLKeygenElement : HTMLElement {
  attribute boolean autofocus;
  attribute DOMString challenge;
  attribute boolean disabled;
  readonly attribute HTMLFormElement? form;
  attribute DOMString keytype;
  attribute DOMString name;

  readonly attribute DOMString type;

  readonly attribute boolean willValidate;
  readonly attribute ValidityState validity;
  readonly attribute DOMString validationMessage;
  boolean checkValidity();
  boolean reportValidity();
  void setCustomValidity(DOMString error);

  readonly attribute NodeList labels;
};
interface HTMLOutputElement : HTMLElement {
  [PutForwards=value] readonly attribute DOMSettableTokenList htmlFor;
  readonly attribute HTMLFormElement? form;
  attribute DOMString name;

  readonly attribute DOMString type;
  attribute DOMString defaultValue;
  attribute DOMString value;

  readonly attribute boolean willValidate;
  readonly attribute ValidityState validity;
  readonly attribute DOMString validationMessage;
  boolean checkValidity();
  boolean reportValidity();
  void setCustomValidity(DOMString error);

  readonly attribute NodeList labels;
};
interface HTMLProgressElement : HTMLElement {
  attribute double value;
  attribute double max;
  readonly attribute double position;
  readonly attribute NodeList labels;
};
interface HTMLMeterElement : HTMLElement {
  attribute double value;
  attribute double min;
  attribute double max;
  attribute double low;
  attribute double high;
  attribute double optimum;
  readonly attribute NodeList labels;
};
interface HTMLFieldSetElement : HTMLElement {
  attribute boolean disabled;
  readonly attribute HTMLFormElement? form;
  attribute DOMString name;

  readonly attribute DOMString type;

  readonly attribute HTMLFormControlsCollection elements;

  readonly attribute boolean willValidate;
  [SameObject] readonly attribute ValidityState validity;
  readonly attribute DOMString validationMessage;
  boolean checkValidity();
  boolean reportValidity();
  void setCustomValidity(DOMString error);
};
interface HTMLLegendElement : HTMLElement {
  readonly attribute HTMLFormElement? form;

  // also has obsolete members
};
enum AutocompleteErrorReason { "" /* empty string */, "cancel", "disabled", "invalid" };

[Constructor(DOMString type, optional AutocompleteErrorEventInit eventInitDict)]
interface AutocompleteErrorEvent : Event {
  readonly attribute AutocompleteErrorReason reason;
};

dictionary AutocompleteErrorEventInit : EventInit {
  AutocompleteErrorReason reason;
};

enum SelectionMode {
  "select",
  "start",
  "end",
  "preserve", // default
};
interface ValidityState {
  readonly attribute boolean valueMissing;
  readonly attribute boolean typeMismatch;
  readonly attribute boolean patternMismatch;
  readonly attribute boolean tooLong;
  readonly attribute boolean tooShort;
  readonly attribute boolean rangeUnderflow;
  readonly attribute boolean rangeOverflow;
  readonly attribute boolean stepMismatch;
  readonly attribute boolean badInput;
  readonly attribute boolean customError;
  readonly attribute boolean valid;
};
interface HTMLDetailsElement : HTMLElement {
  attribute boolean open;
};
interface HTMLMenuElement : HTMLElement {
  attribute DOMString type;
  attribute DOMString label;

  // also has obsolete members
};
interface HTMLMenuItemElement : HTMLElement {
  attribute DOMString type;
  attribute DOMString label;
  attribute DOMString icon;
  attribute boolean disabled;
  attribute boolean checked;
  attribute DOMString radiogroup;
  attribute boolean default;
  readonly attribute HTMLElement? command;
};
[Constructor(DOMString type, optional RelatedEventInit eventInitDict)]
interface RelatedEvent : Event {
  readonly attribute EventTarget? relatedTarget;
};

dictionary RelatedEventInit : EventInit {
  EventTarget? relatedTarget;
};
interface HTMLDialogElement : HTMLElement {
  attribute boolean open;
  attribute DOMString returnValue;
  void show(optional (MouseEvent or Element) anchor);
  void showModal(optional (MouseEvent or Element) anchor);
  void close(optional DOMString returnValue);
};
interface HTMLScriptElement : HTMLElement {
  attribute DOMString src;
  attribute DOMString type;
  attribute DOMString charset;
  attribute boolean async;
  attribute boolean defer;
  attribute DOMString? crossOrigin;
  attribute DOMString text;

  // also has obsolete members
};
interface HTMLTemplateElement : HTMLElement {
  readonly attribute DocumentFragment content;
};
typedef (CanvasRenderingContext2D or WebGLRenderingContext) RenderingContext;

interface HTMLCanvasElement : HTMLElement {
  attribute unsigned long width;
  attribute unsigned long height;

  RenderingContext? getContext(DOMString contextId, any... arguments);
  boolean probablySupportsContext(DOMString contextId, any... arguments);

  void setContext(RenderingContext context);
  CanvasProxy transferControlToProxy();

  DOMString toDataURL(optional DOMString type, any... arguments);
  void toBlob(FileCallback? _callback, optional DOMString type, any... arguments);
};
[Exposed=(Window,Worker)]
interface CanvasProxy {
  void setContext(RenderingContext context);
};
// CanvasProxy implements Transferable;
typedef (HTMLImageElement or
         HTMLVideoElement or
         HTMLCanvasElement or
         CanvasRenderingContext2D or
         ImageBitmap) CanvasImageSource;

enum CanvasFillRule { "nonzero", "evenodd" };

dictionary CanvasRenderingContext2DSettings {
  boolean alpha = true;
}

[Constructor(),
 Constructor(unsigned long width, unsigned long height),
 Exposed=(Window,Worker)]
interface CanvasRenderingContext2D {

  // back-reference to the canvas
  readonly attribute HTMLCanvasElement canvas;

  // canvas dimensions
  attribute unsigned long width;
  attribute unsigned long height;

  // for contexts that aren't directly fixed to a specific canvas
  void commit(); // push the image to the output bitmap

  // state
  void save(); // push state on state stack
  void restore(); // pop state stack and restore state

  // transformations (default transform is the identity matrix)
  attribute SVGMatrix currentTransform;
  void scale(unrestricted double x, unrestricted double y);
  void rotate(unrestricted double angle);
  void translate(unrestricted double x, unrestricted double y);
  void transform(unrestricted double a, unrestricted double b, unrestricted double c, unrestricted double d, unrestricted double e, unrestricted double f);
  void setTransform(unrestricted double a, unrestricted double b, unrestricted double c, unrestricted double d, unrestricted double e, unrestricted double f);
  void resetTransform();

  // compositing
  attribute unrestricted double globalAlpha; // (default 1.0)
  attribute DOMString globalCompositeOperation; // (default source-over)

  // image smoothing
  attribute boolean imageSmoothingEnabled; // (default true)

  // colours and styles (see also the CanvasDrawingStyles interface)
  attribute (DOMString or CanvasGradient or CanvasPattern) strokeStyle; // (default black)
  attribute (DOMString or CanvasGradient or CanvasPattern) fillStyle; // (default black)
  CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);
  CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1);
  CanvasPattern createPattern(CanvasImageSource image, [TreatNullAs=EmptyString] DOMString repetition);

  // shadows
  attribute unrestricted double shadowOffsetX; // (default 0)
  attribute unrestricted double shadowOffsetY; // (default 0)
  attribute unrestricted double shadowBlur; // (default 0)
  attribute DOMString shadowColor; // (default transparent black)

  // rects
  void clearRect(unrestricted double x, unrestricted double y, unrestricted double w, unrestricted double h);
  void fillRect(unrestricted double x, unrestricted double y, unrestricted double w, unrestricted double h);
  void strokeRect(unrestricted double x, unrestricted double y, unrestricted double w, unrestricted double h);

  // path API (see also CanvasPathMethods)
  void beginPath();
  void fill(optional CanvasFillRule fillRule = "nonzero");
  void fill(Path2D path, optional CanvasFillRule fillRule = "nonzero");
  void stroke();
  void stroke(Path2D path);
  void drawFocusIfNeeded(Element element);
  void drawFocusIfNeeded(Path2D path, Element element);
  void scrollPathIntoView();
  void scrollPathIntoView(Path2D path);
  void clip(optional CanvasFillRule fillRule = "nonzero");
  void clip(Path2D path, optional CanvasFillRule fillRule = "nonzero");
  void resetClip();
  boolean isPointInPath(unrestricted double x, unrestricted double y, optional CanvasFillRule fillRule = "nonzero");
  boolean isPointInPath(Path2D path, unrestricted double x, unrestricted double y, optional CanvasFillRule fillRule = "nonzero");
  boolean isPointInStroke(unrestricted double x, unrestricted double y);
  boolean isPointInStroke(Path2D path, unrestricted double x, unrestricted double y);

  // text (see also the CanvasDrawingStyles interface)
  void fillText(DOMString text, unrestricted double x, unrestricted double y, optional unrestricted double maxWidth);
  void strokeText(DOMString text, unrestricted double x, unrestricted double y, optional unrestricted double maxWidth);
  TextMetrics measureText(DOMString text);

  // drawing images
  void drawImage(CanvasImageSource image, unrestricted double dx, unrestricted double dy);
  void drawImage(CanvasImageSource image, unrestricted double dx, unrestricted double dy, unrestricted double dw, unrestricted double dh);
  void drawImage(CanvasImageSource image, unrestricted double sx, unrestricted double sy, unrestricted double sw, unrestricted double sh, unrestricted double dx, unrestricted double dy, unrestricted double dw, unrestricted double dh);

  // hit regions
  void addHitRegion(optional HitRegionOptions options);
  void removeHitRegion(DOMString id);
  void clearHitRegions();

  // pixel manipulation
  ImageData createImageData(double sw, double sh);
  ImageData createImageData(ImageData imagedata);
  ImageData getImageData(double sx, double sy, double sw, double sh);
  void putImageData(ImageData imagedata, double dx, double dy);
  void putImageData(ImageData imagedata, double dx, double dy, double dirtyX, double dirtyY, double dirtyWidth, double dirtyHeight);
};
CanvasRenderingContext2D implements CanvasDrawingStyles;
CanvasRenderingContext2D implements CanvasPathMethods;

[NoInterfaceObject, Exposed=(Window,Worker)]
interface CanvasDrawingStyles {
  // line caps/joins
  attribute unrestricted double lineWidth; // (default 1)
  attribute DOMString lineCap; // "butt", "round", "square" (default "butt")
  attribute DOMString lineJoin; // "round", "bevel", "miter" (default "miter")
  attribute unrestricted double miterLimit; // (default 10)

  // dashed lines
  void setLineDash(sequence<unrestricted double> segments); // default empty
  sequence<unrestricted double> getLineDash();
  attribute unrestricted double lineDashOffset;

  // text
  attribute DOMString font; // (default 10px sans-serif)
  attribute DOMString textAlign; // "start", "end", "left", "right", "center" (default: "start")
  attribute DOMString textBaseline; // "top", "hanging", "middle", "alphabetic", "ideographic", "bottom" (default: "alphabetic")
  attribute DOMString direction; // "ltr", "rtl", "inherit" (default: "inherit")
};

[NoInterfaceObject, Exposed=(Window,Worker)]
interface CanvasPathMethods {
  // shared path API methods
  void closePath();
  void moveTo(unrestricted double x, unrestricted double y);
  void lineTo(unrestricted double x, unrestricted double y);
  void quadraticCurveTo(unrestricted double cpx, unrestricted double cpy, unrestricted double x, unrestricted double y);
  void bezierCurveTo(unrestricted double cp1x, unrestricted double cp1y, unrestricted double cp2x, unrestricted double cp2y, unrestricted double x, unrestricted double y);
  void arcTo(unrestricted double x1, unrestricted double y1, unrestricted double x2, unrestricted double y2, unrestricted double radius); 
  void arcTo(unrestricted double x1, unrestricted double y1, unrestricted double x2, unrestricted double y2, unrestricted double radiusX, unrestricted double radiusY, unrestricted double rotation); 
  void rect(unrestricted double x, unrestricted double y, unrestricted double w, unrestricted double h);
  void arc(unrestricted double x, unrestricted double y, unrestricted double radius, unrestricted double startAngle, unrestricted double endAngle, optional boolean anticlockwise = false); 
  void ellipse(unrestricted double x, unrestricted double y, unrestricted double radiusX, unrestricted double radiusY, unrestricted double rotation, unrestricted double startAngle, unrestricted double endAngle, optional boolean anticlockwise = false); 
};

[Exposed=(Window,Worker)]
interface CanvasGradient {
  // opaque object
  void addColorStop(double offset, DOMString color);
};

[Exposed=(Window,Worker)]
interface CanvasPattern {
  // opaque object
  void setTransform(SVGMatrix transform);
};

[Exposed=(Window,Worker)]
interface TextMetrics {
  // x-direction
  readonly attribute double width; // advance width
  readonly attribute double actualBoundingBoxLeft;
  readonly attribute double actualBoundingBoxRight;

  // y-direction
  readonly attribute double fontBoundingBoxAscent;
  readonly attribute double fontBoundingBoxDescent;
  readonly attribute double actualBoundingBoxAscent;
  readonly attribute double actualBoundingBoxDescent;
  readonly attribute double emHeightAscent;
  readonly attribute double emHeightDescent;
  readonly attribute double hangingBaseline;
  readonly attribute double alphabeticBaseline;
  readonly attribute double ideographicBaseline;
};

dictionary HitRegionOptions {
  Path2D? path = null;
  CanvasFillRule fillRule = "nonzero";
  DOMString id = ""; 
  DOMString? parentID = null;
  DOMString cursor = "inherit";
  // for control-backed regions:
  Element? control = null;
  // for unbacked regions:
  DOMString? label = null;
  DOMString? role = null;
};

[Constructor(unsigned long sw, unsigned long sh),
 Constructor(Uint8ClampedArray data, unsigned long sw, optional unsigned long sh),
 Exposed=(Window,Worker)]
interface ImageData {
  readonly attribute unsigned long width;
  readonly attribute unsigned long height;
  readonly attribute Uint8ClampedArray data;
};

[Constructor(optional Element scope), Exposed=(Window,Worker)]
interface DrawingStyle { };
DrawingStyle implements CanvasDrawingStyles;

[Constructor,
 Constructor(Path2D path),
 Constructor(Path2D[] paths, optional CanvasFillRule fillRule = "nonzero"),
 Constructor(DOMString d), Exposed=(Window,Worker)]
interface Path2D {
  void addPath(Path2D path, optional SVGMatrix? transformation = null);
  void addPathByStrokingPath(Path2D path, CanvasDrawingStyles styles, optional SVGMatrix? transformation = null);
  void addText(DOMString text, CanvasDrawingStyles styles, SVGMatrix? transformation, unrestricted double x, unrestricted double y, optional unrestricted double maxWidth);
  void addPathByStrokingText(DOMString text, CanvasDrawingStyles styles, SVGMatrix? transformation, unrestricted double x, unrestricted double y, optional unrestricted double maxWidth);
  void addText(DOMString text, CanvasDrawingStyles styles, SVGMatrix? transformation, Path2D path, optional unrestricted double maxWidth);
  void addPathByStrokingText(DOMString text, CanvasDrawingStyles styles, SVGMatrix? transformation, Path2D path, optional unrestricted double maxWidth);
};
Path2D implements CanvasPathMethods;
partial interface MouseEvent {
  readonly attribute DOMString? region;
};

partial dictionary MouseEventInit {
  DOMString? region;
};
partial interface Touch {
  readonly attribute DOMString? region;
};
[NoInterfaceObject]
interface ElementContentEditable {
  attribute DOMString contentEditable;
  readonly attribute boolean isContentEditable;
};
interface DataTransfer {
  attribute DOMString dropEffect;
  attribute DOMString effectAllowed;

  [SameObject] readonly attribute DataTransferItemList items;

  void setDragImage(Element image, long x, long y);

  /* old interface */
  [SameObject] readonly attribute DOMString[] types;
  DOMString getData(DOMString format);
  void setData(DOMString format, DOMString data);
  void clearData(optional DOMString format);
  [SameObject] readonly attribute FileList files;
};
interface DataTransferItemList {
  readonly attribute unsigned long length;
  getter DataTransferItem (unsigned long index);
  DataTransferItem? add(DOMString data, DOMString type);
  DataTransferItem? add(File data);
  void remove(unsigned long index);
  void clear();
};
interface DataTransferItem {
  readonly attribute DOMString kind;
  readonly attribute DOMString type;
  void getAsString(FunctionStringCallback? _callback);
  File? getAsFile();
};

callback FunctionStringCallback = void (DOMString data);
[Constructor(DOMString type, optional DragEventInit eventInitDict)]
interface DragEvent : MouseEvent {
  readonly attribute DataTransfer? dataTransfer;
};

dictionary DragEventInit : MouseEventInit {
  DataTransfer? dataTransfer;
};
[PrimaryGlobal] 
/*sealed*/ interface Window : EventTarget {
  // the current browsing context
  [Unforgeable] readonly attribute WindowProxy window;
  [Replaceable] readonly attribute WindowProxy self;
  [Unforgeable] readonly attribute Document document;
  attribute DOMString name; 
  [PutForwards=href, Unforgeable] readonly attribute Location location;
  readonly attribute History history;
  [Replaceable] readonly attribute BarProp locationbar;
  [Replaceable] readonly attribute BarProp menubar;
  [Replaceable] readonly attribute BarProp personalbar;
  [Replaceable] readonly attribute BarProp scrollbars;
  [Replaceable] readonly attribute BarProp statusbar;
  [Replaceable] readonly attribute BarProp toolbar;
  attribute DOMString status;
  void close();
  readonly attribute boolean closed;
  void stop();
  void focus();
  void blur();

  // other browsing contexts
  [Replaceable] readonly attribute WindowProxy frames;
  [Replaceable] readonly attribute unsigned long length;
  [Unforgeable] readonly attribute WindowProxy top;
  attribute any opener;
  [Replaceable] readonly attribute WindowProxy parent;
  readonly attribute Element? frameElement;
  WindowProxy open(optional DOMString url = "about:blank", optional DOMString target = "_blank", [TreatNullAs=EmptyString] optional DOMString features = "", optional boolean replace = false);
  getter WindowProxy (unsigned long index);
  getter object (DOMString name);

  // the user agent
  readonly attribute Navigator navigator; 
  [Replaceable, SameObject] readonly attribute External external;
  readonly attribute ApplicationCache applicationCache;

  // user prompts
  void alert();
  void alert(DOMString message);
  boolean confirm(optional DOMString message = "");
  DOMString? prompt(optional DOMString message = "", optional DOMString default = "");
  void print();
  any showModalDialog(DOMString url, optional any argument); // deprecated

  long requestAnimationFrame(FrameRequestCallback callback);
  void cancelAnimationFrame(long handle);

  void postMessage(any message, DOMString targetOrigin, optional sequence<Transferable> transfer);

  // also has obsolete members
};
Window implements GlobalEventHandlers;
Window implements WindowEventHandlers;
interface BarProp {
  attribute boolean visible;
};
interface History {
  readonly attribute long length;
  readonly attribute any state;
  void go(optional long delta);
  void back();
  void forward();
  void pushState(any data, DOMString title, optional DOMString? url = null);
  void replaceState(any data, DOMString title, optional DOMString? url = null);
};
[Unforgeable] interface Location {
  void assign(DOMString url);
  void replace(DOMString url);
  void reload();

  [SameObject] readonly attribute DOMString[] ancestorOrigins;
};
Location implements URLUtils;
[Constructor(DOMString type, optional PopStateEventInit eventInitDict), Exposed=(Window,Worker)]
interface PopStateEvent : Event {
  readonly attribute any state;
};

dictionary PopStateEventInit : EventInit {
  any state;
};
[Constructor(DOMString type, optional HashChangeEventInit eventInitDict), Exposed=(Window,Worker)]
interface HashChangeEvent : Event {
  readonly attribute DOMString oldURL;
  readonly attribute DOMString newURL;
};

dictionary HashChangeEventInit : EventInit {
  DOMString oldURL;
  DOMString newURL;
};
[Constructor(DOMString type, optional PageTransitionEventInit eventInitDict), Exposed=(Window,Worker)]
interface PageTransitionEvent : Event {
  readonly attribute boolean persisted;
};

dictionary PageTransitionEventInit : EventInit {
  boolean persisted;
};
interface BeforeUnloadEvent : Event {
  attribute DOMString returnValue;
};
[Exposed=(Window,SharedWorker)]
interface ApplicationCache : EventTarget {

  // update status
  const unsigned short UNCACHED = 0;
  const unsigned short IDLE = 1;
  const unsigned short CHECKING = 2;
  const unsigned short DOWNLOADING = 3;
  const unsigned short UPDATEREADY = 4;
  const unsigned short OBSOLETE = 5;
  readonly attribute unsigned short status;

  // updates
  void update();
  void abort();
  void swapCache();

  // events
  attribute EventHandler onchecking;
  attribute EventHandler onerror;
  attribute EventHandler onnoupdate;
  attribute EventHandler ondownloading;
  attribute EventHandler onprogress;
  attribute EventHandler onupdateready;
  attribute EventHandler oncached;
  attribute EventHandler onobsolete;
};
[NoInterfaceObject, Exposed=(Window,Worker)]
interface NavigatorOnLine {
  readonly attribute boolean onLine;
};
[Constructor(DOMString type, optional ErrorEventInit eventInitDict), Exposed=(Window,Worker)]
interface ErrorEvent : Event {
  readonly attribute DOMString message;
  readonly attribute DOMString filename;
  readonly attribute unsigned long lineno;
  readonly attribute unsigned long colno;
  readonly attribute any error;
};

dictionary ErrorEventInit : EventInit {
  DOMString message;
  DOMString filename;
  unsigned long lineno;
  unsigned long colno;
  any error;
};
[TreatNonObjectAsNull]
callback EventHandlerNonNull = any (Event event);
typedef EventHandlerNonNull? EventHandler;
[TreatNonObjectAsNull]
callback OnErrorEventHandlerNonNull = any ((Event or DOMString) event, optional DOMString source, optional unsigned long lineno, optional unsigned long column, optional any error);
typedef OnErrorEventHandlerNonNull? OnErrorEventHandler;
[TreatNonObjectAsNull]
callback OnBeforeUnloadEventHandlerNonNull = DOMString? (Event event);
typedef OnBeforeUnloadEventHandlerNonNull? OnBeforeUnloadEventHandler;
[NoInterfaceObject]
interface GlobalEventHandlers {
  attribute EventHandler onabort;
  attribute EventHandler onautocomplete;
  attribute EventHandler onautocompleteerror;
  attribute EventHandler onblur;
  attribute EventHandler oncancel;
  attribute EventHandler oncanplay;
  attribute EventHandler oncanplaythrough;
  attribute EventHandler onchange;
  attribute EventHandler onclick;
  attribute EventHandler onclose;
  attribute EventHandler oncontextmenu;
  attribute EventHandler oncuechange;
  attribute EventHandler ondblclick;
  attribute EventHandler ondrag;
  attribute EventHandler ondragend;
  attribute EventHandler ondragenter;
  attribute EventHandler ondragexit;
  attribute EventHandler ondragleave;
  attribute EventHandler ondragover;
  attribute EventHandler ondragstart;
  attribute EventHandler ondrop;
  attribute EventHandler ondurationchange;
  attribute EventHandler onemptied;
  attribute EventHandler onended;
  attribute OnErrorEventHandler onerror;
  attribute EventHandler onfocus;
  attribute EventHandler oninput;
  attribute EventHandler oninvalid;
  attribute EventHandler onkeydown;
  attribute EventHandler onkeypress;
  attribute EventHandler onkeyup;
  attribute EventHandler onload;
  attribute EventHandler onloadeddata;
  attribute EventHandler onloadedmetadata;
  attribute EventHandler onloadstart;
  attribute EventHandler onmousedown;
  [LenientThis] attribute EventHandler onmouseenter;
  [LenientThis] attribute EventHandler onmouseleave;
  attribute EventHandler onmousemove;
  attribute EventHandler onmouseout;
  attribute EventHandler onmouseover;
  attribute EventHandler onmouseup;
  attribute EventHandler onmousewheel;
  attribute EventHandler onpause;
  attribute EventHandler onplay;
  attribute EventHandler onplaying;
  attribute EventHandler onprogress;
  attribute EventHandler onratechange;
  attribute EventHandler onreset;
  attribute EventHandler onresize;
  attribute EventHandler onscroll;
  attribute EventHandler onseeked;
  attribute EventHandler onseeking;
  attribute EventHandler onselect;
  attribute EventHandler onshow;
  attribute EventHandler onsort;
  attribute EventHandler onstalled;
  attribute EventHandler onsubmit;
  attribute EventHandler onsuspend;
  attribute EventHandler ontimeupdate;
  attribute EventHandler ontoggle;
  attribute EventHandler onvolumechange;
  attribute EventHandler onwaiting;
};

[NoInterfaceObject]
interface WindowEventHandlers {
  attribute EventHandler onafterprint;
  attribute EventHandler onbeforeprint;
  attribute OnBeforeUnloadEventHandler onbeforeunload;
  attribute EventHandler onhashchange;
  attribute EventHandler onlanguagechange;
  attribute EventHandler onmessage;
  attribute EventHandler onoffline;
  attribute EventHandler ononline;
  attribute EventHandler onpagehide;
  attribute EventHandler onpageshow;
  attribute EventHandler onpopstate;
  attribute EventHandler onstorage;
  attribute EventHandler onunload;
};
[NoInterfaceObject, Exposed=(Window,Worker)]
interface WindowBase64 {
  DOMString btoa(DOMString btoa);
  DOMString atob(DOMString atob);
};
Window implements WindowBase64;
[NoInterfaceObject, Exposed=(Window,Worker)]
interface WindowTimers {
  long setTimeout(Function handler, optional long timeout = 0, any... arguments);
  long setTimeout(DOMString handler, optional long timeout = 0, any... arguments);
  void clearTimeout(optional long handle = 0);
  long setInterval(Function handler, optional long timeout = 0, any... arguments);
  long setInterval(DOMString handler, optional long timeout = 0, any... arguments);
  void clearInterval(optional long handle = 0);
};
Window implements WindowTimers;
[NoInterfaceObject]
interface WindowModal {
  readonly attribute any dialogArguments;
  attribute any returnValue;
};
interface Navigator {
  // objects implementing this interface also implement the interfaces given below
};
Navigator implements NavigatorID;
Navigator implements NavigatorLanguage;
Navigator implements NavigatorOnLine;
Navigator implements NavigatorContentUtils;
Navigator implements NavigatorStorageUtils;
Navigator implements NavigatorPlugins;
[NoInterfaceObject, Exposed=(Window,Worker)]
interface NavigatorID {
  readonly attribute DOMString appCodeName; // constant "Mozilla"
  readonly attribute DOMString appName;
  readonly attribute DOMString appVersion;
  readonly attribute DOMString platform;
  readonly attribute DOMString product; // constant "Gecko"
  boolean taintEnabled(); // constant false
  readonly attribute DOMString userAgent;
  readonly attribute DOMString vendorSub;
};
[NoInterfaceObject, Exposed=(Window,Worker)]
interface NavigatorLanguage {
  readonly attribute DOMString? language;
  readonly attribute DOMString[] languages;
};
[NoInterfaceObject]
interface NavigatorContentUtils {
  // content handler registration
  void registerProtocolHandler(DOMString scheme, DOMString url, DOMString title);
  void registerContentHandler(DOMString mimeType, DOMString url, DOMString title);
  DOMString isProtocolHandlerRegistered(DOMString scheme, DOMString url);
  DOMString isContentHandlerRegistered(DOMString mimeType, DOMString url);
  void unregisterProtocolHandler(DOMString scheme, DOMString url);
  void unregisterContentHandler(DOMString mimeType, DOMString url);
};
[NoInterfaceObject]
interface NavigatorStorageUtils {
  readonly attribute boolean cookieEnabled;
  void yieldForStorageUpdates();
};
[NoInterfaceObject]
interface NavigatorPlugins {
  [SameObject] readonly attribute PluginArray plugins;
  [SameObject] readonly attribute MimeTypeArray mimeTypes;
  readonly attribute boolean javaEnabled;
};

interface PluginArray {
  void refresh(optional boolean reload = false);
  readonly attribute unsigned long length;
  getter Plugin? item(unsigned long index);
  getter Plugin? namedItem(DOMString name);
};

interface MimeTypeArray {
  readonly attribute unsigned long length;
  getter MimeType? item(unsigned long index);
  getter MimeType? namedItem(DOMString name);
};

interface Plugin {
  readonly attribute DOMString name;
  readonly attribute DOMString description;
  readonly attribute DOMString filename;
  readonly attribute unsigned long length;
  getter MimeType? item(unsigned long index);
  getter MimeType? namedItem(DOMString name);
};

interface MimeType {
  readonly attribute DOMString type;
  readonly attribute DOMString description;
  readonly attribute DOMString suffixes; // comma-separated
  readonly attribute Plugin enabledPlugin;
};
interface External {
  void AddSearchProvider(DOMString engineURL);
  unsigned long IsSearchProviderInstalled(DOMString engineURL);
};
[Exposed=(Window,Worker)]
interface ImageBitmap {
  readonly attribute unsigned long width;
  readonly attribute unsigned long height;
};

typedef (HTMLImageElement or
         HTMLVideoElement or
         HTMLCanvasElement or
         Blob or
         ImageData or
         CanvasRenderingContext2D or
         ImageBitmap) ImageBitmapSource;

[NoInterfaceObject, Exposed=(Window,Worker)]
interface ImageBitmapFactories {
  Promise<ImageBitmap> createImageBitmap(ImageBitmapSource image);
  Promise<ImageBitmap> createImageBitmap(ImageBitmapSource image, long sx, long sy, long sw, long sh);
};
Window implements ImageBitmapFactories;
WorkerGlobalScope implements ImageBitmapFactories;
[Constructor(DOMString type, optional MessageEventInit eventInitDict), Exposed=(Window,Worker)]
interface MessageEvent : Event {
  readonly attribute any data;
  readonly attribute DOMString origin;
  readonly attribute DOMString lastEventId;
  readonly attribute (WindowProxy or MessagePort)? source;
  readonly attribute MessagePort[]? ports;

  void initMessageEvent(DOMString typeArg, boolean canBubbleArg, boolean cancelableArg, any dataArg, DOMString originArg, DOMString lastEventIdArg, (WindowProxy or MessagePort) sourceArg, sequence<MessagePort>? portsArg);
};

dictionary MessageEventInit : EventInit {
  any data;
  DOMString origin;
  DOMString lastEventId;
  (WindowProxy or MessagePort)? source;
  sequence<MessagePort> ports;
};
[Constructor(DOMString url, optional EventSourceInit eventSourceInitDict), Exposed=(Window,Worker)]
interface EventSource : EventTarget {
  readonly attribute DOMString url;
  readonly attribute boolean withCredentials;

  // ready state
  const unsigned short CONNECTING = 0;
  const unsigned short OPEN = 1;
  const unsigned short CLOSED = 2;
  readonly attribute unsigned short readyState;

  // networking
  attribute EventHandler onopen;
  attribute EventHandler onmessage;
  attribute EventHandler onerror;
  void close();
};

dictionary EventSourceInit {
  boolean withCredentials = false;
};
enum BinaryType { "blob", "arraybuffer" };
[Constructor(DOMString url, optional (DOMString or DOMString[]) protocols), Exposed=(Window,Worker)]
interface WebSocket : EventTarget {
  readonly attribute DOMString url;

  // ready state
  const unsigned short CONNECTING = 0;
  const unsigned short OPEN = 1;
  const unsigned short CLOSING = 2;
  const unsigned short CLOSED = 3;
  readonly attribute unsigned short readyState;
  readonly attribute unsigned long bufferedAmount;

  // networking
  attribute EventHandler onopen;
  attribute EventHandler onerror;
  attribute EventHandler onclose;
  readonly attribute DOMString extensions;
  readonly attribute DOMString protocol;
  void close([Clamp] optional unsigned short code, optional USVString reason);

  // messaging
  attribute EventHandler onmessage;
  attribute BinaryType binaryType;
  void send(USVString data);
  void send(Blob data);
  void send(ArrayBuffer data);
  void send(ArrayBufferView data);
};
[Constructor(DOMString type, optional CloseEventInit eventInitDict), Exposed=(Window,Worker)]
interface CloseEvent : Event {
  readonly attribute boolean wasClean;
  readonly attribute unsigned short code;
  readonly attribute DOMString reason;
};

dictionary CloseEventInit : EventInit {
  boolean wasClean;
  unsigned short code;
  DOMString reason;
};
[Constructor, Exposed=(Window,Worker)]
interface MessageChannel {
  readonly attribute MessagePort port1;
  readonly attribute MessagePort port2;
};
[Exposed=(Window,Worker)]
interface MessagePort : EventTarget {
  void postMessage(any message, optional sequence<Transferable> transfer);
  void start();
  void close();

  // event handlers
  attribute EventHandler onmessage;
};
// MessagePort implements Transferable;
[Constructor, Exposed=(Window,Worker)]
interface PortCollection {
  void add(MessagePort port);
  void remove(MessagePort port);
  void clear();
  void iterate(PortCollectionCallback callback);
};

callback PortCollectionCallback = void (MessagePort port);
[Constructor(DOMString channel), Exposed=(Window,Worker)]
interface BroadcastChannel : EventTarget {
  readonly attribute DOMString name;
  void postMessage(any message);
  void close();
  attribute EventHandler onmessage;
};
[Exposed=Worker] 
interface WorkerGlobalScope : EventTarget {
  readonly attribute WorkerGlobalScope self;
  readonly attribute WorkerLocation location;

  void close();
  attribute OnErrorEventHandler onerror;
  attribute EventHandler onlanguagechange;
  attribute EventHandler onoffline;
  attribute EventHandler ononline;

  // also has additional members in a partial interface
};
[Global=(Worker,DedicatedWorker),Exposed=DedicatedWorker]
/*sealed*/ interface DedicatedWorkerGlobalScope : WorkerGlobalScope {
  void postMessage(any message, optional sequence<Transferable> transfer);
  attribute EventHandler onmessage;
};
[Global=(Worker,SharedWorker),Exposed=SharedWorker]
/*sealed*/ interface SharedWorkerGlobalScope : WorkerGlobalScope {
  readonly attribute DOMString name;
  readonly attribute ApplicationCache applicationCache;
  attribute EventHandler onconnect;
};
[NoInterfaceObject, Exposed=(Window,Worker)]
interface AbstractWorker {
  attribute EventHandler onerror;
};
[Constructor(DOMString scriptURL), Exposed=(Window,Worker)]
interface Worker : EventTarget {
  void terminate();

  void postMessage(any message, optional sequence<Transferable> transfer);
  attribute EventHandler onmessage;
};
Worker implements AbstractWorker;
[Constructor(DOMString scriptURL, optional DOMString name), Exposed=(Window,Worker)]
interface SharedWorker : EventTarget {
  readonly attribute MessagePort port;
};
SharedWorker implements AbstractWorker;
[Exposed=Worker]
partial interface WorkerGlobalScope { // not obsolete
  void importScripts(DOMString... urls);
  readonly attribute WorkerNavigator navigator;
};
WorkerGlobalScope implements WindowTimers;
WorkerGlobalScope implements WindowBase64;
[Exposed=Worker]
interface WorkerNavigator {};
WorkerNavigator implements NavigatorID;
WorkerNavigator implements NavigatorLanguage;
WorkerNavigator implements NavigatorOnLine;
[Exposed=Worker]
interface WorkerLocation { };
WorkerLocation implements URLUtilsReadOnly;
interface Storage {
  readonly attribute unsigned long length;
  DOMString? key(unsigned long index);
  getter DOMString? getItem(DOMString key);
  setter creator void setItem(DOMString key, DOMString value);
  deleter void removeItem(DOMString key);
  void clear();
};
[NoInterfaceObject]
interface WindowSessionStorage {
  readonly attribute Storage sessionStorage;
};
Window implements WindowSessionStorage;
[NoInterfaceObject]
interface WindowLocalStorage {
  readonly attribute Storage localStorage;
};
Window implements WindowLocalStorage;
[Constructor(DOMString type, optional StorageEventInit eventInitDict)]
interface StorageEvent : Event {
  readonly attribute DOMString? key;
  readonly attribute DOMString? oldValue;
  readonly attribute DOMString? newValue;
  readonly attribute DOMString url;
  readonly attribute Storage? storageArea;
};

dictionary StorageEventInit : EventInit {
  DOMString? key;
  DOMString? oldValue;
  DOMString? newValue;
  DOMString url;
  Storage? storageArea;
};
interface HTMLAppletElement : HTMLElement {
  attribute DOMString align;
  attribute DOMString alt;
  attribute DOMString archive;
  attribute DOMString code;
  attribute DOMString codeBase;
  attribute DOMString height;
  attribute unsigned long hspace;
  attribute DOMString name;
  attribute DOMString _object; // the underscore is not part of the identifier 
  attribute unsigned long vspace;
  attribute DOMString width;
};
interface HTMLMarqueeElement : HTMLElement {
  attribute DOMString behavior;
  attribute DOMString bgColor;
  attribute DOMString direction;
  attribute DOMString height;
  attribute unsigned long hspace;
  attribute long loop;
  attribute unsigned long scrollAmount;
  attribute unsigned long scrollDelay;
  attribute boolean trueSpeed;
  attribute unsigned long vspace;
  attribute DOMString width;

  attribute EventHandler onbounce;
  attribute EventHandler onfinish;
  attribute EventHandler onstart;

  void start();
  void stop();
};
interface HTMLFrameSetElement : HTMLElement {
  attribute DOMString cols;
  attribute DOMString rows;
};
HTMLFrameSetElement implements WindowEventHandlers;
interface HTMLFrameElement : HTMLElement {
  attribute DOMString name;
  attribute DOMString scrolling;
  attribute DOMString src;
  attribute DOMString frameBorder;
  attribute DOMString longDesc;
  attribute boolean noResize;
  readonly attribute Document? contentDocument;
  readonly attribute WindowProxy? contentWindow;

  [TreatNullAs=EmptyString] attribute DOMString marginHeight;
  [TreatNullAs=EmptyString] attribute DOMString marginWidth;
};
partial interface HTMLAnchorElement {
  attribute DOMString coords;
  attribute DOMString charset;
  attribute DOMString name;
  attribute DOMString rev;
  attribute DOMString shape;
};
partial interface HTMLAreaElement {
  attribute boolean noHref;
};
partial interface HTMLBodyElement {
  [TreatNullAs=EmptyString] attribute DOMString text;
  [TreatNullAs=EmptyString] attribute DOMString link;
  [TreatNullAs=EmptyString] attribute DOMString vLink;
  [TreatNullAs=EmptyString] attribute DOMString aLink;
  [TreatNullAs=EmptyString] attribute DOMString bgColor;
                   attribute DOMString background;
};
partial interface HTMLBRElement {
  attribute DOMString clear;
};
partial interface HTMLTableCaptionElement {
  attribute DOMString align;
};
partial interface HTMLTableColElement {
  attribute DOMString align;
  attribute DOMString ch;
  attribute DOMString chOff;
  attribute DOMString vAlign;
  attribute DOMString width;
};
interface HTMLDirectoryElement : HTMLElement {
  attribute boolean compact;
};
partial interface HTMLDivElement {
  attribute DOMString align;
};
partial interface HTMLDListElement {
  attribute boolean compact;
};
partial interface HTMLEmbedElement {
  attribute DOMString align;
  attribute DOMString name;
};
interface HTMLFontElement : HTMLElement {
  [TreatNullAs=EmptyString] attribute DOMString color;
                   attribute DOMString face;
                   attribute DOMString size; 
};
partial interface HTMLHeadingElement {
  attribute DOMString align;
};
partial interface HTMLHRElement {
  attribute DOMString align;
  attribute DOMString color;
  attribute boolean noShade;
  attribute DOMString size;
  attribute DOMString width;
};
partial interface HTMLHtmlElement {
  attribute DOMString version;
};
partial interface HTMLIFrameElement {
  attribute DOMString align;
  attribute DOMString scrolling;
  attribute DOMString frameBorder;
  attribute DOMString longDesc;

  [TreatNullAs=EmptyString] attribute DOMString marginHeight;
  [TreatNullAs=EmptyString] attribute DOMString marginWidth;
};
partial interface HTMLImageElement {
  attribute DOMString name;
  attribute DOMString lowsrc;
  attribute DOMString align;
  attribute unsigned long hspace;
  attribute unsigned long vspace;
  attribute DOMString longDesc;

  [TreatNullAs=EmptyString] attribute DOMString border;
};
partial interface HTMLInputElement {
  attribute DOMString align;
  attribute DOMString useMap;
};
partial interface HTMLLegendElement {
  attribute DOMString align;
};
partial interface HTMLLIElement {
  attribute DOMString type;
};
partial interface HTMLLinkElement {
  attribute DOMString charset;
  attribute DOMString rev;
  attribute DOMString target;
};
partial interface HTMLMenuElement {
  attribute boolean compact;
};
partial interface HTMLMetaElement {
  attribute DOMString scheme;
};
partial interface HTMLObjectElement {
  attribute DOMString align;
  attribute DOMString archive;
  attribute DOMString code;
  attribute boolean declare;
  attribute unsigned long hspace;
  attribute DOMString standby;
  attribute unsigned long vspace;
  attribute DOMString codeBase;
  attribute DOMString codeType;

  [TreatNullAs=EmptyString] attribute DOMString border;
};
partial interface HTMLOListElement {
  attribute boolean compact;
};
partial interface HTMLParagraphElement {
  attribute DOMString align;
};
partial interface HTMLParamElement {
  attribute DOMString type;
  attribute DOMString valueType;
};
partial interface HTMLPreElement {
  attribute long width;
};
partial interface HTMLScriptElement {
  attribute DOMString event;
  attribute DOMString htmlFor;
};
partial interface HTMLTableElement {
  attribute DOMString align;
  attribute DOMString border;
  attribute DOMString frame;
  attribute DOMString rules;
  attribute DOMString summary;
  attribute DOMString width;

  [TreatNullAs=EmptyString] attribute DOMString bgColor;
  [TreatNullAs=EmptyString] attribute DOMString cellPadding;
  [TreatNullAs=EmptyString] attribute DOMString cellSpacing;
};
partial interface HTMLTableSectionElement {
  attribute DOMString align;
  attribute DOMString ch;
  attribute DOMString chOff;
  attribute DOMString vAlign;
};
partial interface HTMLTableCellElement {
  attribute DOMString align;
  attribute DOMString axis;
  attribute DOMString height;
  attribute DOMString width;

  attribute DOMString ch;
  attribute DOMString chOff;
  attribute boolean noWrap;
  attribute DOMString vAlign;

  [TreatNullAs=EmptyString] attribute DOMString bgColor;
};
partial interface HTMLTableDataCellElement {
  attribute DOMString abbr;
};
partial interface HTMLTableRowElement {
  attribute DOMString align;
  attribute DOMString ch;
  attribute DOMString chOff;
  attribute DOMString vAlign;

  [TreatNullAs=EmptyString] attribute DOMString bgColor;
};
partial interface HTMLUListElement {
  attribute boolean compact;
  attribute DOMString type;
};
partial interface Document {
  [TreatNullAs=EmptyString] attribute DOMString fgColor;
  [TreatNullAs=EmptyString] attribute DOMString linkColor;
  [TreatNullAs=EmptyString] attribute DOMString vlinkColor;
  [TreatNullAs=EmptyString] attribute DOMString alinkColor;
  [TreatNullAs=EmptyString] attribute DOMString bgColor;

  readonly attribute HTMLCollection anchors;
  readonly attribute HTMLCollection applets;

  void clear();
  void captureEvents();
  void releaseEvents();

  readonly attribute HTMLAllCollection all;
};
partial interface Window {
  void captureEvents();
  void releaseEvents();
};
