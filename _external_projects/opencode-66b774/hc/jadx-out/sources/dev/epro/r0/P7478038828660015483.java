package dev.epro.r0;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P7478038828660015483 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.O13555142349968671984 a(dev.epro.r0.O10944101174480148852 r7, dev.epro.r0.B18380949320309934747 r8, dev.epro.r0.T15443218846549482730 r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = dev.epro.r0.U10212628459988632488.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L40
            r0 = 6
            dev.epro.r0.H17686692708284905246 r0 = dev.epro.r0.I3887072968740112330.a(r2, r0, r3)
            dev.epro.r0.O12494175665883759871 r4 = dev.epro.r0.C18359104897526640234.m
            java.lang.Object r4 = r4.getValue()
            dev.epro.r0.G8001132634698687269 r4 = (dev.epro.r0.G8001132634698687269) r4
            dev.epro.r0.A2789795882633926065 r4 = dev.epro.r0.O8620973563946607355.a(r4)
            dev.epro.r0.C288342651169725874 r5 = new dev.epro.r0.C288342651169725874
            r6 = 11
            r5.<init>(r0, r3, r6)
            r6 = 3
            dev.epro.r0.R7033599853981556291.E(r4, r3, r3, r5, r6)
            dev.epro.r0.S16262227471297796850 r4 = new dev.epro.r0.S16262227471297796850
            r5 = 2
            r4.<init>(r0, r5)
            java.lang.Object r0 = dev.epro.r0.D459204867321966484.c
            monitor-enter(r0)
            java.util.List r5 = dev.epro.r0.D459204867321966484.i     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r4 = dev.epro.r0.R9411874267597469228.P0(r5, r4)     // Catch: java.lang.Throwable -> L3d
            dev.epro.r0.D459204867321966484.i = r4     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            dev.epro.r0.D459204867321966484.c()
            goto L40
        L3d:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L40:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L5a
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof dev.epro.r0.S7974369370986781936
            if (r1 == 0) goto L51
            dev.epro.r0.S7974369370986781936 r0 = (dev.epro.r0.S7974369370986781936) r0
            goto L52
        L51:
            r0 = r3
        L52:
            if (r0 == 0) goto L58
            r0.setComposeViewContext(r8)
            goto L5e
        L58:
            r0 = r3
            goto L5e
        L5a:
            r7.removeAllViews()
            goto L58
        L5e:
            if (r0 != 0) goto L72
            dev.epro.r0.S7974369370986781936 r0 = new dev.epro.r0.S7974369370986781936
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = dev.epro.r0.P7478038828660015483.a
            r7.addView(r1, r4)
        L72:
            r0.setComposeViewContext(r8)
            dev.epro.r0.B18380949320309934747 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L81
            r8.e()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L81:
            r7 = 2131296831(0x7f09023f, float:1.821159E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof dev.epro.r0.O13555142349968671984
            if (r2 == 0) goto L8f
            r3 = r1
            dev.epro.r0.O13555142349968671984 r3 = (dev.epro.r0.O13555142349968671984) r3
        L8f:
            if (r3 != 0) goto Lab
            dev.epro.r0.O13555142349968671984 r3 = new dev.epro.r0.O13555142349968671984
            dev.epro.r0.Z5153954235810715664 r1 = new dev.epro.r0.Z5153954235810715664
            dev.epro.r0.H11725168162114556860 r2 = r0.getRoot()
            r1.<init>(r2)
            dev.epro.r0.Y5209789131793062978 r2 = r8.c()
            dev.epro.r0.S12944751221596631194 r4 = new dev.epro.r0.S12944751221596631194
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Lab:
            r3.f(r9)
            dev.epro.r0.Y5209789131793062978 r7 = r8.c()
            dev.epro.r0.V11105185854535875412 r8 = new dev.epro.r0.V11105185854535875412
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7478038828660015483.a(dev.epro.r0.O10944101174480148852, dev.epro.r0.B18380949320309934747, dev.epro.r0.T15443218846549482730):dev.epro.r0.O13555142349968671984");
    }
}
