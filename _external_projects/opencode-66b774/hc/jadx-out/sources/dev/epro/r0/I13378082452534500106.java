package dev.epro.r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I13378082452534500106 extends R15896830329318850690 implements F16971278462881137815, V6844203142031704410, A11121185661545552785 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D5961215468735357278 f286o;
    public final boolean p;
    public final float q;
    public final C5950695083679873225 r;
    public final G6415894765745710790 s;
    public A6478343232691943615 t;
    public float u;
    public boolean w;
    public I17862628329628029572 y;
    public T10804465336881022126 z;
    public long v = 0;
    public final U9803441765912152712 x = new U9803441765912152712();

    public I13378082452534500106(D5961215468735357278 d5961215468735357278, boolean z, float f, C5950695083679873225 c5950695083679873225, G6415894765745710790 g6415894765745710790) {
        this.f286o = d5961215468735357278;
        this.p = z;
        this.q = f;
        this.r = c5950695083679873225;
        this.s = g6415894765745710790;
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
        n17396598995248644478.a();
        A6478343232691943615 a6478343232691943615 = this.t;
        if (a6478343232691943615 != null) {
            float f = this.u;
            long jA = this.r.a();
            float fFloatValue = ((Number) ((U16834965109098959004) a6478343232691943615.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = U10174709222559481877.b(fFloatValue, jA);
                if (a6478343232691943615.a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L));
                    Q7316561721656982910 q7316561721656982910 = n16536369055082677148.b;
                    long jF = q7316561721656982910.F();
                    q7316561721656982910.A().l();
                    try {
                        ((Q7316561721656982910) ((H12843822278061842084) q7316561721656982910.b).b).A().h(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        L17598299826319227431.M(n17396598995248644478, jB, f, 0L, null, 0, 124);
                    } finally {
                        L11610354117192841236.w(q7316561721656982910, jF);
                    }
                } else {
                    L17598299826319227431.M(n17396598995248644478, jB, f, 0L, null, 0, 124);
                }
            }
        }
        V1715405128288489768 v1715405128288489768A = n16536369055082677148.b.A();
        T10804465336881022126 t10804465336881022126 = this.z;
        if (t10804465336881022126 != null) {
            long j = this.v;
            int iZ = T18016951143603335921.Z(this.u);
            long jA2 = this.r.a();
            this.s.invoke();
            t10804465336881022126.e(iZ, j, jA2);
            t10804465336881022126.draw(R14166932666867597588.a(v1715405128288489768A));
        }
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        R7033599853981556291.E(V0(), null, null, new G5547415528770645763((Object) this, (R4833348786910499294) null, (byte) 4), 3);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        I17862628329628029572 i17862628329628029572 = this.y;
        if (i17862628329628029572 != null) {
            this.z = null;
            V1475975160983963926.D(this);
            V10300877997588547986 v10300877997588547986 = i17862628329628029572.d;
            T10804465336881022126 t10804465336881022126 = (T10804465336881022126) ((LinkedHashMap) v10300877997588547986.b).get(this);
            if (t10804465336881022126 != null) {
                t10804465336881022126.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) v10300877997588547986.b;
                T10804465336881022126 t108044653368810221262 = (T10804465336881022126) linkedHashMap.get(this);
                if (t108044653368810221262 != null) {
                }
                linkedHashMap.remove(this);
                i17862628329628029572.c.add(t10804465336881022126);
            }
        }
    }

    @Override // dev.epro.r0.A11121185661545552785, dev.epro.r0.T975006071468260715
    public final void d(long j) {
        float fK;
        this.w = true;
        R8540738700654750557 r8540738700654750557 = R7033599853981556291.R(this).y;
        this.v = I3887072968740112330.Q(j);
        float f = this.q;
        if (Float.isNaN(f)) {
            long j2 = this.v;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fK = L2216691091636065972.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.p) {
                fK += r8540738700654750557.K(10.0f);
            }
        } else {
            fK = r8540738700654750557.K(f);
        }
        this.u = fK;
        U9803441765912152712 u9803441765912152712 = this.x;
        Object[] objArr = u9803441765912152712.a;
        int i = u9803441765912152712.b;
        for (int i2 = 0; i2 < i; i2++) {
            h1((V1670068795916328108) objArr[i2]);
        }
        u9803441765912152712.d();
    }

    public final void h1(V1670068795916328108 v1670068795916328108) {
        T10804465336881022126 t10804465336881022126;
        if (!(v1670068795916328108 instanceof L11334185135933894276)) {
            if (v1670068795916328108 instanceof A9134307198683833790) {
                T10804465336881022126 t108044653368810221262 = this.z;
                if (t108044653368810221262 != null) {
                    t108044653368810221262.d();
                    return;
                }
                return;
            }
            if (!(v1670068795916328108 instanceof D10175313246177059481) || (t10804465336881022126 = this.z) == null) {
                return;
            }
            t10804465336881022126.d();
            return;
        }
        L11334185135933894276 l11334185135933894276 = (L11334185135933894276) v1670068795916328108;
        long j = this.v;
        float f = this.u;
        I17862628329628029572 i17862628329628029572 = this.y;
        if (i17862628329628029572 == null) {
            Object obj = (View) B11964701839924937722.o(this, T15795698139970521497.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    K2042933864045806308.l("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    I17862628329628029572 i178626283296280295722 = new I17862628329628029572(viewGroup.getContext());
                    viewGroup.addView(i178626283296280295722);
                    i17862628329628029572 = i178626283296280295722;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof I17862628329628029572) {
                        i17862628329628029572 = (I17862628329628029572) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.y = i17862628329628029572;
        }
        ArrayList arrayList = i17862628329628029572.b;
        V10300877997588547986 v10300877997588547986 = i17862628329628029572.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) v10300877997588547986.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) v10300877997588547986.b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) v10300877997588547986.c;
        T10804465336881022126 t108044653368810221263 = (T10804465336881022126) linkedHashMap.get(this);
        if (t108044653368810221263 == null) {
            ArrayList arrayList2 = i17862628329628029572.c;
            arrayList2.getClass();
            t108044653368810221263 = (T10804465336881022126) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (t108044653368810221263 == null) {
                if (i17862628329628029572.e > K5751602218013079365.N(arrayList)) {
                    t108044653368810221263 = new T10804465336881022126(i17862628329628029572.getContext());
                    i17862628329628029572.addView(t108044653368810221263);
                    arrayList.add(t108044653368810221263);
                } else {
                    t108044653368810221263 = (T10804465336881022126) arrayList.get(i17862628329628029572.e);
                    I13378082452534500106 i13378082452534500106 = (I13378082452534500106) linkedHashMap3.get(t108044653368810221263);
                    if (i13378082452534500106 != null) {
                        i13378082452534500106.z = null;
                        V1475975160983963926.D(i13378082452534500106);
                        T10804465336881022126 t108044653368810221264 = (T10804465336881022126) linkedHashMap2.get(i13378082452534500106);
                        if (t108044653368810221264 != null) {
                        }
                        linkedHashMap2.remove(i13378082452534500106);
                        t108044653368810221263.c();
                    }
                }
                int i2 = i17862628329628029572.e;
                if (i2 < i17862628329628029572.a - 1) {
                    i17862628329628029572.e = i2 + 1;
                } else {
                    i17862628329628029572.e = 0;
                }
            }
            linkedHashMap2.put(this, t108044653368810221263);
            linkedHashMap3.put(t108044653368810221263, this);
        }
        T10804465336881022126 t108044653368810221265 = t108044653368810221263;
        int iZ = T18016951143603335921.Z(f);
        long jA = this.r.a();
        this.s.invoke();
        t108044653368810221265.b(l11334185135933894276, this.p, j, iZ, jA, new S464754454553842217(this, (byte) 3));
        this.z = t108044653368810221265;
        V1475975160983963926.D(this);
    }
}
