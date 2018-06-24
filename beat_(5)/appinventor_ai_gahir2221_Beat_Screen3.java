package appinventor.ai_gahir2221.Beat;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
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

/* compiled from: Screen3.yail */
public class Screen3 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen3").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final IntNum Lit10 = IntNum.make(3);
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit13 = IntNum.make(2);
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit15 = IntNum.make(-2);
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit17 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit18 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit23 = IntNum.make(20);
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit26 = IntNum.make(1);
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AboutScreen").readResolve());
    static final IntNum Lit30 = IntNum.make(30);
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement2").readResolve());
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve());
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement3").readResolve());
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement4").readResolve());
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Label5").readResolve());
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement5").readResolve());
    static final IntNum Lit55 = IntNum.make(10);
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final FString Lit7 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    public static Screen3 Screen3;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public HorizontalArrangement HorizontalArrangement1;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public Label Label6;
    public VerticalArrangement VerticalArrangement1;
    public VerticalArrangement VerticalArrangement2;
    public VerticalArrangement VerticalArrangement3;
    public VerticalArrangement VerticalArrangement4;
    public VerticalArrangement VerticalArrangement5;
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
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen3.yail */
    public class frame extends ModuleBody {
        Screen3 $main = this;

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
                    if (!(obj instanceof Screen3)) {
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
                    if (!(obj instanceof Screen3)) {
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
                    return Screen3.lambda2();
                case 16:
                    this.$main.$define();
                    return Values.empty;
                case 17:
                    return Screen3.lambda3();
                case 18:
                    return Screen3.lambda4();
                case 19:
                    return Screen3.lambda5();
                case 20:
                    return Screen3.lambda6();
                case 21:
                    return Screen3.lambda7();
                case 22:
                    return Screen3.lambda8();
                case 23:
                    return Screen3.lambda9();
                case 24:
                    return Screen3.lambda10();
                case 25:
                    return Screen3.lambda11();
                case 26:
                    return Screen3.lambda12();
                case 27:
                    return Screen3.lambda13();
                case 28:
                    return Screen3.lambda14();
                case 29:
                    return Screen3.lambda15();
                case 30:
                    return Screen3.lambda16();
                case 31:
                    return Screen3.lambda17();
                case 32:
                    return Screen3.lambda18();
                case 33:
                    return Screen3.lambda19();
                case 34:
                    return Screen3.lambda20();
                case 35:
                    return Screen3.lambda21();
                case 36:
                    return Screen3.lambda22();
                case 37:
                    return Screen3.lambda23();
                case 38:
                    return Screen3.lambda24();
                case 39:
                    return Screen3.lambda25();
                case 40:
                    return Screen3.lambda26();
                case 41:
                    return Screen3.lambda27();
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public Screen3() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_gahir2221_Beat_Screen3_frame = new frame();
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 1, Lit60, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 2, Lit61, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 3, Lit62, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 5, Lit63, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 6, Lit64, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 7, Lit65, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 8, Lit66, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 9, Lit67, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 10, Lit68, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 11, Lit69, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 13, Lit70, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 14, Lit71, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6608153224517167716.scm:552");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 21, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 22, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 23, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 24, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 25, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 26, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 27, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 28, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 29, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 30, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 31, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 32, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 33, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 34, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 35, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 36, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 37, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 38, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 39, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 40, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_gahir2221_Beat_Screen3_frame, 41, null, 0);
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
            Screen3 = null;
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
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit7, Lit8, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit17, Lit8, lambda$Fn4);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit8, Lit18, Lit19, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit8, Lit27, Lit19, lambda$Fn6);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit8, Lit28, Lit29, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit8, Lit31, Lit29, lambda$Fn8);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit29, Lit32, Lit33, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit29, Lit34, Lit33, lambda$Fn10);
                }
                this.VerticalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit8, Lit35, Lit36, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit8, Lit37, Lit36, lambda$Fn12);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit36, Lit38, Lit39, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit36, Lit40, Lit39, lambda$Fn14);
                }
                this.VerticalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit8, Lit41, Lit42, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit8, Lit43, Lit42, lambda$Fn16);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit42, Lit44, Lit45, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit42, Lit46, Lit45, lambda$Fn18);
                }
                this.VerticalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit8, Lit47, Lit48, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit8, Lit49, Lit48, lambda$Fn20);
                }
                this.Label5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit48, Lit50, Lit51, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit48, Lit52, Lit51, lambda$Fn22);
                }
                this.VerticalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit8, Lit53, Lit54, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit8, Lit56, Lit54, lambda$Fn24);
                }
                this.Label6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit8, Lit57, Lit58, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit8, Lit59, Lit58, lambda$Fn26);
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

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit12, Lit13, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit14, Lit15, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit16, Lit15, Lit11);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit12, Lit13, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit14, Lit15, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit16, Lit15, Lit11);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.TRUE, Lit21);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit22, Lit23, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit24, "Project Made By:", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit25, Lit26, Lit11);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.TRUE, Lit21);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit22, Lit23, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit24, "Project Made By:", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit25, Lit26, Lit11);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit14, Lit30, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit16, Lit15, Lit11);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit14, Lit30, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit16, Lit15, Lit11);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit24, "Munish Ahuja (101583014)", Lit4);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit24, "Munish Ahuja (101583014)", Lit4);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit12, Lit13, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit14, Lit30, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit16, Lit15, Lit11);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit12, Lit13, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit14, Lit30, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit16, Lit15, Lit11);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit24, "Sukhber Bansal (101403181)", Lit4);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit24, "Sukhber Bansal (101403181)", Lit4);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit42, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit42, Lit12, Lit13, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit42, Lit14, Lit30, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit16, Lit15, Lit11);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit42, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit42, Lit12, Lit13, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit42, Lit14, Lit30, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit16, Lit15, Lit11);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit24, "Shuvam Mhay (101403174)", Lit4);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit24, "Shuvam Mhay (101403174)", Lit4);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit12, Lit13, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit14, Lit30, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit16, Lit15, Lit11);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit9, Lit10, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit12, Lit13, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit14, Lit30, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit16, Lit15, Lit11);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit24, "Karanvir Singh (101403089)", Lit4);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit24, "Karanvir Singh (101403089)", Lit4);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit14, Lit55, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit16, Lit15, Lit11);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit14, Lit55, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit16, Lit15, Lit11);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit58, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit24, "Department of COE", Lit4);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit58, Lit22, Lit23, Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit24, "Department of COE", Lit4);
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
        Screen3 = this;
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
        Screen3 closureEnv = this;
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
