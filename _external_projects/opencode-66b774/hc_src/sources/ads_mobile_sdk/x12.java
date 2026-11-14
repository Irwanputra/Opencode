package ads_mobile_sdk;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import dev.epro.r0.G10308367458345557237;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Z3437138737604933638;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class x12 implements G10308367458345557237 {
    public final Context a;
    public final String b;
    public final String c;
    public final ri d;
    public final Optional e;
    public final O16637889491137121389 f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final w12 i;

    public x12(Context context, String str, String str2, ri riVar, Optional optional, O16637889491137121389 o16637889491137121389) {
        context.getClass();
        str.getClass();
        str2.getClass();
        riVar.getClass();
        optional.getClass();
        o16637889491137121389.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = riVar;
        this.e = optional;
        this.f = o16637889491137121389;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        w12 w12Var = new w12();
        w12Var.a = false;
        w12Var.d = 0L;
        w12Var.f = null;
        this.i = w12Var;
    }

    public final Object a(R4833348786910499294 r4833348786910499294) {
        P16422848101170923038 p16422848101170923038;
        float f;
        I16631908410500040363 i16631908410500040363;
        tx0 tx0Var = (tx0) M18113111391818111737.H(this.e);
        if (tx0Var != null) {
            Context context = this.a;
            context.getClass();
            String str = this.b;
            str.getClass();
            String str2 = this.c;
            str2.getClass();
            ri riVar = this.d;
            riVar.getClass();
            P16422848101170923038 p164228481011709230382 = new P16422848101170923038();
            PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
            w12 w12Var = this.i;
            qo3 qo3Var = w12Var.f;
            if (qo3Var == null) {
                i16631908410500040363 = new I16631908410500040363();
                p16422848101170923038 = p164228481011709230382;
            } else {
                Rect rect = qo3Var.k;
                Rect rect2 = qo3Var.i;
                Rect rect3 = qo3Var.g;
                Rect rect4 = qo3Var.d;
                Rect rect5 = qo3Var.f;
                I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
                i166319084105000403632.t("afmaVersion", str);
                i166319084105000403632.q("activeViewJSON", new I16631908410500040363());
                p16422848101170923038 = p164228481011709230382;
                i166319084105000403632.s("timestamp", Long.valueOf(w12Var.d));
                i166319084105000403632.r("isNative", Boolean.TRUE);
                i166319084105000403632.t("adFormat", "native");
                Boolean bool = Boolean.FALSE;
                i166319084105000403632.r("isMraid", bool);
                i166319084105000403632.t("hashCode", str2);
                i166319084105000403632.r("isStopped", bool);
                i166319084105000403632.r("isPaused", bool);
                i166319084105000403632.r("isScreenOn", Boolean.valueOf(powerManager.isInteractive()));
                i166319084105000403632.r("appMuted", Boolean.valueOf(riVar.d));
                i166319084105000403632.s("appVolume", Float.valueOf(riVar.c));
                AudioManager audioManager = (AudioManager) context.getSystemService(AudioManager.class);
                if (audioManager != null) {
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamMaxVolume != 0) {
                        f = streamVolume / streamMaxVolume;
                        i166319084105000403632.s("deviceVolume", Float.valueOf(f));
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        i166319084105000403632.s("windowVisibility", Integer.valueOf(qo3Var.c));
                        i166319084105000403632.r("isAttachedToWindow", Boolean.valueOf(qo3Var.e));
                        I16631908410500040363 i166319084105000403633 = new I16631908410500040363();
                        i166319084105000403633.s("top", Integer.valueOf(rect5.top));
                        i166319084105000403633.s("bottom", Integer.valueOf(rect5.bottom));
                        i166319084105000403633.s("left", Integer.valueOf(rect5.left));
                        i166319084105000403633.s("right", Integer.valueOf(rect5.right));
                        i166319084105000403632.q("viewBox", i166319084105000403633);
                        I16631908410500040363 i166319084105000403634 = new I16631908410500040363();
                        i166319084105000403634.s("top", Integer.valueOf(rect4.top));
                        i166319084105000403634.s("bottom", Integer.valueOf(rect4.bottom));
                        i166319084105000403634.s("left", Integer.valueOf(rect4.left));
                        i166319084105000403634.s("right", Integer.valueOf(rect4.right));
                        i166319084105000403632.q("adBox", i166319084105000403634);
                        I16631908410500040363 i166319084105000403635 = new I16631908410500040363();
                        i166319084105000403635.s("top", Integer.valueOf(rect3.top));
                        i166319084105000403635.s("bottom", Integer.valueOf(rect3.bottom));
                        i166319084105000403635.s("left", Integer.valueOf(rect3.left));
                        i166319084105000403635.s("right", Integer.valueOf(rect3.right));
                        i166319084105000403632.q("globalVisibleBox", i166319084105000403635);
                        i166319084105000403632.r("globalVisibleBoxVisible", Boolean.valueOf(qo3Var.h));
                        I16631908410500040363 i166319084105000403636 = new I16631908410500040363();
                        i166319084105000403636.s("top", Integer.valueOf(rect2.top));
                        i166319084105000403636.s("bottom", Integer.valueOf(rect2.bottom));
                        i166319084105000403636.s("left", Integer.valueOf(rect2.left));
                        i166319084105000403636.s("right", Integer.valueOf(rect2.right));
                        i166319084105000403632.q("localVisibleBox", i166319084105000403636);
                        i166319084105000403632.r("localVisibleBoxVisible", Boolean.valueOf(qo3Var.j));
                        I16631908410500040363 i166319084105000403637 = new I16631908410500040363();
                        i166319084105000403637.s("top", Integer.valueOf(rect.top));
                        i166319084105000403637.s("bottom", Integer.valueOf(rect.bottom));
                        i166319084105000403637.s("left", Integer.valueOf(rect.left));
                        i166319084105000403637.s("right", Integer.valueOf(rect.right));
                        i166319084105000403632.q("hitBox", i166319084105000403637);
                        i166319084105000403632.s("screenDensity", Float.valueOf(displayMetrics.density));
                        i166319084105000403632.r("isVisible", Boolean.valueOf(w12Var.a));
                        i16631908410500040363 = i166319084105000403632;
                    }
                }
                f = 0.0f;
                i166319084105000403632.s("deviceVolume", Float.valueOf(f));
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                i166319084105000403632.s("windowVisibility", Integer.valueOf(qo3Var.c));
                i166319084105000403632.r("isAttachedToWindow", Boolean.valueOf(qo3Var.e));
                I16631908410500040363 i1663190841050004036332 = new I16631908410500040363();
                i1663190841050004036332.s("top", Integer.valueOf(rect5.top));
                i1663190841050004036332.s("bottom", Integer.valueOf(rect5.bottom));
                i1663190841050004036332.s("left", Integer.valueOf(rect5.left));
                i1663190841050004036332.s("right", Integer.valueOf(rect5.right));
                i166319084105000403632.q("viewBox", i1663190841050004036332);
                I16631908410500040363 i1663190841050004036342 = new I16631908410500040363();
                i1663190841050004036342.s("top", Integer.valueOf(rect4.top));
                i1663190841050004036342.s("bottom", Integer.valueOf(rect4.bottom));
                i1663190841050004036342.s("left", Integer.valueOf(rect4.left));
                i1663190841050004036342.s("right", Integer.valueOf(rect4.right));
                i166319084105000403632.q("adBox", i1663190841050004036342);
                I16631908410500040363 i1663190841050004036352 = new I16631908410500040363();
                i1663190841050004036352.s("top", Integer.valueOf(rect3.top));
                i1663190841050004036352.s("bottom", Integer.valueOf(rect3.bottom));
                i1663190841050004036352.s("left", Integer.valueOf(rect3.left));
                i1663190841050004036352.s("right", Integer.valueOf(rect3.right));
                i166319084105000403632.q("globalVisibleBox", i1663190841050004036352);
                i166319084105000403632.r("globalVisibleBoxVisible", Boolean.valueOf(qo3Var.h));
                I16631908410500040363 i1663190841050004036362 = new I16631908410500040363();
                i1663190841050004036362.s("top", Integer.valueOf(rect2.top));
                i1663190841050004036362.s("bottom", Integer.valueOf(rect2.bottom));
                i1663190841050004036362.s("left", Integer.valueOf(rect2.left));
                i1663190841050004036362.s("right", Integer.valueOf(rect2.right));
                i166319084105000403632.q("localVisibleBox", i1663190841050004036362);
                i166319084105000403632.r("localVisibleBoxVisible", Boolean.valueOf(qo3Var.j));
                I16631908410500040363 i1663190841050004036372 = new I16631908410500040363();
                i1663190841050004036372.s("top", Integer.valueOf(rect.top));
                i1663190841050004036372.s("bottom", Integer.valueOf(rect.bottom));
                i1663190841050004036372.s("left", Integer.valueOf(rect.left));
                i1663190841050004036372.s("right", Integer.valueOf(rect.right));
                i166319084105000403632.q("hitBox", i1663190841050004036372);
                i166319084105000403632.s("screenDensity", Float.valueOf(displayMetrics2.density));
                i166319084105000403632.r("isVisible", Boolean.valueOf(w12Var.a));
                i16631908410500040363 = i166319084105000403632;
            }
            p16422848101170923038.q(i16631908410500040363);
            I16631908410500040363 i166319084105000403638 = new I16631908410500040363();
            i166319084105000403638.q("units", p16422848101170923038);
            i166319084105000403638.toString();
            Object b = tx0Var.b(i166319084105000403638, "AFMA_updateActiveView", r4833348786910499294);
            if (b == Z3437138737604933638.a) {
                return b;
            }
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.G10308367458345557237
    public final Object b(qo3 qo3Var, R4833348786910499294 r4833348786910499294) {
        Object a;
        boolean z = this.h.get() ? false : qo3Var.b;
        w12 w12Var = this.i;
        w12Var.a = z;
        this.f.getClass();
        w12Var.d = SystemClock.elapsedRealtime();
        w12Var.f = qo3Var;
        return (this.g.get() && (a = a(r4833348786910499294)) == Z3437138737604933638.a) ? a : O9245300239821758723.a;
    }
}
