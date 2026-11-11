.class public final Lcom/google/android/gms/internal/zzjc;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzjc;",
        ">;"
    }
.end annotation


# instance fields
.field public zzbcw:Ljava/lang/String;

.field public zzbcx:[J

.field public zzbcy:Lcom/google/android/gms/internal/zzjb;

.field public zzbcz:Lcom/google/android/gms/internal/zzja;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcw:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/zzfjv;->zzpnq:[J

    iput-object v1, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    iput-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcy:Lcom/google/android/gms/internal/zzjb;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcz:Lcom/google/android/gms/internal/zzja;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzfjs;->zzpfd:I

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfjs;
    .registers 8

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    move-result v0

    if-eqz v0, :cond_b2

    const/16 v1, 0x52

    if-eq v0, v1, :cond_aa

    const/16 v1, 0x70

    const/4 v2, 0x0

    if-eq v0, v1, :cond_7d

    const/16 v1, 0x72

    if-eq v0, v1, :cond_41

    const/16 v1, 0x7a

    if-eq v0, v1, :cond_30

    const/16 v1, 0x92

    if-eq v0, v1, :cond_22

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_22
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcz:Lcom/google/android/gms/internal/zzja;

    if-nez v0, :cond_2d

    new-instance v0, Lcom/google/android/gms/internal/zzja;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzja;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcz:Lcom/google/android/gms/internal/zzja;

    :cond_2d
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcz:Lcom/google/android/gms/internal/zzja;

    goto :goto_3d

    :cond_30
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcy:Lcom/google/android/gms/internal/zzjb;

    if-nez v0, :cond_3b

    new-instance v0, Lcom/google/android/gms/internal/zzjb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzjb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcy:Lcom/google/android/gms/internal/zzjb;

    :cond_3b
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcy:Lcom/google/android/gms/internal/zzjb;

    :goto_3d
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zza(Lcom/google/android/gms/internal/zzfjs;)V

    goto :goto_0

    :cond_41
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zzks(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v1

    const/4 v3, 0x0

    :goto_4e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwk()I

    move-result v4

    if-lez v4, :cond_5a

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    add-int/lit8 v3, v3, 0x1

    goto :goto_4e

    :cond_5a
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzfjj;->zzmg(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    if-nez v1, :cond_63

    const/4 v4, 0x0

    goto :goto_64

    :cond_63
    array-length v4, v1

    :goto_64
    add-int/2addr v3, v4

    new-array v5, v3, [J

    if-eqz v4, :cond_6c

    invoke-static {v1, v2, v5, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6c
    :goto_6c
    if-ge v4, v3, :cond_77

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v1

    aput-wide v1, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_6c

    :cond_77
    iput-object v5, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zzkt(I)V

    goto :goto_0

    :cond_7d
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/zzfjv;->zzb(Lcom/google/android/gms/internal/zzfjj;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    if-nez v1, :cond_87

    const/4 v3, 0x0

    goto :goto_88

    :cond_87
    array-length v3, v1

    :goto_88
    add-int/2addr v0, v3

    new-array v4, v0, [J

    if-eqz v3, :cond_90

    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_90
    :goto_90
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_a0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v1

    aput-wide v1, v4, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_90

    :cond_a0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    aput-wide v0, v4, v3

    iput-object v4, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    goto/16 :goto_0

    :cond_aa
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcw:Ljava/lang/String;

    goto/16 :goto_0

    :cond_b2
    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcw:Ljava/lang/String;

    if-eqz v0, :cond_9

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    if-eqz v0, :cond_20

    array-length v0, v0

    if-lez v0, :cond_20

    const/4 v0, 0x0

    :goto_11
    iget-object v1, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    array-length v2, v1

    if-ge v0, v2, :cond_20

    const/16 v2, 0xe

    aget-wide v3, v1, v0

    invoke-virtual {p1, v2, v3, v4}, Lcom/google/android/gms/internal/zzfjk;->zza(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_11

    :cond_20
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcy:Lcom/google/android/gms/internal/zzjb;

    if-eqz v0, :cond_29

    const/16 v1, 0xf

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_29
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjc;->zzbcz:Lcom/google/android/gms/internal/zzja;

    if-eqz v0, :cond_32

    const/16 v1, 0x12

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_32
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 7

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzjc;->zzbcw:Ljava/lang/String;

    if-eqz v1, :cond_f

    const/16 v2, 0xa

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_f
    iget-object v1, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    if-eqz v1, :cond_2c

    array-length v1, v1

    if-lez v1, :cond_2c

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_18
    iget-object v3, p0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    array-length v4, v3

    if-ge v1, v4, :cond_27

    aget-wide v4, v3, v1

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/zzfjk;->zzdi(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_27
    add-int/2addr v0, v2

    array-length v1, v3

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :cond_2c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzjc;->zzbcy:Lcom/google/android/gms/internal/zzjb;

    if-eqz v1, :cond_37

    const/16 v2, 0xf

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_37
    iget-object v1, p0, Lcom/google/android/gms/internal/zzjc;->zzbcz:Lcom/google/android/gms/internal/zzja;

    if-eqz v1, :cond_42

    const/16 v2, 0x12

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_42
    return v0
.end method
