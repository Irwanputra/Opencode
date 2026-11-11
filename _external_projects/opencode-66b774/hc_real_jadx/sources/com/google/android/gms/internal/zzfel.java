package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfek;
import com.google.android.gms.internal.zzfel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzfel<MessageType extends zzfek<MessageType, BuilderType>, BuilderType extends zzfel<MessageType, BuilderType>> implements zzfhf {
    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzffz.checkNotNull(iterable);
        if (!(iterable instanceof zzfgl)) {
            if (iterable instanceof zzfhl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List<?> zzcyl = ((zzfgl) iterable).zzcyl();
        zzfgl zzfglVar = (zzfgl) list;
        int size = list.size();
        for (Object obj : zzcyl) {
            if (obj == null) {
                int size2 = zzfglVar.size() - size;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                String sb2 = sb.toString();
                for (int size3 = zzfglVar.size() - 1; size3 >= size; size3--) {
                    zzfglVar.remove(size3);
                }
                throw new NullPointerException(sb2);
            }
            if (!(obj instanceof zzfes)) {
                zzfglVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size2 = list.size() - size;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                String sb2 = sb.toString();
                for (int size3 = list.size() - 1; size3 >= size; size3--) {
                    list.remove(size3);
                }
                throw new NullPointerException(sb2);
            }
            list.add(t);
        }
    }

    public abstract BuilderType zza(MessageType messagetype);

    @Override // com.google.android.gms.internal.zzfhf
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zzffb zzffbVar, zzffm zzffmVar);

    @Override // 
    /* renamed from: zzcvh, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.zzfhf
    public final /* synthetic */ zzfhf zzd(zzfhe zzfheVar) {
        if (zzcxq().getClass().isInstance(zzfheVar)) {
            return zza((zzfek) zzfheVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
