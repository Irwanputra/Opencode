package dev.epro.r0;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G12010629111624924329 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntConsumer b;
    public final /* synthetic */ int c;

    public /* synthetic */ G12010629111624924329(IntConsumer intConsumer, int i, byte b) {
        this.a = b;
        this.b = intConsumer;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        IntConsumer intConsumer = this.b;
        switch (b) {
            case 0:
                intConsumer.accept(i);
                break;
            default:
                intConsumer.accept(i);
                break;
        }
    }
}
