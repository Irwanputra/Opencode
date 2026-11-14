package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B4512085422902578073 {
    public static final B4512085422902578073 b;
    public final AtomicReference a = new AtomicReference(new H12952893160333227181(new J15730374346044043770((byte) 15)));

    static {
        try {
            B4512085422902578073 b4512085422902578073 = new B4512085422902578073();
            b4512085422902578073.b(new X18244299380549586254(U2157586126377853843.class, new D11988991656201568495((byte) 16)));
            b4512085422902578073.d(new B6440366792515411106(V5443054910857193357.class, new D11988991656201568495((byte) 17)));
            b = b4512085422902578073;
        } catch (Exception e) {
            D11988991656201568495.p(e);
        }
    }

    public final synchronized void a(X17873598080297061904 x17873598080297061904) {
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((H12952893160333227181) this.a.get());
        String str = x17873598080297061904.a;
        HashMap hashMap = (HashMap) j15730374346044043770.d;
        if (hashMap.containsKey(str)) {
            X17873598080297061904 x178735980802970619042 = (X17873598080297061904) hashMap.get(str);
            if (!x178735980802970619042.equals(x17873598080297061904) || x17873598080297061904 != x178735980802970619042) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            hashMap.put(str, x17873598080297061904);
        }
        this.a.set(new H12952893160333227181(j15730374346044043770));
    }

    public final synchronized void b(X18244299380549586254 x18244299380549586254) {
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((H12952893160333227181) this.a.get());
        HashMap hashMap = (HashMap) j15730374346044043770.c;
        Class cls = x18244299380549586254.a;
        if (hashMap.containsKey(cls)) {
            X18244299380549586254 x182442993805495862542 = (X18244299380549586254) hashMap.get(cls);
            if (!x182442993805495862542.equals(x18244299380549586254) || x18244299380549586254 != x182442993805495862542) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(cls)));
            }
        } else {
            hashMap.put(cls, x18244299380549586254);
        }
        this.a.set(new H12952893160333227181(j15730374346044043770));
    }

    public final synchronized void c(L12293142626931145046 l12293142626931145046) {
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((H12952893160333227181) this.a.get());
        String str = l12293142626931145046.a;
        HashMap hashMap = (HashMap) j15730374346044043770.b;
        if (hashMap.containsKey(str)) {
            L12293142626931145046 l122931426269311450462 = (L12293142626931145046) hashMap.get(str);
            if (!l122931426269311450462.equals(l12293142626931145046) || l12293142626931145046 != l122931426269311450462) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            hashMap.put(str, l12293142626931145046);
        }
        this.a.set(new H12952893160333227181(j15730374346044043770));
    }

    public final synchronized void d(B6440366792515411106 b6440366792515411106) {
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((H12952893160333227181) this.a.get());
        HashMap hashMap = (HashMap) j15730374346044043770.e;
        Class cls = b6440366792515411106.a;
        if (hashMap.containsKey(cls)) {
            B6440366792515411106 b64403667925154111062 = (B6440366792515411106) hashMap.get(cls);
            if (!b64403667925154111062.equals(b6440366792515411106) || b6440366792515411106 != b64403667925154111062) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(cls)));
            }
        } else {
            hashMap.put(cls, b6440366792515411106);
        }
        this.a.set(new H12952893160333227181(j15730374346044043770));
    }
}
