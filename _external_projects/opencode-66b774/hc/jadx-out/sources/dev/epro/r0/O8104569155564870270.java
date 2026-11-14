package dev.epro.r0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O8104569155564870270 implements I5164649337253478959, J4720286603213127984 {
    public final /* synthetic */ J4720286603213127984 a;
    public final F10342546226345611902 b;

    public O8104569155564870270(J4720286603213127984 j4720286603213127984, F10342546226345611902 f10342546226345611902) {
        this.a = j4720286603213127984;
        this.b = f10342546226345611902;
    }

    @Override // dev.epro.r0.J4720286603213127984
    public final boolean A() {
        return this.a.A();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long E0(float f) {
        return this.a.E0(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long G(float f) {
        return this.a.G(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long I(long j) {
        return this.a.I(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float K(float f) {
        return this.a.K(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float M0(int i) {
        return this.a.M0(i);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float P0(float f) {
        return this.a.P0(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int X(long j) {
        return this.a.X(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float Y(long j) {
        return this.a.Y(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.a.c();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int g0(float f) {
        return this.a.g0(f);
    }

    @Override // dev.epro.r0.J4720286603213127984
    public final F10342546226345611902 getLayoutDirection() {
        return this.b;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.a.s();
    }

    @Override // dev.epro.r0.I5164649337253478959
    public final H11646813293457574213 t(int i, int i2, Map map, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            P753981624812481271.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new G16918553482983453359(i, i2, map, f4096073349764486348);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long t0(long j) {
        return this.a.t0(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float v0(long j) {
        return this.a.v0(j);
    }
}
