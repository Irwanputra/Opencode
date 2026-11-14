package dev.epro.r0;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z15700854437409326936 extends F3160751278268780235 implements Runnable, S15634377979812012213, View.OnAttachStateChangeListener {
    public final L11283005264715124852 c;
    public boolean d;
    public boolean e;
    public N3121440022506799205 f;

    public Z15700854437409326936(L11283005264715124852 l11283005264715124852) {
        super(!l11283005264715124852.t ? 1 : 0);
        this.c = l11283005264715124852;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void d(Q12598757537405990809 q12598757537405990809) {
        this.d = false;
        this.e = false;
        N3121440022506799205 n3121440022506799205 = this.f;
        if (q12598757537405990809.a.b() > 0 && n3121440022506799205 != null) {
            J11937375245988738237 j11937375245988738237 = n3121440022506799205.a;
            L11283005264715124852 l11283005264715124852 = this.c;
            l11283005264715124852.s.f(M17147082063200071302.N(j11937375245988738237.i(8)));
            l11283005264715124852.r.f(M17147082063200071302.N(j11937375245988738237.i(8)));
            L11283005264715124852.b(l11283005264715124852, n3121440022506799205);
        }
        this.f = null;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void e(Q12598757537405990809 q12598757537405990809) {
        this.d = true;
        this.e = true;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final N3121440022506799205 f(N3121440022506799205 n3121440022506799205, List list) {
        L11283005264715124852 l11283005264715124852 = this.c;
        L11283005264715124852.b(l11283005264715124852, n3121440022506799205);
        return l11283005264715124852.t ? N3121440022506799205.b : n3121440022506799205;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final V10300877997588547986 g(Q12598757537405990809 q12598757537405990809, V10300877997588547986 v10300877997588547986) {
        this.d = false;
        return v10300877997588547986;
    }

    @Override // dev.epro.r0.S15634377979812012213
    public final N3121440022506799205 h(View view, N3121440022506799205 n3121440022506799205) {
        this.f = n3121440022506799205;
        L11283005264715124852 l11283005264715124852 = this.c;
        Q16155885045079384933 q16155885045079384933 = l11283005264715124852.r;
        J11937375245988738237 j11937375245988738237 = n3121440022506799205.a;
        q16155885045079384933.f(M17147082063200071302.N(j11937375245988738237.i(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            l11283005264715124852.s.f(M17147082063200071302.N(j11937375245988738237.i(8)));
            L11283005264715124852.b(l11283005264715124852, n3121440022506799205);
        }
        return l11283005264715124852.t ? N3121440022506799205.b : n3121440022506799205;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            N3121440022506799205 n3121440022506799205 = this.f;
            if (n3121440022506799205 != null) {
                L11283005264715124852 l11283005264715124852 = this.c;
                l11283005264715124852.s.f(M17147082063200071302.N(n3121440022506799205.a.i(8)));
                L11283005264715124852.b(l11283005264715124852, n3121440022506799205);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
