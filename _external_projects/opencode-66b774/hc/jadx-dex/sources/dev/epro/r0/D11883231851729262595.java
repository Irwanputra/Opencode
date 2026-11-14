package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class D11883231851729262595 extends dev.epro.r0.Z4899479314060394891 implements dev.epro.r0.H7323971265464188398 {
    public static final dev.epro.r0.J1743919081797479607 b = new dev.epro.r0.J1743919081797479607(dev.epro.r0.T13350664027331345869.s, new dev.epro.r0.F17594658268783405200((byte) 25));

    public D11883231851729262595() {
        super(dev.epro.r0.T13350664027331345869.s);
    }

    public void A(dev.epro.r0.G8001132634698687269 g8001132634698687269, java.lang.Runnable runnable) {
        z(g8001132634698687269, runnable);
    }

    public boolean B(dev.epro.r0.G8001132634698687269 g8001132634698687269) {
        return !(this instanceof dev.epro.r0.X9281005853935093715);
    }

    public dev.epro.r0.D11883231851729262595 C(int i, java.lang.String str) {
        dev.epro.r0.E12775674050813925581.u(i);
        return new dev.epro.r0.B73407611111492471(this, i, str);
    }

    public final dev.epro.r0.H7323971265464188398 get(dev.epro.r0.R12081023847482212386 r12081023847482212386) {
        dev.epro.r0.H7323971265464188398 h7323971265464188398;
        r12081023847482212386.getClass();
        if (r12081023847482212386 instanceof dev.epro.r0.J1743919081797479607) {
            dev.epro.r0.R12081023847482212386 r120810238474822123862 = (dev.epro.r0.J1743919081797479607) r12081023847482212386;
            dev.epro.r0.R12081023847482212386 key = getKey();
            key.getClass();
            if ((key == r120810238474822123862 || ((dev.epro.r0.J1743919081797479607) r120810238474822123862).b == key) && (h7323971265464188398 = (dev.epro.r0.H7323971265464188398) ((dev.epro.r0.J1743919081797479607) r120810238474822123862).a.invoke(this)) != null) {
                return h7323971265464188398;
            }
        } else if (dev.epro.r0.T13350664027331345869.s == r12081023847482212386) {
            return this;
        }
        return null;
    }

    public final dev.epro.r0.G8001132634698687269 minusKey(dev.epro.r0.R12081023847482212386 r12081023847482212386) {
        r12081023847482212386.getClass();
        if (r12081023847482212386 instanceof dev.epro.r0.J1743919081797479607) {
            dev.epro.r0.R12081023847482212386 r120810238474822123862 = (dev.epro.r0.J1743919081797479607) r12081023847482212386;
            dev.epro.r0.R12081023847482212386 key = getKey();
            key.getClass();
            if ((key != r120810238474822123862 && ((dev.epro.r0.J1743919081797479607) r120810238474822123862).b != key) || ((dev.epro.r0.H7323971265464188398) ((dev.epro.r0.J1743919081797479607) r120810238474822123862).a.invoke(this)) == null) {
                return this;
            }
        } else if (dev.epro.r0.T13350664027331345869.s != r12081023847482212386) {
            return this;
        }
        return dev.epro.r0.I3826119971291161142.a;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + dev.epro.r0.D15445857918358799638.I(this);
    }

    public void z(dev.epro.r0.G8001132634698687269 g8001132634698687269, java.lang.Runnable runnable) {
        g8001132634698687269.getClass();
        runnable.getClass();
        dev.epro.r0.A2915904411423006968.d.z(g8001132634698687269, runnable);
    }
}
