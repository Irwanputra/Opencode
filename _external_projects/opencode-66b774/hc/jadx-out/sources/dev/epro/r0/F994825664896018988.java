package dev.epro.r0;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F994825664896018988 extends L9028203031476232898 {
    public final WindowInsetsAnimation e;

    public F994825664896018988(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // dev.epro.r0.L9028203031476232898
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // dev.epro.r0.L9028203031476232898
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // dev.epro.r0.L9028203031476232898
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // dev.epro.r0.L9028203031476232898
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // dev.epro.r0.L9028203031476232898
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
