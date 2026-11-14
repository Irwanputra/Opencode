package dev.epro.r0;

import ads_mobile_sdk.mb3;
import ads_mobile_sdk.ob3;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class I8586442731552441025 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Map b;

    public /* synthetic */ I8586442731552441025(Map map, byte b) {
        this.a = b;
        this.b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((E17436120295797655087) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((E11030406304573768846) map).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 2:
                ((E17436120295797655087) map).clear();
                break;
            case 3:
                ((E11030406304573768846) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ((ob3) map).get(entry.getKey());
                return entry.getValue() == null;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((E17436120295797655087) map).get(entry2.getKey());
                Object value = entry2.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj3 = ((E11030406304573768846) map).get(entry3.getKey());
                Object value2 = entry3.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                return new A9403161892277650160((O827298036535440209) map);
            case 1:
                return new mb3((ob3) map);
            case 2:
                return new P1530735476536904619((E17436120295797655087) map, (byte) 0);
            default:
                return new P1530735476536904619((E11030406304573768846) map, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((E17436120295797655087) map).remove(entry.getKey());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((E11030406304573768846) map).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                return ((O827298036535440209) map).c;
            case 1:
                return ((ob3) map).b;
            case 2:
                return ((E17436120295797655087) map).size();
            default:
                return ((E11030406304573768846) map).size();
        }
    }
}
