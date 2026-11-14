package dev.epro.r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N3121440022506799205 {
    public static final N3121440022506799205 b;
    public final J11937375245988738237 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = I6809612112758996898.x;
        } else if (i >= 30) {
            b = X1518933376781917419.w;
        } else {
            b = J11937375245988738237.b;
        }
    }

    public N3121440022506799205(N3121440022506799205 n3121440022506799205) {
        if (n3121440022506799205 == null) {
            this.a = new J11937375245988738237(this);
            return;
        }
        J11937375245988738237 j11937375245988738237 = n3121440022506799205.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (j11937375245988738237 instanceof I2948461556674220507)) {
            this.a = new I2948461556674220507(this, (I2948461556674220507) j11937375245988738237);
        } else if (i >= 34 && (j11937375245988738237 instanceof I6809612112758996898)) {
            this.a = new I6809612112758996898(this, (I6809612112758996898) j11937375245988738237);
        } else if (i >= 31 && (j11937375245988738237 instanceof R11468698777038055282)) {
            this.a = new R11468698777038055282(this, (R11468698777038055282) j11937375245988738237);
        } else if (i >= 30 && (j11937375245988738237 instanceof X1518933376781917419)) {
            this.a = new X1518933376781917419(this, (X1518933376781917419) j11937375245988738237);
        } else if (i >= 29 && (j11937375245988738237 instanceof K12387811218152668980)) {
            this.a = new K12387811218152668980(this, (K12387811218152668980) j11937375245988738237);
        } else if (i >= 28 && (j11937375245988738237 instanceof V6310040811667546528)) {
            this.a = new V6310040811667546528(this, (V6310040811667546528) j11937375245988738237);
        } else if (j11937375245988738237 instanceof A15549915418839859568) {
            this.a = new A15549915418839859568(this, (A15549915418839859568) j11937375245988738237);
        } else if (j11937375245988738237 instanceof H960234695227575304) {
            this.a = new H960234695227575304(this, (H960234695227575304) j11937375245988738237);
        } else {
            this.a = new J11937375245988738237(this);
        }
        j11937375245988738237.e(this);
    }

    public static Z1975157152518754667 a(Z1975157152518754667 z1975157152518754667, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, z1975157152518754667.a - i);
        int iMax2 = Math.max(0, z1975157152518754667.b - i2);
        int iMax3 = Math.max(0, z1975157152518754667.c - i3);
        int iMax4 = Math.max(0, z1975157152518754667.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? z1975157152518754667 : Z1975157152518754667.b(iMax, iMax2, iMax3, iMax4);
    }

    public static N3121440022506799205 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        N3121440022506799205 n3121440022506799205 = new N3121440022506799205(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = W10240872260424387225.a;
            N3121440022506799205 n3121440022506799205A = K10428636177324322555.a(view);
            J11937375245988738237 j11937375245988738237 = n3121440022506799205.a;
            j11937375245988738237.y(n3121440022506799205A);
            View rootView = view.getRootView();
            j11937375245988738237.d(rootView);
            j11937375245988738237.p(rootView);
            j11937375245988738237.q();
            j11937375245988738237.A(view.getWindowSystemUiVisibility());
        }
        return n3121440022506799205;
    }

    public final WindowInsets b() {
        J11937375245988738237 j11937375245988738237 = this.a;
        if (j11937375245988738237 instanceof H960234695227575304) {
            return ((H960234695227575304) j11937375245988738237).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N3121440022506799205) {
            return Objects.equals(this.a, ((N3121440022506799205) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        J11937375245988738237 j11937375245988738237 = this.a;
        if (j11937375245988738237 == null) {
            return 0;
        }
        return j11937375245988738237.hashCode();
    }

    public N3121440022506799205(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new I2948461556674220507(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new I6809612112758996898(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new R11468698777038055282(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new X1518933376781917419(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new K12387811218152668980(this, windowInsets);
        } else if (i >= 28) {
            this.a = new V6310040811667546528(this, windowInsets);
        } else {
            this.a = new A15549915418839859568(this, windowInsets);
        }
    }
}
