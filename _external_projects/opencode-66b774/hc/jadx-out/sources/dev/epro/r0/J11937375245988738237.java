package dev.epro.r0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class J11937375245988738237 {
    public static final N3121440022506799205 b;
    public final N3121440022506799205 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new B6446223468909275612() : i >= 35 ? new O17126913626849052802() : i >= 34 ? new Q10879412431158002632() : i >= 31 ? new Q3455882957094431299() : i >= 30 ? new V18164520886680827197() : i >= 29 ? new D9305770446274769439() : new G16448537019021176841()).b().a.a().a.b().a.c();
    }

    public J11937375245988738237(N3121440022506799205 n3121440022506799205) {
        this.a = n3121440022506799205;
    }

    public N3121440022506799205 a() {
        return this.a;
    }

    public N3121440022506799205 b() {
        return this.a;
    }

    public N3121440022506799205 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J11937375245988738237)) {
            return false;
        }
        J11937375245988738237 j11937375245988738237 = (J11937375245988738237) obj;
        return t() == j11937375245988738237.t() && s() == j11937375245988738237.s() && Objects.equals(n(), j11937375245988738237.n()) && Objects.equals(l(), j11937375245988738237.l()) && Objects.equals(h(), j11937375245988738237.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public R825017289975842005 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public Z1975157152518754667 i(int i) {
        return Z1975157152518754667.e;
    }

    public Z1975157152518754667 j(int i) {
        if ((i & 8) == 0) {
            return Z1975157152518754667.e;
        }
        S10973172697741180971.j("Unable to query the maximum insets for IME");
        return null;
    }

    public Z1975157152518754667 k() {
        return n();
    }

    public Z1975157152518754667 l() {
        return Z1975157152518754667.e;
    }

    public Z1975157152518754667 m() {
        return n();
    }

    public Z1975157152518754667 n() {
        return Z1975157152518754667.e;
    }

    public Z1975157152518754667 o() {
        return n();
    }

    public N3121440022506799205 r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(N3121440022506799205 n3121440022506799205) {
    }

    public void p(View view) {
    }

    public void v(D14723526890230738817 d14723526890230738817) {
    }

    public void w(Z1975157152518754667[] z1975157152518754667Arr) {
    }

    public void x(Z1975157152518754667 z1975157152518754667) {
    }

    public void y(N3121440022506799205 n3121440022506799205) {
    }

    public void z(Z1975157152518754667 z1975157152518754667) {
    }
}
