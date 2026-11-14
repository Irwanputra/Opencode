package dev.epro.r0;

import android.os.Build;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G10327508498288787502 extends M2066880349381062048 {
    public final /* synthetic */ J6160233934771378283 W;
    public final /* synthetic */ String X;
    public final /* synthetic */ E3422549137300678133 Y;

    public G10327508498288787502(J6160233934771378283 j6160233934771378283, String str, E3422549137300678133 e3422549137300678133) {
        this.W = j6160233934771378283;
        this.X = str;
        this.Y = e3422549137300678133;
    }

    public final void U() {
        Object parcelable;
        Integer num;
        J6160233934771378283 j6160233934771378283 = this.W;
        Bundle bundle = j6160233934771378283.g;
        LinkedHashMap linkedHashMap = j6160233934771378283.f;
        String str = this.X;
        str.getClass();
        if (!j6160233934771378283.d.contains(str) && (num = (Integer) j6160233934771378283.b.remove(str)) != null) {
            j6160233934771378283.a.remove(num);
        }
        j6160233934771378283.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = T3623367008917729099.d(str, bundle);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!H15446768409112154310.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Objects.toString((H15446768409112154310) parcelable);
            bundle.remove(str);
        }
        if (j6160233934771378283.c.get(str) == null) {
            return;
        }
        Z3383101362411723454.s();
    }
}
