package p034.p063.p064;

import android.graphics.Rect;
import java.util.Comparator;
import p034.p063.p064.AbstractC1353;

/* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1361<T> implements Comparator<T> {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean f6500;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final InterfaceC1351<T> f6502;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Rect f6501 = new Rect();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Rect f6499 = new Rect();

    public C1361(boolean z, InterfaceC1351<T> interfaceC1351) {
        this.f6500 = z;
        this.f6502 = interfaceC1351;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        Rect rect = this.f6501;
        Rect rect2 = this.f6499;
        ((AbstractC1353.C1356) this.f6502).m3048(t, rect);
        ((AbstractC1353.C1356) this.f6502).m3048(t2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.f6500 ? 1 : -1;
        }
        if (i3 > i4) {
            return this.f6500 ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return this.f6500 ? 1 : -1;
        }
        if (i7 > i8) {
            return this.f6500 ? -1 : 1;
        }
        return 0;
    }
}
