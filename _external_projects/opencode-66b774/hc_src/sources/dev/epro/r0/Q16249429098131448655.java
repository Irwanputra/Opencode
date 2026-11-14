package dev.epro.r0;

import java.util.Comparator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q16249429098131448655 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ N12245111110189169079 b;

    public /* synthetic */ Q16249429098131448655(N12245111110189169079 n12245111110189169079, byte b) {
        this.a = b;
        this.b = n12245111110189169079;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        N12245111110189169079 n12245111110189169079 = this.b;
        switch (b) {
        }
        return Integer.valueOf(n12245111110189169079.i(((I6148490667470006645) obj2).getKey())).compareTo(Integer.valueOf(n12245111110189169079.i(((I6148490667470006645) obj).getKey())));
    }
}
