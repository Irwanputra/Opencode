.class public final Lcom/google/android/gms/internal/zzffg$zzd;
.super Lcom/google/android/gms/internal/zzffg$zza;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzffg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzd"
.end annotation


# instance fields
.field private final out:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .registers 3

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzffg$zza;-><init>(I)V

    if-eqz p1, :cond_8

    iput-object p1, p0, Lcom/google/android/gms/internal/zzffg$zzd;->out:Ljava/io/OutputStream;

    return-void

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final doFlush()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzffg$zzd;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->buffer:[B

    iget v2, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    return-void
.end method

.method private final zzls(I)V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->limit:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_a

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffg$zzd;->doFlush()V

    :cond_a
    return-void
.end method


# virtual methods
.method public final flush()V
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    if-lez v0, :cond_7

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffg$zzd;->doFlush()V

    :cond_7
    return-void
.end method

.method public final write([BII)V
    .registers 7

    iget v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->limit:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    sub-int v2, v0, v1

    if-lt v2, p3, :cond_13

    iget-object v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->buffer:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    goto :goto_39

    :cond_13
    sub-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffg$zza;->buffer:[B

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->limit:I

    iput v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->zzpgb:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->zzpgb:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffg$zzd;->doFlush()V

    iget v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->limit:I

    if-gt p3, v0, :cond_34

    iget-object v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->buffer:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    goto :goto_39

    :cond_34
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffg$zzd;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_39
    iget p1, p0, Lcom/google/android/gms/internal/zzffg$zza;->zzpgb:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/zzffg$zza;->zzpgb:I

    return-void
.end method

.method public final zza(IJ)V
    .registers 5

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zza;->zzah(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/zzffg$zza;->zzdc(J)V

    return-void
.end method

.method public final zza(ILcom/google/android/gms/internal/zzfes;)V
    .registers 4

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzz(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzffg$zzd;->zzay(Lcom/google/android/gms/internal/zzfes;)V

    return-void
.end method

.method public final zza(ILcom/google/android/gms/internal/zzfhe;)V
    .registers 4

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzz(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzffg$zzd;->zze(Lcom/google/android/gms/internal/zzfhe;)V

    return-void
.end method

.method public final zzaa(II)V
    .registers 4

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zza;->zzah(II)V

    if-ltz p2, :cond_f

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzffg$zza;->zzlq(I)V

    return-void

    :cond_f
    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg$zza;->zzdc(J)V

    return-void
.end method

.method public final zzab(II)V
    .registers 4

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zza;->zzah(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzffg$zza;->zzlq(I)V

    return-void
.end method

.method public final zzac(II)V
    .registers 4

    const/16 v0, 0xe

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zza;->zzah(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzffg$zza;->zzlr(I)V

    return-void
.end method

.method public final zzay(Lcom/google/android/gms/internal/zzfes;)V
    .registers 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfes;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzld(I)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfes;->zza(Lcom/google/android/gms/internal/zzfer;)V

    return-void
.end method

.method public final zzb(B)V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->limit:I

    if-ne v0, v1, :cond_9

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffg$zzd;->doFlush()V

    :cond_9
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg$zza;->zzc(B)V

    return-void
.end method

.method public final zzb(IJ)V
    .registers 5

    const/16 v0, 0x12

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zza;->zzah(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/zzffg$zza;->zzdd(J)V

    return-void
.end method

.method public final zzb(ILcom/google/android/gms/internal/zzfes;)V
    .registers 6

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzz(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzab(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/android/gms/internal/zzffg$zzd;->zza(ILcom/google/android/gms/internal/zzfes;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzz(II)V

    return-void
.end method

.method public final zzb(ILcom/google/android/gms/internal/zzfhe;)V
    .registers 6

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzz(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzab(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/android/gms/internal/zzffg$zzd;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzz(II)V

    return-void
.end method

.method public final zzct(J)V
    .registers 4

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg$zza;->zzdc(J)V

    return-void
.end method

.method public final zzcv(J)V
    .registers 4

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg$zza;->zzdd(J)V

    return-void
.end method

.method public final zzd([BII)V
    .registers 4

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzffg$zzd;->write([BII)V

    return-void
.end method

.method public final zze(Lcom/google/android/gms/internal/zzfhe;)V
    .registers 3

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzfhe;->zzho()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzld(I)V

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/zzfhe;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzi([BII)V
    .registers 4

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/zzffg$zzd;->zzld(I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzffg$zzd;->write([BII)V

    return-void
.end method

.method public final zzl(IZ)V
    .registers 4

    const/16 v0, 0xb

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zza;->zzah(II)V

    int-to-byte p1, p2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg$zza;->zzc(B)V

    return-void
.end method

.method public final zzlc(I)V
    .registers 4

    if-ltz p1, :cond_6

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzld(I)V

    return-void

    :cond_6
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzct(J)V

    return-void
.end method

.method public final zzld(I)V
    .registers 3

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg$zza;->zzlq(I)V

    return-void
.end method

.method public final zzlf(I)V
    .registers 3

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzls(I)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg$zza;->zzlr(I)V

    return-void
.end method

.method public final zzn(ILjava/lang/String;)V
    .registers 4

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzz(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzffg$zzd;->zzts(Ljava/lang/String;)V

    return-void
.end method

.method public final zzts(Ljava/lang/String;)V
    .registers 7

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/zzffg;->zzli(I)I

    move-result v1

    add-int v2, v1, v0

    iget v3, p0, Lcom/google/android/gms/internal/zzffg$zza;->limit:I

    if-le v2, v3, :cond_1e

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/internal/zzfis;->zza(Ljava/lang/CharSequence;[BII)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzld(I)V

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/zzffg$zzd;->zzd([BII)V

    return-void

    :cond_1e
    iget v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    sub-int/2addr v3, v0

    if-le v2, v3, :cond_26

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffg$zzd;->doFlush()V

    :cond_26
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzffg;->zzli(I)I

    move-result v0

    iget v2, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I
    :try_end_30
    .catch Lcom/google/android/gms/internal/zzfiv; {:try_start_0 .. :try_end_30} :catch_74

    if-ne v0, v1, :cond_4a

    add-int v1, v2, v0

    :try_start_34
    iput v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    iget-object v3, p0, Lcom/google/android/gms/internal/zzffg$zza;->buffer:[B

    iget v4, p0, Lcom/google/android/gms/internal/zzffg$zza;->limit:I

    sub-int/2addr v4, v1

    invoke-static {p1, v3, v1, v4}, Lcom/google/android/gms/internal/zzfis;->zza(Ljava/lang/CharSequence;[BII)I

    move-result v1

    iput v2, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    sub-int v3, v1, v2

    sub-int/2addr v3, v0

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/zzffg$zza;->zzlq(I)V

    iput v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    goto :goto_5b

    :cond_4a
    invoke-static {p1}, Lcom/google/android/gms/internal/zzfis;->zzd(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/zzffg$zza;->zzlq(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->buffer:[B

    iget v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    invoke-static {p1, v0, v1, v3}, Lcom/google/android/gms/internal/zzfis;->zza(Ljava/lang/CharSequence;[BII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    :goto_5b
    iget v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->zzpgb:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/zzffg$zza;->zzpgb:I
    :try_end_60
    .catch Lcom/google/android/gms/internal/zzfiv; {:try_start_34 .. :try_end_60} :catch_68
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_34 .. :try_end_60} :catch_61

    return-void

    :catch_61
    move-exception v0

    :try_start_62
    new-instance v1, Lcom/google/android/gms/internal/zzffg$zzc;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/zzffg$zzc;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_68
    move-exception v0

    iget v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->zzpgb:I

    iget v3, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    sub-int/2addr v3, v2

    sub-int/2addr v1, v3

    iput v1, p0, Lcom/google/android/gms/internal/zzffg$zza;->zzpgb:I

    iput v2, p0, Lcom/google/android/gms/internal/zzffg$zza;->position:I

    throw v0
    :try_end_74
    .catch Lcom/google/android/gms/internal/zzfiv; {:try_start_62 .. :try_end_74} :catch_74

    :catch_74
    move-exception v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzfiv;)V

    return-void
.end method

.method public final zzz(II)V
    .registers 3

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg$zzd;->zzld(I)V

    return-void
.end method
