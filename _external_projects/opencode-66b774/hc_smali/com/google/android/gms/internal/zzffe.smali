.class public final Lcom/google/android/gms/internal/zzffe;
.super Lcom/google/android/gms/internal/zzffb;
.source ""


# instance fields
.field private final buffer:[B

.field private pos:I

.field private zzpfr:I

.field private zzpft:I

.field private zzpfu:I

.field private final zzpfv:Ljava/io/InputStream;

.field private zzpfw:I

.field private zzpfx:I

.field private zzpfy:Lcom/google/android/gms/internal/zzfff;


# direct methods
.method private constructor <init>(Ljava/io/InputStream;I)V
    .registers 5

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffb;-><init>(Lcom/google/android/gms/internal/zzffc;)V

    const v1, 0x7fffffff

    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    iput-object v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfy:Lcom/google/android/gms/internal/zzfff;

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzffz;->zzc(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfv:Ljava/io/InputStream;

    new-array p1, p2, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    iput p1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iput p1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/InputStream;ILcom/google/android/gms/internal/zzffc;)V
    .registers 4

    const/16 p2, 0x1000

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzffe;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method private final zzcwn()J
    .registers 12

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    if-eq v1, v0, :cond_b8

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v2, v0

    if-ltz v0, :cond_12

    iput v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    int-to-long v0, v0

    return-wide v0

    :cond_12
    sub-int/2addr v1, v3

    const/16 v4, 0x9

    if-lt v1, v4, :cond_b8

    add-int/lit8 v1, v3, 0x1

    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x7

    xor-int/2addr v0, v3

    if-gez v0, :cond_25

    xor-int/lit8 v0, v0, -0x80

    :goto_22
    int-to-long v2, v0

    goto/16 :goto_b5

    :cond_25
    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v2, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v0, v1

    if-ltz v0, :cond_36

    xor-int/lit16 v0, v0, 0x3f80

    int-to-long v0, v0

    move-wide v9, v0

    move v1, v3

    move-wide v2, v9

    goto/16 :goto_b5

    :cond_36
    add-int/lit8 v1, v3, 0x1

    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x15

    xor-int/2addr v0, v3

    if-gez v0, :cond_44

    const v2, -0x1fc080

    xor-int/2addr v0, v2

    goto :goto_22

    :cond_44
    int-to-long v3, v0

    add-int/lit8 v0, v1, 0x1

    aget-byte v1, v2, v1

    int-to-long v5, v1

    const/16 v1, 0x1c

    shl-long/2addr v5, v1

    xor-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-ltz v1, :cond_5b

    const-wide/32 v1, 0xfe03f80

    :goto_57
    xor-long/2addr v1, v3

    move-wide v2, v1

    move v1, v0

    goto :goto_b5

    :cond_5b
    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v2, v0

    int-to-long v7, v0

    const/16 v0, 0x23

    shl-long/2addr v7, v0

    xor-long/2addr v3, v7

    cmp-long v0, v3, v5

    if-gez v0, :cond_70

    const-wide v5, -0x7f01fc080L

    :goto_6d
    xor-long/2addr v3, v5

    :goto_6e
    move-wide v2, v3

    goto :goto_b5

    :cond_70
    add-int/lit8 v0, v1, 0x1

    aget-byte v1, v2, v1

    int-to-long v7, v1

    const/16 v1, 0x2a

    shl-long/2addr v7, v1

    xor-long/2addr v3, v7

    cmp-long v1, v3, v5

    if-ltz v1, :cond_83

    const-wide v1, 0x3f80fe03f80L

    goto :goto_57

    :cond_83
    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v2, v0

    int-to-long v7, v0

    const/16 v0, 0x31

    shl-long/2addr v7, v0

    xor-long/2addr v3, v7

    cmp-long v0, v3, v5

    if-gez v0, :cond_96

    const-wide v5, -0x1fc07f01fc080L

    goto :goto_6d

    :cond_96
    add-int/lit8 v0, v1, 0x1

    aget-byte v1, v2, v1

    int-to-long v7, v1

    const/16 v1, 0x38

    shl-long/2addr v7, v1

    xor-long/2addr v3, v7

    const-wide v7, 0xfe03f80fe03f80L

    xor-long/2addr v3, v7

    cmp-long v1, v3, v5

    if-gez v1, :cond_b3

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v2, v0

    int-to-long v7, v0

    cmp-long v0, v7, v5

    if-ltz v0, :cond_b8

    goto :goto_6e

    :cond_b3
    move v1, v0

    goto :goto_6e

    :goto_b5
    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    return-wide v2

    :cond_b8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwj()J

    move-result-wide v0

    return-wide v0
.end method

.method private final zzcwo()I
    .registers 5

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int/2addr v1, v0

    const/4 v2, 0x4

    if-ge v1, v2, :cond_d

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzffe;->zzkw(I)V

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    add-int/lit8 v2, v0, 0x4

    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0
.end method

.method private final zzcwp()J
    .registers 10

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int/2addr v1, v0

    const/16 v2, 0x8

    if-ge v1, v2, :cond_e

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzffe;->zzkw(I)V

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    add-int/lit8 v3, v0, 0x8

    iput v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    aget-byte v3, v1, v0

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v7, v0, 0x1

    aget-byte v7, v1, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v2

    or-long/2addr v3, v7

    add-int/lit8 v2, v0, 0x2

    aget-byte v2, v1, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x10

    shl-long/2addr v7, v2

    or-long/2addr v3, v7

    add-int/lit8 v2, v0, 0x3

    aget-byte v2, v1, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x18

    shl-long/2addr v7, v2

    or-long/2addr v3, v7

    add-int/lit8 v2, v0, 0x4

    aget-byte v2, v1, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x20

    shl-long/2addr v7, v2

    or-long/2addr v3, v7

    add-int/lit8 v2, v0, 0x5

    aget-byte v2, v1, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x28

    shl-long/2addr v7, v2

    or-long/2addr v3, v7

    add-int/lit8 v2, v0, 0x6

    aget-byte v2, v1, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x30

    shl-long/2addr v7, v2

    or-long/2addr v3, v7

    add-int/lit8 v0, v0, 0x7

    aget-byte v0, v1, v0

    int-to-long v0, v0

    and-long/2addr v0, v5

    const/16 v2, 0x38

    shl-long/2addr v0, v2

    or-long/2addr v0, v3

    return-wide v0
.end method

.method private final zzcwq()V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfr:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int/2addr v1, v0

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    if-le v1, v2, :cond_15

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfr:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    return-void

    :cond_15
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfr:I

    return-void
.end method

.method private final zzcwr()B
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    if-ne v0, v1, :cond_a

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkw(I)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    aget-byte v0, v0, v1

    return v0
.end method

.method private final zzkw(I)V
    .registers 4

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzffe;->zzkx(I)Z

    move-result v0

    if-nez v0, :cond_1a

    iget v0, p0, Lcom/google/android/gms/internal/zzffb;->zzpfo:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    sub-int/2addr v0, v1

    if-le p1, v0, :cond_15

    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyh()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcya()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_1a
    return-void
.end method

.method private final zzkx(I)Z
    .registers 9

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int v1, v0, p1

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    if-le v1, v2, :cond_7e

    iget v1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfo:I

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    sub-int/2addr v1, v3

    sub-int/2addr v1, v0

    const/4 v4, 0x0

    if-le p1, v1, :cond_12

    return v4

    :cond_12
    add-int/2addr v3, v0

    add-int/2addr v3, p1

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    if-le v3, v1, :cond_19

    return v4

    :cond_19
    if-lez v0, :cond_2f

    if-le v2, v0, :cond_23

    iget-object v1, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    sub-int/2addr v2, v0

    invoke-static {v1, v0, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_23
    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    iput v4, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    :cond_2f
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfv:Ljava/io/InputStream;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    array-length v3, v1

    sub-int/2addr v3, v2

    iget v5, p0, Lcom/google/android/gms/internal/zzffb;->zzpfo:I

    iget v6, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    sub-int/2addr v5, v6

    sub-int/2addr v5, v2

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-eqz v0, :cond_60

    const/4 v1, -0x1

    if-lt v0, v1, :cond_60

    iget-object v1, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    array-length v1, v1

    if-gt v0, v1, :cond_60

    if-lez v0, :cond_5f

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwq()V

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_5f
    return v4

    :cond_60
    new-instance p1, Ljava/lang/IllegalStateException;

    const/16 v1, 0x66

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "InputStream#read(byte[]) returned invalid result: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\nThe InputStream implementation is buggy."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7e
    new-instance v0, Ljava/lang/IllegalStateException;

    const/16 v1, 0x4d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "refillBuffer() called when "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes were already available in buffer"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_9d

    :goto_9c
    throw v0

    :goto_9d
    goto :goto_9c
.end method

.method private final zzky(I)[B
    .registers 7

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzffe;->zzkz(I)[B

    move-result-object v0

    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int v2, v1, v0

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int/2addr v3, v1

    iput v3, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int v3, p1, v2

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/zzffe;->zzla(I)Ljava/util/List;

    move-result-object v3

    new-array p1, p1, [B

    iget-object v4, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    invoke-static {v4, v0, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    array-length v4, v3

    invoke-static {v3, v1, p1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, v3

    add-int/2addr v2, v3

    goto :goto_28

    :cond_3b
    return-object p1
.end method

.method private final zzkz(I)[B
    .registers 7

    if-nez p1, :cond_5

    sget-object p1, Lcom/google/android/gms/internal/zzffz;->EMPTY_BYTE_ARRAY:[B

    return-object p1

    :cond_5
    if-ltz p1, :cond_6a

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int v2, v0, v1

    add-int/2addr v2, p1

    iget v3, p0, Lcom/google/android/gms/internal/zzffb;->zzpfo:I

    sub-int v3, v2, v3

    if-gtz v3, :cond_65

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    if-gt v2, v3, :cond_5b

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int/2addr v0, v1

    sub-int v1, p1, v0

    const/16 v2, 0x1000

    if-lt v1, v2, :cond_2c

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfv:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v2

    if-gt v1, v2, :cond_2a

    goto :goto_2c

    :cond_2a
    const/4 p1, 0x0

    return-object p1

    :cond_2c
    :goto_2c
    new-array v1, p1, [B

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    iput v4, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iput v4, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    :goto_41
    if-ge v0, p1, :cond_5a

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfv:Ljava/io/InputStream;

    sub-int v3, p1, v0

    invoke-virtual {v2, v1, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_55

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int/2addr v3, v2

    iput v3, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int/2addr v0, v2

    goto :goto_41

    :cond_55
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcya()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_5a
    return-object v1

    :cond_5b
    sub-int/2addr v3, v0

    sub-int/2addr v3, v1

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/zzffe;->zzku(I)V

    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcya()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_65
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyh()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_6a
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyb()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    goto :goto_70

    :goto_6f
    throw p1

    :goto_70
    goto :goto_6f
.end method

.method private final zzla(I)Ljava/util/List;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_5
    if-lez p1, :cond_2e

    const/16 v1, 0x1000

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    new-array v2, v1, [B

    const/4 v3, 0x0

    :goto_10
    if-ge v3, v1, :cond_29

    iget-object v4, p0, Lcom/google/android/gms/internal/zzffe;->zzpfv:Ljava/io/InputStream;

    sub-int v5, v1, v3

    invoke-virtual {v4, v2, v3, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_24

    iget v5, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int/2addr v5, v4

    iput v5, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int/2addr v3, v4

    goto :goto_10

    :cond_24
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcya()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_29
    sub-int/2addr p1, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_2e
    return-object v0
.end method


# virtual methods
.method public final readDouble()D
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwp()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public final readFloat()F
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwo()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public final readString()Ljava/lang/String;
    .registers 6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    if-lez v0, :cond_1e

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_1e

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    sget-object v4, Lcom/google/android/gms/internal/zzffz;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    return-object v1

    :cond_1e
    if-nez v0, :cond_23

    const-string v0, ""

    return-object v0

    :cond_23
    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    if-gt v0, v1, :cond_3b

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkw(I)V

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    sget-object v4, Lcom/google/android/gms/internal/zzffz;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    return-object v1

    :cond_3b
    new-instance v1, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzky(I)[B

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/zzffz;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzffu<",
            "TT;*>;>(TT;",
            "Lcom/google/android/gms/internal/zzffm;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    iget v2, p0, Lcom/google/android/gms/internal/zzffb;->zzpfn:I

    if-ge v1, v2, :cond_26

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzks(I)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    invoke-static {p1, p0, p2}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffb;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzffe;->zzkp(I)V

    iget p2, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkt(I)V

    return-object p1

    :cond_26
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyg()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfhf;Lcom/google/android/gms/internal/zzffm;)V
    .registers 6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    iget v2, p0, Lcom/google/android/gms/internal/zzffb;->zzpfn:I

    if-ge v1, v2, :cond_25

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzks(I)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    invoke-interface {p1, p0, p2}, Lcom/google/android/gms/internal/zzfhf;->zzb(Lcom/google/android/gms/internal/zzffb;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzfhf;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffe;->zzkp(I)V

    iget p1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/zzffb;->zzpfm:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkt(I)V

    return-void

    :cond_25
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyg()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1
.end method

.method public final zzcvt()I
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwl()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpft:I

    return v0

    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpft:I

    ushr-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_15

    return v0

    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyd()Lcom/google/android/gms/internal/zzfge;

    move-result-object v0

    throw v0
.end method

.method public final zzcvu()J
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwn()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzcvv()J
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwn()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzcvw()I
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    return v0
.end method

.method public final zzcvx()J
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwp()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzcvy()I
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwo()I

    move-result v0

    return v0
.end method

.method public final zzcvz()Z
    .registers 6

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwn()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_c

    const/4 v0, 0x1

    return v0

    :cond_c
    const/4 v0, 0x0

    return v0
.end method

.method public final zzcwa()Ljava/lang/String;
    .registers 6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int v3, v2, v1

    const/4 v4, 0x0

    if-gt v0, v3, :cond_16

    if-lez v0, :cond_16

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    add-int v3, v1, v0

    iput v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    goto :goto_2a

    :cond_16
    if-nez v0, :cond_1b

    const-string v0, ""

    return-object v0

    :cond_1b
    if-gt v0, v2, :cond_25

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkw(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    iput v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    goto :goto_29

    :cond_25
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzky(I)[B

    move-result-object v2

    :goto_29
    const/4 v1, 0x0

    :goto_2a
    add-int v3, v1, v0

    invoke-static {v2, v1, v3}, Lcom/google/android/gms/internal/zzfis;->zzk([BII)Z

    move-result v3

    if-eqz v3, :cond_3a

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lcom/google/android/gms/internal/zzffz;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v1, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v3

    :cond_3a
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyi()Lcom/google/android/gms/internal/zzfge;

    move-result-object v0

    throw v0
.end method

.method public final zzcwb()Lcom/google/android/gms/internal/zzfes;
    .registers 6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_19

    if-lez v0, :cond_19

    iget-object v1, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/zzfes;->zze([BII)Lcom/google/android/gms/internal/zzfes;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    return-object v1

    :cond_19
    if-nez v0, :cond_1e

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    return-object v0

    :cond_1e
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkz(I)[B

    move-result-object v1

    if-eqz v1, :cond_29

    invoke-static {v1}, Lcom/google/android/gms/internal/zzfes;->zzba([B)Lcom/google/android/gms/internal/zzfes;

    move-result-object v0

    return-object v0

    :cond_29
    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int v3, v2, v1

    iget v4, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int/2addr v4, v2

    iput v4, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    const/4 v2, 0x0

    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    sub-int/2addr v0, v3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzla(I)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v4, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    invoke-static {v4, v1, v3}, Lcom/google/android/gms/internal/zzfes;->zze([BII)Lcom/google/android/gms/internal/zzfes;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_56
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v1}, Lcom/google/android/gms/internal/zzfes;->zzba([B)Lcom/google/android/gms/internal/zzfes;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_56

    :cond_6a
    invoke-static {v2}, Lcom/google/android/gms/internal/zzfes;->zzf(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/zzfes;

    move-result-object v0

    return-object v0
.end method

.method public final zzcwc()I
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    return v0
.end method

.method public final zzcwd()I
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    return v0
.end method

.method public final zzcwe()I
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwo()I

    move-result v0

    return v0
.end method

.method public final zzcwf()J
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwp()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzcwg()I
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzffb;->zzkv(I)I

    move-result v0

    return v0
.end method

.method public final zzcwh()J
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzffb;->zzcs(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzcwi()I
    .registers 6

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    if-eq v1, v0, :cond_6b

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v2, v0

    if-ltz v0, :cond_11

    iput v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    return v0

    :cond_11
    sub-int/2addr v1, v3

    const/16 v4, 0x9

    if-lt v1, v4, :cond_6b

    add-int/lit8 v1, v3, 0x1

    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x7

    xor-int/2addr v0, v3

    if-gez v0, :cond_22

    xor-int/lit8 v0, v0, -0x80

    goto :goto_68

    :cond_22
    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v2, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v0, v1

    if-ltz v0, :cond_2f

    xor-int/lit16 v0, v0, 0x3f80

    :cond_2d
    move v1, v3

    goto :goto_68

    :cond_2f
    add-int/lit8 v1, v3, 0x1

    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x15

    xor-int/2addr v0, v3

    if-gez v0, :cond_3d

    const v2, -0x1fc080

    xor-int/2addr v0, v2

    goto :goto_68

    :cond_3d
    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v2, v1

    shl-int/lit8 v4, v1, 0x1c

    xor-int/2addr v0, v4

    const v4, 0xfe03f80

    xor-int/2addr v0, v4

    if-gez v1, :cond_2d

    add-int/lit8 v1, v3, 0x1

    aget-byte v3, v2, v3

    if-gez v3, :cond_68

    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v2, v1

    if-gez v1, :cond_2d

    add-int/lit8 v1, v3, 0x1

    aget-byte v3, v2, v3

    if-gez v3, :cond_68

    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v2, v1

    if-gez v1, :cond_2d

    add-int/lit8 v1, v3, 0x1

    aget-byte v2, v2, v3

    if-ltz v2, :cond_6b

    :cond_68
    :goto_68
    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    return v0

    :cond_6b
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwj()J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public final zzcwj()J
    .registers 7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_3
    const/16 v3, 0x40

    if-ge v2, v3, :cond_18

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwr()B

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_15

    return-wide v0

    :cond_15
    add-int/lit8 v2, v2, 0x7

    goto :goto_3

    :cond_18
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyc()Lcom/google/android/gms/internal/zzfge;

    move-result-object v0

    goto :goto_1e

    :goto_1d
    throw v0

    :goto_1e
    goto :goto_1d
.end method

.method public final zzcwk()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_9

    const/4 v0, -0x1

    return v0

    :cond_9
    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    return v0
.end method

.method public final zzcwl()Z
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    if-ne v0, v1, :cond_e

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkx(I)Z

    move-result v1

    if-nez v1, :cond_e

    return v0

    :cond_e
    const/4 v0, 0x0

    return v0
.end method

.method public final zzcwm()I
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zzkp(I)V
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpft:I

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcye()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1
.end method

.method public final zzkq(I)Z
    .registers 7

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3f

    if-eq v0, v2, :cond_39

    const/4 v3, 0x2

    if-eq v0, v3, :cond_31

    const/4 v3, 0x4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_1e

    if-eq v0, v3, :cond_1d

    const/4 p1, 0x5

    if-ne v0, p1, :cond_18

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/zzffe;->zzku(I)V

    return v2

    :cond_18
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyf()Lcom/google/android/gms/internal/zzfgf;

    move-result-object p1

    throw p1

    :cond_1d
    return v1

    :cond_1e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcvt()I

    move-result v0

    if-eqz v0, :cond_2a

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkq(I)Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_2a
    ushr-int/2addr p1, v4

    shl-int/2addr p1, v4

    or-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffe;->zzkp(I)V

    return v2

    :cond_31
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwi()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffe;->zzku(I)V

    return v2

    :cond_39
    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffe;->zzku(I)V

    return v2

    :cond_3f
    iget p1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    sub-int/2addr p1, v0

    const/16 v0, 0xa

    if-lt p1, v0, :cond_5e

    :goto_48
    if-ge v1, v0, :cond_59

    iget-object p1, p0, Lcom/google/android/gms/internal/zzffe;->buffer:[B

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    aget-byte p1, p1, v3

    if-gez p1, :cond_69

    add-int/lit8 v1, v1, 0x1

    goto :goto_48

    :cond_59
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyc()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_5e
    :goto_5e
    if-ge v1, v0, :cond_6a

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwr()B

    move-result p1

    if-gez p1, :cond_69

    add-int/lit8 v1, v1, 0x1

    goto :goto_5e

    :cond_69
    return v2

    :cond_6a
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyc()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    goto :goto_70

    :goto_6f
    throw p1

    :goto_70
    goto :goto_6f
.end method

.method public final zzks(I)I
    .registers 4

    if-ltz p1, :cond_17

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iget p1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    if-gt v0, p1, :cond_12

    iput v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwq()V

    return p1

    :cond_12
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcya()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_17
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyb()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1
.end method

.method public final zzkt(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffe;->zzcwq()V

    return-void
.end method

.method public final zzku(I)V
    .registers 7

    iget v0, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    iget v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    sub-int v2, v0, v1

    if-gt p1, v2, :cond_e

    if-ltz p1, :cond_e

    add-int/2addr v1, p1

    iput v1, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    return-void

    :cond_e
    if-ltz p1, :cond_38

    iget v2, p0, Lcom/google/android/gms/internal/zzffe;->zzpfx:I

    add-int v3, v2, v1

    add-int/2addr v3, p1

    iget v4, p0, Lcom/google/android/gms/internal/zzffe;->zzpfu:I

    if-gt v3, v4, :cond_2e

    sub-int v1, v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    const/4 v0, 0x1

    :goto_1e
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzffe;->zzkw(I)V

    sub-int v2, p1, v1

    iget v3, p0, Lcom/google/android/gms/internal/zzffe;->zzpfw:I

    if-le v2, v3, :cond_2b

    add-int/2addr v1, v3

    iput v3, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    goto :goto_1e

    :cond_2b
    iput v2, p0, Lcom/google/android/gms/internal/zzffe;->pos:I

    return-void

    :cond_2e
    sub-int/2addr v4, v2

    sub-int/2addr v4, v1

    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/zzffe;->zzku(I)V

    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcya()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    throw p1

    :cond_38
    invoke-static {}, Lcom/google/android/gms/internal/zzfge;->zzcyb()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    goto :goto_3e

    :goto_3d
    throw p1

    :goto_3e
    goto :goto_3d
.end method
