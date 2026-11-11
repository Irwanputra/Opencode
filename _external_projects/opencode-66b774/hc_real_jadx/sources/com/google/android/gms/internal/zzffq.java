package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzffq<FieldDescriptorType extends zzffs<FieldDescriptorType>> {
    private static final zzffq zzpgm = new zzffq(true);
    private boolean zzktj;
    private final zzfhy<FieldDescriptorType, Object> zzpgk;
    private boolean zzpgl;

    private zzffq() {
        this.zzpgl = false;
        this.zzpgk = zzfhy.zzma(16);
    }

    private zzffq(boolean z) {
        this.zzpgl = false;
        zzfhy<FieldDescriptorType, Object> zzma = zzfhy.zzma(0);
        this.zzpgk = zzma;
        if (this.zzktj) {
            return;
        }
        zzma.zzbiy();
        this.zzktj = true;
    }

    public static int zza(zzfiy zzfiyVar, int i, Object obj) {
        int zzlg = zzffg.zzlg(i);
        if (zzfiyVar == zzfiy.zzply) {
            zzffz.zzh((zzfhe) obj);
            zzlg <<= 1;
        }
        return zzlg + zzb(zzfiyVar, obj);
    }

    public static Object zza(zzffb zzffbVar, zzfiy zzfiyVar, boolean z) {
        zzfje zzfjeVar = zzfje.zzpmw;
        switch (zzfix.zzpgo[zzfiyVar.ordinal()]) {
            case 1:
                return Double.valueOf(zzffbVar.readDouble());
            case 2:
                return Float.valueOf(zzffbVar.readFloat());
            case 3:
                return Long.valueOf(zzffbVar.zzcvv());
            case 4:
                return Long.valueOf(zzffbVar.zzcvu());
            case 5:
                return Integer.valueOf(zzffbVar.zzcvw());
            case 6:
                return Long.valueOf(zzffbVar.zzcvx());
            case 7:
                return Integer.valueOf(zzffbVar.zzcvy());
            case 8:
                return Boolean.valueOf(zzffbVar.zzcvz());
            case 9:
                return zzffbVar.zzcwb();
            case 10:
                return Integer.valueOf(zzffbVar.zzcwc());
            case 11:
                return Integer.valueOf(zzffbVar.zzcwe());
            case 12:
                return Long.valueOf(zzffbVar.zzcwf());
            case 13:
                return Integer.valueOf(zzffbVar.zzcwg());
            case 14:
                return Long.valueOf(zzffbVar.zzcwh());
            case 15:
                return zzfjeVar.zza(zzffbVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void zza(zzffg zzffgVar, zzfiy zzfiyVar, int i, Object obj) {
        if (zzfiyVar == zzfiy.zzply) {
            zzfhe zzfheVar = (zzfhe) obj;
            zzffz.zzh(zzfheVar);
            zzffgVar.zze(i, zzfheVar);
        }
        zzffgVar.zzz(i, zzfiyVar.zzdae());
        switch (zzffr.zzpgo[zzfiyVar.ordinal()]) {
            case 1:
                zzffgVar.zzn(((Double) obj).doubleValue());
                break;
            case 2:
                zzffgVar.zzf(((Float) obj).floatValue());
                break;
            case 3:
                zzffgVar.zzct(((Long) obj).longValue());
                break;
            case 4:
                zzffgVar.zzct(((Long) obj).longValue());
                break;
            case 5:
                zzffgVar.zzlc(((Integer) obj).intValue());
                break;
            case 6:
                zzffgVar.zzcv(((Long) obj).longValue());
                break;
            case 7:
                zzffgVar.zzlf(((Integer) obj).intValue());
                break;
            case 8:
                zzffgVar.zzdd(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzfhe) obj).zza(zzffgVar);
                break;
            case 10:
                zzffgVar.zze((zzfhe) obj);
                break;
            case 11:
                if (!(obj instanceof zzfes)) {
                    zzffgVar.zzts((String) obj);
                    break;
                } else {
                    zzffgVar.zzay((zzfes) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof zzfes)) {
                    byte[] bArr = (byte[]) obj;
                    zzffgVar.zzi(bArr, 0, bArr.length);
                    break;
                } else {
                    zzffgVar.zzay((zzfes) obj);
                    break;
                }
            case 13:
                zzffgVar.zzld(((Integer) obj).intValue());
                break;
            case 14:
                zzffgVar.zzlf(((Integer) obj).intValue());
                break;
            case 15:
                zzffgVar.zzcv(((Long) obj).longValue());
                break;
            case 16:
                zzffgVar.zzle(((Integer) obj).intValue());
                break;
            case 17:
                zzffgVar.zzcu(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzfga)) {
                    zzffgVar.zzlc(((Integer) obj).intValue());
                    break;
                } else {
                    zzffgVar.zzlc(((zzfga) obj).zzhq());
                    break;
                }
        }
    }

    private void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzcxj()) {
            zza(fielddescriptortype.zzcxh(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zza(fielddescriptortype.zzcxh(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzfgg) {
            this.zzpgl = true;
        }
        this.zzpgk.zza((zzfhy<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.zzfga) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.zzfgg) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.zzfiy r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.zzffz.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.zzffr.zzpgn
            com.google.android.gms.internal.zzfjd r2 = r2.zzdad()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.zzfhe
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.zzfgg
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.zzfga
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.zzfes
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L50
        L4f:
            throw r2
        L50:
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzffq.zza(com.google.android.gms.internal.zzfiy, java.lang.Object):void");
    }

    private static int zzb(zzffs<?> zzffsVar, Object obj) {
        zzfiy zzcxh = zzffsVar.zzcxh();
        int zzhq = zzffsVar.zzhq();
        if (!zzffsVar.zzcxj()) {
            return zza(zzcxh, zzhq, obj);
        }
        int i = 0;
        List list = (List) obj;
        if (!zzffsVar.zzcxk()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += zza(zzcxh, zzhq, it.next());
            }
            return i;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i += zzb(zzcxh, it2.next());
        }
        return zzffg.zzlp(i) + zzffg.zzlg(zzhq) + i;
    }

    private static int zzb(zzfiy zzfiyVar, Object obj) {
        switch (zzffr.zzpgo[zzfiyVar.ordinal()]) {
            case 1:
                return zzffg.zzo(((Double) obj).doubleValue());
            case 2:
                return zzffg.zzg(((Float) obj).floatValue());
            case 3:
                return zzffg.zzcw(((Long) obj).longValue());
            case 4:
                return zzffg.zzcx(((Long) obj).longValue());
            case 5:
                return zzffg.zzlh(((Integer) obj).intValue());
            case 6:
                return zzffg.zzcz(((Long) obj).longValue());
            case 7:
                return zzffg.zzlk(((Integer) obj).intValue());
            case 8:
                return zzffg.zzde(((Boolean) obj).booleanValue());
            case 9:
                return zzffg.zzg((zzfhe) obj);
            case 10:
                return obj instanceof zzfgg ? zzffg.zza((zzfgg) obj) : zzffg.zzf((zzfhe) obj);
            case 11:
                return obj instanceof zzfes ? zzffg.zzaz((zzfes) obj) : zzffg.zztt((String) obj);
            case 12:
                return obj instanceof zzfes ? zzffg.zzaz((zzfes) obj) : zzffg.zzbd((byte[]) obj);
            case 13:
                return zzffg.zzli(((Integer) obj).intValue());
            case 14:
                return zzffg.zzll(((Integer) obj).intValue());
            case 15:
                return zzffg.zzda(((Long) obj).longValue());
            case 16:
                return zzffg.zzlj(((Integer) obj).intValue());
            case 17:
                return zzffg.zzcy(((Long) obj).longValue());
            case 18:
                return obj instanceof zzfga ? zzffg.zzlm(((zzfga) obj).zzhq()) : zzffg.zzlm(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzcxi() != zzfjd.MESSAGE || key.zzcxj() || key.zzcxk()) {
            return zzb((zzffs<?>) key, value);
        }
        boolean z = value instanceof zzfgg;
        int zzhq = entry.getKey().zzhq();
        return z ? zzffg.zzb(zzhq, (zzfgg) value) : zzffg.zzd(zzhq, (zzfhe) value);
    }

    public static <T extends zzffs<T>> zzffq<T> zzcxf() {
        return new zzffq<>();
    }

    public final /* synthetic */ Object clone() {
        zzffq zzffqVar = new zzffq();
        for (int i = 0; i < this.zzpgk.zzczj(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzmb = this.zzpgk.zzmb(i);
            zzffqVar.zza((zzffq) zzmb.getKey(), zzmb.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzpgk.zzczk()) {
            zzffqVar.zza((zzffq) entry.getKey(), entry.getValue());
        }
        zzffqVar.zzpgl = this.zzpgl;
        return zzffqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzffq) {
            return this.zzpgk.equals(((zzffq) obj).zzpgk);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzpgk.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzpgl ? new zzfgj(this.zzpgk.entrySet().iterator()) : this.zzpgk.entrySet().iterator();
    }

    public final int zzcxg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzpgk.zzczj(); i2++) {
            i += zzb(this.zzpgk.zzmb(i2));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.zzpgk.zzczk().iterator();
        while (it.hasNext()) {
            i += zzb(it.next());
        }
        return i;
    }
}
