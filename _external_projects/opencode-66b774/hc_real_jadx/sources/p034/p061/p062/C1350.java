package p034.p061.p062;

import java.util.ArrayList;
import java.util.HashSet;
import p034.p035.p042.C1053;
import p034.p080.C1493;

/* renamed from: づざかべべ.ぁごぐすすぃ.びぐびあび.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1350<T> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1053<ArrayList<T>> f6459 = new C1053<>(10);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1493<T, ArrayList<T>> f6457 = new C1493<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ArrayList<T> f6458 = new ArrayList<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final HashSet<T> f6460 = new HashSet<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m3035(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> orDefault = this.f6457.getOrDefault(t, null);
        if (orDefault != null) {
            int size = orDefault.size();
            for (int i = 0; i < size; i++) {
                m3035(orDefault.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3036(T t) {
        if (this.f6457.m3251(t) >= 0) {
            return;
        }
        this.f6457.put(t, null);
    }
}
