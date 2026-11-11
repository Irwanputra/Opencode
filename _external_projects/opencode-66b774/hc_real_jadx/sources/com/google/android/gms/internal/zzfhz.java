package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfhz<FieldDescriptorType> extends zzfhy<FieldDescriptorType, Object> {
    public zzfhz(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.zzfhy
    public final void zzbiy() {
        if (!isImmutable()) {
            for (int i = 0; i < zzczj(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzmb = zzmb(i);
                if (((zzffs) zzmb.getKey()).zzcxj()) {
                    zzmb.setValue(Collections.unmodifiableList((List) zzmb.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzczk()) {
                if (((zzffs) entry.getKey()).zzcxj()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzbiy();
    }
}
