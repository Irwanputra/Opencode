package dev.epro.r0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q17938270031678740860 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ Q17938270031678740860(String str, Context context, Object obj, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        int i = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                Object[] objArr = {(O5645052741531709506) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return T1225794268786662319.b(str, context, Collections.unmodifiableList(arrayList), i);
            default:
                try {
                    return T1225794268786662319.b(str, context, (ArrayList) obj, i);
                } catch (Throwable unused) {
                    return new T9198164096090695723(-3);
                }
        }
    }
}
