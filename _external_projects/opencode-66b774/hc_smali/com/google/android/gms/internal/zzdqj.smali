.class public final Lcom/google/android/gms/internal/zzdqj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzdpw;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzdpw<",
        "Lcom/google/android/gms/internal/zzdpp;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final zzd(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdpp;
    .registers 4

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/zzdrm;->zzo(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdrm;

    move-result-object p1

    instance-of v0, p1, Lcom/google/android/gms/internal/zzdrm;

    if-eqz v0, :cond_52

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->getVersion()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzdvk;->zzt(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbmj()Lcom/google/android/gms/internal/zzfes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdvk;->zzgi(I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdrq;->zzbmp()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3c

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdrq;->zzbmp()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_34

    goto :goto_3c

    :cond_34
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3c
    :goto_3c
    new-instance v0, Lcom/google/android/gms/internal/zzdty;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbmj()Lcom/google/android/gms/internal/zzfes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfes;->toByteArray()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrq;->zzbmp()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/zzdty;-><init>([BI)V

    return-object v0

    :cond_52
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "expected AesEaxKey proto"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5a
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_0 .. :try_end_5a} :catch_5a

    :catch_5a
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected serialized AesEaxKey proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/zzfes;)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdqj;->zzd(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdpp;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/zzfhe;)Ljava/lang/Object;
    .registers 4

    instance-of v0, p1, Lcom/google/android/gms/internal/zzdrm;

    if-eqz v0, :cond_50

    check-cast p1, Lcom/google/android/gms/internal/zzdrm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->getVersion()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzdvk;->zzt(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbmj()Lcom/google/android/gms/internal/zzfes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdvk;->zzgi(I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdrq;->zzbmp()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3a

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdrq;->zzbmp()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_32

    goto :goto_3a

    :cond_32
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3a
    :goto_3a
    new-instance v0, Lcom/google/android/gms/internal/zzdty;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbmj()Lcom/google/android/gms/internal/zzfes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfes;->toByteArray()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrm;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdrq;->zzbmp()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/zzdty;-><init>([BI)V

    return-object v0

    :cond_50
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "expected AesEaxKey proto"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfhe;
    .registers 4

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/zzdro;->zzq(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdro;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzdqj;->zzb(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1
    :try_end_8
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_0 .. :try_end_8} :catch_9

    return-object p1

    :catch_9
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected serialized AesEaxKeyFormat proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;
    .registers 4

    instance-of v0, p1, Lcom/google/android/gms/internal/zzdro;

    if-eqz v0, :cond_54

    check-cast p1, Lcom/google/android/gms/internal/zzdro;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdro;->getKeySize()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdvk;->zzgi(I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdro;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdrq;->zzbmp()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_2e

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdro;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdrq;->zzbmp()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_26

    goto :goto_2e

    :cond_26
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2e
    :goto_2e
    invoke-static {}, Lcom/google/android/gms/internal/zzdrm;->zzbmt()Lcom/google/android/gms/internal/zzdrm$zza;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdro;->getKeySize()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzdvi;->zzgh(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzfes;->zzaz([B)Lcom/google/android/gms/internal/zzfes;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzdrm$zza;->zzp(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdrm$zza;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdro;->zzbms()Lcom/google/android/gms/internal/zzdrq;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzdrm$zza;->zzb(Lcom/google/android/gms/internal/zzdrq;)Lcom/google/android/gms/internal/zzdrm$zza;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzdrm$zza;->zzfk(I)Lcom/google/android/gms/internal/zzdrm$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxt()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    return-object p1

    :cond_54
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "expected AesEaxKeyFormat proto"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdsy;
    .registers 4

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzdqj;->zzb(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrm;

    invoke-static {}, Lcom/google/android/gms/internal/zzdsy;->zzboq()Lcom/google/android/gms/internal/zzdsy$zza;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzdsy$zza;->zzoj(Ljava/lang/String;)Lcom/google/android/gms/internal/zzdsy$zza;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfek;->toByteString()Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzdsy$zza;->zzai(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdsy$zza;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/zzdsy$zzb;->zzlwf:Lcom/google/android/gms/internal/zzdsy$zzb;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzdsy$zza;->zzb(Lcom/google/android/gms/internal/zzdsy$zzb;)Lcom/google/android/gms/internal/zzdsy$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxt()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsy;

    return-object p1
.end method
