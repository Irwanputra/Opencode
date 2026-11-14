package dev.epro.r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X7349411410832153785 {
    public final I15982850730816748353 a;

    public X7349411410832153785(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new I10255317576133479409(nestedScrollView);
        } else {
            this.a = new E17149812035295265804((byte) 28);
        }
    }
}
