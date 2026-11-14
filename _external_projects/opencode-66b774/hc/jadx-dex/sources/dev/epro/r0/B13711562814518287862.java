package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B13711562814518287862 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ dev.epro.r0.Q12598757537405990809 a;
    public final /* synthetic */ dev.epro.r0.N3121440022506799205 b;
    public final /* synthetic */ dev.epro.r0.N3121440022506799205 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.View e;

    public B13711562814518287862(dev.epro.r0.Q12598757537405990809 q12598757537405990809, dev.epro.r0.N3121440022506799205 n3121440022506799205, dev.epro.r0.N3121440022506799205 n31214400225067992052, int i, android.view.View view) {
        this.a = q12598757537405990809;
        this.b = n3121440022506799205;
        this.c = n31214400225067992052;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        dev.epro.r0.Q12598757537405990809 q12598757537405990809 = this.a;
        dev.epro.r0.L9028203031476232898 l9028203031476232898 = q12598757537405990809.a;
        l9028203031476232898.e(animatedFraction);
        float fC = l9028203031476232898.c();
        android.view.animation.PathInterpolator pathInterpolator = dev.epro.r0.V7994488537893142047.e;
        int i = android.os.Build.VERSION.SDK_INT;
        dev.epro.r0.N3121440022506799205 n3121440022506799205 = this.b;
        dev.epro.r0.F3837300029271916472 b6446223468909275612 = i >= 36 ? new dev.epro.r0.B6446223468909275612(n3121440022506799205) : i >= 35 ? new dev.epro.r0.O17126913626849052802(n3121440022506799205) : i >= 34 ? new dev.epro.r0.Q10879412431158002632(n3121440022506799205) : i >= 31 ? new dev.epro.r0.Q3455882957094431299(n3121440022506799205) : i >= 30 ? new dev.epro.r0.V18164520886680827197(n3121440022506799205) : i >= 29 ? new dev.epro.r0.D9305770446274769439(n3121440022506799205) : new dev.epro.r0.G16448537019021176841(n3121440022506799205);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            dev.epro.r0.J11937375245988738237 j11937375245988738237 = n3121440022506799205.a;
            if (i3 == 0) {
                b6446223468909275612.d(i2, j11937375245988738237.i(i2));
            } else {
                dev.epro.r0.Z1975157152518754667 z1975157152518754667I = j11937375245988738237.i(i2);
                dev.epro.r0.Z1975157152518754667 z1975157152518754667I2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                b6446223468909275612.d(i2, dev.epro.r0.N3121440022506799205.a(z1975157152518754667I, (int) (((double) ((z1975157152518754667I.a - z1975157152518754667I2.a) * f)) + 0.5d), (int) (((double) ((z1975157152518754667I.b - z1975157152518754667I2.b) * f)) + 0.5d), (int) (((double) ((z1975157152518754667I.c - z1975157152518754667I2.c) * f)) + 0.5d), (int) (((double) ((z1975157152518754667I.d - z1975157152518754667I2.d) * f)) + 0.5d)));
            }
        }
        dev.epro.r0.V7994488537893142047.h(this.e, b6446223468909275612.b(), java.util.Collections.singletonList(q12598757537405990809));
    }
}
