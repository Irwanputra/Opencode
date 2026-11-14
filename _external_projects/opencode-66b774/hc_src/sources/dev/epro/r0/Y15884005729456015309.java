package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y15884005729456015309 {
    public ArrayList a;
    public float[] b;

    public Y15884005729456015309(byte b) {
        switch (b) {
            case 1:
                this.b = new float[64];
                break;
            default:
                this.a = new ArrayList();
                float[] fArr = new float[5];
                for (int i = 0; i < 5; i++) {
                    fArr[i] = Float.NaN;
                }
                this.b = fArr;
                break;
        }
    }

    public void a(Object obj, float f) {
        ArrayList arrayList = this.a;
        arrayList.add(obj);
        if (this.b.length < arrayList.size()) {
            this.b = Arrays.copyOf(this.b, arrayList.size() + 2);
        }
        this.b[arrayList.size() - 1] = f;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public void b(java.lang.String r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y15884005729456015309.b(java.lang.String, java.util.ArrayList):void");
    }
}
