.class public final Lcom/google/android/gms/internal/zzfkb;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzfkb;",
        ">;"
    }
.end annotation


# instance fields
.field private body:[B

.field private zzpoo:[Lcom/google/android/gms/internal/zzfjy;

.field private zzpop:[B

.field private zzpoq:Ljava/lang/Integer;

.field private zzpou:Lcom/google/android/gms/internal/zzfkc;

.field private zzpov:[B


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpou:Lcom/google/android/gms/internal/zzfkc;

    invoke-static {}, Lcom/google/android/gms/internal/zzfjy;->zzdan()[Lcom/google/android/gms/internal/zzfjy;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoo:[Lcom/google/android/gms/internal/zzfjy;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->body:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpop:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoq:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpov:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzfjs;->zzpfd:I

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfjs;
    .registers 7

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    move-result v0

    if-eqz v0, :cond_90

    const/16 v1, 0xa

    if-eq v0, v1, :cond_7e

    const/16 v1, 0x12

    if-eq v0, v1, :cond_45

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_3e

    const/16 v1, 0x22

    if-eq v0, v1, :cond_37

    const/16 v1, 0x28

    if-eq v0, v1, :cond_2c

    const/16 v1, 0x32

    if-eq v0, v1, :cond_25

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpov:[B

    goto :goto_0

    :cond_2c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoq:Ljava/lang/Integer;

    goto :goto_0

    :cond_37
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpop:[B

    goto :goto_0

    :cond_3e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->body:[B

    goto :goto_0

    :cond_45
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/zzfjv;->zzb(Lcom/google/android/gms/internal/zzfjj;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoo:[Lcom/google/android/gms/internal/zzfjy;

    const/4 v2, 0x0

    if-nez v1, :cond_50

    const/4 v3, 0x0

    goto :goto_51

    :cond_50
    array-length v3, v1

    :goto_51
    add-int/2addr v0, v3

    new-array v4, v0, [Lcom/google/android/gms/internal/zzfjy;

    if-eqz v3, :cond_59

    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_59
    :goto_59
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_6f

    new-instance v1, Lcom/google/android/gms/internal/zzfjy;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzfjy;-><init>()V

    aput-object v1, v4, v3

    aget-object v1, v4, v3

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzfjj;->zza(Lcom/google/android/gms/internal/zzfjs;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_59

    :cond_6f
    new-instance v0, Lcom/google/android/gms/internal/zzfjy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfjy;-><init>()V

    aput-object v0, v4, v3

    aget-object v0, v4, v3

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zza(Lcom/google/android/gms/internal/zzfjs;)V

    iput-object v4, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoo:[Lcom/google/android/gms/internal/zzfjy;

    goto :goto_0

    :cond_7e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpou:Lcom/google/android/gms/internal/zzfkc;

    if-nez v0, :cond_89

    new-instance v0, Lcom/google/android/gms/internal/zzfkc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfkc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpou:Lcom/google/android/gms/internal/zzfkc;

    :cond_89
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpou:Lcom/google/android/gms/internal/zzfkc;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zza(Lcom/google/android/gms/internal/zzfjs;)V

    goto/16 :goto_0

    :cond_90
    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpou:Lcom/google/android/gms/internal/zzfkc;

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoo:[Lcom/google/android/gms/internal/zzfjy;

    if-eqz v0, :cond_20

    array-length v0, v0

    if-lez v0, :cond_20

    const/4 v0, 0x0

    :goto_10
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoo:[Lcom/google/android/gms/internal/zzfjy;

    array-length v2, v1

    if-ge v0, v2, :cond_20

    aget-object v1, v1, v0

    if-eqz v1, :cond_1d

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_1d
    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    :cond_20
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->body:[B

    if-eqz v0, :cond_28

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzc(I[B)V

    :cond_28
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpop:[B

    if-eqz v0, :cond_30

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzc(I[B)V

    :cond_30
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoq:Ljava/lang/Integer;

    if-eqz v0, :cond_3c

    const/4 v1, 0x5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    :cond_3c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkb;->zzpov:[B

    if-eqz v0, :cond_44

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzc(I[B)V

    :cond_44
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 5

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->zzpou:Lcom/google/android/gms/internal/zzfkc;

    if-eqz v1, :cond_e

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoo:[Lcom/google/android/gms/internal/zzfjy;

    if-eqz v1, :cond_28

    array-length v1, v1

    if-lez v1, :cond_28

    const/4 v1, 0x0

    :goto_16
    iget-object v2, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoo:[Lcom/google/android/gms/internal/zzfjy;

    array-length v3, v2

    if-ge v1, v3, :cond_28

    aget-object v2, v2, v1

    if-eqz v2, :cond_25

    const/4 v3, 0x2

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_25
    add-int/lit8 v1, v1, 0x1

    goto :goto_16

    :cond_28
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->body:[B

    if-eqz v1, :cond_32

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzd(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_32
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->zzpop:[B

    if-eqz v1, :cond_3c

    const/4 v2, 0x4

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzd(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->zzpoq:Ljava/lang/Integer;

    if-eqz v1, :cond_45

    const/4 v2, 0x5

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    :cond_45
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkb;->zzpov:[B

    if-eqz v1, :cond_4f

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzd(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4f
    return v0
.end method
