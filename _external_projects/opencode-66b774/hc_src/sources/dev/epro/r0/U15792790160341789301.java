package dev.epro.r0;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class U15792790160341789301 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ S7974369370986781936 b;

    public /* synthetic */ U15792790160341789301(S7974369370986781936 s7974369370986781936, byte b) {
        this.a = b;
        this.b = s7974369370986781936;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        S7974369370986781936 s7974369370986781936 = this.b;
        switch (b) {
            case 0:
                return new N17834861578880914456(s7974369370986781936, s7974369370986781936.getTextInputService(), (W5797197595347441198) obj);
            case 1:
                B13729205492206812220 b13729205492206812220 = (B13729205492206812220) obj;
                Handler handler = s7974369370986781936.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    b13729205492206812220.invoke();
                } else {
                    Handler handler2 = s7974369370986781936.getHandler();
                    if (handler2 != null) {
                        handler2.post(new S6873153560207725378(b13729205492206812220, (byte) 1));
                    }
                }
                return o9245300239821758723;
            case 2:
                ((D10236220797215130727) s7974369370986781936.getFocusOwner()).h(((A2608878181351957686) obj).a, false);
                return o9245300239821758723;
            case 3:
                return s7974369370986781936.getSavedStateRegistry();
            case 4:
                return Boolean.valueOf(s7974369370986781936.getScrollCaptureInProgress());
            case 5:
                return s7974369370986781936.m30getInputModeManager();
            case 6:
                return s7974369370986781936.getTextInputService();
            case 7:
                return s7974369370986781936.getSoftwareKeyboardController();
            case 8:
                return s7974369370986781936.getTextToolbar();
            default:
                return s7974369370986781936.getPointerIconService();
        }
    }
}
