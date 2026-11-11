.class public final L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final 〳ぜぞぜべっ:Ljava/util/logging/Logger;


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

.field public final ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;

.field public final くし〴〺ぅ:Z

.field public づざかべべ:I

.field public なぎぱいぢぎ:Z

.field public final びぐびあび:Lぺぁあねじ/づざかべべ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〳ぜぞぜべっ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lぺぁあねじ/なぎぱいぢぎ;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    iput-boolean p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Z

    new-instance p1, Lぺぁあねじ/づざかべべ;

    invoke-direct {p1}, Lぺぁあねじ/づざかべべ;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lぺぁあねじ/づざかべべ;

    new-instance p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;

    invoke-direct {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;-><init>(Lぺぁあねじ/づざかべべ;)V

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;

    const/16 p1, 0x4000

    iput p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->づざかべべ:I

    return-void
.end method


# virtual methods
.method public declared-synchronized close()V
    .registers 2

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0}, Lぺぁあねじ/でどあくず;->close()V
    :try_end_9
    .catchall {:try_start_2 .. :try_end_9} :catchall_b

    monitor-exit p0

    return-void

    :catchall_b
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized flush()V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_c

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V
    :try_end_a
    .catchall {:try_start_1 .. :try_end_a} :catchall_14

    monitor-exit p0

    return-void

    :cond_c
    :try_start_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_14
    .catchall {:try_start_c .. :try_end_14} :catchall_14

    :catchall_14
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized 〺でおいここ(IJ)V
    .registers 8

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_36

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    cmp-long v3, p2, v0

    if-eqz v3, :cond_26

    const-wide/32 v0, 0x7fffffff

    cmp-long v3, p2, v0

    if-gtz v3, :cond_26

    const/4 v0, 0x4

    const/16 v1, 0x8

    invoke-virtual {p0, p1, v0, v1, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    long-to-int p3, p2

    invoke-interface {p1, p3}, Lぺぁあねじ/なぎぱいぢぎ;->いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V
    :try_end_24
    .catchall {:try_start_1 .. :try_end_24} :catchall_3e

    monitor-exit p0

    return-void

    :cond_26
    :try_start_26
    const-string p1, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v2

    invoke-static {p1, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->〺つふすそ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    :try_end_34
    .catchall {:try_start_26 .. :try_end_34} :catchall_3e

    const/4 p1, 0x0

    throw p1

    :cond_36
    :try_start_36
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3e
    .catchall {:try_start_36 .. :try_end_3e} :catchall_3e

    :catchall_3e
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final ぇとしたべど(IJ)V
    .registers 11

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_24

    iget v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->づざかべべ:I

    int-to-long v2, v2

    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    int-to-long v4, v3

    sub-long/2addr p2, v4

    const/16 v2, 0x9

    cmp-long v6, p2, v0

    if-nez v6, :cond_18

    const/4 v0, 0x4

    goto :goto_19

    :cond_18
    const/4 v0, 0x0

    :goto_19
    invoke-virtual {p0, p1, v3, v2, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lぺぁあねじ/づざかべべ;

    invoke-interface {v0, v1, v4, v5}, Lぺぁあねじ/でどあくず;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V

    goto :goto_0

    :cond_24
    return-void
.end method

.method public ぉひのべい(IIBB)V
    .registers 9

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〳ぜぞぜべっ:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_12

    invoke-static {v2, p1, p2, p3, p4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->げつ〴ぬぐ(ZIIBB)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_12
    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->づざかべべ:I

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-gt p2, v0, :cond_58

    const/high16 v0, -0x80000000

    and-int/2addr v0, p1

    if-nez v0, :cond_4a

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    ushr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 1
    invoke-interface {v0, v1}, Lぺぁあねじ/なぎぱいぢぎ;->へぬ〴づぞ(I)Lぺぁあねじ/なぎぱいぢぎ;

    ushr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    invoke-interface {v0, v1}, Lぺぁあねじ/なぎぱいぢぎ;->へぬ〴づぞ(I)Lぺぁあねじ/なぎぱいぢぎ;

    and-int/lit16 p2, p2, 0xff

    invoke-interface {v0, p2}, Lぺぁあねじ/なぎぱいぢぎ;->へぬ〴づぞ(I)Lぺぁあねじ/なぎぱいぢぎ;

    .line 2
    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    and-int/lit16 p3, p3, 0xff

    invoke-interface {p2, p3}, Lぺぁあねじ/なぎぱいぢぎ;->へぬ〴づぞ(I)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    and-int/lit16 p3, p4, 0xff

    invoke-interface {p2, p3}, Lぺぁあねじ/なぎぱいぢぎ;->へぬ〴づぞ(I)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    const p3, 0x7fffffff

    and-int/2addr p1, p3

    invoke-interface {p2, p1}, Lぺぁあねじ/なぎぱいぢぎ;->いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;

    return-void

    :cond_4a
    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, v2

    const-string p1, "reserved bit set: %s"

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->〺つふすそ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    throw v1

    :cond_58
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p1, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v3

    const-string p2, "FRAME_SIZE_ERROR length > %d: %d"

    invoke-static {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->〺つふすそ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    throw v1
.end method

.method public declared-synchronized おかぷせ〱(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_24

    iget v0, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->〺つふすそ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1e

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    iget p2, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->〺つふすそ:I

    invoke-interface {p1, p2}, Lぺぁあねじ/なぎぱいぢぎ;->いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V
    :try_end_1c
    .catchall {:try_start_1 .. :try_end_1c} :catchall_2c

    monitor-exit p0

    return-void

    :cond_1e
    :try_start_1e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_24
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2c
    .catchall {:try_start_1e .. :try_end_2c} :catchall_2c

    :catchall_2c
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized けときぜと(ZII)V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_22

    const/16 v0, 0x8

    const/4 v1, 0x6

    const/4 v2, 0x0

    if-eqz p1, :cond_d

    const/4 p1, 0x1

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    invoke-virtual {p0, v2, v0, v1, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1, p2}, Lぺぁあねじ/なぎぱいぢぎ;->いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1, p3}, Lぺぁあねじ/なぎぱいぢぎ;->いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V
    :try_end_20
    .catchall {:try_start_1 .. :try_end_20} :catchall_2a

    monitor-exit p0

    return-void

    :cond_22
    :try_start_22
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2a
    .catchall {:try_start_22 .. :try_end_2a} :catchall_2a

    :catchall_2a
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized じぜこほぱ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;)V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_60

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->づざかべべ:I

    .line 1
    iget v1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:I

    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_12

    iget-object v0, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ:[I

    const/4 v2, 0x5

    aget v0, v0, v2

    .line 2
    :cond_12
    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->づざかべべ:I

    and-int/lit8 v0, v1, 0x2

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eqz v0, :cond_1f

    .line 3
    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ:[I

    aget v3, v3, v1

    goto :goto_20

    :cond_1f
    const/4 v3, -0x1

    :goto_20
    if-eq v3, v2, :cond_54

    .line 4
    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;

    if-eqz v0, :cond_2a

    .line 5
    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ:[I

    aget v2, p1, v1

    .line 6
    :cond_2a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x4000

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v0, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->びぐびあび:I

    if-ne v0, p1, :cond_38

    goto :goto_54

    :cond_38
    if-ge p1, v0, :cond_42

    iget v0, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->〺つふすそ:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->〺つふすそ:I

    :cond_42
    iput-boolean v1, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->くし〴〺ぅ:Z

    iput p1, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->びぐびあび:I

    .line 7
    iget v0, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->〳ぜぞぜべっ:I

    if-ge p1, v0, :cond_54

    if-nez p1, :cond_50

    invoke-virtual {v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->げつ〴ぬぐ()V

    goto :goto_54

    :cond_50
    sub-int/2addr v0, p1

    invoke-virtual {v3, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->〺つふすそ(I)I

    :cond_54
    :goto_54
    const/4 p1, 0x4

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, p1, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V
    :try_end_5e
    .catchall {:try_start_1 .. :try_end_5e} :catchall_68

    monitor-exit p0

    return-void

    :cond_60
    :try_start_60
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_68
    .catchall {:try_start_60 .. :try_end_68} :catchall_68

    :catchall_68
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized せづっ〸ちね(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;[B)V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_36

    iget v0, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->〺つふすそ:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2d

    array-length v0, p3

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x7

    invoke-virtual {p0, v2, v0, v1, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0, p1}, Lぺぁあねじ/なぎぱいぢぎ;->いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    iget p2, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->〺つふすそ:I

    invoke-interface {p1, p2}, Lぺぁあねじ/なぎぱいぢぎ;->いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;

    array-length p1, p3

    if-lez p1, :cond_26

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1, p3}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    :cond_26
    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V
    :try_end_2b
    .catchall {:try_start_1 .. :try_end_2b} :catchall_3e

    monitor-exit p0

    return-void

    :cond_2d
    :try_start_2d
    const-string p1, "errorCode.httpCode == -1"

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->〺つふすそ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    :try_end_34
    .catchall {:try_start_2d .. :try_end_34} :catchall_3e

    const/4 p1, 0x0

    throw p1

    :cond_36
    :try_start_36
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3e
    .catchall {:try_start_36 .. :try_end_3e} :catchall_3e

    :catchall_3e
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public ぷぞてのほき(ZILjava/util/List;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u307a\u3041\u3042\u306d\u3058/\u304f\u3057\u3034\u303a\u3045;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_36

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;

    invoke-virtual {v0, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$〺つふすそ;->づざかべべ(Ljava/util/List;)V

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lぺぁあねじ/づざかべべ;

    .line 1
    iget-wide v0, p3, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    .line 2
    iget p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->づざかべべ:I

    int-to-long v2, p3

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    int-to-long v2, p3

    cmp-long v4, v0, v2

    if-nez v4, :cond_1c

    const/4 v4, 0x4

    goto :goto_1d

    :cond_1c
    const/4 v4, 0x0

    :goto_1d
    if-eqz p1, :cond_22

    or-int/lit8 p1, v4, 0x1

    int-to-byte v4, p1

    :cond_22
    const/4 p1, 0x1

    invoke-virtual {p0, p2, p3, p1, v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->びぐびあび:Lぺぁあねじ/づざかべべ;

    invoke-interface {p1, p3, v2, v3}, Lぺぁあねじ/でどあくず;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V

    cmp-long p1, v0, v2

    if-lez p1, :cond_35

    sub-long/2addr v0, v2

    invoke-virtual {p0, p2, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぇとしたべど(IJ)V

    :cond_35
    return-void

    :cond_36
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized ぺづげぺが(ZILぺぁあねじ/づざかべべ;I)V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_19

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    const/4 p1, 0x1

    int-to-byte p1, p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 1
    :goto_c
    invoke-virtual {p0, p2, p4, v0, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    if-lez p4, :cond_17

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    int-to-long v0, p4

    invoke-interface {p1, p3, v0, v1}, Lぺぁあねじ/でどあくず;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V
    :try_end_17
    .catchall {:try_start_1 .. :try_end_17} :catchall_21

    .line 2
    :cond_17
    monitor-exit p0

    return-void

    :cond_19
    :try_start_19
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_21
    .catchall {:try_start_19 .. :try_end_21} :catchall_21

    :catchall_21
    move-exception p1

    monitor-exit p0

    throw p1
.end method
