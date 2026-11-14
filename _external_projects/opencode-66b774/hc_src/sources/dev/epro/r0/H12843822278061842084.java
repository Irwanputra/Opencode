package dev.epro.r0;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class H12843822278061842084 implements C546526958440023066, S17787728937930228535, D10104483913663276389, G10797274810599614742, H14091617879526365106, G12238198644913880576, G17207421659529280019, J8575954267469244926, A13182230205880306765, U2582504393267961583, R17143752899285419206, N9606265891541456973 {
    public static H12843822278061842084 c;
    public static final H12843822278061842084 e;
    public static volatile H12843822278061842084 g;
    public static final P4037009845664801273 h;
    public static final N5189337359368371626 i;
    public static final A5761250791026268916 j;
    public final /* synthetic */ byte a;
    public Object b;
    public static final F5577235160184315757 d = new F5577235160184315757(0, false, false, 0, 0);
    public static final Object f = new Object();

    static {
        byte b = 1;
        e = new H12843822278061842084(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, b);
        h = new P4037009845664801273(b);
        i = new N5189337359368371626(b);
        j = new A5761250791026268916(b);
    }

    public H12843822278061842084(byte b) {
        A16777725183770839672 a16777725183770839672;
        F106848419962225656 f106848419962225656;
        E6003104237735953596 e6003104237735953596;
        this.a = b;
        switch (b) {
            case 3:
                Class cls = E6993330184355272251.a;
                try {
                    a16777725183770839672 = (A16777725183770839672) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    a16777725183770839672 = h;
                }
                A16777725183770839672[] a16777725183770839672Arr = {P4037009845664801273.b, a16777725183770839672};
                Z17811827500574349708 z17811827500574349708 = new Z17811827500574349708();
                z17811827500574349708.a = a16777725183770839672Arr;
                Charset charset = S15638288480382345131.a;
                this.b = z17811827500574349708;
                break;
            case 4:
                try {
                    f106848419962225656 = (F106848419962225656) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    f106848419962225656 = i;
                }
                F106848419962225656[] f106848419962225656Arr = {N5189337359368371626.b, f106848419962225656};
                J9227924881636374484 j9227924881636374484 = new J9227924881636374484();
                j9227924881636374484.a = f106848419962225656Arr;
                Charset charset2 = X10245771154555039797.a;
                this.b = j9227924881636374484;
                break;
            case 5:
                X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
                try {
                    e6003104237735953596 = (E6003104237735953596) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused3) {
                    e6003104237735953596 = j;
                }
                E6003104237735953596[] e6003104237735953596Arr = {A5761250791026268916.b, e6003104237735953596};
                J1170565920253950774 j1170565920253950774 = new J1170565920253950774();
                j1170565920253950774.a = e6003104237735953596Arr;
                Charset charset3 = A9187767737237685029.a;
                this.b = j1170565920253950774;
                break;
            case 6:
                if (Build.VERSION.SDK_INT < 26) {
                    this.b = new N6541761658076896261(this);
                    break;
                } else {
                    this.b = new K15647550276531265879(this);
                    break;
                }
            default:
                this.b = new ConcurrentHashMap();
                break;
        }
    }

    public static synchronized H12843822278061842084 C() {
        H12843822278061842084 h12843822278061842084;
        synchronized (H12843822278061842084.class) {
            h12843822278061842084 = c;
            if (h12843822278061842084 == null) {
                h12843822278061842084 = new H12843822278061842084((byte) 0, false);
                c = h12843822278061842084;
            }
        }
        return h12843822278061842084;
    }

    public static H12843822278061842084 D() {
        if (g == null) {
            synchronized (f) {
                try {
                    if (g == null) {
                        g = new H12843822278061842084((byte) 2);
                    }
                } finally {
                }
            }
        }
        H12843822278061842084 h12843822278061842084 = g;
        M18113111391818111737.v(h12843822278061842084);
        return h12843822278061842084;
    }

    public P11546267793636643785 A(int i2) {
        return null;
    }

    public L13148442655056575112 B() {
        D3638978315442423989 a = D3638978315442423989.a();
        if (a.c() == 1) {
            return new Y10675828910133495542(true);
        }
        V697849047308847220 t = V4416135141588678913.t(Boolean.FALSE);
        a.h(new U17836651770749089936(t, this));
        return t;
    }

    public void E(float f2, float f3, float f4, float f5) {
        Q7316561721656982910 q7316561721656982910 = (Q7316561721656982910) this.b;
        V1715405128288489768 A = q7316561721656982910.A();
        float intBitsToFloat = Float.intBitsToFloat((int) (q7316561721656982910.F() >> 32)) - (f4 + f2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (q7316561721656982910.F() & 4294967295L)) - (f5 + f3);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            U6129583139759812404.a("Width and height must be greater than or equal to zero");
        }
        q7316561721656982910.P(floatToRawIntBits);
        A.i(f2, f3);
    }

    public boolean F(int i2, int i3, Bundle bundle) {
        return false;
    }

    public void G(float f2, long j2) {
        V1715405128288489768 A = ((Q7316561721656982910) this.b).A();
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        A.i(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        A.f(f2);
        A.i(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
    }

    public void H(float f2, float f3, long j2) {
        V1715405128288489768 A = ((Q7316561721656982910) this.b).A();
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        A.i(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        A.d(f2, f3);
        A.i(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
    }

    public void I(float f2, float f3) {
        ((Q7316561721656982910) this.b).A().i(f2, f3);
    }

    public void J(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        if ((serviceConnection instanceof F14087932618967811298) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public void K(int i2, Object obj, B8838962141159673445 b8838962141159673445) {
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) this.b;
        w12822723367527402820.B(i2, 3);
        b8838962141159673445.h((E10304945778167701561) obj, w12822723367527402820.a);
        w12822723367527402820.B(i2, 4);
    }

    public void L(int i2, Object obj, Y3341182438442346389 y3341182438442346389) {
        E890218321994133736 e890218321994133736 = (E890218321994133736) obj;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) this.b;
        a5011514514014580540.t(i2, 2);
        a5011514514014580540.v(e890218321994133736.b(y3341182438442346389));
        y3341182438442346389.h(e890218321994133736, this);
    }

    public boolean M(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((G8478591149424363700.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof F14087932618967811298) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    @Override // dev.epro.r0.C546526958440023066
    public void a(T8605657386197958581 t8605657386197958581, boolean z) {
        if (t8605657386197958581 instanceof Q7493219842314740732) {
            ((Q7493219842314740732) t8605657386197958581).z.k().c(false);
        }
        C546526958440023066 c546526958440023066 = ((T1878852318042345820) this.b).e;
        if (c546526958440023066 != null) {
            c546526958440023066.a(t8605657386197958581, z);
        }
    }

    @Override // dev.epro.r0.C546526958440023066
    public boolean b(T8605657386197958581 t8605657386197958581) {
        T1878852318042345820 t1878852318042345820 = (T1878852318042345820) this.b;
        if (t8605657386197958581 == t1878852318042345820.c) {
            return false;
        }
        I4217019646703278835 i4217019646703278835 = ((Q7493219842314740732) t8605657386197958581).A;
        C546526958440023066 c546526958440023066 = t1878852318042345820.e;
        if (c546526958440023066 != null) {
            return c546526958440023066.b(t8605657386197958581);
        }
        return false;
    }

    @Override // dev.epro.r0.G17207421659529280019
    public P16142420860494385953 build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.b).build();
        return new P16142420860494385953(new H12843822278061842084(build));
    }

    @Override // dev.epro.r0.J8575954267469244926
    public int c() {
        int source;
        source = ((ContentInfo) this.b).getSource();
        return source;
    }

    @Override // dev.epro.r0.H14091617879526365106
    public void d(T8605657386197958581 t8605657386197958581, MenuItem menuItem) {
        ((T16502368487833955839) this.b).f.removeCallbacksAndMessages(t8605657386197958581);
    }

    @Override // dev.epro.r0.J8575954267469244926
    public ClipData e() {
        ClipData clip;
        clip = ((ContentInfo) this.b).getClip();
        return clip;
    }

    @Override // dev.epro.r0.S17787728937930228535
    public void f(T8605657386197958581 t8605657386197958581) {
        E3501342855209648231 e3501342855209648231 = ((ActionMenuView) this.b).u;
        if (e3501342855209648231 != null) {
            e3501342855209648231.f(t8605657386197958581);
        }
    }

    @Override // dev.epro.r0.G12238198644913880576
    public void g(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            ((Method) this.b).invoke(th, th2);
        } catch (Throwable unused) {
            Logger logger = T9539921337775422672.a;
            Level level = Level.WARNING;
            Objects.toString(closeable);
            logger.getClass();
        }
    }

    @Override // dev.epro.r0.G10797274810599614742
    public void i(B6867906687934285025 b6867906687934285025) {
        boolean z = b6867906687934285025.e == 0;
        E1636901823844057514 e1636901823844057514 = (E1636901823844057514) this.b;
        if (z) {
            e1636901823844057514.getRemoteService(null, e1636901823844057514.getScopes());
        } else if (e1636901823844057514.zzl() != null) {
            e1636901823844057514.zzl().onConnectionFailed(b6867906687934285025);
        }
    }

    @Override // dev.epro.r0.U2582504393267961583
    public float j(float f2, float f3) {
        return 0.0f;
    }

    @Override // dev.epro.r0.A13182230205880306765
    public long k(I11366018238968599357 i11366018238968599357, long j2, F10342546226345611902 f10342546226345611902, long j3) {
        return (U16229988784104357932.v(true, i11366018238968599357.b + ((int) (r0 & 4294967295L)), (int) (j3 & 4294967295L), (int) (j2 & 4294967295L)) & 4294967295L) | (U16229988784104357932.v(f10342546226345611902 == F10342546226345611902.a, i11366018238968599357.a + ((int) (((Q2551293802323679034) ((B13729205492206812220) this.b).invoke()).a >> 32)), (int) (j3 >> 32), (int) (j2 >> 32)) << 32);
    }

    @Override // dev.epro.r0.S17787728937930228535
    public boolean l(T8605657386197958581 t8605657386197958581, MenuItem menuItem) {
        P11864007600649976263 p11864007600649976263 = ((ActionMenuView) this.b).z;
        if (p11864007600649976263 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((E3501342855209648231) p11864007600649976263).a.G.d).iterator();
        while (it.hasNext()) {
            if (((F5958934288633973125) it.next()).a.n()) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.J8575954267469244926
    public int m() {
        int flags;
        flags = ((ContentInfo) this.b).getFlags();
        return flags;
    }

    @Override // dev.epro.r0.J8575954267469244926
    public ContentInfo n() {
        return (ContentInfo) this.b;
    }

    @Override // dev.epro.r0.R17143752899285419206
    public int p(int i2) {
        J2109124760844406430 j2109124760844406430 = (J2109124760844406430) this.b;
        if (i2 <= j2109124760844406430.b - 1) {
            return i2;
        }
        if (i2 <= j2109124760844406430.c - 1) {
            return i2 - 1;
        }
        int i3 = j2109124760844406430.d;
        return i2 <= i3 + 1 ? i2 - 2 : i3;
    }

    @Override // dev.epro.r0.G17207421659529280019
    public void q(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // dev.epro.r0.H14091617879526365106
    public void r(T8605657386197958581 t8605657386197958581, I4217019646703278835 i4217019646703278835) {
        T16502368487833955839 t16502368487833955839 = (T16502368487833955839) this.b;
        Handler handler = t16502368487833955839.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = t16502368487833955839.h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (t8605657386197958581 == ((A15735106322894363321) arrayList.get(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        handler.postAtTime(new I3522225526927885074(this, i3 < arrayList.size() ? (A15735106322894363321) arrayList.get(i3) : null, i4217019646703278835, t8605657386197958581), t8605657386197958581, SystemClock.uptimeMillis() + 200);
    }

    @Override // dev.epro.r0.R17143752899285419206
    public int s(int i2) {
        J2109124760844406430 j2109124760844406430 = (J2109124760844406430) this.b;
        if (i2 < j2109124760844406430.b) {
            return i2;
        }
        if (i2 < j2109124760844406430.c) {
            return i2 + 1;
        }
        int i3 = j2109124760844406430.d;
        return i2 <= i3 ? i2 + 2 : i3 + 2;
    }

    @Override // dev.epro.r0.G17207421659529280019
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    @Override // dev.epro.r0.U2582504393267961583
    public float t(float f2) {
        return ((V10300877997588547986) this.b).t(f2);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bradford";
            case 24:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // dev.epro.r0.N9606265891541456973
    public Object v(A7868207189447841291 a7868207189447841291, Float f2, Float f3, F4096073349764486348 f4096073349764486348, E14296708806979853694 e14296708806979853694) {
        Object k = U1554499319261669842.k(a7868207189447841291, f2.floatValue(), B5998207562248239613.a(0.0f, f3.floatValue(), 28), (X14364139104409853146) this.b, f4096073349764486348, e14296708806979853694);
        return k == Z3437138737604933638.a ? k : (U17540031421654684319) k;
    }

    @Override // dev.epro.r0.G17207421659529280019
    public void w(int i2) {
        ((ContentInfo.Builder) this.b).setFlags(i2);
    }

    public P11546267793636643785 y(int i2) {
        return null;
    }

    public void z() {
        ((Y5209789131793062978) this.b).getClass();
    }

    @Override // dev.epro.r0.D10104483913663276389
    public void h(int i2) {
    }

    @Override // dev.epro.r0.D10104483913663276389
    public void o(int i2) {
    }

    @Override // dev.epro.r0.D10104483913663276389
    public void u(int i2, float f2) {
    }

    public /* synthetic */ H12843822278061842084(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ H12843822278061842084(byte b, boolean z) {
        this.a = b;
    }

    public H12843822278061842084(E1636901823844057514 e1636901823844057514) {
        this.a = (byte) 14;
        Objects.requireNonNull(e1636901823844057514);
        this.b = e1636901823844057514;
    }

    public H12843822278061842084(A5011514514014580540 a5011514514014580540) {
        this.a = (byte) 19;
        Charset charset = S15638288480382345131.a;
        this.b = a5011514514014580540;
        a5011514514014580540.a = this;
    }

    public H12843822278061842084(W12822723367527402820 w12822723367527402820) {
        this.a = (byte) 20;
        Charset charset = A9187767737237685029.a;
        this.b = w12822723367527402820;
        w12822723367527402820.a = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r7 == r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[LOOP:1: B:14:0x0047->B:15:0x0049, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H12843822278061842084(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 13
            r0.a = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            dev.epro.r0.R17217466126009103756[][] r4 = new dev.epro.r0.R17217466126009103756[r2][]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L6b
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r11) goto L31
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 == r10) goto L2a
            r10 = 5
            if (r9 == r10) goto L2a
            r13 = r8
            goto L35
        L2a:
            r13 = r10
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r13 = r7
            goto L35
        L31:
            r7 = r11
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            dev.epro.r0.R17217466126009103756[] r11 = new dev.epro.r0.R17217466126009103756[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            dev.epro.r0.R17217466126009103756 r12 = new dev.epro.r0.R17217466126009103756
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L47
        L65:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L14
        L6b:
            r0.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H12843822278061842084.<init>(int[], float[], float[][]):void");
    }

    public H12843822278061842084(int i2, long j2) {
        this.a = (byte) 22;
        TimeUnit.MINUTES.getClass();
        M10634075818626712574 m10634075818626712574 = M10634075818626712574.k;
        m10634075818626712574.getClass();
        this.b = new J9884070742191057945(m10634075818626712574, i2, j2);
    }

    public H12843822278061842084(ContentInfo contentInfo) {
        this.a = (byte) 24;
        contentInfo.getClass();
        this.b = Y8324723668087979953.g(contentInfo);
    }

    public H12843822278061842084(ClipData clipData, int i2) {
        this.a = (byte) 23;
        this.b = Y8324723668087979953.e(clipData, i2);
    }

    public H12843822278061842084(BottomSheetBehavior bottomSheetBehavior) {
        this.a = (byte) 15;
        this.b = bottomSheetBehavior;
        new U3594978070141619353((Object) this, (byte) 2);
    }

    public void x(int i2, P11546267793636643785 p11546267793636643785, String str, Bundle bundle) {
    }
}
