package appinventor.ai_gahir2221.Beat;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.AddOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.kawa.servlet.HttpRequestContext;
import gnu.kawa.xml.XDataType;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement9").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit102 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 884814);
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit104 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("Clock1").readResolve());
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("ReceiveText").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("BytesAvailableToReceive").readResolve());
    static final PairWithPosition Lit111 = PairWithPosition.make(Lit13, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934160);
    static final PairWithPosition Lit112 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934276);
    static final IntNum Lit113 = IntNum.make(0);
    static final PairWithPosition Lit114 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934397), "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934389);
    static final IntNum Lit115 = IntNum.make(1023);
    static final PairWithPosition Lit116 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934499), "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934491);
    static final PairWithPosition Lit117;
    static final IntNum Lit118 = IntNum.make(2000);
    static final PairWithPosition Lit119 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934832), "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934824);
    static final IntNum Lit12 = IntNum.make(20);
    static final IntNum Lit120 = IntNum.make(3023);
    static final PairWithPosition Lit121 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934934), "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934926);
    static final IntNum Lit122 = IntNum.make(2000);
    static final PairWithPosition Lit123;
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve());
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("Timer").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit132 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit15 = IntNum.make(-2);
    static final FString Lit16 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit17 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement7").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final IntNum Lit20 = IntNum.make(3);
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit22 = IntNum.make(2);
    static final IntNum Lit23 = IntNum.make(30);
    static final FString Lit24 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit25 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AboutScreen").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement8").readResolve());
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit4;
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement10").readResolve());
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("ListPicker1").readResolve());
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("Elements").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve());
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("ListPicker1$BeforePicking").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve());
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("Connect").readResolve());
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("Selection").readResolve());
    static final PairWithPosition Lit58 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 462968);
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("IsConnected").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("nobluetooth").readResolve());
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit62 = IntNum.make(-16777216);
    static final IntNum Lit63 = IntNum.make(-3407872);
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("ListPicker1$AfterPicking").readResolve());
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit67;
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("Screen1$BackPressed").readResolve());
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement11").readResolve());
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement6").readResolve());
    static final IntNum Lit74 = IntNum.make(60);
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit79 = IntNum.make(1);
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("BackPressed").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement3").readResolve());
    static final IntNum Lit86 = IntNum.make(50);
    static final FString Lit87 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final FString Lit9 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final IntNum Lit90 = IntNum.make(18);
    static final IntNum Lit91 = IntNum.make((int) HttpRequestContext.HTTP_OK);
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit93 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 778318);
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement5").readResolve());
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.Button");
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public BluetoothClient BluetoothClient1;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public HorizontalArrangement HorizontalArrangement1;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public ListPicker ListPicker1;
    public final ModuleMethod ListPicker1$AfterPicking;
    public final ModuleMethod ListPicker1$BeforePicking;
    public final ModuleMethod Screen1$BackPressed;
    public VerticalArrangement VerticalArrangement1;
    public VerticalArrangement VerticalArrangement10;
    public VerticalArrangement VerticalArrangement11;
    public VerticalArrangement VerticalArrangement3;
    public VerticalArrangement VerticalArrangement5;
    public VerticalArrangement VerticalArrangement6;
    public VerticalArrangement VerticalArrangement7;
    public VerticalArrangement VerticalArrangement8;
    public VerticalArrangement VerticalArrangement9;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public Label nobluetooth;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 2:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 6:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 7:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 14:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 13:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 10:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 11:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 12:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 8:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 13:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 2:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case 7:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 9:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 14:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 15:
                    return Screen1.lambda2();
                case 16:
                    this.$main.$define();
                    return Values.empty;
                case 17:
                    return Screen1.lambda3();
                case 18:
                    return this.$main.Screen1$BackPressed();
                case 19:
                    return Screen1.lambda4();
                case 20:
                    return Screen1.lambda5();
                case 21:
                    return Screen1.lambda6();
                case 22:
                    return Screen1.lambda7();
                case 23:
                    return Screen1.lambda8();
                case 24:
                    return Screen1.lambda9();
                case 25:
                    return Screen1.lambda10();
                case 26:
                    return Screen1.lambda11();
                case 27:
                    return Screen1.lambda12();
                case 28:
                    return Screen1.lambda13();
                case 29:
                    return Screen1.lambda14();
                case 30:
                    return Screen1.lambda15();
                case 31:
                    return Screen1.lambda16();
                case 32:
                    return Screen1.lambda17();
                case 33:
                    return Screen1.lambda18();
                case 34:
                    return Screen1.lambda19();
                case 35:
                    return Screen1.lambda20();
                case 36:
                    return Screen1.lambda21();
                case 37:
                    return this.$main.ListPicker1$BeforePicking();
                case 38:
                    return this.$main.ListPicker1$AfterPicking();
                case 39:
                    return Screen1.lambda22();
                case 40:
                    return Screen1.lambda23();
                case 41:
                    return Screen1.lambda24();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return Screen1.lambda25();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Screen1.lambda26();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Screen1.lambda27();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return Screen1.lambda28();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return Screen1.lambda29();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return Screen1.lambda30();
                case 48:
                    return Screen1.lambda31();
                case 49:
                    return Screen1.lambda32();
                case 50:
                    return Screen1.lambda33();
                case 51:
                    return Screen1.lambda34();
                case 52:
                    return Screen1.lambda35();
                case 53:
                    return this.$main.Button1$Click();
                case 54:
                    return Screen1.lambda36();
                case 55:
                    return Screen1.lambda37();
                case 56:
                    return Screen1.lambda38();
                case 57:
                    return Screen1.lambda39();
                case 58:
                    return this.$main.Button2$Click();
                case 59:
                    return Screen1.lambda40();
                case 60:
                    return Screen1.lambda42();
                case 61:
                    return Screen1.lambda43();
                case 62:
                    return Screen1.lambda41();
                case 63:
                    return Screen1.lambda44();
                case 64:
                    return Screen1.lambda46();
                case 65:
                    return Screen1.lambda47();
                case 66:
                    return Screen1.lambda45();
                case 67:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 15:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 16:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NAME_TYPE_CODE /*43*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ID_TYPE_CODE /*45*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 64:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit13 = simpleSymbol;
        Lit123 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 935086), "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 935078);
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit117 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1511967359419_0.31963897324220003-0/youngandroidproject/../src/appinventor/ai_gahir2221/Beat/Screen1.yail", 934708);
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_RED;
        Lit67 = IntNum.make(iArr);
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_gahir2221_Beat_Screen1_frame = new frame();
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 1, Lit126, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 2, Lit127, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 3, Lit128, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 5, Lit129, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 6, Lit130, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 7, Lit131, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 8, Lit132, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 9, Lit133, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 10, Lit134, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 11, Lit135, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 13, Lit136, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 14, Lit137, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6608153224517167716.scm:552");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 17, null, 0);
        this.Screen1$BackPressed = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 18, Lit7, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 28, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 29, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 30, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 31, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 32, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 33, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 34, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 35, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 36, null, 0);
        this.ListPicker1$BeforePicking = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 37, Lit54, 0);
        this.ListPicker1$AfterPicking = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 38, Lit64, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 39, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 40, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 41, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 42, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 43, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 44, null, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 45, null, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 46, null, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 47, null, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 48, null, 0);
        lambda$Fn31 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 49, null, 0);
        lambda$Fn32 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 50, null, 0);
        lambda$Fn33 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 51, null, 0);
        lambda$Fn34 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 52, null, 0);
        this.Button1$Click = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 53, Lit94, 0);
        lambda$Fn35 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 54, null, 0);
        lambda$Fn36 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 55, null, 0);
        lambda$Fn37 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 56, null, 0);
        lambda$Fn38 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 57, null, 0);
        this.Button2$Click = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 58, Lit103, 0);
        lambda$Fn39 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 59, null, 0);
        lambda$Fn41 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 60, null, 0);
        lambda$Fn42 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 61, null, 0);
        lambda$Fn40 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 62, null, 0);
        lambda$Fn43 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 63, null, 0);
        lambda$Fn45 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 64, null, 0);
        lambda$Fn46 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 65, null, 0);
        lambda$Fn44 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 66, null, 0);
        this.Clock1$Timer = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen1_frame, 67, Lit124, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Beat", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Beat", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Beat", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit7, this.Screen1$BackPressed);
                } else {
                    addToFormEnvironment(Lit7, this.Screen1$BackPressed);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "BackPressed");
                } else {
                    addToEvents(Lit0, Lit8);
                }
                this.VerticalArrangement9 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit16, Lit10, lambda$Fn4);
                }
                this.VerticalArrangement7 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit17, Lit18, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit24, Lit18, lambda$Fn6);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit25, Lit26, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit18, Lit31, Lit26, lambda$Fn8);
                }
                this.VerticalArrangement8 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit32, Lit33, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit34, Lit33, lambda$Fn10);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit33, Lit35, Lit36, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit33, Lit37, Lit36, lambda$Fn12);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit38, Lit39, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit0, Lit40, Lit39, lambda$Fn14);
                }
                this.VerticalArrangement10 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit41, Lit42, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit39, Lit43, Lit42, lambda$Fn16);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit44, Lit45, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit39, Lit46, Lit45, lambda$Fn18);
                }
                this.ListPicker1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit45, Lit47, Lit48, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit45, Lit49, Lit48, lambda$Fn20);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit54, this.ListPicker1$BeforePicking);
                } else {
                    addToFormEnvironment(Lit54, this.ListPicker1$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "BeforePicking");
                } else {
                    addToEvents(Lit48, Lit55);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit64, this.ListPicker1$AfterPicking);
                } else {
                    addToFormEnvironment(Lit64, this.ListPicker1$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "AfterPicking");
                } else {
                    addToEvents(Lit48, Lit65);
                }
                this.nobluetooth = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit45, Lit66, Lit60, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit45, Lit68, Lit60, lambda$Fn22);
                }
                this.VerticalArrangement11 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit69, Lit70, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit39, Lit71, Lit70, lambda$Fn24);
                }
                this.VerticalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit72, Lit73, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit39, Lit75, Lit73, lambda$Fn26);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit73, Lit76, Lit77, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit73, Lit80, Lit77, lambda$Fn28);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit73, Lit81, Lit82, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit73, Lit83, Lit82, lambda$Fn30);
                }
                this.VerticalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit84, Lit85, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit39, Lit87, Lit85, lambda$Fn32);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit85, Lit88, Lit89, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit85, Lit92, Lit89, lambda$Fn34);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit94, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit94, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit89, Lit95);
                }
                this.VerticalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit96, Lit97, lambda$Fn35), $result);
                } else {
                    addToComponents(Lit39, Lit98, Lit97, lambda$Fn36);
                }
                this.Button2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit97, Lit99, Lit100, lambda$Fn37), $result);
                } else {
                    addToComponents(Lit97, Lit101, Lit100, lambda$Fn38);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit103, this.Button2$Click);
                } else {
                    addToFormEnvironment(Lit103, this.Button2$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button2", "Click");
                } else {
                    addToEvents(Lit100, Lit95);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit104, Lit51, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit105, Lit51, Boolean.FALSE);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit106, Lit107, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit108, Lit107, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit124, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit124, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit107, Lit125);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Beat", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Beat", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Beat", Lit4);
    }

    public Object Screen1$BackPressed() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit13);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit13);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit18, Lit21, Lit22, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit18, Lit11, Lit23, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit14, Lit15, Lit13);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit18, Lit21, Lit22, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit18, Lit11, Lit23, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit14, Lit15, Lit13);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit26, Lit27, Boolean.TRUE, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit26, Lit29, Lit12, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit26, Lit30, "Thapar Institute of Engineering", Lit4);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit26, Lit27, Boolean.TRUE, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit26, Lit29, Lit12, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit26, Lit30, "Thapar Institute of Engineering", Lit4);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit21, Lit22, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit11, Lit23, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit14, Lit15, Lit13);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit21, Lit22, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit11, Lit23, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit14, Lit15, Lit13);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit27, Boolean.TRUE, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit29, Lit12, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit30, " and Technology University, Patiala", Lit4);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit27, Boolean.TRUE, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit29, Lit12, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit30, " and Technology University, Patiala", Lit4);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit11, Lit15, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit14, Lit15, Lit13);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit11, Lit15, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit14, Lit15, Lit13);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit42, Lit11, Lit12, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit14, Lit15, Lit13);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit42, Lit11, Lit12, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit14, Lit15, Lit13);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit21, Lit22, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit14, Lit15, Lit13);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit21, Lit22, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit14, Lit15, Lit13);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit30, "Select Device", Lit4);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit30, "Select Device", Lit4);
    }

    public Object ListPicker1$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit50, runtime.getProperty$1(Lit51, Lit52), Lit53);
    }

    public Object ListPicker1$AfterPicking() {
        runtime.setThisForm();
        if (runtime.callComponentMethod(Lit51, Lit56, LList.list1(runtime.getProperty$1(Lit48, Lit57)), Lit58) == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.setAndCoerceProperty$Ex(Lit48, Lit50, runtime.getProperty$1(Lit51, Lit52), Lit53);
        if (runtime.getProperty$1(Lit51, Lit59) != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit60, Lit30, "Connected", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit60, Lit61, Lit62, Lit13);
        }
        runtime.setAndCoerceProperty$Ex(Lit60, Lit30, "Not Connected", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit61, Lit63, Lit13);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit30, "Not Connected", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit61, Lit67, Lit13);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit30, "Not Connected", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit61, Lit67, Lit13);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit11, Lit23, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit14, Lit15, Lit13);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit11, Lit23, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit14, Lit15, Lit13);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit11, Lit74, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit14, Lit15, Lit13);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit11, Lit74, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit14, Lit15, Lit13);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit29, Lit12, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit11, Lit12, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit14, Lit15, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit78, Lit79, Lit13);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit29, Lit12, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit11, Lit12, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit14, Lit15, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit78, Lit79, Lit13);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit11, Lit12, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit14, Lit15, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit78, Lit79, Lit13);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit11, Lit12, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit14, Lit15, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit78, Lit79, Lit13);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit21, Lit22, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit11, Lit86, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit14, Lit15, Lit13);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit21, Lit22, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit11, Lit86, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit14, Lit15, Lit13);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit29, Lit90, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit14, Lit91, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit30, "Go to Maps", Lit4);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit29, Lit90, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit14, Lit91, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit30, "Go to Maps", Lit4);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Screen2"), Lit93, "open another screen");
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit21, Lit22, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit11, Lit86, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit14, Lit15, Lit13);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit19, Lit20, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit21, Lit22, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit11, Lit86, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit14, Lit15, Lit13);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit29, Lit90, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit14, Lit91, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit30, "About Us", Lit4);
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit29, Lit90, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit14, Lit91, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit30, "About Us", Lit4);
    }

    public Object Button2$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Screen3"), Lit102, "open another screen");
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        if (runtime.getProperty$1(Lit51, Lit59) == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.setAndCoerceProperty$Ex(Lit77, Lit30, runtime.callComponentMethod(Lit51, Lit109, LList.list1(runtime.callComponentMethod(Lit51, Lit110, LList.Empty, LList.Empty)), Lit111), Lit4);
        if (runtime.processAndDelayed$V(new Object[]{lambda$Fn39, lambda$Fn40}) != Boolean.FALSE) {
            return runtime.setAndCoerceProperty$Ex(Lit77, Lit30, runtime.getProperty$1(Lit77, Lit30), Lit4);
        }
        return runtime.processAndDelayed$V(new Object[]{lambda$Fn43, lambda$Fn44}) != Boolean.FALSE ? runtime.setAndCoerceProperty$Ex(Lit82, Lit30, runtime.callYailPrimitive(AddOp.$Mn, LList.list2(runtime.getProperty$1(Lit77, Lit30), Lit122), Lit123, "-"), Lit4) : Values.empty;
    }

    static Object lambda40() {
        return runtime.callYailPrimitive(runtime.is$Mnnumber$Qu, LList.list1(runtime.getProperty$1(Lit77, Lit30)), Lit112, "is a number?");
    }

    static Object lambda41() {
        return runtime.processAndDelayed$V(new Object[]{lambda$Fn41, lambda$Fn42});
    }

    static Object lambda42() {
        return runtime.callYailPrimitive(Scheme.numGEq, LList.list2(runtime.getProperty$1(Lit77, Lit30), Lit113), Lit114, ">=");
    }

    static Object lambda43() {
        return runtime.callYailPrimitive(Scheme.numLEq, LList.list2(runtime.getProperty$1(Lit77, Lit30), Lit115), Lit116, "<=");
    }

    static Object lambda44() {
        return runtime.callYailPrimitive(runtime.is$Mnnumber$Qu, LList.list1(runtime.getProperty$1(Lit77, Lit30)), Lit117, "is a number?");
    }

    static Object lambda45() {
        return runtime.processAndDelayed$V(new Object[]{lambda$Fn45, lambda$Fn46});
    }

    static Object lambda46() {
        return runtime.callYailPrimitive(Scheme.numGEq, LList.list2(runtime.getProperty$1(Lit77, Lit30), Lit118), Lit119, ">=");
    }

    static Object lambda47() {
        return runtime.callYailPrimitive(Scheme.numLEq, LList.list2(runtime.getProperty$1(Lit77, Lit30), Lit120), Lit121, "<=");
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Screen1 closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
