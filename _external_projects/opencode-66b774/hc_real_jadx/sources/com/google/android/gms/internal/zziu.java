package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zziu {

    public static final class zza extends zzffu<zza, C0385zza> implements zzfhg {
        private static final zza zzbbj;
        private static volatile zzfhk<zza> zzbbk;

        /* renamed from: com.google.android.gms.internal.zziu$zza$zza, reason: collision with other inner class name */
        public static final class C0385zza extends zzffu.zza<zza, C0385zza> implements zzfhg {
            private C0385zza() {
                super(zza.zzbbj);
            }

            public /* synthetic */ C0385zza(zziv zzivVar) {
                this();
            }
        }

        public enum zzb implements zzfga {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005);

            private static final zzfgb<zzb> zzbcl = new zziw();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            @Override // com.google.android.gms.internal.zzfga
            public final int zzhq() {
                return this.value;
            }
        }

        static {
            zza zzaVar = new zza();
            zzbbj = zzaVar;
            zzaVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
            zzaVar.zzpgr.zzbiy();
        }

        private zza() {
        }

        @Override // com.google.android.gms.internal.zzffu
        public final Object zza(int i, Object obj, Object obj2) {
            zziv zzivVar = null;
            switch (zziv.zzbbi[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return zzbbj;
                case 3:
                    return null;
                case 4:
                    return new C0385zza(zzivVar);
                case 5:
                    return this;
                case 6:
                    zzffb zzffbVar = (zzffb) obj;
                    ((zzffm) obj2).getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int zzcvt = zzffbVar.zzcvt();
                                if (zzcvt == 0 || !zza(zzcvt, zzffbVar)) {
                                    z = true;
                                }
                            } catch (zzfge e) {
                                throw new RuntimeException(e.zzi(this));
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException(new zzfge(e2.getMessage()).zzi(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (zzbbk == null) {
                        synchronized (zza.class) {
                            if (zzbbk == null) {
                                zzbbk = new zzffu.zzb(zzbbj);
                            }
                        }
                    }
                    return zzbbk;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return zzbbj;
        }

        @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
        public final void zza(zzffg zzffgVar) {
            this.zzpgr.zza(zzffgVar);
        }

        @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
        public final int zzho() {
            int i = this.zzpgs;
            if (i != -1) {
                return i;
            }
            int zzho = this.zzpgr.zzho() + 0;
            this.zzpgs = zzho;
            return zzho;
        }
    }
}
