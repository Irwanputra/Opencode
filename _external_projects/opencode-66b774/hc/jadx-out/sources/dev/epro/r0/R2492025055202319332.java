package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R2492025055202319332 implements A10838822263452390785 {
    public final W10067852399966859634 a;

    public R2492025055202319332(W10067852399966859634 w10067852399966859634) {
        this.a = w10067852399966859634;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        return this.a.a(j4720286603213127984, O4077903568229246.r(j4720286603213127984), i);
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        return this.a.b(j4720286603213127984, O4077903568229246.r(j4720286603213127984), i);
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        return this.a.c(i5164649337253478959, O4077903568229246.r(i5164649337253478959), j);
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        return this.a.d(j4720286603213127984, O4077903568229246.r(j4720286603213127984), i);
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        return this.a.e(j4720286603213127984, O4077903568229246.r(j4720286603213127984), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof R2492025055202319332) && S10823041268949770285.t(this.a, ((R2492025055202319332) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
