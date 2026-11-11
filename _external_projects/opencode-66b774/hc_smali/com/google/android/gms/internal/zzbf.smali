.class public final Lcom/google/android/gms/internal/zzbf;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzbf;",
        ">;"
    }
.end annotation


# instance fields
.field public zzgl:[B

.field public zzgq:[[B

.field private zzgr:Ljava/lang/Integer;

.field public zzgs:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/zzfjv;->zzpnu:[[B

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbf;->zzgq:[[B

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbf;->zzgl:[B

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzfjs;->zzpfd:I

    return-void
.end method

.method private final zzd(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzbf;
    .registers 8

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    move-result v0

    if-eqz v0, :cond_b9

    const/16 v1, 0xa

    if-eq v0, v1, :cond_8b

    const/16 v1, 0x12

    if-eq v0, v1, :cond_83

    const/16 v1, 0x18

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4e

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1e

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_1e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v1

    :try_start_22
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v3

    if-eqz v3, :cond_47

    if-eq v3, v2, :cond_47

    const/4 v2, 0x2

    if-ne v3, v2, :cond_2e

    goto :goto_47

    :cond_2e
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const/16 v4, 0x30

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " is not a valid enum EncryptionMethod"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_47
    :goto_47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzbf;->zzgs:Ljava/lang/Integer;
    :try_end_4d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_22 .. :try_end_4d} :catch_7b

    goto :goto_0

    :cond_4e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v1

    :try_start_52
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v3

    if-eqz v3, :cond_74

    if-ne v3, v2, :cond_5b

    goto :goto_74

    :cond_5b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const/16 v4, 0x29

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " is not a valid enum ProtoName"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_74
    :goto_74
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzbf;->zzgr:Ljava/lang/Integer;
    :try_end_7a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_52 .. :try_end_7a} :catch_7b

    goto :goto_0

    :catch_7b
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzfjj;->zzmg(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    goto/16 :goto_0

    :cond_83
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbf;->zzgl:[B

    goto/16 :goto_0

    :cond_8b
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/zzfjv;->zzb(Lcom/google/android/gms/internal/zzfjj;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbf;->zzgq:[[B

    const/4 v2, 0x0

    if-nez v1, :cond_96

    const/4 v3, 0x0

    goto :goto_97

    :cond_96
    array-length v3, v1

    :goto_97
    add-int/2addr v0, v3

    new-array v4, v0, [[B

    if-eqz v3, :cond_9f

    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_9f
    :goto_9f
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_af

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readBytes()[B

    move-result-object v1

    aput-object v1, v4, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_9f

    :cond_af
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readBytes()[B

    move-result-object v0

    aput-object v0, v4, v3

    iput-object v4, p0, Lcom/google/android/gms/internal/zzbf;->zzgq:[[B

    goto/16 :goto_0

    :cond_b9
    return-object p0
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfjs;
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzbf;->zzd(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzbf;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzbf;->zzgq:[[B

    if-eqz v0, :cond_18

    array-length v0, v0

    if-lez v0, :cond_18

    const/4 v0, 0x0

    :goto_8
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbf;->zzgq:[[B

    array-length v2, v1

    if-ge v0, v2, :cond_18

    aget-object v1, v1, v0

    if-eqz v1, :cond_15

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzc(I[B)V

    :cond_15
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbf;->zzgl:[B

    if-eqz v0, :cond_20

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzc(I[B)V

    :cond_20
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbf;->zzgr:Ljava/lang/Integer;

    if-eqz v0, :cond_2c

    const/4 v1, 0x3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    :cond_2c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbf;->zzgs:Ljava/lang/Integer;

    if-eqz v0, :cond_38

    const/4 v1, 0x4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    :cond_38
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 7

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbf;->zzgq:[[B

    if-eqz v1, :cond_26

    array-length v1, v1

    if-lez v1, :cond_26

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_e
    iget-object v4, p0, Lcom/google/android/gms/internal/zzbf;->zzgq:[[B

    array-length v5, v4

    if-ge v1, v5, :cond_22

    aget-object v4, v4, v1

    if-eqz v4, :cond_1f

    add-int/lit8 v3, v3, 0x1

    invoke-static {v4}, Lcom/google/android/gms/internal/zzfjk;->zzbg([B)I

    move-result v4

    add-int/2addr v4, v2

    move v2, v4

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_22
    add-int/2addr v0, v2

    mul-int/lit8 v3, v3, 0x1

    add-int/2addr v0, v3

    :cond_26
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbf;->zzgl:[B

    if-eqz v1, :cond_30

    const/4 v2, 0x2

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzd(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_30
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbf;->zzgr:Ljava/lang/Integer;

    if-eqz v1, :cond_39

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    :cond_39
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbf;->zzgs:Ljava/lang/Integer;

    if-eqz v1, :cond_42

    const/4 v2, 0x4

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    :cond_42
    return v0
.end method
