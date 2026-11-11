.class public final Lcom/google/android/gms/internal/zzdqx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzduj;


# instance fields
.field private final zzlti:Ljava/lang/String;

.field private final zzltj:I

.field private zzltk:Lcom/google/android/gms/internal/zzdrs;

.field private zzltl:Lcom/google/android/gms/internal/zzdrc;

.field private zzltm:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzdtd;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdtd;->zzbon()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdqx;->zzlti:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "invalid KeyFormat protobuf, expected AesGcmKeyFormat"

    if-eqz v1, :cond_31

    :try_start_13
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdtd;->zzboo()Lcom/google/android/gms/internal/zzfes;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdru;->zzt(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdru;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/zzdqe;->zzb(Lcom/google/android/gms/internal/zzdtd;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrs;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdqx;->zzltk:Lcom/google/android/gms/internal/zzdrs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdru;->getKeySize()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdqx;->zzltj:I
    :try_end_29
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_13 .. :try_end_29} :catch_2a

    return-void

    :catch_2a
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_31
    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_68

    :try_start_39
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdtd;->zzboo()Lcom/google/android/gms/internal/zzfes;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdre;->zzj(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdre;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/zzdqe;->zzb(Lcom/google/android/gms/internal/zzdtd;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrc;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdqx;->zzltl:Lcom/google/android/gms/internal/zzdrc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdre;->zzbmf()Lcom/google/android/gms/internal/zzdri;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdri;->getKeySize()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdqx;->zzltm:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdre;->zzbmg()Lcom/google/android/gms/internal/zzdsu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdsu;->getKeySize()I

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/zzdqx;->zzltm:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/zzdqx;->zzltj:I
    :try_end_60
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_39 .. :try_end_60} :catch_61

    return-void

    :catch_61
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_68
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v1, "unsupported AEAD DEM key type: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_7b

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_80

    :cond_7b
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_80
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final zzae([B)Lcom/google/android/gms/internal/zzdpp;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdqx;->zzlti:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-static {}, Lcom/google/android/gms/internal/zzdrs;->zzbmy()Lcom/google/android/gms/internal/zzdrs$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdqx;->zzltk:Lcom/google/android/gms/internal/zzdrs;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzdrs$zza;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzfes;->zzaz([B)Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzdrs$zza;->zzs(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdrs$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxt()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrs;

    :goto_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdqx;->zzlti:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzdqe;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzfhe;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdpp;

    return-object p1

    :cond_2d
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdqx;->zzlti:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9f

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/internal/zzdqx;->zzltm:I

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/zzdqx;->zzltm:I

    iget v2, p0, Lcom/google/android/gms/internal/zzdqx;->zzltj:I

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/zzdrg;->zzbmk()Lcom/google/android/gms/internal/zzdrg$zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdqx;->zzltl:Lcom/google/android/gms/internal/zzdrc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdrc;->zzbmb()Lcom/google/android/gms/internal/zzdrg;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzdrg$zza;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzfes;->zzaz([B)Lcom/google/android/gms/internal/zzfes;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzdrg$zza;->zzm(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdrg$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxt()Lcom/google/android/gms/internal/zzffu;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzdrg;

    invoke-static {}, Lcom/google/android/gms/internal/zzdss;->zzboe()Lcom/google/android/gms/internal/zzdss$zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdqx;->zzltl:Lcom/google/android/gms/internal/zzdrc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdrc;->zzbmc()Lcom/google/android/gms/internal/zzdss;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzdss$zza;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzfes;->zzaz([B)Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzdss$zza;->zzaf(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdss$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxt()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdss;

    invoke-static {}, Lcom/google/android/gms/internal/zzdrc;->zzbmd()Lcom/google/android/gms/internal/zzdrc$zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdqx;->zzltl:Lcom/google/android/gms/internal/zzdrc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdrc;->getVersion()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzdrc$zza;->zzfi(I)Lcom/google/android/gms/internal/zzdrc$zza;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzdrc$zza;->zzb(Lcom/google/android/gms/internal/zzdrg;)Lcom/google/android/gms/internal/zzdrc$zza;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzdrc$zza;->zzb(Lcom/google/android/gms/internal/zzdss;)Lcom/google/android/gms/internal/zzdrc$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxt()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrc;

    goto :goto_24

    :cond_9f
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown DEM key type"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    goto :goto_a8

    :goto_a7
    throw p1

    :goto_a8
    goto :goto_a7
.end method

.method public final zzbma()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdqx;->zzltj:I

    return v0
.end method
