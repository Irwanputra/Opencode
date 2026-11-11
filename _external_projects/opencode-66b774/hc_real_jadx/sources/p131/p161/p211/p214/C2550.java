package p131.p161.p211.p214;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import p131.p155.p156.p157.C2098;
import p131.p161.p211.C2543;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2550<T> implements InterfaceC2629<T> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ Type f9920;

    public C2550(C2547 c2547, Type type) {
        this.f9920 = type;
    }

    @Override // p131.p161.p211.p214.InterfaceC2629
    /* renamed from: げつ〴ぬぐ */
    public T mo4589() {
        Type type = this.f9920;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder m4207 = C2098.m4207("Invalid EnumSet type: ");
            m4207.append(this.f9920.toString());
            throw new C2543(m4207.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return (T) EnumSet.noneOf((Class) type2);
        }
        StringBuilder m42072 = C2098.m4207("Invalid EnumSet type: ");
        m42072.append(this.f9920.toString());
        throw new C2543(m42072.toString());
    }
}
