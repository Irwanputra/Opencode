package dev.epro.r0;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S15087790042213527970 {
    public final ComponentName a;

    static {
        B14824868959299866349.o("SystemJobInfoConverter");
    }

    public S15087790042213527970(Context context, O12545633033254628644 o12545633033254628644) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
