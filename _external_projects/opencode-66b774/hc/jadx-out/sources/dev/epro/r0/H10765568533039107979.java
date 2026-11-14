package dev.epro.r0;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H10765568533039107979 extends D14208870094104617988 {
    public final long a;

    public H10765568533039107979(long j) {
        this.a = j;
    }

    @Override // dev.epro.r0.D14208870094104617988
    public final void a(float f, long j, O3228356295430981133 o3228356295430981133) {
        o3228356295430981133.m(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = U10174709222559481877.b(U10174709222559481877.c(jB) * f, jB);
        }
        o3228356295430981133.o(jB);
        if (((Shader) o3228356295430981133.c) != null) {
            o3228356295430981133.r(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H10765568533039107979)) {
            return false;
        }
        long j = ((H10765568533039107979) obj).a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return G6547577305291411977.s("SolidColor(value=", U10174709222559481877.h(this.a), ")");
    }
}
