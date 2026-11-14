package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B4512085422902578073 {
    public static final dev.epro.r0.B4512085422902578073 b;
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference(new dev.epro.r0.H12952893160333227181(new dev.epro.r0.J15730374346044043770((byte) 15)));

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.M8821877208104636290 */
    static {
        try {
            dev.epro.r0.B4512085422902578073 b4512085422902578073 = new dev.epro.r0.B4512085422902578073();
            b4512085422902578073.b(new dev.epro.r0.X18244299380549586254(dev.epro.r0.U2157586126377853843.class, new dev.epro.r0.D11988991656201568495((byte) 16)));
            b4512085422902578073.d(new dev.epro.r0.B6440366792515411106(dev.epro.r0.V5443054910857193357.class, new dev.epro.r0.D11988991656201568495((byte) 17)));
            b = b4512085422902578073;
        } catch (java.lang.Exception e) {
            dev.epro.r0.D11988991656201568495.p(e);
        }
    }

    public final synchronized void a(dev.epro.r0.X17873598080297061904 x17873598080297061904) {
        dev.epro.r0.J15730374346044043770 j15730374346044043770 = new dev.epro.r0.J15730374346044043770((dev.epro.r0.H12952893160333227181) this.a.get());
        java.lang.String str = x17873598080297061904.a;
        java.util.HashMap map = (java.util.HashMap) j15730374346044043770.d;
        if (map.containsKey(str)) {
            dev.epro.r0.X17873598080297061904 x178735980802970619042 = (dev.epro.r0.X17873598080297061904) map.get(str);
            if (!x178735980802970619042.equals(x17873598080297061904) || x17873598080297061904 != x178735980802970619042) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, x17873598080297061904);
        }
        this.a.set(new dev.epro.r0.H12952893160333227181(j15730374346044043770));
    }

    public final synchronized void b(dev.epro.r0.X18244299380549586254 x18244299380549586254) {
        dev.epro.r0.J15730374346044043770 j15730374346044043770 = new dev.epro.r0.J15730374346044043770((dev.epro.r0.H12952893160333227181) this.a.get());
        java.util.HashMap map = (java.util.HashMap) j15730374346044043770.c;
        java.lang.Class cls = x18244299380549586254.a;
        if (map.containsKey(cls)) {
            dev.epro.r0.X18244299380549586254 x182442993805495862542 = (dev.epro.r0.X18244299380549586254) map.get(cls);
            if (!x182442993805495862542.equals(x18244299380549586254) || x18244299380549586254 != x182442993805495862542) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(java.lang.String.valueOf(cls)));
            }
        } else {
            map.put(cls, x18244299380549586254);
        }
        this.a.set(new dev.epro.r0.H12952893160333227181(j15730374346044043770));
    }

    public final synchronized void c(dev.epro.r0.L12293142626931145046 l12293142626931145046) {
        dev.epro.r0.J15730374346044043770 j15730374346044043770 = new dev.epro.r0.J15730374346044043770((dev.epro.r0.H12952893160333227181) this.a.get());
        java.lang.String str = l12293142626931145046.a;
        java.util.HashMap map = (java.util.HashMap) j15730374346044043770.b;
        if (map.containsKey(str)) {
            dev.epro.r0.L12293142626931145046 l122931426269311450462 = (dev.epro.r0.L12293142626931145046) map.get(str);
            if (!l122931426269311450462.equals(l12293142626931145046) || l12293142626931145046 != l122931426269311450462) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, l12293142626931145046);
        }
        this.a.set(new dev.epro.r0.H12952893160333227181(j15730374346044043770));
    }

    public final synchronized void d(dev.epro.r0.B6440366792515411106 b6440366792515411106) {
        dev.epro.r0.J15730374346044043770 j15730374346044043770 = new dev.epro.r0.J15730374346044043770((dev.epro.r0.H12952893160333227181) this.a.get());
        java.util.HashMap map = (java.util.HashMap) j15730374346044043770.e;
        java.lang.Class cls = b6440366792515411106.a;
        if (map.containsKey(cls)) {
            dev.epro.r0.B6440366792515411106 b64403667925154111062 = (dev.epro.r0.B6440366792515411106) map.get(cls);
            if (!b64403667925154111062.equals(b6440366792515411106) || b6440366792515411106 != b64403667925154111062) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(java.lang.String.valueOf(cls)));
            }
        } else {
            map.put(cls, b6440366792515411106);
        }
        this.a.set(new dev.epro.r0.H12952893160333227181(j15730374346044043770));
    }
}
