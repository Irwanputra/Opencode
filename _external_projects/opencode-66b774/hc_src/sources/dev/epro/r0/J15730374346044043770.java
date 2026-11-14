package dev.epro.r0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J15730374346044043770 implements L6498280162989651404, Y16209271193599430318, I3673563500665330592, Y14924988016309632925, B18329032920392634747 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public J15730374346044043770(U1644378183406225904 u1644378183406225904) {
        this.a = (byte) 22;
        K1309202645837547483 k1309202645837547483 = new K1309202645837547483();
        byte b = 27;
        T15504973625601650233 t15504973625601650233 = new T15504973625601650233(b);
        HashMap hashMap = k1309202645837547483.a;
        hashMap.put(String.class, t15504973625601650233);
        byte b2 = 24;
        hashMap.put(Boolean.class, new J3301701597851028733(b2));
        hashMap.put(Character.class, new T15504973625601650233(b));
        hashMap.put(UUID.class, new E17149812035295265804(b));
        byte b3 = 25;
        hashMap.put(byte[].class, new M10846389789027735899(b3));
        byte b4 = 26;
        J3301701597851028733 j3301701597851028733 = new J3301701597851028733(b4);
        hashMap.put(short[].class, j3301701597851028733);
        hashMap.put(int[].class, j3301701597851028733);
        hashMap.put(long[].class, j3301701597851028733);
        hashMap.put(float[].class, j3301701597851028733);
        hashMap.put(double[].class, j3301701597851028733);
        hashMap.put(char[].class, j3301701597851028733);
        hashMap.put(boolean[].class, j3301701597851028733);
        E17149812035295265804 e17149812035295265804 = new E17149812035295265804(b4);
        LinkedHashMap linkedHashMap = k1309202645837547483.b;
        linkedHashMap.put(Number.class, e17149812035295265804);
        linkedHashMap.put(List.class, new M10846389789027735899(b4));
        linkedHashMap.put(Map.class, new T15504973625601650233(b4));
        linkedHashMap.put(Set.class, new M10846389789027735899(b));
        linkedHashMap.put(Iterator.class, new J3301701597851028733(b3));
        linkedHashMap.put(new Object[0].getClass(), new E17149812035295265804(b2));
        linkedHashMap.put(Date.class, new T15504973625601650233(b3));
        linkedHashMap.put(Enum.class, new E17149812035295265804(b3));
        linkedHashMap.put(Calendar.class, new T15504973625601650233(b3));
        new HashMap();
        k1309202645837547483.c = Q3209512064461050809.PLAIN;
        Map map = Collections.EMPTY_MAP;
        hashMap.put(null, new M10846389789027735899(b2));
        Q3209512064461050809 q3209512064461050809 = k1309202645837547483.c;
        if (k1309202645837547483.d == null) {
            k1309202645837547483.d = new E17149812035295265804();
        }
        J7183379813836568005 j7183379813836568005 = u1644378183406225904.n;
        C9495331981145830184 c9495331981145830184 = new C9495331981145830184();
        c9495331981145830184.a = new HashMap();
        c9495331981145830184.a(Q3622318280241842965.l, C9495331981145830184.b, "yYnNtTfFoO", 10);
        c9495331981145830184.a(Q3622318280241842965.i, C9495331981145830184.d, "-+0123456789", 1024);
        c9495331981145830184.a(Q3622318280241842965.j, C9495331981145830184.c, "-+0123456789.", 1024);
        c9495331981145830184.a(Q3622318280241842965.d, C9495331981145830184.e, "<", 10);
        Q3622318280241842965 q3622318280241842965 = Q3622318280241842965.m;
        c9495331981145830184.a(q3622318280241842965, C9495331981145830184.f, "~nN\u0000", 10);
        c9495331981145830184.a(q3622318280241842965, C9495331981145830184.g, null, 10);
        c9495331981145830184.a(Q3622318280241842965.k, C9495331981145830184.h, "0123456789", 50);
        c9495331981145830184.a(Q3622318280241842965.c, C9495331981145830184.i, "!&*", 10);
        if (!u1644378183406225904.j) {
            E17149812035295265804 e171498120352952658042 = k1309202645837547483.d;
            if (e171498120352952658042 == null) {
                e171498120352952658042 = new E17149812035295265804();
                k1309202645837547483.d = e171498120352952658042;
            }
            u1644378183406225904.i = e171498120352952658042;
            u1644378183406225904.j = true;
            Iterator it = u1644378183406225904.m.values().iterator();
            while (it.hasNext()) {
                ((C9513563470267509397) it.next()).getClass();
            }
        } else if (!k1309202645837547483.e) {
            E17149812035295265804 e171498120352952658043 = u1644378183406225904.i;
            if (e171498120352952658043 == null) {
                e171498120352952658043 = new E17149812035295265804();
                u1644378183406225904.i = e171498120352952658043;
            }
            k1309202645837547483.d = e171498120352952658043;
            k1309202645837547483.e = true;
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                ((C9513563470267509397) it2.next()).getClass();
            }
        }
        this.e = u1644378183406225904;
        u1644378183406225904.k = j7183379813836568005.a;
        u1644378183406225904.l = true;
        k1309202645837547483.c = q3209512064461050809;
        if (k1309202645837547483.d == null) {
            k1309202645837547483.d = new E17149812035295265804();
        }
        this.b = j7183379813836568005;
        this.c = c9495331981145830184;
        this.d = "Yaml:" + System.identityHashCode(this);
    }

    public static void R(J15730374346044043770 j15730374346044043770, C12173677222265696772 c12173677222265696772, C12173677222265696772 c121736772222656967722, int i) {
        F6942723054099263096 f6942723054099263096;
        if ((i & 1) != 0) {
            c12173677222265696772 = null;
        }
        if ((i & 4) != 0) {
            c121736772222656967722 = null;
        }
        j15730374346044043770.getClass();
        TimeZone timeZone = C14766148968941961570.a;
        boolean isShutdown = j15730374346044043770.z().isShutdown();
        synchronized (j15730374346044043770) {
            if (c121736772222656967722 != null) {
                try {
                    c121736772222656967722.b.decrementAndGet();
                    if (!((ArrayDeque) j15730374346044043770.e).remove(c121736772222656967722)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c12173677222265696772 != null) {
                ((ArrayDeque) j15730374346044043770.d).add(c12173677222265696772);
                C12173677222265696772 B = j15730374346044043770.B(c12173677222265696772.c.b.a.d);
                if (B != null) {
                    c12173677222265696772.b = B.b;
                }
            }
            if (c121736772222656967722 != null && (isShutdown || ((ArrayDeque) j15730374346044043770.e).isEmpty())) {
                ((ArrayDeque) j15730374346044043770.b).isEmpty();
            }
            byte b = 3;
            if (isShutdown) {
                List d1 = R9411874267597469228.d1((ArrayDeque) j15730374346044043770.d);
                ((ArrayDeque) j15730374346044043770.d).clear();
                f6942723054099263096 = new F6942723054099263096(d1, b);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) j15730374346044043770.d).iterator();
                it.getClass();
                while (it.hasNext()) {
                    C12173677222265696772 c121736772222656967723 = (C12173677222265696772) it.next();
                    if (((ArrayDeque) j15730374346044043770.e).size() >= 64) {
                        break;
                    }
                    if (c121736772222656967723.b.get() < 5) {
                        it.remove();
                        c121736772222656967723.b.incrementAndGet();
                        arrayList.add(c121736772222656967723);
                        ((ArrayDeque) j15730374346044043770.e).add(c121736772222656967723);
                    }
                }
                f6942723054099263096 = new F6942723054099263096(arrayList, b);
            }
        }
        int size = ((List) f6942723054099263096.b).size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            C12173677222265696772 c121736772222656967724 = (C12173677222265696772) ((List) f6942723054099263096.b).get(i2);
            if (c121736772222656967724 == c12173677222265696772) {
                z = false;
            } else {
                c121736772222656967724.c.d.getClass();
            }
            if (isShutdown) {
                c121736772222656967724.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                V5252629055842691065 v5252629055842691065 = c121736772222656967724.c;
                v5252629055842691065.h(interruptedIOException);
                c121736772222656967724.a.onFailure(v5252629055842691065, interruptedIOException);
            } else {
                ExecutorService z2 = j15730374346044043770.z();
                c121736772222656967724.getClass();
                V5252629055842691065 v52526290558426910652 = c121736772222656967724.c;
                v52526290558426910652.a.a.getClass();
                try {
                    try {
                        z2.execute(c121736772222656967724);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        V5252629055842691065 v52526290558426910653 = c121736772222656967724.c;
                        v52526290558426910653.h(interruptedIOException2);
                        c121736772222656967724.a.onFailure(v52526290558426910653, interruptedIOException2);
                        J15730374346044043770 j157303743460440437702 = v52526290558426910652.a.a;
                        j157303743460440437702.getClass();
                        R(j157303743460440437702, null, c121736772222656967724, 3);
                    }
                } catch (Throwable th2) {
                    J15730374346044043770 j157303743460440437703 = v52526290558426910652.a.a;
                    j157303743460440437703.getClass();
                    R(j157303743460440437703, null, c121736772222656967724, 3);
                    throw th2;
                }
            }
        }
        if (!z || c12173677222265696772 == null) {
            return;
        }
        c12173677222265696772.c.d.getClass();
    }

    public static void k(J15730374346044043770 j15730374346044043770, Y10166432356890198008 y10166432356890198008) {
        j15730374346044043770.getClass();
        y10166432356890198008.getClass();
        if (((K18075763046227786881) j15730374346044043770.e).a(y10166432356890198008)) {
            X3172131531941125810 x3172131531941125810 = (X3172131531941125810) j15730374346044043770.d;
            if (y10166432356890198008.e != null) {
                K2042933864045806308.l("Handler '", y10166432356890198008, "' is already registered with a dispatcher");
                return;
            }
            x3172131531941125810.e.addFirst(y10166432356890198008);
            y10166432356890198008.e = j15730374346044043770;
            x3172131531941125810.b();
        }
    }

    public C13374971588771233833 A(String str) {
        B11652692535345282996 b11652692535345282996 = (B11652692535345282996) ((HashMap) this.d).get(str);
        if (b11652692535345282996 != null) {
            return b11652692535345282996.c;
        }
        return null;
    }

    public C12173677222265696772 B(String str) {
        Iterator it = ((ArrayDeque) this.e).iterator();
        it.getClass();
        while (it.hasNext()) {
            C12173677222265696772 c12173677222265696772 = (C12173677222265696772) it.next();
            if (S10823041268949770285.t(c12173677222265696772.c.b.a.d, str)) {
                return c12173677222265696772;
            }
        }
        Iterator it2 = ((ArrayDeque) this.d).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            C12173677222265696772 c121736772222656967722 = (C12173677222265696772) it2.next();
            if (S10823041268949770285.t(c121736772222656967722.c.b.a.d, str)) {
                return c121736772222656967722;
            }
        }
        return null;
    }

    public C13374971588771233833 C(String str) {
        for (B11652692535345282996 b11652692535345282996 : ((HashMap) this.d).values()) {
            if (b11652692535345282996 != null) {
                C13374971588771233833 c13374971588771233833 = b11652692535345282996.c;
                if (!str.equals(c13374971588771233833.e)) {
                    c13374971588771233833 = c13374971588771233833.t.c.C(str);
                }
                if (c13374971588771233833 != null) {
                    return c13374971588771233833;
                }
            }
        }
        return null;
    }

    public A8443250024445789105 D(F3205875925450835131 f3205875925450835131) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            A8443250024445789105 a8443250024445789105 = (A8443250024445789105) arrayList.get(i);
            if (a8443250024445789105 != null && a8443250024445789105.b == f3205875925450835131) {
                return a8443250024445789105;
            }
        }
        A8443250024445789105 a84432500244457891052 = new A8443250024445789105((Context) this.d, f3205875925450835131);
        arrayList.add(a84432500244457891052);
        return a84432500244457891052;
    }

    public ArrayList E() {
        ArrayList arrayList = new ArrayList();
        for (B11652692535345282996 b11652692535345282996 : ((HashMap) this.d).values()) {
            if (b11652692535345282996 != null) {
                arrayList.add(b11652692535345282996);
            }
        }
        return arrayList;
    }

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        for (B11652692535345282996 b11652692535345282996 : ((HashMap) this.d).values()) {
            if (b11652692535345282996 != null) {
                arrayList.add(b11652692535345282996.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List G() {
        ArrayList arrayList;
        if (((ArrayList) this.c).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.c)) {
            arrayList = new ArrayList((ArrayList) this.c);
        }
        return arrayList;
    }

    public List H() {
        List list = (List) this.e;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            W10545060672287394780 w10545060672287394780 = (W10545060672287394780) this.c;
            arrayList.add(W10545060672287394780.a(d, w10545060672287394780.b, w10545060672287394780.c));
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        this.e = unmodifiableList;
        return unmodifiableList;
    }

    public List I() {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(H());
        arrayList2.add((W10545060672287394780) this.c);
        Collections.sort(arrayList2, Comparator.comparing(new H10891550656504408564(this, (byte) 14), new M5459415309190684092((byte) 10)));
        this.d = arrayList2;
        return arrayList2;
    }

    public double J(W10545060672287394780 w10545060672287394780) {
        double doubleValue = ((Double) ((HashMap) K()).get((W10545060672287394780) ((ArrayList) I()).get(((ArrayList) I()).size() - 1))).doubleValue() - ((Double) ((HashMap) K()).get((W10545060672287394780) ((ArrayList) I()).get(0))).doubleValue();
        double doubleValue2 = ((Double) ((HashMap) K()).get(w10545060672287394780)).doubleValue() - ((Double) ((HashMap) K()).get((W10545060672287394780) ((ArrayList) I()).get(0))).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    public Map K() {
        HashMap hashMap = (HashMap) this.b;
        if (hashMap != null) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(H());
        arrayList.add((W10545060672287394780) this.c);
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            int i2 = i + 1;
            W10545060672287394780 w10545060672287394780 = (W10545060672287394780) obj;
            int i3 = w10545060672287394780.d;
            double O = S2941385686793915703.O((i3 >> 16) & 255);
            double O2 = S2941385686793915703.O((i3 >> 8) & 255);
            double O3 = S2941385686793915703.O(i3 & 255);
            double[][] dArr = S2941385686793915703.g;
            double[] dArr2 = dArr[c];
            double d = (dArr2[2] * O3) + (dArr2[1] * O2) + (dArr2[c] * O);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * O3) + (dArr3[1] * O2) + (dArr3[c] * O);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * O3) + (dArr4[1] * O2) + (dArr4[c] * O);
            double[] dArr5 = S2941385686793915703.h;
            double d4 = d / dArr5[c];
            double d5 = d2 / dArr5[1];
            double d6 = d3 / dArr5[2];
            double N = S2941385686793915703.N(d4);
            double N2 = S2941385686793915703.N(d5);
            double d7 = (116.0d * N2) - 16.0d;
            double d8 = (N - N2) * 500.0d;
            double N3 = (N2 - S2941385686793915703.N(d6)) * 200.0d;
            double[] dArr6 = new double[3];
            dArr6[c] = d7;
            dArr6[1] = d8;
            dArr6[2] = N3;
            double degrees = Math.toDegrees(Math.atan2(dArr6[2], dArr6[1])) % 360.0d;
            if (degrees < 0.0d) {
                degrees += 360.0d;
            }
            double pow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d9 = (degrees - 50.0d) % 360.0d;
            if (d9 < 0.0d) {
                d9 += 360.0d;
            }
            hashMap2.put(w10545060672287394780, Double.valueOf((Math.cos(Math.toRadians(d9)) * pow) - 0.5d));
            i = i2;
            c = 0;
        }
        this.b = hashMap2;
        return hashMap2;
    }

    public J14024120050125738337 L(V6281043481934004271 v6281043481934004271, String str) {
        J14024120050125738337 j14024120050125738337;
        J14024120050125738337 a;
        synchronized (((O12545633033254628644) this.b)) {
            try {
                j14024120050125738337 = (J14024120050125738337) ((L3530692241870850490) this.c).a.get(str);
                if (v6281043481934004271.d(j14024120050125738337)) {
                    Q15796038708469204840 q15796038708469204840 = (Q15796038708469204840) this.d;
                    if (q15796038708469204840 instanceof E15463216210730020934) {
                        E15463216210730020934 e15463216210730020934 = (E15463216210730020934) q15796038708469204840;
                        j14024120050125738337.getClass();
                        R3192876217964974737 r3192876217964974737 = e15463216210730020934.d;
                        if (r3192876217964974737 != null) {
                            V10300877997588547986 v10300877997588547986 = e15463216210730020934.e;
                            v10300877997588547986.getClass();
                            S2941385686793915703.v(j14024120050125738337, v10300877997588547986, r3192876217964974737);
                        }
                    }
                    j14024120050125738337.getClass();
                } else {
                    X8580441079827879338 x8580441079827879338 = new X8580441079827879338((L14576235570718031614) this.e);
                    x8580441079827879338.a.put(Z860808776098365610.k, str);
                    Q15796038708469204840 q157960387084692048402 = (Q15796038708469204840) this.d;
                    q157960387084692048402.getClass();
                    try {
                        try {
                            a = q157960387084692048402.c(v6281043481934004271, x8580441079827879338);
                        } catch (AbstractMethodError unused) {
                            a = q157960387084692048402.a(U16229988784104357932.H(v6281043481934004271));
                        }
                    } catch (AbstractMethodError unused2) {
                        a = q157960387084692048402.b(U16229988784104357932.H(v6281043481934004271), x8580441079827879338);
                    }
                    j14024120050125738337 = a;
                    L3530692241870850490 l3530692241870850490 = (L3530692241870850490) this.c;
                    l3530692241870850490.getClass();
                    j14024120050125738337.getClass();
                    J14024120050125738337 j140241200501257383372 = (J14024120050125738337) l3530692241870850490.a.put(str, j14024120050125738337);
                    if (j140241200501257383372 != null) {
                        j140241200501257383372.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j14024120050125738337;
    }

    public Q10674749373141604055 M(String str) {
        F7278720905790609885 f7278720905790609885 = new F7278720905790609885(new StringReader(str));
        J7183379813836568005 j7183379813836568005 = (J7183379813836568005) this.b;
        ((U1644378183406225904) this.e).d = new W14208766909380660198(new X7021780317955852078(f7278720905790609885, j7183379813836568005), (C9495331981145830184) this.c, j7183379813836568005);
        byte b = 1;
        return new Q10674749373141604055(new L8747532038827245841(this, b), b);
    }

    public void N(B11652692535345282996 b11652692535345282996) {
        C13374971588771233833 c13374971588771233833 = b11652692535345282996.c;
        String str = c13374971588771233833.e;
        HashMap hashMap = (HashMap) this.d;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(c13374971588771233833.e, b11652692535345282996);
    }

    public void O(B11652692535345282996 b11652692535345282996) {
        C13374971588771233833 c13374971588771233833 = b11652692535345282996.c;
        if (c13374971588771233833.A) {
            J12447903228903363333 j12447903228903363333 = (J12447903228903363333) this.b;
            if (!j12447903228903363333.g) {
                j12447903228903363333.b.remove(c13374971588771233833.e);
            }
        }
    }

    public boolean P(F3205875925450835131 f3205875925450835131, MenuItem menuItem) {
        return ((ActionMode.Callback) this.c).onActionItemClicked(D(f3205875925450835131), new H2233650693096395599((Context) this.d, (M13863035574364816451) menuItem));
    }

    public boolean Q(F3205875925450835131 f3205875925450835131, T8605657386197958581 t8605657386197958581) {
        ActionMode.Callback callback = (ActionMode.Callback) this.c;
        A8443250024445789105 D = D(f3205875925450835131);
        W929662112881511578 w929662112881511578 = (W929662112881511578) this.b;
        Menu menu = (Menu) w929662112881511578.get(t8605657386197958581);
        if (menu == null) {
            menu = new C2329263103474904727((Context) this.d, t8605657386197958581);
            w929662112881511578.put(t8605657386197958581, menu);
        }
        return callback.onCreateActionMode(D, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r10.c(r1) == r7) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x005b, B:29:0x0065), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r2v3, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r9v0, types: [dev.epro.r0.J15730374346044043770] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(dev.epro.r0.K14749510448791472029 r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            dev.epro.r0.A18119328133183277592 r0 = (dev.epro.r0.A18119328133183277592) r0
            boolean r1 = r10 instanceof dev.epro.r0.S13952299053668026580
            if (r1 == 0) goto L17
            r1 = r10
            dev.epro.r0.S13952299053668026580 r1 = (dev.epro.r0.S13952299053668026580) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.w = r2
            goto L1c
        L17:
            dev.epro.r0.S13952299053668026580 r1 = new dev.epro.r0.S13952299053668026580
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.u
            int r2 = r1.w
            r3 = 2
            r4 = 1
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L35
            dev.epro.r0.R8015591507171738907 r9 = r1.t
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L33
            goto L71
        L33:
            r10 = move-exception
            goto L7c
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r6
        L3b:
            dev.epro.r0.R8015591507171738907 r2 = r1.t
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r2
            goto L5b
        L42:
            dev.epro.r0.E17665849472693074628.k(r10)
            boolean r10 = r0.p()
            if (r10 == 0) goto L4c
            return r5
        L4c:
            java.lang.Object r10 = r9.c
            dev.epro.r0.H15186625828076266306 r10 = (dev.epro.r0.H15186625828076266306) r10
            r1.t = r10
            r1.w = r4
            java.lang.Object r2 = r10.c(r1)
            if (r2 != r7) goto L5b
            goto L6f
        L5b:
            boolean r2 = r0.p()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L65
            r10.b(r6)
            return r5
        L65:
            r1.t = r10     // Catch: java.lang.Throwable -> L78
            r1.w = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = r9.y(r1)     // Catch: java.lang.Throwable -> L78
            if (r9 != r7) goto L70
        L6f:
            return r7
        L70:
            r9 = r10
        L71:
            r0.S(r5)     // Catch: java.lang.Throwable -> L33
            r9.b(r6)
            return r5
        L78:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L7c:
            r9.b(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15730374346044043770.S(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public void T() {
        this.c = 12;
    }

    public void U(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public void V(int i) {
        switch (this.a) {
            case 1:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.b = Integer.valueOf(i);
                return;
            default:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.b = Integer.valueOf(i);
                return;
        }
    }

    public void W() {
        switch (this.a) {
            case 1:
                this.d = 16;
                break;
            default:
                this.d = 16;
                break;
        }
    }

    public void X() {
        try {
            U3506079075055770632 u3506079075055770632 = new U3506079075055770632(this, (byte) 0);
            this.d = u3506079075055770632;
            u3506079075055770632.setDaemon(true);
            ((U3506079075055770632) this.d).setName((String) ((Y9819334540737372388) this.b).get());
            ((U3506079075055770632) this.d).start();
        } catch (OutOfMemoryError e) {
            this.d = null;
            ((Vector) this.c).removeAllElements();
            Z3383101362411723454.q("Could not start asynchronous SSH sender", e);
        }
    }

    public void Y(Y1086209215650239921 y1086209215650239921) {
        if (((Y15332629801367963516) this.d) == Y15332629801367963516.b) {
            Y4989033692226475498 y4989033692226475498 = (Y4989033692226475498) this.c;
            if (y4989033692226475498 == null) {
                S10973172697741180971.m("layoutCoordinates not set");
                return;
            }
            D15913187640519482289.I(y1086209215650239921, y4989033692226475498.O(0L), new H8734584053421516944(this.b, (byte) 14), true);
        }
        this.d = Y15332629801367963516.c;
    }

    public void Z(X5127101262035123109 x5127101262035123109) {
        x5127101262035123109.getClass();
        Q9622116641457785369 q9622116641457785369 = new Q9622116641457785369(this, x5127101262035123109, (byte) 15);
        synchronized (this.e) {
        }
        ((Handler) ((F6942723054099263096) this.c).b).postDelayed(q9622116641457785369, 5400000L);
    }

    public J15730374346044043770 a0() {
        return new J15730374346044043770((Y15841630011871852334) ((D9201356603168736774) this.c).h(), ((M1458640882343060544) this.d).h(), (G5446205426701161097) ((D9201356603168736774) this.e).h(), (A7202329723792933819) ((D9201356603168736774) this.b).h(), (byte) 29);
    }

    @Override // dev.epro.r0.V9266657454036696449
    public long b(Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        int b = z13251062865217617579.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((R5827688671290015495) this.c).get(i).b(z13251062865217617579.a(i), z132510628652176175792.a(i), z132510628652176175793.a(i)));
        }
        return j;
    }

    public Y16414919402539525744 b0(D1357656567758640121 d1357656567758640121) {
        int i;
        int i2;
        String str;
        G5446205426701161097 g5446205426701161097 = (G5446205426701161097) this.e;
        A7202329723792933819 a7202329723792933819 = (A7202329723792933819) this.b;
        int i3 = d1357656567758640121.g;
        g5446205426701161097.b.edit().putBoolean("is_pub_misconfigured", i3 == 8).commit();
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        byte b = 3;
        switch (i4) {
            case 1:
            case 2:
            case 3:
                i = 3;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 1;
                break;
            case 6:
                throw new I10210771329789820200(1, "Invalid response from server: ".concat(String.valueOf(d1357656567758640121.c)));
            case 7:
                throw new I10210771329789820200(3, "Publisher misconfiguration: ".concat(String.valueOf(d1357656567758640121.c)));
            default:
                throw new I10210771329789820200(1, "Invalid response from server.");
        }
        int i5 = d1357656567758640121.h;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 == 1) {
            i2 = 3;
        } else {
            if (i6 != 2) {
                throw new I10210771329789820200(1, "Invalid response from server.");
            }
            i2 = 2;
        }
        String str2 = d1357656567758640121.a;
        O3923701449542713850 o3923701449542713850 = str2 == null ? null : new O3923701449542713850(d1357656567758640121.b, str2);
        a7202329723792933819.a.set(d1357656567758640121.f);
        g5446205426701161097.b.edit().putStringSet("stored_info", new HashSet(d1357656567758640121.d)).commit();
        for (O15088527058212365015 o15088527058212365015 : d1357656567758640121.e) {
            int i7 = o15088527058212365015.b;
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == 0) {
                str = null;
            } else if (i8 == 1) {
                str = "write";
            } else {
                if (i8 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                Y15841630011871852334 y15841630011871852334 = (Y15841630011871852334) this.c;
                String str3 = o15088527058212365015.a;
                Y14924988016309632925[] y14924988016309632925Arr = {(J15730374346044043770) this.d};
                y15841630011871852334.getClass();
                y15841630011871852334.a.execute(new F16393152783805540385(str, str3, y14924988016309632925Arr, b));
            }
        }
        return new Y16414919402539525744(i, i2, o3923701449542713850);
    }

    @Override // dev.epro.r0.L6498280162989651404
    public S7370861580758580261 c() {
        return (U9281124989019192072) this.e;
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 d(Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        Z13251062865217617579 z132510628652176175794 = (Z13251062865217617579) this.b;
        if (z132510628652176175794 == null) {
            z132510628652176175794 = z132510628652176175793.c();
            this.b = z132510628652176175794;
        }
        int b = z132510628652176175794.b();
        int i = 0;
        while (true) {
            Z13251062865217617579 z132510628652176175795 = (Z13251062865217617579) this.b;
            if (i >= b) {
                if (z132510628652176175795 != null) {
                    return z132510628652176175795;
                }
                S10823041268949770285.b0("endVelocityVector");
                throw null;
            }
            if (z132510628652176175795 == null) {
                S10823041268949770285.b0("endVelocityVector");
                throw null;
            }
            z132510628652176175795.e(i, ((R5827688671290015495) this.c).get(i).e(z13251062865217617579.a(i), z132510628652176175792.a(i), z132510628652176175793.a(i)));
            i++;
        }
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 e(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        Z13251062865217617579 z132510628652176175794 = (Z13251062865217617579) this.d;
        if (z132510628652176175794 == null) {
            z132510628652176175794 = z13251062865217617579.c();
            this.d = z132510628652176175794;
        }
        int b = z132510628652176175794.b();
        int i = 0;
        while (true) {
            Z13251062865217617579 z132510628652176175795 = (Z13251062865217617579) this.d;
            if (i >= b) {
                if (z132510628652176175795 != null) {
                    return z132510628652176175795;
                }
                S10823041268949770285.b0("valueVector");
                throw null;
            }
            if (z132510628652176175795 == null) {
                S10823041268949770285.b0("valueVector");
                throw null;
            }
            long j2 = j;
            z132510628652176175795.e(i, ((R5827688671290015495) this.c).get(i).c(z13251062865217617579.a(i), z132510628652176175792.a(i), z132510628652176175793.a(i), j2));
            i++;
            j = j2;
        }
    }

    @Override // dev.epro.r0.Y14924988016309632925
    public Executor f() {
        return (Executor) this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x01e8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026d  */
    @Override // dev.epro.r0.Y14924988016309632925
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(java.lang.String r18, org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15730374346044043770.g(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // dev.epro.r0.I3673563500665330592
    public /* bridge */ /* synthetic */ Object h() {
        switch (this.a) {
            case 24:
                return a0();
            default:
                return new W16959169036269499790((G5446205426701161097) ((D9201356603168736774) this.c).h(), ((C4341747165502163559) this.d).h(), (G15068739404623149094) ((D9201356603168736774) this.e).h(), (A7202329723792933819) ((D9201356603168736774) this.b).h());
        }
    }

    @Override // dev.epro.r0.L6498280162989651404
    public U10510841700634832156 i() {
        return (J3339196104325362891) this.b;
    }

    public void j(C13374971588771233833 c13374971588771233833) {
        if (((ArrayList) this.c).contains(c13374971588771233833)) {
            Q11088980322693754445.m("Fragment already added: ", c13374971588771233833);
            return;
        }
        synchronized (((ArrayList) this.c)) {
            ((ArrayList) this.c).add(c13374971588771233833);
        }
        c13374971588771233833.k = true;
    }

    public void l(R967311890144455702 r967311890144455702) {
        if (((K18075763046227786881) this.b).a(r967311890144455702)) {
            ((X3172131531941125810) this.d).a(this, r967311890144455702, -1);
        }
    }

    public void m(K3543068083010740431 k3543068083010740431, int i) {
        if (i != 1 && i != 0) {
            S10973172697741180971.i(G6547577305291411977.n(i, "Unsupported priority value: "));
        } else if (((K18075763046227786881) this.b).a(k3543068083010740431)) {
            ((X3172131531941125810) this.d).a(this, k3543068083010740431, i);
        }
    }

    public G13340623375126021314 o() {
        M9197813449740923653 m9197813449740923653;
        J4250663911053539605 b;
        A17163912561928975531 a17163912561928975531 = (A17163912561928975531) this.c;
        if (a17163912561928975531 == null) {
            W4415201450379021245.c("Cannot build without parameters");
            return null;
        }
        M9197813449740923653 m91978134497409236532 = (M9197813449740923653) this.d;
        if (m91978134497409236532 == null || (m9197813449740923653 = (M9197813449740923653) this.e) == null) {
            W4415201450379021245.c("Cannot build without key material");
            return null;
        }
        if (a17163912561928975531.a != ((J4250663911053539605) m91978134497409236532.b).a.length) {
            W4415201450379021245.c("AES key size mismatch");
            return null;
        }
        if (a17163912561928975531.b != ((J4250663911053539605) m9197813449740923653.b).a.length) {
            W4415201450379021245.c("HMAC key size mismatch");
            return null;
        }
        if (a17163912561928975531.a() && ((Integer) this.b) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((A17163912561928975531) this.c).a() && ((Integer) this.b) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((A17163912561928975531) this.c).e;
        if (d14731132657808549702 == D14731132657808549702.n) {
            b = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.m) {
            b = H3219070247167520574.a(((Integer) this.b).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.l) {
                S10973172697741180971.m("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            b = H3219070247167520574.b(((Integer) this.b).intValue());
        }
        return new G13340623375126021314((A17163912561928975531) this.c, (M9197813449740923653) this.d, (M9197813449740923653) this.e, b, (Integer) this.b);
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onDismissed(Bundle bundle) {
        boolean z = bundle.getBoolean("dldpRedirect", false);
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.b;
        if (hsdpShimActivity.b || z) {
            hsdpShimActivity.a = null;
            hsdpShimActivity.finish();
        }
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onError(Bundle bundle) {
        String.valueOf(bundle);
        String str = (String) this.c;
        String str2 = (String) this.d;
        Map map = (Map) this.e;
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.b;
        hsdpShimActivity.startActivityForResult(C468629748621011703.y(str, str2, map), 0);
        hsdpShimActivity.a = null;
        hsdpShimActivity.b = false;
        hsdpShimActivity.finish();
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onShown(Bundle bundle) {
        ((HsdpShimActivity) this.b).b = true;
    }

    public W4043777213630942564 p() {
        Integer num = (Integer) this.b;
        if (num == null) {
            W4415201450379021245.c("Key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            W4415201450379021245.c("IV size is not set");
            return null;
        }
        if (((D14731132657808549702) this.e) == null) {
            W4415201450379021245.c("Variant is not set");
            return null;
        }
        if (((Integer) this.d) != null) {
            return new W4043777213630942564(num.intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (D14731132657808549702) this.e);
        }
        W4415201450379021245.c("Tag size is not set");
        return null;
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 r(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        Z13251062865217617579 z132510628652176175794 = (Z13251062865217617579) this.e;
        if (z132510628652176175794 == null) {
            z132510628652176175794 = z132510628652176175793.c();
            this.e = z132510628652176175794;
        }
        int b = z132510628652176175794.b();
        int i = 0;
        while (true) {
            Z13251062865217617579 z132510628652176175795 = (Z13251062865217617579) this.e;
            if (i >= b) {
                if (z132510628652176175795 != null) {
                    return z132510628652176175795;
                }
                S10823041268949770285.b0("velocityVector");
                throw null;
            }
            if (z132510628652176175795 == null) {
                S10823041268949770285.b0("velocityVector");
                throw null;
            }
            long j2 = j;
            z132510628652176175795.e(i, ((R5827688671290015495) this.c).get(i).d(z13251062865217617579.a(i), z132510628652176175792.a(i), z132510628652176175793.a(i), j2));
            i++;
            j = j2;
        }
    }

    public T1031997469743650177 s() {
        Integer num = (Integer) this.b;
        if (num == null) {
            W4415201450379021245.c("Key size is not set");
            return null;
        }
        if (((D14731132657808549702) this.e) == null) {
            W4415201450379021245.c("Variant is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            W4415201450379021245.c("IV size is not set");
            return null;
        }
        if (((Integer) this.d) != null) {
            return new T1031997469743650177(num.intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (D14731132657808549702) this.e);
        }
        W4415201450379021245.c("Tag size is not set");
        return null;
    }

    public O10635330630771259783 t() {
        D14731132657808549702 d14731132657808549702 = D14731132657808549702.C;
        D14731132657808549702 d147311326578085497022 = (D14731132657808549702) this.c;
        if (d147311326578085497022 == null) {
            W4415201450379021245.c("signature encoding is not set");
            return null;
        }
        H5270339962551858100 h5270339962551858100 = (H5270339962551858100) this.d;
        if (h5270339962551858100 == null) {
            W4415201450379021245.c("EC curve type is not set");
            return null;
        }
        D14731132657808549702 d147311326578085497023 = (D14731132657808549702) this.e;
        if (d147311326578085497023 == null) {
            W4415201450379021245.c("hash type is not set");
            return null;
        }
        D14731132657808549702 d147311326578085497024 = (D14731132657808549702) this.b;
        if (d147311326578085497024 == null) {
            W4415201450379021245.c("variant is not set");
            return null;
        }
        if (h5270339962551858100 == H5270339962551858100.c && d147311326578085497023 != D14731132657808549702.A) {
            W4415201450379021245.c("NIST_P256 requires SHA256");
            return null;
        }
        if (h5270339962551858100 == H5270339962551858100.d && d147311326578085497023 != D14731132657808549702.B && d147311326578085497023 != d14731132657808549702) {
            W4415201450379021245.c("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (h5270339962551858100 != H5270339962551858100.e || d147311326578085497023 == d14731132657808549702) {
            return new O10635330630771259783(d147311326578085497022, h5270339962551858100, d147311326578085497023, d147311326578085497024);
        }
        W4415201450379021245.c("NIST_P521 requires SHA512");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 6:
                String socket = ((Socket) this.c).toString();
                socket.getClass();
                return socket;
            case 22:
                return (String) this.d;
            default:
                return super.toString();
        }
    }

    public N13917601494741667358 u() {
        Integer num = (Integer) this.b;
        if (num == null) {
            W4415201450379021245.c("key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            W4415201450379021245.c("tag size is not set");
            return null;
        }
        if (((K18164101509571580779) this.d) == null) {
            W4415201450379021245.c("hash type is not set");
            return null;
        }
        if (((D14731132657808549702) this.e) == null) {
            W4415201450379021245.c("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.b));
        }
        Integer num2 = (Integer) this.c;
        int intValue = num2.intValue();
        K18164101509571580779 k18164101509571580779 = (K18164101509571580779) this.d;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (k18164101509571580779 == K18164101509571580779.b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (k18164101509571580779 == K18164101509571580779.c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (k18164101509571580779 == K18164101509571580779.d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (k18164101509571580779 == K18164101509571580779.e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (k18164101509571580779 != K18164101509571580779.f) {
                W4415201450379021245.c("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new N13917601494741667358(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (D14731132657808549702) this.e, (K18164101509571580779) this.d);
    }

    public void v(X5127101262035123109 x5127101262035123109) {
        Runnable runnable;
        x5127101262035123109.getClass();
        synchronized (this.e) {
            runnable = (Runnable) ((LinkedHashMap) this.b).remove(x5127101262035123109);
        }
        if (runnable != null) {
            ((Handler) ((F6942723054099263096) this.c).b).removeCallbacks(runnable);
        }
    }

    public void w(R967311890144455702 r967311890144455702, F17048500263560432125 f17048500263560432125) {
        X3172131531941125810 x3172131531941125810 = (X3172131531941125810) this.d;
        if (x3172131531941125810.g != 0) {
            return;
        }
        Y10166432356890198008 c = x3172131531941125810.c(-1);
        x3172131531941125810.f = c;
        x3172131531941125810.g = -1;
        x3172131531941125810.h = r967311890144455702;
        if (f17048500263560432125 != null) {
            if (c != null) {
                c.d(f17048500263560432125);
            }
            x3172131531941125810.a.k(null, new M2563387695822359547(f17048500263560432125));
        }
    }

    public void x(Y1086209215650239921 y1086209215650239921, boolean z) {
        I17687524211334993649 i17687524211334993649 = (I17687524211334993649) this.b;
        List list = y1086209215650239921.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((N13196868278329319633) list.get(i)).c()) {
                Y(y1086209215650239921);
                return;
            }
        }
        Y4989033692226475498 y4989033692226475498 = (Y4989033692226475498) this.c;
        if (y4989033692226475498 == null) {
            S10973172697741180971.m("layoutCoordinates not set");
            return;
        }
        D15913187640519482289.I(y1086209215650239921, y4989033692226475498.O(0L), new U9113694475402304022(this, i17687524211334993649, (byte) 20), false);
        if (((Y15332629801367963516) this.d) == Y15332629801367963516.b) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((N13196868278329319633) list.get(i2)).a();
                }
            }
            N10542843603712830247 n10542843603712830247 = y1086209215650239921.b;
            if (n10542843603712830247 != null) {
                n10542843603712830247.a = !i17687524211334993649.c;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            dev.epro.r0.J7128855986599981135 r0 = (dev.epro.r0.J7128855986599981135) r0
            boolean r1 = r7 instanceof dev.epro.r0.D13095036186316263024
            if (r1 == 0) goto L17
            r1 = r7
            dev.epro.r0.D13095036186316263024 r1 = (dev.epro.r0.D13095036186316263024) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            dev.epro.r0.D13095036186316263024 r1 = new dev.epro.r0.D13095036186316263024
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.t
            int r2 = r1.v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L5b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L33:
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L68
        L37:
            dev.epro.r0.E17665849472693074628.k(r7)
            java.lang.Object r7 = r6.e
            java.util.List r7 = (java.util.List) r7
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r7 == 0) goto L5e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            goto L5e
        L49:
            dev.epro.r0.I8259692294117767977 r7 = r0.c()
            dev.epro.r0.F11121931435456439763 r5 = new dev.epro.r0.F11121931435456439763
            r5.<init>(r0, r6, r3)
            r1.v = r4
            java.lang.Object r7 = r7.b(r5, r1)
            if (r7 != r2) goto L5b
            goto L67
        L5b:
            dev.epro.r0.F2942794012393580692 r7 = (dev.epro.r0.F2942794012393580692) r7
            goto L6a
        L5e:
            r1.v = r5
            r6 = 0
            java.lang.Object r7 = r0.h(r6, r1)
            if (r7 != r2) goto L68
        L67:
            return r2
        L68:
            dev.epro.r0.F2942794012393580692 r7 = (dev.epro.r0.F2942794012393580692) r7
        L6a:
            dev.epro.r0.R9298828235481065733 r6 = r0.h
            r6.c(r7)
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15730374346044043770.y(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public synchronized ExecutorService z() {
        ExecutorService executorService;
        try {
            executorService = (ExecutorService) this.c;
            if (executorService == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new L5350362960623133222(C14766148968941961570.b + " Dispatcher", false));
                this.c = threadPoolExecutor;
                executorService = threadPoolExecutor;
            }
            executorService.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public /* synthetic */ J15730374346044043770(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    public /* synthetic */ J15730374346044043770(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    public J15730374346044043770(HsdpShimActivity hsdpShimActivity, String str, String str2, HashMap hashMap) {
        this.a = (byte) 26;
        this.c = str;
        this.d = str2;
        this.e = hashMap;
        this.b = hsdpShimActivity;
    }

    public J15730374346044043770(T1177712003054613961 t1177712003054613961, Y9819334540737372388 y9819334540737372388) {
        this.a = (byte) 3;
        this.c = new Vector();
        this.e = t1177712003054613961;
        this.b = y9819334540737372388;
    }

    public J15730374346044043770(boolean z) {
        this.a = (byte) 23;
        this.e = new byte[32768];
        this.b = new ByteArrayOutputStream();
        this.c = z ? new Deflater(-1) : null;
        this.d = z ? null : new Inflater();
    }

    public J15730374346044043770(F6942723054099263096 f6942723054099263096, F6353700998356592239 f6353700998356592239) {
        this.a = (byte) 19;
        this.c = f6942723054099263096;
        this.d = f6353700998356592239;
        this.e = new Object();
        this.b = new LinkedHashMap();
    }

    public J15730374346044043770(W5797197595347441198 w5797197595347441198, A6662317080022852970 a6662317080022852970, X4712621039624176170 x4712621039624176170, Y14354959068095823168 y14354959068095823168) {
        this.a = (byte) 16;
        this.c = w5797197595347441198;
        this.d = y14354959068095823168;
        this.e = I3887072968740112330.a(Integer.MAX_VALUE, 6, null);
        this.b = new R6949869166308759947((byte) 0);
        Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) w5797197595347441198.h().get(P2382941533350862833.p);
        if (q15035754882231748864 != null) {
            q15035754882231748864.j(new U6413690856892394737(a6662317080022852970, this, x4712621039624176170, (byte) 15));
        }
    }

    public J15730374346044043770(L3530692241870850490 l3530692241870850490, Q15796038708469204840 q15796038708469204840, L14576235570718031614 l14576235570718031614) {
        this.a = (byte) 21;
        l3530692241870850490.getClass();
        q15796038708469204840.getClass();
        l14576235570718031614.getClass();
        this.c = l3530692241870850490;
        this.d = q15796038708469204840;
        this.e = l14576235570718031614;
        this.b = new O12545633033254628644((byte) 1);
    }

    public J15730374346044043770(Socket socket) {
        this.a = (byte) 6;
        this.c = socket;
        this.d = new AtomicInteger();
        this.e = new U9281124989019192072(this);
        this.b = new J3339196104325362891(this);
    }

    public J15730374346044043770(I17687524211334993649 i17687524211334993649) {
        this.a = (byte) 13;
        this.b = i17687524211334993649;
        this.d = Y15332629801367963516.a;
    }

    public J15730374346044043770(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.c = new ArrayList();
                this.d = new HashMap();
                this.e = new HashMap();
                break;
            case 15:
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new HashMap();
                this.b = new HashMap();
                break;
            default:
                this.d = new ArrayDeque();
                this.e = new ArrayDeque();
                this.b = new ArrayDeque();
                break;
        }
    }

    public J15730374346044043770(L4980660535418402690 l4980660535418402690) {
        this.a = (byte) 12;
        this.c = l4980660535418402690;
        this.d = new X3172131531941125810();
        N18175069617523293125.a();
        this.e = N18175069617523293125.a();
        this.b = N18175069617523293125.a();
    }

    public J15730374346044043770(H12952893160333227181 h12952893160333227181) {
        this.a = (byte) 15;
        this.c = new HashMap(h12952893160333227181.a);
        this.d = new HashMap(h12952893160333227181.b);
        this.e = new HashMap(h12952893160333227181.c);
        this.b = new HashMap(h12952893160333227181.d);
    }

    public J15730374346044043770(Typeface typeface, E13661095186259607145 e13661095186259607145) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a = (byte) 11;
        this.b = typeface;
        this.c = e13661095186259607145;
        this.e = new J5953358054831440945(1024);
        int a = e13661095186259607145.a(6);
        if (a != 0) {
            int i5 = a + e13661095186259607145.a;
            i = ((ByteBuffer) e13661095186259607145.d).getInt(((ByteBuffer) e13661095186259607145.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.d = new char[i * 2];
        int a2 = e13661095186259607145.a(6);
        if (a2 != 0) {
            int i6 = a2 + e13661095186259607145.a;
            i2 = ((ByteBuffer) e13661095186259607145.d).getInt(((ByteBuffer) e13661095186259607145.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            D14027398382627356533 d14027398382627356533 = new D14027398382627356533(this, i7);
            Q5727030208712194095 b = d14027398382627356533.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.d).getInt(a3 + b.a) : 0, (char[]) this.d, i7 * 2);
            Q5727030208712194095 b2 = d14027398382627356533.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                J5953358054831440945 j5953358054831440945 = (J5953358054831440945) this.e;
                Q5727030208712194095 b3 = d14027398382627356533.b();
                int a5 = b3.a(16);
                if (a5 != 0) {
                    int i9 = a5 + b3.a;
                    i4 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                j5953358054831440945.a(d14027398382627356533, 0, i4 - 1);
            } else {
                S10973172697741180971.j("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public /* synthetic */ J15730374346044043770(byte b, boolean z) {
        this.a = b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J15730374346044043770(ExecutorService executorService) {
        this((byte) 7);
        this.a = (byte) 7;
        this.c = executorService;
    }

    public J15730374346044043770(Context context, ActionMode.Callback callback) {
        this.a = (byte) 17;
        this.d = context;
        this.c = callback;
        this.e = new ArrayList();
        this.b = new W929662112881511578(0);
    }

    public J15730374346044043770(J7128855986599981135 j7128855986599981135, List list) {
        this.a = (byte) 5;
        this.b = j7128855986599981135;
        this.c = new H15186625828076266306();
        this.d = new A18119328133183277592();
        this.e = R9411874267597469228.d1(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J15730374346044043770(K6937929821947263863 k6937929821947263863) {
        this((Object) new M204440408817344908(k6937929821947263863, (byte) 0), (byte) 20);
        this.a = (byte) 20;
    }
}
