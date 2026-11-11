package p131.p161.p162.p163.p185;

import android.os.Build;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2271 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f9462;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f9463;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f9464;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f9465;

    public C2271(int i, int i2, int i3, int i4) {
        this.f9464 = i;
        this.f9462 = i2;
        this.f9463 = i3;
        this.f9465 = i4;
    }

    public C2271(C2271 c2271) {
        this.f9464 = c2271.f9464;
        this.f9462 = c2271.f9462;
        this.f9463 = c2271.f9463;
        this.f9465 = c2271.f9465;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4439(View view) {
        int i = this.f9464;
        int i2 = this.f9462;
        int i3 = this.f9463;
        int i4 = this.f9465;
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }
}
