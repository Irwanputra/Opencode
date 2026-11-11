package p131.p161.p211.p214.p215;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import p131.p155.p156.p157.C2098;
import p131.p161.p211.AbstractC2532;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2531;
import p131.p161.p211.C2541;
import p131.p161.p211.C2543;
import p131.p161.p211.C2655;
import p131.p161.p211.C2660;
import p131.p161.p211.C2670;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;
import p131.p161.p211.p214.AbstractC2621;
import p131.p161.p211.p214.C2547;
import p131.p161.p211.p214.C2625;
import p131.p161.p211.p214.InterfaceC2629;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2555 implements InterfaceC2656 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2547 f9926;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean f9927;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public final class C2556<K, V> extends AbstractC2658<Map<K, V>> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final AbstractC2658<V> f9928;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final InterfaceC2629<? extends Map<K, V>> f9929;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final AbstractC2658<K> f9930;

        public C2556(C2673 c2673, Type type, AbstractC2658<K> abstractC2658, Type type2, AbstractC2658<V> abstractC26582, InterfaceC2629<? extends Map<K, V>> interfaceC2629) {
            this.f9930 = new C2615(c2673, abstractC2658, type);
            this.f9928 = new C2615(c2673, abstractC26582, type2);
            this.f9929 = interfaceC2629;
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: 〺つふすそ */
        public void mo4533(C2534 c2534, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                c2534.mo4541();
                return;
            }
            if (C2555.this.f9927) {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    AbstractC2658<K> abstractC2658 = this.f9930;
                    K key = entry.getKey();
                    abstractC2658.getClass();
                    try {
                        C2607 c2607 = new C2607();
                        abstractC2658.mo4533(c2607, key);
                        if (!c2607.f10024.isEmpty()) {
                            throw new IllegalStateException("Expected one JSON element but was " + c2607.f10024);
                        }
                        AbstractC2532 abstractC2532 = c2607.f10023;
                        arrayList.add(abstractC2532);
                        arrayList2.add(entry.getValue());
                        abstractC2532.getClass();
                        z |= (abstractC2532 instanceof C2670) || (abstractC2532 instanceof C2541);
                    } catch (IOException e) {
                        throw new C2543(e);
                    }
                }
                if (z) {
                    c2534.mo4557();
                    int size = arrayList.size();
                    while (i < size) {
                        c2534.mo4557();
                        C2562.f9985.mo4533(c2534, (AbstractC2532) arrayList.get(i));
                        this.f9928.mo4533(c2534, arrayList2.get(i));
                        c2534.mo4555();
                        i++;
                    }
                    c2534.mo4555();
                    return;
                }
                c2534.mo4543();
                int size2 = arrayList.size();
                while (i < size2) {
                    AbstractC2532 abstractC25322 = (AbstractC2532) arrayList.get(i);
                    abstractC25322.getClass();
                    if (abstractC25322 instanceof C2655) {
                        C2655 m4538 = abstractC25322.m4538();
                        Object obj2 = m4538.f10116;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(m4538.m4637());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(m4538.m4636());
                        } else {
                            if (!(obj2 instanceof String)) {
                                throw new AssertionError();
                            }
                            str = m4538.m4638();
                        }
                    } else {
                        if (!(abstractC25322 instanceof C2660)) {
                            throw new AssertionError();
                        }
                        str = "null";
                    }
                    c2534.mo4544(str);
                    this.f9928.mo4533(c2534, arrayList2.get(i));
                    i++;
                }
            } else {
                c2534.mo4543();
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    c2534.mo4544(String.valueOf(entry2.getKey()));
                    this.f9928.mo4533(c2534, entry2.getValue());
                }
            }
            c2534.mo4545();
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: げつ〴ぬぐ */
        public Object mo4534(C2535 c2535) {
            int i;
            EnumC2533 mo4559 = c2535.mo4559();
            if (mo4559 == EnumC2533.NULL) {
                c2535.mo4572();
                return null;
            }
            Map<K, V> mo4589 = this.f9929.mo4589();
            if (mo4559 == EnumC2533.BEGIN_ARRAY) {
                c2535.mo4574();
                while (c2535.mo4563()) {
                    c2535.mo4574();
                    K mo4534 = this.f9930.mo4534(c2535);
                    if (mo4589.put(mo4534, this.f9928.mo4534(c2535)) != null) {
                        throw new C2531("duplicate key: " + mo4534);
                    }
                    c2535.mo4583();
                }
                c2535.mo4583();
            } else {
                c2535.mo4585();
                while (c2535.mo4563()) {
                    ((C2535.C2536) AbstractC2621.f10054).getClass();
                    if (c2535 instanceof C2603) {
                        C2603 c2603 = (C2603) c2535;
                        c2603.m4604(EnumC2533.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) c2603.m4605()).next();
                        c2603.m4606(entry.getValue());
                        c2603.m4606(new C2655((String) entry.getKey()));
                    } else {
                        int i2 = c2535.f9908;
                        if (i2 == 0) {
                            i2 = c2535.m4576();
                        }
                        if (i2 == 13) {
                            i = 9;
                        } else if (i2 == 12) {
                            i = 8;
                        } else {
                            if (i2 != 14) {
                                StringBuilder m4207 = C2098.m4207("Expected a name but was ");
                                m4207.append(c2535.mo4559());
                                m4207.append(c2535.m4579());
                                throw new IllegalStateException(m4207.toString());
                            }
                            i = 10;
                        }
                        c2535.f9908 = i;
                    }
                    K mo45342 = this.f9930.mo4534(c2535);
                    if (mo4589.put(mo45342, this.f9928.mo4534(c2535)) != null) {
                        throw new C2531("duplicate key: " + mo45342);
                    }
                }
                c2535.mo4570();
            }
            return mo4589;
        }
    }

    public C2555(C2547 c2547, boolean z) {
        this.f9926 = c2547;
        this.f9927 = z;
    }

    @Override // p131.p161.p211.InterfaceC2656
    /* renamed from: げつ〴ぬぐ */
    public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
        Type[] actualTypeArguments;
        Type type = c2672.f10128;
        if (!Map.class.isAssignableFrom(c2672.f10130)) {
            return null;
        }
        Class<?> m4618 = C2625.m4618(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type m4619 = C2625.m4619(type, m4618, Map.class);
            actualTypeArguments = m4619 instanceof ParameterizedType ? ((ParameterizedType) m4619).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new C2556(c2673, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? C2562.f9983 : c2673.m4646(new C2672<>(type2)), actualTypeArguments[1], c2673.m4646(new C2672<>(actualTypeArguments[1])), this.f9926.m4591(c2672));
    }
}
