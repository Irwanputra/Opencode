package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class D11883231851729262595 extends Z4899479314060394891 implements H7323971265464188398 {
    public static final J1743919081797479607 b = new J1743919081797479607(T13350664027331345869.s, new F17594658268783405200((byte) 25));

    public D11883231851729262595() {
        super(T13350664027331345869.s);
    }

    public void A(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        z(g8001132634698687269, runnable);
    }

    public boolean B(G8001132634698687269 g8001132634698687269) {
        return !(this instanceof X9281005853935093715);
    }

    public D11883231851729262595 C(int i, String str) {
        E12775674050813925581.u(i);
        return new B73407611111492471(this, i, str);
    }

    @Override // dev.epro.r0.Z4899479314060394891, dev.epro.r0.G8001132634698687269
    public final H7323971265464188398 get(R12081023847482212386 r12081023847482212386) {
        H7323971265464188398 h7323971265464188398;
        r12081023847482212386.getClass();
        if (r12081023847482212386 instanceof J1743919081797479607) {
            J1743919081797479607 j1743919081797479607 = (J1743919081797479607) r12081023847482212386;
            R12081023847482212386 key = getKey();
            key.getClass();
            if ((key == j1743919081797479607 || j1743919081797479607.b == key) && (h7323971265464188398 = (H7323971265464188398) j1743919081797479607.a.invoke(this)) != null) {
                return h7323971265464188398;
            }
        } else if (T13350664027331345869.s == r12081023847482212386) {
            return this;
        }
        return null;
    }

    @Override // dev.epro.r0.Z4899479314060394891, dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 minusKey(R12081023847482212386 r12081023847482212386) {
        r12081023847482212386.getClass();
        if (r12081023847482212386 instanceof J1743919081797479607) {
            J1743919081797479607 j1743919081797479607 = (J1743919081797479607) r12081023847482212386;
            R12081023847482212386 key = getKey();
            key.getClass();
            if (key != j1743919081797479607 && j1743919081797479607.b != key) {
                return this;
            }
            if (((H7323971265464188398) j1743919081797479607.a.invoke(this)) == null) {
                return this;
            }
        } else if (T13350664027331345869.s != r12081023847482212386) {
            return this;
        }
        return I3826119971291161142.a;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + D15445857918358799638.I(this);
    }

    public void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        g8001132634698687269.getClass();
        runnable.getClass();
        A2915904411423006968.d.z(g8001132634698687269, runnable);
    }
}
