package dev.epro.r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B13711562814518287862 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Q12598757537405990809 a;
    public final /* synthetic */ N3121440022506799205 b;
    public final /* synthetic */ N3121440022506799205 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public B13711562814518287862(Q12598757537405990809 q12598757537405990809, N3121440022506799205 n3121440022506799205, N3121440022506799205 n31214400225067992052, int i, View view) {
        this.a = q12598757537405990809;
        this.b = n3121440022506799205;
        this.c = n31214400225067992052;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Q12598757537405990809 q12598757537405990809 = this.a;
        L9028203031476232898 l9028203031476232898 = q12598757537405990809.a;
        l9028203031476232898.e(animatedFraction);
        float c = l9028203031476232898.c();
        PathInterpolator pathInterpolator = V7994488537893142047.e;
        int i = Build.VERSION.SDK_INT;
        N3121440022506799205 n3121440022506799205 = this.b;
        F3837300029271916472 b6446223468909275612 = i >= 36 ? new B6446223468909275612(n3121440022506799205) : i >= 35 ? new O17126913626849052802(n3121440022506799205) : i >= 34 ? new Q10879412431158002632(n3121440022506799205) : i >= 31 ? new Q3455882957094431299(n3121440022506799205) : i >= 30 ? new V18164520886680827197(n3121440022506799205) : i >= 29 ? new D9305770446274769439(n3121440022506799205) : new G16448537019021176841(n3121440022506799205);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            J11937375245988738237 j11937375245988738237 = n3121440022506799205.a;
            if (i3 == 0) {
                b6446223468909275612.d(i2, j11937375245988738237.i(i2));
            } else {
                Z1975157152518754667 i4 = j11937375245988738237.i(i2);
                Z1975157152518754667 i5 = this.c.a.i(i2);
                float f = 1.0f - c;
                b6446223468909275612.d(i2, N3121440022506799205.a(i4, (int) (((i4.a - i5.a) * f) + 0.5d), (int) (((i4.b - i5.b) * f) + 0.5d), (int) (((i4.c - i5.c) * f) + 0.5d), (int) (((i4.d - i5.d) * f) + 0.5d)));
            }
        }
        V7994488537893142047.h(this.e, b6446223468909275612.b(), Collections.singletonList(q12598757537405990809));
    }
}
