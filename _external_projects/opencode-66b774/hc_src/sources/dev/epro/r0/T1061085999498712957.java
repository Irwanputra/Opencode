package dev.epro.r0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T1061085999498712957 extends AnimatorListenerAdapter {
    public final /* synthetic */ Q12598757537405990809 a;
    public final /* synthetic */ View b;

    public T1061085999498712957(View view, Q12598757537405990809 q12598757537405990809) {
        this.a = q12598757537405990809;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Q12598757537405990809 q12598757537405990809 = this.a;
        q12598757537405990809.a.e(1.0f);
        V7994488537893142047.f(this.b, q12598757537405990809);
    }
}
