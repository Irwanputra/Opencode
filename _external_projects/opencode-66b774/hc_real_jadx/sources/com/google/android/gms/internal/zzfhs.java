package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.Stack;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfhs {
    private final Stack<zzfes> zzpjm;

    private zzfhs() {
        this.zzpjm = new Stack<>();
    }

    private final void zzba(zzfes zzfesVar) {
        zzfhr zzfhrVar;
        while (!zzfesVar.zzcvo()) {
            if (!(zzfesVar instanceof zzfhq)) {
                String valueOf = String.valueOf(zzfesVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            zzfhq zzfhqVar = (zzfhq) zzfesVar;
            zzba(zzfhqVar.zzpji);
            zzfesVar = zzfhqVar.zzpjj;
        }
        int zzlz = zzlz(zzfesVar.size());
        int i = zzfhq.zzpjg[zzlz + 1];
        if (this.zzpjm.isEmpty() || this.zzpjm.peek().size() >= i) {
            this.zzpjm.push(zzfesVar);
            return;
        }
        int i2 = zzfhq.zzpjg[zzlz];
        zzfes pop = this.zzpjm.pop();
        while (true) {
            zzfhrVar = null;
            if (this.zzpjm.isEmpty() || this.zzpjm.peek().size() >= i2) {
                break;
            } else {
                pop = new zzfhq(this.zzpjm.pop(), pop);
            }
        }
        zzfhq zzfhqVar2 = new zzfhq(pop, zzfesVar);
        while (!this.zzpjm.isEmpty()) {
            if (this.zzpjm.peek().size() >= zzfhq.zzpjg[zzlz(zzfhqVar2.size()) + 1]) {
                break;
            } else {
                zzfhqVar2 = new zzfhq(this.zzpjm.pop(), zzfhqVar2);
            }
        }
        this.zzpjm.push(zzfhqVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzfes zzc(zzfes zzfesVar, zzfes zzfesVar2) {
        zzba(zzfesVar);
        zzba(zzfesVar2);
        zzfes pop = this.zzpjm.pop();
        while (!this.zzpjm.isEmpty()) {
            pop = new zzfhq(this.zzpjm.pop(), pop);
        }
        return pop;
    }

    private static int zzlz(int i) {
        int binarySearch = Arrays.binarySearch(zzfhq.zzpjg, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
