package dev.epro.r0;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A7728317443059173920 extends H18172316468146598624 {
    public final W15255462148861058153 f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A7728317443059173920(Context context, Q13914734507241918864 q13914734507241918864, byte b) {
        super(context, q13914734507241918864);
        this.g = b;
        this.f = new W15255462148861058153(this, (byte) 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r8.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // dev.epro.r0.H18172316468146598624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c() {
        /*
            r8 = this;
            byte r0 = r8.g
            java.lang.String r1 = "status"
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r3 = -1
            r4 = 0
            java.lang.Object r5 = r8.b
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L88;
                case 1: goto L4c;
                default: goto Lf;
            }
        Lf:
            android.content.Context r5 = (android.content.Context) r5
            android.content.IntentFilter r8 = r8.g()
            android.content.Intent r8 = r5.registerReceiver(r4, r8)
            if (r8 == 0) goto L47
            java.lang.String r0 = r8.getAction()
            if (r0 != 0) goto L22
            goto L47
        L22:
            java.lang.String r8 = r8.getAction()
            if (r8 == 0) goto L46
            int r0 = r8.hashCode()
            r1 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r0 == r1) goto L40
            r1 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r0 == r1) goto L37
            goto L46
        L37:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L47
            goto L46
        L40:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r8 = r8.equals(r0)
        L46:
            r6 = r7
        L47:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L4c:
            android.content.IntentFilter r8 = new android.content.IntentFilter
            r8.<init>(r2)
            android.content.Context r5 = (android.content.Context) r5
            android.content.Intent r8 = r5.registerReceiver(r4, r8)
            if (r8 != 0) goto L65
            dev.epro.r0.B14824868959299866349 r8 = dev.epro.r0.B14824868959299866349.n()
            int r0 = dev.epro.r0.T11524986218876621286.a
            r8.getClass()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L87
        L65:
            int r0 = r8.getIntExtra(r1, r3)
            java.lang.String r1 = "level"
            int r1 = r8.getIntExtra(r1, r3)
            java.lang.String r2 = "scale"
            int r8 = r8.getIntExtra(r2, r3)
            float r1 = (float) r1
            float r8 = (float) r8
            float r1 = r1 / r8
            if (r0 == r6) goto L83
            r8 = 1041865114(0x3e19999a, float:0.15)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 <= 0) goto L82
            goto L83
        L82:
            r6 = r7
        L83:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
        L87:
            return r8
        L88:
            android.content.IntentFilter r8 = new android.content.IntentFilter
            r8.<init>(r2)
            android.content.Context r5 = (android.content.Context) r5
            android.content.Intent r8 = r5.registerReceiver(r4, r8)
            if (r8 != 0) goto La1
            dev.epro.r0.B14824868959299866349 r8 = dev.epro.r0.B14824868959299866349.n()
            int r0 = dev.epro.r0.E7856967994397430734.a
            r8.getClass()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto Lb1
        La1:
            int r8 = r8.getIntExtra(r1, r3)
            r0 = 2
            if (r8 == r0) goto Lad
            r0 = 5
            if (r8 != r0) goto Lac
            goto Lad
        Lac:
            r6 = r7
        Lad:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A7728317443059173920.c():java.lang.Object");
    }

    @Override // dev.epro.r0.H18172316468146598624
    public final void e() {
        B14824868959299866349 n = B14824868959299866349.n();
        int i = V11157196790895867036.a;
        n.getClass();
        ((Context) this.b).registerReceiver(this.f, g());
    }

    @Override // dev.epro.r0.H18172316468146598624
    public final void f() {
        B14824868959299866349 n = B14824868959299866349.n();
        int i = V11157196790895867036.a;
        n.getClass();
        ((Context) this.b).unregisterReceiver(this.f);
    }

    public final IntentFilter g() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
