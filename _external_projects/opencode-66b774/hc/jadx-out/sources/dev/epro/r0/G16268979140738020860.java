package dev.epro.r0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G16268979140738020860 extends Q4687907353276880766 {
    public final /* synthetic */ byte a;
    public final C560824835210562156 b;

    public /* synthetic */ G16268979140738020860(C560824835210562156 c560824835210562156, byte b) {
        this.a = b;
        this.b = c560824835210562156;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        byte b = this.a;
        C560824835210562156 c560824835210562156 = this.b;
        switch (b) {
        }
        return c560824835210562156.b;
    }

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        byte b = this.a;
        C560824835210562156 c560824835210562156 = this.b;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = c560824835210562156.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && c560824835210562156.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return c560824835210562156.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        C560824835210562156 c560824835210562156 = this.b;
        switch (b) {
            case 0:
                B14108412273878533248 b14108412273878533248 = c560824835210562156.a;
                Y975470382943463598[] y975470382943463598Arr = new Y975470382943463598[8];
                for (int i = 0; i < 8; i++) {
                    y975470382943463598Arr[i] = new I16387300989914550797((byte) 0);
                }
                return new D3990401954667247864(b14108412273878533248, y975470382943463598Arr);
            default:
                B14108412273878533248 b141084122738785332482 = c560824835210562156.a;
                Y975470382943463598[] y975470382943463598Arr2 = new Y975470382943463598[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    y975470382943463598Arr2[i2] = new I16387300989914550797((byte) 1);
                }
                return new D3990401954667247864(b141084122738785332482, y975470382943463598Arr2);
        }
    }
}
