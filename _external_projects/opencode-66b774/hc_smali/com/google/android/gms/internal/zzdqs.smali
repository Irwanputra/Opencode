.class public final Lcom/google/android/gms/internal/zzdqs;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final zzlta:Lcom/google/android/gms/internal/zzdtv;


# direct methods
.method public static constructor <clinit>()V
    .registers 6

    invoke-static {}, Lcom/google/android/gms/internal/zzdtv;->zzbqg()Lcom/google/android/gms/internal/zzdtv$zza;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzdqg;->zzlta:Lcom/google/android/gms/internal/zzdtv;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzdtv$zza;

    const-string v1, "TinkHybrid"

    const-string v2, "HybridDecrypt"

    const-string v3, "EciesAeadHkdfPrivateKey"

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/zzdpr;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/google/android/gms/internal/zzdtf;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzdtv$zza;->zzb(Lcom/google/android/gms/internal/zzdtf;)Lcom/google/android/gms/internal/zzdtv$zza;

    move-result-object v0

    const-string v2, "HybridEncrypt"

    const-string v3, "EciesAeadHkdfPublicKey"

    invoke-static {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/zzdpr;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/google/android/gms/internal/zzdtf;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzdtv$zza;->zzb(Lcom/google/android/gms/internal/zzdtf;)Lcom/google/android/gms/internal/zzdtv$zza;

    move-result-object v0

    const-string v2, "TINK_HYBRID_1_0_0"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzdtv$zza;->zzor(Ljava/lang/String;)Lcom/google/android/gms/internal/zzdtv$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxt()Lcom/google/android/gms/internal/zzffu;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzdtv;

    sput-object v0, Lcom/google/android/gms/internal/zzdqs;->zzlta:Lcom/google/android/gms/internal/zzdtv;

    :try_start_36
    new-instance v0, Lcom/google/android/gms/internal/zzdqr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdqr;-><init>()V

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzdqe;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdpq;)V

    invoke-static {}, Lcom/google/android/gms/internal/zzdqg;->zzbly()V
    :try_end_41
    .catch Ljava/security/GeneralSecurityException; {:try_start_36 .. :try_end_41} :catch_42

    return-void

    :catch_42
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
