package dev.epro.r0;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F14240031463097426304 {
    public static final A16798789777035163011 i = A16798789777035163011.d;
    public static final int j = 1;
    public static final int k = 1;
    public static final int l = 2;
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final S790996689653940400 c;
    public final S14095860472553357893 d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final A16798789777035163011 h;

    public F14240031463097426304(X16868335726098211378 x16868335726098211378, int i2, Map map, boolean z, A16798789777035163011 a16798789777035163011, List list, int i3, int i4, List list2) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        S790996689653940400 s790996689653940400 = new S790996689653940400(map, list2);
        this.c = s790996689653940400;
        this.f = z;
        byte b = 1;
        this.g = true;
        this.h = a16798789777035163011;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Q2123592735363394013.A);
        arrayList.add(i3 == 1 ? C11040945536995239011.c : new M15027517010688111229(i3));
        arrayList.add(x16868335726098211378);
        arrayList.addAll(list);
        arrayList.add(Q2123592735363394013.p);
        arrayList.add(Q2123592735363394013.g);
        arrayList.add(Q2123592735363394013.d);
        arrayList.add(Q2123592735363394013.e);
        arrayList.add(Q2123592735363394013.f);
        Y15727004751735750140 y15727004751735750140 = Q2123592735363394013.k;
        arrayList.add(new K133131628788954134(Long.TYPE, Long.class, y15727004751735750140));
        byte b2 = 0;
        arrayList.add(new K133131628788954134(Double.TYPE, Double.class, new E8559058671246919439(b2)));
        arrayList.add(new K133131628788954134(Float.TYPE, Float.class, new E8559058671246919439(b)));
        arrayList.add(i4 == 2 ? O1318608560032376846.b : new L5727651961827975639(new O1318608560032376846(i4), b2));
        arrayList.add(Q2123592735363394013.h);
        arrayList.add(Q2123592735363394013.i);
        arrayList.add(new A13706681545055074315(AtomicLong.class, new F16145354116733507252(y15727004751735750140, b2).a(), b2));
        arrayList.add(new A13706681545055074315(AtomicLongArray.class, new F16145354116733507252(y15727004751735750140, b).a(), b2));
        arrayList.add(Q2123592735363394013.j);
        arrayList.add(Q2123592735363394013.l);
        arrayList.add(Q2123592735363394013.q);
        arrayList.add(Q2123592735363394013.r);
        arrayList.add(new A13706681545055074315(BigDecimal.class, Q2123592735363394013.m, b2));
        arrayList.add(new A13706681545055074315(BigInteger.class, Q2123592735363394013.n, b2));
        arrayList.add(new A13706681545055074315(H1162839155067368006.class, Q2123592735363394013.f445o, b2));
        arrayList.add(Q2123592735363394013.s);
        arrayList.add(Q2123592735363394013.t);
        arrayList.add(Q2123592735363394013.v);
        arrayList.add(Q2123592735363394013.w);
        arrayList.add(Q2123592735363394013.y);
        arrayList.add(Q2123592735363394013.u);
        arrayList.add(Q2123592735363394013.b);
        arrayList.add(X1392955191090590452.c);
        arrayList.add(Q2123592735363394013.x);
        if (M4353767700798623786.a) {
            arrayList.add(M4353767700798623786.c);
            arrayList.add(M4353767700798623786.b);
            arrayList.add(M4353767700798623786.d);
        }
        arrayList.add(K1947090798528452886.c);
        arrayList.add(Q2123592735363394013.a);
        arrayList.add(new D11845360118227771236(s790996689653940400, b2));
        arrayList.add(new D11845360118227771236(s790996689653940400, b));
        S14095860472553357893 s14095860472553357893 = new S14095860472553357893(s790996689653940400);
        this.d = s14095860472553357893;
        arrayList.add(s14095860472553357893);
        arrayList.add(Q2123592735363394013.B);
        arrayList.add(new P13401624173747179367(s790996689653940400, i2, x16868335726098211378, s14095860472553357893, list2));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        K11898134656129953686 k11898134656129953686 = new K11898134656129953686(cls);
        Object obj = null;
        if (str == null) {
            return null;
        }
        D13396727227989475489 d13396727227989475489 = new D13396727227989475489(new StringReader(str));
        d13396727227989475489.K(2);
        int i2 = d13396727227989475489.f194o;
        boolean z = true;
        if (i2 == 2) {
            d13396727227989475489.f194o = 1;
        }
        try {
            try {
                try {
                    d13396727227989475489.H();
                    z = false;
                    K10678596132709730734 c = c(k11898134656129953686);
                    Class cls2 = k11898134656129953686.a;
                    Object b = c.b(d13396727227989475489);
                    Class f0 = R7033599853981556291.f0(cls2);
                    if (b != null && !f0.isInstance(b)) {
                        throw new ClassCastException("Type adapter '" + c + "' returned wrong type; requested " + cls2 + " but got instance of " + b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    d13396727227989475489.K(i2);
                    obj = b;
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e.getMessage(), e);
                } catch (IllegalStateException e2) {
                    throw new X13554947934760653097(e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new X13554947934760653097(e3);
                }
                d13396727227989475489.K(i2);
            } catch (IOException e4) {
                throw new X13554947934760653097(e4);
            }
            if (obj != null) {
                try {
                    if (d13396727227989475489.H() != 10) {
                        throw new X13554947934760653097("JSON document was not fully consumed.");
                    }
                } catch (H5369259335675503737 e5) {
                    throw new X13554947934760653097(e5);
                } catch (IOException e6) {
                    throw new O6142514240279757215(e6);
                }
            }
            return obj;
        } catch (Throwable th) {
            d13396727227989475489.K(i2);
            throw th;
        }
    }

    public final K10678596132709730734 c(K11898134656129953686 k11898134656129953686) {
        boolean z;
        Objects.requireNonNull(k11898134656129953686, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        K10678596132709730734 k10678596132709730734 = (K10678596132709730734) concurrentHashMap.get(k11898134656129953686);
        if (k10678596132709730734 != null) {
            return k10678596132709730734;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            K10678596132709730734 k106785961327097307342 = (K10678596132709730734) map.get(k11898134656129953686);
            if (k106785961327097307342 != null) {
                return k106785961327097307342;
            }
            z = false;
        }
        try {
            Y17191660982887272427 y17191660982887272427 = new Y17191660982887272427();
            map.put(k11898134656129953686, y17191660982887272427);
            Iterator it = this.e.iterator();
            K10678596132709730734 k106785961327097307343 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k106785961327097307343 = ((V4446577237959483780) it.next()).a(this, k11898134656129953686);
                if (k106785961327097307343 != null) {
                    if (y17191660982887272427.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    y17191660982887272427.a = k106785961327097307343;
                    map.put(k11898134656129953686, k106785961327097307343);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (k106785961327097307343 == null) {
                Q11088980322693754445.l("GSON (2.13.2) cannot handle ", k11898134656129953686);
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return k106785961327097307343;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        if (r4 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r4 == r8) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.K10678596132709730734 d(dev.epro.r0.V4446577237959483780 r8, dev.epro.r0.K11898134656129953686 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r9, r0)
            dev.epro.r0.S14095860472553357893 r0 = r7.d
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r0.b
            dev.epro.r0.D14954542483094472451 r2 = dev.epro.r0.S14095860472553357893.c
            r3 = 1
            if (r8 != r2) goto L17
            goto L58
        L17:
            java.lang.Class r2 = r9.a
            java.lang.Object r4 = r1.get(r2)
            dev.epro.r0.V4446577237959483780 r4 = (dev.epro.r0.V4446577237959483780) r4
            if (r4 == 0) goto L24
            if (r4 != r8) goto L59
            goto L58
        L24:
            java.lang.Class<dev.epro.r0.F15747820971790806316> r4 = dev.epro.r0.F15747820971790806316.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            dev.epro.r0.F15747820971790806316 r4 = (dev.epro.r0.F15747820971790806316) r4
            if (r4 != 0) goto L2f
            goto L59
        L2f:
            java.lang.Class r4 = r4.value()
            java.lang.Class<dev.epro.r0.V4446577237959483780> r5 = dev.epro.r0.V4446577237959483780.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L3c
            goto L59
        L3c:
            dev.epro.r0.S790996689653940400 r5 = r0.a
            dev.epro.r0.K11898134656129953686 r6 = new dev.epro.r0.K11898134656129953686
            r6.<init>(r4)
            dev.epro.r0.H4563649114871566866 r4 = r5.d(r6, r3)
            java.lang.Object r4 = r4.c()
            dev.epro.r0.V4446577237959483780 r4 = (dev.epro.r0.V4446577237959483780) r4
            java.lang.Object r1 = r1.putIfAbsent(r2, r4)
            dev.epro.r0.V4446577237959483780 r1 = (dev.epro.r0.V4446577237959483780) r1
            if (r1 == 0) goto L56
            r4 = r1
        L56:
            if (r4 != r8) goto L59
        L58:
            r8 = r0
        L59:
            java.util.List r0 = r7.e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L60:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            dev.epro.r0.V4446577237959483780 r2 = (dev.epro.r0.V4446577237959483780) r2
            if (r1 != 0) goto L72
            if (r2 != r8) goto L60
            r1 = r3
            goto L60
        L72:
            dev.epro.r0.K10678596132709730734 r2 = r2.a(r7, r9)
            if (r2 == 0) goto L60
            return r2
        L79:
            if (r1 != 0) goto L80
            dev.epro.r0.K10678596132709730734 r7 = r7.c(r9)
            return r7
        L80:
            java.lang.String r7 = "GSON cannot serialize or deserialize "
            dev.epro.r0.Q11088980322693754445.l(r7, r9)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F14240031463097426304.d(dev.epro.r0.V4446577237959483780, dev.epro.r0.K11898134656129953686):dev.epro.r0.K10678596132709730734");
    }

    public final Y14132333989764804283 e(Writer writer) {
        Y14132333989764804283 y14132333989764804283 = new Y14132333989764804283(writer);
        y14132333989764804283.s(this.h);
        y14132333989764804283.i = this.g;
        y14132333989764804283.u(2);
        y14132333989764804283.k = this.f;
        return y14132333989764804283;
    }

    public final String f(K15572083692188606544 k15572083692188606544) {
        StringBuilder sb = new StringBuilder();
        try {
            h(k15572083692188606544, e(new R1620071977321010765(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new O6142514240279757215(e);
        }
    }

    public final String g(Object obj) {
        if (obj == null) {
            return f(Y12917327898100101934.a);
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            i(obj, cls, e(new R1620071977321010765(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new O6142514240279757215(e);
        }
    }

    public final void h(K15572083692188606544 k15572083692188606544, Y14132333989764804283 y14132333989764804283) {
        int i2 = y14132333989764804283.h;
        boolean z = y14132333989764804283.i;
        boolean z2 = y14132333989764804283.k;
        y14132333989764804283.i = this.g;
        y14132333989764804283.k = this.f;
        if (i2 == 2) {
            y14132333989764804283.h = 1;
        }
        try {
            try {
                B14764642315028140130 b14764642315028140130 = Q2123592735363394013.z;
                b14764642315028140130.getClass();
                b14764642315028140130.c(k15572083692188606544, y14132333989764804283);
                y14132333989764804283.u(i2);
                y14132333989764804283.i = z;
                y14132333989764804283.k = z2;
            } catch (IOException e) {
                throw new O6142514240279757215(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            y14132333989764804283.u(i2);
            y14132333989764804283.i = z;
            y14132333989764804283.k = z2;
            throw th;
        }
    }

    public final void i(Object obj, Class cls, Y14132333989764804283 y14132333989764804283) {
        K10678596132709730734 c = c(new K11898134656129953686(cls));
        int i2 = y14132333989764804283.h;
        if (i2 == 2) {
            y14132333989764804283.h = 1;
        }
        boolean z = y14132333989764804283.i;
        boolean z2 = y14132333989764804283.k;
        y14132333989764804283.i = this.g;
        y14132333989764804283.k = this.f;
        try {
            try {
                c.c(y14132333989764804283, obj);
            } catch (IOException e) {
                throw new O6142514240279757215(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } finally {
            y14132333989764804283.u(i2);
            y14132333989764804283.i = z;
            y14132333989764804283.k = z2;
        }
    }

    public final K15572083692188606544 j(Object obj) {
        if (obj == null) {
            return Y12917327898100101934.a;
        }
        Class cls = obj.getClass();
        D16111500240585586517 d16111500240585586517 = new D16111500240585586517();
        i(obj, cls, d16111500240585586517);
        ArrayList arrayList = d16111500240585586517.f201o;
        if (arrayList.isEmpty()) {
            return d16111500240585586517.q;
        }
        Q11088980322693754445.m("Expected one JSON element but was ", arrayList);
        return null;
    }

    public final String toString() {
        return "{serializeNulls:" + this.f + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F14240031463097426304() {
        /*
            r10 = this;
            dev.epro.r0.X16868335726098211378 r1 = dev.epro.r0.X16868335726098211378.c
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            int r7 = dev.epro.r0.F14240031463097426304.k
            int r8 = dev.epro.r0.F14240031463097426304.l
            int r2 = dev.epro.r0.F14240031463097426304.j
            r4 = 0
            dev.epro.r0.A16798789777035163011 r5 = dev.epro.r0.F14240031463097426304.i
            r9 = r6
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F14240031463097426304.<init>():void");
    }
}
