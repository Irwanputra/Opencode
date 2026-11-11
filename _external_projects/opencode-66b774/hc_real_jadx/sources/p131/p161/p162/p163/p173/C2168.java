package p131.p161.p162.p163.p173;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2168 implements InterfaceC2177 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final float f9092;

    public C2168(float f) {
        this.f9092 = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2168) && this.f9092 == ((C2168) obj).f9092;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9092)});
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2177
    /* renamed from: げつ〴ぬぐ */
    public float mo4271(RectF rectF) {
        return rectF.height() * this.f9092;
    }
}
