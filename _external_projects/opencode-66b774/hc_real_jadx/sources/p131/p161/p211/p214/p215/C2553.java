package p131.p161.p211.p214.p215;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;
import p131.p161.p211.p214.C2547;
import p131.p161.p211.p214.C2625;
import p131.p161.p211.p214.InterfaceC2629;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2553 implements InterfaceC2656 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2547 f9923;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C2554<E> extends AbstractC2658<Collection<E>> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final InterfaceC2629<? extends Collection<E>> f9924;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final AbstractC2658<E> f9925;

        public C2554(C2673 c2673, Type type, AbstractC2658<E> abstractC2658, InterfaceC2629<? extends Collection<E>> interfaceC2629) {
            this.f9925 = new C2615(c2673, abstractC2658, type);
            this.f9924 = interfaceC2629;
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: 〺つふすそ */
        public void mo4533(C2534 c2534, Object obj) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                c2534.mo4541();
                return;
            }
            c2534.mo4557();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f9925.mo4533(c2534, it.next());
            }
            c2534.mo4555();
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: げつ〴ぬぐ */
        public Object mo4534(C2535 c2535) {
            if (c2535.mo4559() == EnumC2533.NULL) {
                c2535.mo4572();
                return null;
            }
            Collection<E> mo4589 = this.f9924.mo4589();
            c2535.mo4574();
            while (c2535.mo4563()) {
                mo4589.add(this.f9925.mo4534(c2535));
            }
            c2535.mo4583();
            return mo4589;
        }
    }

    public C2553(C2547 c2547) {
        this.f9923 = c2547;
    }

    @Override // p131.p161.p211.InterfaceC2656
    /* renamed from: げつ〴ぬぐ */
    public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
        Type type = c2672.f10128;
        Class<? super T> cls = c2672.f10130;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type m4619 = C2625.m4619(type, cls, Collection.class);
        if (m4619 instanceof WildcardType) {
            m4619 = ((WildcardType) m4619).getUpperBounds()[0];
        }
        Class cls2 = m4619 instanceof ParameterizedType ? ((ParameterizedType) m4619).getActualTypeArguments()[0] : Object.class;
        return new C2554(c2673, cls2, c2673.m4646(new C2672<>(cls2)), this.f9923.m4591(c2672));
    }
}
