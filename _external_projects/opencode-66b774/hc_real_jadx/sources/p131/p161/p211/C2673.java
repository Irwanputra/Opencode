package p131.p161.p211;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.C2537;
import p131.p161.p211.p213.EnumC2533;
import p131.p161.p211.p214.C2547;
import p131.p161.p211.p214.C2622;
import p131.p161.p211.p214.p215.C2551;
import p131.p161.p211.p214.p215.C2553;
import p131.p161.p211.p214.p215.C2555;
import p131.p161.p211.p214.p215.C2557;
import p131.p161.p211.p214.p215.C2561;
import p131.p161.p211.p214.p215.C2562;
import p131.p161.p211.p214.p215.C2595;
import p131.p161.p211.p214.p215.C2597;
import p131.p161.p211.p214.p215.C2602;
import p131.p161.p211.p214.p215.C2605;
import p131.p161.p211.p214.p215.C2614;
import p131.p161.p211.p214.p215.C2617;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2673 {

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final C2672<?> f10131 = new C2672<>(Object.class);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final boolean f10132;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Map<C2672<?>, AbstractC2658<?>> f10133;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final boolean f10134;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean f10135;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2547 f10136;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ThreadLocal<Map<C2672<?>, C2674<?>>> f10137;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final List<InterfaceC2656> f10138;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final List<InterfaceC2656> f10139;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean f10140;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2614 f10141;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final boolean f10142;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final List<InterfaceC2656> f10143;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぺふねづ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2674<T> extends AbstractC2658<T> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public AbstractC2658<T> f10144;

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: 〺つふすそ */
        public void mo4533(C2534 c2534, T t) {
            AbstractC2658<T> abstractC2658 = this.f10144;
            if (abstractC2658 == null) {
                throw new IllegalStateException();
            }
            abstractC2658.mo4533(c2534, t);
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: げつ〴ぬぐ */
        public T mo4534(C2535 c2535) {
            AbstractC2658<T> abstractC2658 = this.f10144;
            if (abstractC2658 != null) {
                return abstractC2658.mo4534(c2535);
            }
            throw new IllegalStateException();
        }
    }

    public C2673() {
        this(C2622.f10055, EnumC2662.f10120, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC2527.f9869, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public C2673(C2622 c2622, InterfaceC2653 interfaceC2653, Map<Type, InterfaceC2659<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC2527 enumC2527, String str, int i, int i2, List<InterfaceC2656> list, List<InterfaceC2656> list2, List<InterfaceC2656> list3) {
        this.f10137 = new ThreadLocal<>();
        this.f10133 = new ConcurrentHashMap();
        C2547 c2547 = new C2547(map);
        this.f10136 = c2547;
        this.f10140 = z;
        this.f10134 = z3;
        this.f10132 = z4;
        this.f10142 = z5;
        this.f10135 = z6;
        this.f10143 = list;
        this.f10139 = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2562.f9965);
        arrayList.add(C2551.f9921);
        arrayList.add(c2622);
        arrayList.addAll(list3);
        arrayList.add(C2562.f9954);
        arrayList.add(C2562.f9986);
        arrayList.add(C2562.f9951);
        arrayList.add(C2562.f9994);
        arrayList.add(C2562.f9997);
        AbstractC2658 c2520 = enumC2527 == EnumC2527.f9869 ? C2562.f9970 : new C2520();
        arrayList.add(new C2602(Long.TYPE, Long.class, c2520));
        arrayList.add(new C2602(Double.TYPE, Double.class, z7 ? C2562.f9980 : new C2657(this)));
        arrayList.add(new C2602(Float.TYPE, Float.class, z7 ? C2562.f9972 : new C2523(this)));
        arrayList.add(C2562.f9950);
        arrayList.add(C2562.f9963);
        arrayList.add(C2562.f9960);
        arrayList.add(new C2561(AtomicLong.class, new C2661(new C2671(c2520))));
        arrayList.add(new C2561(AtomicLongArray.class, new C2661(new C2524(c2520))));
        arrayList.add(C2562.f9987);
        arrayList.add(C2562.f9955);
        arrayList.add(C2562.f9996);
        arrayList.add(C2562.f9975);
        arrayList.add(new C2561(BigDecimal.class, C2562.f9984));
        arrayList.add(new C2561(BigInteger.class, C2562.f9981));
        arrayList.add(C2562.f9966);
        arrayList.add(C2562.f9949);
        arrayList.add(C2562.f9952);
        arrayList.add(C2562.f9976);
        arrayList.add(C2562.f9995);
        arrayList.add(C2562.f9967);
        arrayList.add(C2562.f9990);
        arrayList.add(C2595.f10001);
        arrayList.add(C2562.f9971);
        arrayList.add(C2605.f10019);
        arrayList.add(C2617.f10051);
        arrayList.add(C2562.f9958);
        arrayList.add(C2597.f10003);
        arrayList.add(C2562.f9948);
        arrayList.add(new C2553(c2547));
        arrayList.add(new C2555(c2547, z2));
        C2614 c2614 = new C2614(c2547);
        this.f10141 = c2614;
        arrayList.add(c2614);
        arrayList.add(C2562.f9946);
        arrayList.add(new C2557(c2547, interfaceC2653, c2622, c2614));
        this.f10138 = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4642(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f10140 + ",factories:" + this.f10138 + ",instanceCreators:" + this.f10136 + "}";
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m4643(AbstractC2532 abstractC2532, C2534 c2534) {
        boolean z = c2534.f9887;
        c2534.f9887 = true;
        boolean z2 = c2534.f9885;
        c2534.f9885 = this.f10132;
        boolean z3 = c2534.f9888;
        c2534.f9888 = this.f10140;
        try {
            try {
                C2562.f9985.mo4533(c2534, abstractC2532);
            } catch (IOException e) {
                throw new C2543(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            c2534.f9887 = z;
            c2534.f9885 = z2;
            c2534.f9888 = z3;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public <T> T m4644(String str, Class<T> cls) {
        Class cls2;
        T t = null;
        if (str != null) {
            C2535 c2535 = new C2535(new StringReader(str));
            boolean z = this.f10135;
            c2535.f9901 = z;
            boolean z2 = true;
            c2535.f9901 = true;
            try {
                try {
                    try {
                        c2535.mo4559();
                        z2 = false;
                        t = m4646(new C2672<>(cls)).mo4534(c2535);
                    } catch (IOException e) {
                        throw new C2531(e);
                    } catch (AssertionError e2) {
                        AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                        assertionError.initCause(e2);
                        throw assertionError;
                    }
                } catch (EOFException e3) {
                    if (!z2) {
                        throw new C2531(e3);
                    }
                } catch (IllegalStateException e4) {
                    throw new C2531(e4);
                }
                c2535.f9901 = z;
                if (t != null) {
                    try {
                        if (c2535.mo4559() != EnumC2533.END_DOCUMENT) {
                            throw new C2543("JSON document was not fully consumed.");
                        }
                    } catch (C2537 e5) {
                        throw new C2531(e5);
                    } catch (IOException e6) {
                        throw new C2543(e6);
                    }
                }
            } catch (Throwable th) {
                c2535.f9901 = z;
                throw th;
            }
        }
        if (cls == Integer.TYPE) {
            cls2 = Integer.class;
        } else if (cls == Float.TYPE) {
            cls2 = Float.class;
        } else if (cls == Byte.TYPE) {
            cls2 = Byte.class;
        } else if (cls == Double.TYPE) {
            cls2 = Double.class;
        } else if (cls == Long.TYPE) {
            cls2 = Long.class;
        } else if (cls == Character.TYPE) {
            cls2 = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls2 = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls2 = Short.class;
        } else {
            if (cls == Void.TYPE) {
                cls = (Class<T>) Void.class;
            }
            cls2 = cls;
        }
        return (T) cls2.cast(t);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String m4645(Object obj) {
        if (obj == null) {
            return m4648(C2660.f10117);
        }
        Type type = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            m4650(obj, type, m4647(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new C2543(e);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public <T> AbstractC2658<T> m4646(C2672<T> c2672) {
        AbstractC2658<T> abstractC2658 = (AbstractC2658) this.f10133.get(c2672);
        if (abstractC2658 != null) {
            return abstractC2658;
        }
        Map<C2672<?>, C2674<?>> map = this.f10137.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f10137.set(map);
            z = true;
        }
        C2674<?> c2674 = map.get(c2672);
        if (c2674 != null) {
            return c2674;
        }
        try {
            C2674<?> c26742 = new C2674<>();
            map.put(c2672, c26742);
            Iterator<InterfaceC2656> it = this.f10138.iterator();
            while (it.hasNext()) {
                AbstractC2658<T> mo4592 = it.next().mo4592(this, c2672);
                if (mo4592 != null) {
                    if (c26742.f10144 != null) {
                        throw new AssertionError();
                    }
                    c26742.f10144 = mo4592;
                    this.f10133.put(c2672, mo4592);
                    return mo4592;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + c2672);
        } finally {
            map.remove(c2672);
            if (z) {
                this.f10137.remove();
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C2534 m4647(Writer writer) {
        if (this.f10134) {
            writer.write(")]}'\n");
        }
        C2534 c2534 = new C2534(writer);
        if (this.f10142) {
            c2534.f9890 = "  ";
            c2534.f9891 = ": ";
        }
        c2534.f9888 = this.f10140;
        return c2534;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String m4648(AbstractC2532 abstractC2532) {
        StringWriter stringWriter = new StringWriter();
        try {
            m4643(abstractC2532, m4647(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new C2543(e);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public <T> AbstractC2658<T> m4649(InterfaceC2656 interfaceC2656, C2672<T> c2672) {
        if (!this.f10138.contains(interfaceC2656)) {
            interfaceC2656 = this.f10141;
        }
        boolean z = false;
        for (InterfaceC2656 interfaceC26562 : this.f10138) {
            if (z) {
                AbstractC2658<T> mo4592 = interfaceC26562.mo4592(this, c2672);
                if (mo4592 != null) {
                    return mo4592;
                }
            } else if (interfaceC26562 == interfaceC2656) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c2672);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m4650(Object obj, Type type, C2534 c2534) {
        AbstractC2658 m4646 = m4646(new C2672(type));
        boolean z = c2534.f9887;
        c2534.f9887 = true;
        boolean z2 = c2534.f9885;
        c2534.f9885 = this.f10132;
        boolean z3 = c2534.f9888;
        c2534.f9888 = this.f10140;
        try {
            try {
                m4646.mo4533(c2534, obj);
            } catch (IOException e) {
                throw new C2543(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            c2534.f9887 = z;
            c2534.f9885 = z2;
            c2534.f9888 = z3;
        }
    }
}
