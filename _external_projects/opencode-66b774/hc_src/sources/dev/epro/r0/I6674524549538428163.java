package dev.epro.r0;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I6674524549538428163 {
    public final Context a;
    public final H18172316468146598624 b;
    public final A7728317443059173920 c;
    public final H16804135748878711746 d;
    public final H18172316468146598624 e;

    public I6674524549538428163(Context context, Q13914734507241918864 q13914734507241918864) {
        H16804135748878711746 h16804135748878711746;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        A7728317443059173920 a7728317443059173920 = new A7728317443059173920(applicationContext, q13914734507241918864, (byte) 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        A7728317443059173920 a77283174430591739202 = new A7728317443059173920(applicationContext2, q13914734507241918864, (byte) 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            int i = J16202216050578767584.a;
            h16804135748878711746 = new H16804135748878711746(applicationContext3, q13914734507241918864);
        } else {
            h16804135748878711746 = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        A7728317443059173920 a77283174430591739203 = new A7728317443059173920(applicationContext4, q13914734507241918864, (byte) 2);
        this.a = context;
        this.b = a7728317443059173920;
        this.c = a77283174430591739202;
        this.d = h16804135748878711746;
        this.e = a77283174430591739203;
    }
}
