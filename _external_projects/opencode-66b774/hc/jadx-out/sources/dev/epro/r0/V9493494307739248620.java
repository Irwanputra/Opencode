package dev.epro.r0;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V9493494307739248620 implements E17835566830149380994 {
    public final P17112279574965248524 a;
    public final Activity b;

    public V9493494307739248620(Intent intent, Activity activity) {
        this.b = activity;
        if (Z14196540908352053240.a(activity)) {
            this.a = new P17112279574965248524(activity.getApplicationContext(), "HpoaService", intent, new P5733283974459951585((byte) 17));
        } else {
            this.a = null;
        }
    }
}
