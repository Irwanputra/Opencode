package p131.p161.p211.p214.p215;

import p131.p155.p156.p157.C2098;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2661;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2522;
import p131.p161.p211.InterfaceC2530;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p212.InterfaceC2526;
import p131.p161.p211.p214.C2547;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2614 implements InterfaceC2656 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2547 f10041;

    public C2614(C2547 c2547) {
        this.f10041 = c2547;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC2658<?> m4609(C2547 c2547, C2673 c2673, C2672<?> c2672, InterfaceC2526 interfaceC2526) {
        AbstractC2658<?> c2609;
        Object mo4589 = c2547.m4591(new C2672(interfaceC2526.value())).mo4589();
        if (mo4589 instanceof AbstractC2658) {
            c2609 = (AbstractC2658) mo4589;
        } else if (mo4589 instanceof InterfaceC2656) {
            c2609 = ((InterfaceC2656) mo4589).mo4592(c2673, c2672);
        } else {
            boolean z = mo4589 instanceof InterfaceC2522;
            if (!z && !(mo4589 instanceof InterfaceC2530)) {
                StringBuilder m4207 = C2098.m4207("Invalid attempt to bind an instance of ");
                m4207.append(mo4589.getClass().getName());
                m4207.append(" as a @JsonAdapter for ");
                m4207.append(c2672.toString());
                m4207.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(m4207.toString());
            }
            c2609 = new C2609<>(z ? (InterfaceC2522) mo4589 : null, mo4589 instanceof InterfaceC2530 ? (InterfaceC2530) mo4589 : null, c2673, c2672, null);
        }
        return (c2609 == null || !interfaceC2526.nullSafe()) ? c2609 : new C2661(c2609);
    }

    @Override // p131.p161.p211.InterfaceC2656
    /* renamed from: げつ〴ぬぐ */
    public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
        InterfaceC2526 interfaceC2526 = (InterfaceC2526) c2672.f10130.getAnnotation(InterfaceC2526.class);
        if (interfaceC2526 == null) {
            return null;
        }
        return (AbstractC2658<T>) m4609(this.f10041, c2673, c2672, interfaceC2526);
    }
}
