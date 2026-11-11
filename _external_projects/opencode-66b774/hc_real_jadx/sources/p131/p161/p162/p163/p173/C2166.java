package p131.p161.p162.p163.p173;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2166 implements InterfaceC2177 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final float f9089;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC2177 f9090;

    public C2166(float f, InterfaceC2177 interfaceC2177) {
        while (interfaceC2177 instanceof C2166) {
            interfaceC2177 = ((C2166) interfaceC2177).f9090;
            f += ((C2166) interfaceC2177).f9089;
        }
        this.f9090 = interfaceC2177;
        this.f9089 = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2166)) {
            return false;
        }
        C2166 c2166 = (C2166) obj;
        return this.f9090.equals(c2166.f9090) && this.f9089 == c2166.f9089;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9090, Float.valueOf(this.f9089)});
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2177
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float mo4271(RectF rectF) {
        return Math.max(0.0f, this.f9090.mo4271(rectF) + this.f9089);
    }
}
