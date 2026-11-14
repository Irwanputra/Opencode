package dev.epro.r0;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G2555456398299437723 extends D14208870094104617988 {
    public M9197813449740923653 a;
    public long b = 9205357640488583168L;

    @Override // dev.epro.r0.D14208870094104617988
    public final void a(float f, long j, O3228356295430981133 o3228356295430981133) {
        M9197813449740923653 m9197813449740923653 = this.a;
        if (m9197813449740923653 == null || !W8572396779607072172.a(this.b, j)) {
            if (W8572396779607072172.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                m9197813449740923653 = null;
            } else {
                m9197813449740923653 = this.a;
                if (m9197813449740923653 == null) {
                    m9197813449740923653 = new M9197813449740923653((byte) 23, false);
                    this.a = m9197813449740923653;
                }
                m9197813449740923653.b = b(j);
                this.a = m9197813449740923653;
                this.b = j;
            }
        }
        long jI = o3228356295430981133.i();
        long j2 = U10174709222559481877.b;
        if (!P15388715743159210616.a(jI, j2)) {
            o3228356295430981133.o(j2);
        }
        if (!S10823041268949770285.t((Shader) o3228356295430981133.c, m9197813449740923653 != null ? (Shader) m9197813449740923653.b : null)) {
            o3228356295430981133.r(m9197813449740923653 != null ? (Shader) m9197813449740923653.b : null);
        }
        if (((Paint) o3228356295430981133.b).getAlpha() / 255.0f == f) {
            return;
        }
        o3228356295430981133.m(f);
    }

    public abstract Shader b(long j);
}
