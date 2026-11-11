package p131.p161.p162.p163.p173;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2178 implements InterfaceC2177 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final float f9116;

    public C2178(float f) {
        this.f9116 = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2178) && this.f9116 == ((C2178) obj).f9116;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9116)});
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2177
    /* renamed from: げつ〴ぬぐ */
    public float mo4271(RectF rectF) {
        return this.f9116;
    }
}
