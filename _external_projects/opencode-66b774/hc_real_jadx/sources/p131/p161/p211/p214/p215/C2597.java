package p131.p161.p211.p214.p215;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;
import p131.p161.p211.p214.C2625;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2597<E> extends AbstractC2658<Object> {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final InterfaceC2656 f10003 = new C2598();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AbstractC2658<E> f10004;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Class<E> f10005;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2598 implements InterfaceC2656 {
        @Override // p131.p161.p211.InterfaceC2656
        /* renamed from: げつ〴ぬぐ */
        public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
            Type type = c2672.f10128;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new C2597(c2673, c2673.m4646(new C2672<>(genericComponentType)), C2625.m4618(genericComponentType));
        }
    }

    public C2597(C2673 c2673, AbstractC2658<E> abstractC2658, Class<E> cls) {
        this.f10004 = new C2615(c2673, abstractC2658, cls);
        this.f10005 = cls;
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, Object obj) {
        if (obj == null) {
            c2534.mo4541();
            return;
        }
        c2534.mo4557();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f10004.mo4533(c2534, Array.get(obj, i));
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
        ArrayList arrayList = new ArrayList();
        c2535.mo4574();
        while (c2535.mo4563()) {
            arrayList.add(this.f10004.mo4534(c2535));
        }
        c2535.mo4583();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f10005, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }
}
