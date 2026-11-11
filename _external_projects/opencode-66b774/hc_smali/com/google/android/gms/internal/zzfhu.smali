.class public final Lcom/google/android/gms/internal/zzfhu;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field private mark:I

.field private zzpjp:Lcom/google/android/gms/internal/zzfht;

.field private zzpjq:Lcom/google/android/gms/internal/zzfey;

.field private zzpjr:I

.field private zzpjs:I

.field private zzpjt:I

.field private synthetic zzpju:Lcom/google/android/gms/internal/zzfhq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzfhq;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpju:Lcom/google/android/gms/internal/zzfhq;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfhu;->initialize()V

    return-void
.end method

.method private final initialize()V
    .registers 4

    new-instance v0, Lcom/google/android/gms/internal/zzfht;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpju:Lcom/google/android/gms/internal/zzfhq;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzfht;-><init>(Lcom/google/android/gms/internal/zzfes;Lcom/google/android/gms/internal/zzfhr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjp:Lcom/google/android/gms/internal/zzfht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfht;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzfey;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjq:Lcom/google/android/gms/internal/zzfey;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->size()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjr:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    iput v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjt:I

    return-void
.end method

.method private final zzczd()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjq:Lcom/google/android/gms/internal/zzfey;

    if-eqz v0, :cond_30

    iget v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    iget v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjr:I

    if-ne v0, v1, :cond_30

    iget v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjt:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjt:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjp:Lcom/google/android/gms/internal/zzfht;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfht;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2b

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjp:Lcom/google/android/gms/internal/zzfht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfht;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzfey;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjq:Lcom/google/android/gms/internal/zzfey;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->size()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjr:I

    return-void

    :cond_2b
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjq:Lcom/google/android/gms/internal/zzfey;

    iput v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjr:I

    :cond_30
    return-void
.end method

.method private final zzj([BII)I
    .registers 8

    move v0, p3

    :goto_1
    if-lez v0, :cond_28

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfhu;->zzczd()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjq:Lcom/google/android/gms/internal/zzfey;

    if-nez v1, :cond_e

    if-ne v0, p3, :cond_28

    const/4 p1, -0x1

    return p1

    :cond_e
    iget v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjr:I

    iget v2, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    sub-int/2addr v1, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-eqz p1, :cond_21

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjq:Lcom/google/android/gms/internal/zzfey;

    iget v3, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    invoke-virtual {v2, p1, v3, p2, v1}, Lcom/google/android/gms/internal/zzfes;->zza([BIII)V

    add-int/2addr p2, v1

    :cond_21
    iget v2, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    sub-int/2addr v0, v1

    goto :goto_1

    :cond_28
    sub-int/2addr p3, v0

    return p3
.end method


# virtual methods
.method public final available()I
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjt:I

    iget v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpju:Lcom/google/android/gms/internal/zzfhq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfhq;->size()I

    move-result v1

    sub-int/2addr v1, v0

    return v1
.end method

.method public final mark(I)V
    .registers 3

    iget p1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjt:I

    iget v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/zzfhu;->mark:I

    return-void
.end method

.method public final markSupported()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .registers 4

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfhu;->zzczd()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjq:Lcom/google/android/gms/internal/zzfey;

    if-nez v0, :cond_9

    const/4 v0, -0x1

    return v0

    :cond_9
    iget v1, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/zzfhu;->zzpjs:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzfes;->zzkn(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .registers 5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_10

    if-ltz p3, :cond_10

    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_10

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzfhu;->zzj([BII)I

    move-result p1

    return p1

    :cond_10
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final declared-synchronized reset()V
    .registers 4

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfhu;->initialize()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/internal/zzfhu;->mark:I

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/zzfhu;->zzj([BII)I
    :try_end_b
    .catchall {:try_start_1 .. :try_end_b} :catchall_d

    monitor-exit p0

    return-void

    :catchall_d
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final skip(J)J
    .registers 6

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_17

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p1, v0

    if-lez v2, :cond_e

    move-wide p1, v0

    :cond_e
    const/4 v0, 0x0

    const/4 v1, 0x0

    long-to-int p2, p1

    invoke-direct {p0, v0, v1, p2}, Lcom/google/android/gms/internal/zzfhu;->zzj([BII)I

    move-result p1

    int-to-long p1, p1

    return-wide p1

    :cond_17
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
