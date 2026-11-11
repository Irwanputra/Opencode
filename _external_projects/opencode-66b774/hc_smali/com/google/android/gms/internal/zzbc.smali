.class public final Lcom/google/android/gms/internal/zzbc;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzbc;",
        ">;"
    }
.end annotation


# instance fields
.field private zzgg:Ljava/lang/Long;

.field private zzgh:Ljava/lang/Integer;

.field private zzgi:Ljava/lang/Boolean;

.field private zzgj:[I

.field private zzgk:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgg:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgh:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgi:Ljava/lang/Boolean;

    sget-object v1, Lcom/google/android/gms/internal/zzfjv;->zzpnp:[I

    iput-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgk:Ljava/lang/Long;

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

    if-eqz v0, :cond_be

    const/16 v1, 0x8

    if-eq v0, v1, :cond_b2

    const/16 v1, 0x10

    if-eq v0, v1, :cond_a6

    const/16 v1, 0x18

    if-eq v0, v1, :cond_9a

    const/16 v1, 0x20

    const/4 v2, 0x0

    if-eq v0, v1, :cond_6d

    const/16 v1, 0x22

    if-eq v0, v1, :cond_31

    const/16 v1, 0x28

    if-eq v0, v1, :cond_26

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_26
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgk:Ljava/lang/Long;

    goto :goto_0

    :cond_31
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zzks(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v1

    const/4 v3, 0x0

    :goto_3e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwk()I

    move-result v4

    if-lez v4, :cond_4a

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_3e

    :cond_4a
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzfjj;->zzmg(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    if-nez v1, :cond_53

    const/4 v4, 0x0

    goto :goto_54

    :cond_53
    array-length v4, v1

    :goto_54
    add-int/2addr v3, v4

    new-array v5, v3, [I

    if-eqz v4, :cond_5c

    invoke-static {v1, v2, v5, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5c
    :goto_5c
    if-ge v4, v3, :cond_67

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v1

    aput v1, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_5c

    :cond_67
    iput-object v5, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zzkt(I)V

    goto :goto_0

    :cond_6d
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/zzfjv;->zzb(Lcom/google/android/gms/internal/zzfjj;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    if-nez v1, :cond_77

    const/4 v3, 0x0

    goto :goto_78

    :cond_77
    array-length v3, v1

    :goto_78
    add-int/2addr v0, v3

    new-array v4, v0, [I

    if-eqz v3, :cond_80

    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_80
    :goto_80
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_90

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v1

    aput v1, v4, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_80

    :cond_90
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v0

    aput v0, v4, v3

    iput-object v4, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    goto/16 :goto_0

    :cond_9a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvz()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgi:Ljava/lang/Boolean;

    goto/16 :goto_0

    :cond_a6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgh:Ljava/lang/Integer;

    goto/16 :goto_0

    :cond_b2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgg:Ljava/lang/Long;

    goto/16 :goto_0

    :cond_be
    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgg:Ljava/lang/Long;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgh:Ljava/lang/Integer;

    if-eqz v0, :cond_18

    const/4 v1, 0x2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgi:Ljava/lang/Boolean;

    if-eqz v0, :cond_24

    const/4 v1, 0x3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzl(IZ)V

    :cond_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    if-eqz v0, :cond_3a

    array-length v0, v0

    if-lez v0, :cond_3a

    const/4 v0, 0x0

    :goto_2c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    array-length v2, v1

    if-ge v0, v2, :cond_3a

    const/4 v2, 0x4

    aget v1, v1, v0

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2c

    :cond_3a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbc;->zzgk:Ljava/lang/Long;

    if-eqz v0, :cond_46

    const/4 v1, 0x5

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zza(IJ)V

    :cond_46
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 6

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgg:Ljava/lang/Long;

    const/4 v2, 0x1

    if-eqz v1, :cond_d

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgh:Ljava/lang/Integer;

    if-eqz v1, :cond_16

    const/4 v3, 0x2

    invoke-static {v1, v3, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    :cond_16
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgi:Ljava/lang/Boolean;

    if-eqz v1, :cond_24

    const/4 v3, 0x3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static {v3}, Lcom/google/android/gms/internal/zzfjk;->zzlg(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_24
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    if-eqz v1, :cond_41

    array-length v1, v1

    if-lez v1, :cond_41

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2d
    iget-object v3, p0, Lcom/google/android/gms/internal/zzbc;->zzgj:[I

    array-length v4, v3

    if-ge v1, v4, :cond_3c

    aget v3, v3, v1

    invoke-static {v3}, Lcom/google/android/gms/internal/zzfjk;->zzlh(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2d

    :cond_3c
    add-int/2addr v0, v2

    array-length v1, v3

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :cond_41
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc;->zzgk:Ljava/lang/Long;

    if-eqz v1, :cond_54

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 v3, 0x5

    invoke-static {v3}, Lcom/google/android/gms/internal/zzfjk;->zzlg(I)I

    move-result v3

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzfjk;->zzdi(J)I

    move-result v1

    add-int/2addr v1, v3

    add-int/2addr v0, v1

    :cond_54
    return v0
.end method
