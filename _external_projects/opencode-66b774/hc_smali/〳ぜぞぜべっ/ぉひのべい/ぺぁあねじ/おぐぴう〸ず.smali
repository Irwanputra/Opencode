.class public final L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;,
        L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final なぎぱいぢぎ:Ljava/util/logging/Logger;


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

.field public final くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;

.field public final づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;

.field public final びぐびあび:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lぺぁあねじ/ぁごぐすすぃ;Z)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    iput-boolean p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->びぐびあび:Z

    new-instance p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;

    invoke-direct {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;-><init>(Lぺぁあねじ/ぁごぐすすぃ;)V

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;

    new-instance p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;

    const/16 v0, 0x1000

    invoke-direct {p1, v0, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;-><init>(ILぺぁあねじ/ぶでにく〼〳;)V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;

    return-void
.end method

.method public static けときぜと(Lぺぁあねじ/ぁごぐすすぃ;)I
    .registers 3

    invoke-interface {p0}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    invoke-interface {p0}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-interface {p0}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static じぜこほぱ(IBS)I
    .registers 4

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_6

    add-int/lit8 p0, p0, -0x1

    :cond_6
    if-gt p2, p0, :cond_b

    sub-int/2addr p0, p2

    int-to-short p0, p0

    return p0

    :cond_b
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    aput-object p2, p1, v0

    const/4 p2, 0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, p1, p2

    const-string p0, "PROTOCOL_ERROR padding %s > remaining length %s"

    invoke-static {p0, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public close()V
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->close()V

    return-void
.end method

.method public final 〺でおいここ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;IBI)V
    .registers 15

    const/4 v0, 0x0

    if-eqz p4, :cond_68

    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_11

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v1}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-short v1, v1

    goto :goto_12

    :cond_11
    const/4 v1, 0x0

    :goto_12
    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v2}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result v2

    const v3, 0x7fffffff

    and-int v8, v2, v3

    add-int/lit8 p2, p2, -0x4

    invoke-static {p2, p3, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->じぜこほぱ(IBS)I

    move-result p2

    invoke-virtual {p0, p2, v1, p3, p4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->ぷぞてのほき(ISBI)Ljava/util/List;

    move-result-object v9

    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 1
    iget-object v5, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 2
    monitor-enter v5

    :try_start_2c
    iget-object p1, v5, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ざっざへづ:Ljava/util/Set;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3f

    sget-object p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {v5, v8, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぇとしたべど(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    monitor-exit v5

    goto :goto_64

    :cond_3f
    iget-object p1, v5, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ざっざへづ:Ljava/util/Set;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v5
    :try_end_49
    .catchall {:try_start_2c .. :try_end_49} :catchall_65

    :try_start_49
    iget-object p1, v5, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〳ぜぞぜべっ;

    const-string v6, "OkHttp %s Push Request[%s]"

    const/4 p3, 0x2

    new-array v7, p3, [Ljava/lang/Object;

    iget-object p3, v5, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object p3, v7, v0

    const/4 p3, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, v7, p3

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〳ぜぞぜべっ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_64
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_49 .. :try_end_64} :catch_64

    :catch_64
    :goto_64
    return-void

    :catchall_65
    move-exception p1

    :try_start_66
    monitor-exit v5
    :try_end_67
    .catchall {:try_start_66 .. :try_end_67} :catchall_65

    throw p1

    :cond_68
    const-string p1, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    new-array p2, v0, [Ljava/lang/Object;

    .line 3
    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    const/4 p1, 0x0

    throw p1
.end method

.method public final ぇとしたべど(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;II)V
    .registers 13

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-ne p2, v3, :cond_6a

    if-eqz p3, :cond_62

    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p2}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result p2

    invoke-static {p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->げつ〴ぬぐ(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    move-result-object v8

    if-eqz v8, :cond_54

    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 1
    iget-object p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {p2, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぷぞてのほき(I)Z

    move-result p2

    if-eqz p2, :cond_3c

    iget-object v4, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 2
    iget-object p1, v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぺふねづ〺;

    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/Object;

    iget-object v0, v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object v0, v6, v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v1

    const-string v5, "OkHttp %s Push Reset[%s]"

    move-object v3, p2

    move v7, p3

    invoke-direct/range {v3 .. v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぺふねづ〺;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;Ljava/lang/String;[Ljava/lang/Object;IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_53

    .line 3
    :cond_3c
    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->けときぜと(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    move-result-object p1

    if-eqz p1, :cond_53

    .line 4
    monitor-enter p1

    :try_start_45
    iget-object p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->てぜきぽく:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    if-nez p2, :cond_4e

    iput-object v8, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->てぜきぽく:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
    :try_end_4e
    .catchall {:try_start_45 .. :try_end_4e} :catchall_50

    :cond_4e
    monitor-exit p1

    goto :goto_53

    :catchall_50
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_53
    :goto_53
    return-void

    :cond_54
    const-string p1, "TYPE_RST_STREAM unexpected error code: %d"

    new-array p3, v1, [Ljava/lang/Object;

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v2

    invoke-static {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_62
    const-string p1, "TYPE_RST_STREAM streamId == 0"

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_6a
    const-string p1, "TYPE_RST_STREAM length: %d != 4"

    new-array p3, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v2

    invoke-static {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0
.end method

.method public ぉひのべい(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;)V
    .registers 9

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->びぐびあび:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_16

    invoke-virtual {p0, v3, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->ぺづげぺが(ZL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;)Z

    move-result p1

    if-eqz p1, :cond_e

    goto :goto_44

    :cond_e
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "Required SETTINGS preface not received"

    invoke-static {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v1

    :cond_16
    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-virtual {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->ぺふねづ〺()I

    move-result v4

    int-to-long v4, v4

    invoke-interface {p1, v4, v5}, Lぺぁあねじ/ぁごぐすすぃ;->なぎぱいぢぎ(J)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p1

    sget-object v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v5

    if-eqz v5, :cond_3e

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lぺぁあねじ/〳ぜぞぜべっ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    const-string v6, "<< CONNECTION %s"

    invoke-static {v6, v5}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_3e
    invoke-virtual {v0, p1}, Lぺぁあねじ/〳ぜぞぜべっ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_45

    :goto_44
    return-void

    :cond_45
    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lぺぁあねじ/〳ぜぞぜべっ;->おぐぴう〸ず()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "Expected a connection header but was %s"

    invoke-static {p1, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v1
.end method

.method public final おかぷせ〱(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;IBI)V
    .registers 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x8

    if-ne p2, v3, :cond_46

    if-nez p4, :cond_3e

    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p2}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result p2

    iget-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p4}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result p4

    and-int/2addr p3, v2

    if-eqz p3, :cond_1a

    const/4 p3, 0x1

    goto :goto_1b

    :cond_1a
    const/4 p3, 0x0

    :goto_1b
    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p3, :cond_31

    iget-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    monitor-enter p3

    :try_start_25
    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 2
    iput-boolean v1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく:Z

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p3

    goto :goto_3d

    :catchall_2e
    move-exception p1

    monitor-exit p3
    :try_end_30
    .catchall {:try_start_25 .. :try_end_30} :catchall_2e

    throw p1

    :cond_31
    :try_start_31
    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 4
    iget-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;

    invoke-direct {v0, p1, v2, p2, p4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;ZII)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_3d
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_31 .. :try_end_3d} :catch_3d

    :catch_3d
    :goto_3d
    return-void

    :cond_3e
    const-string p1, "TYPE_PING streamId != 0"

    new-array p2, v1, [Ljava/lang/Object;

    .line 6
    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_46
    const-string p1, "TYPE_PING length != 8: %s"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v1

    invoke-static {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0
.end method

.method public final げがぴうあだ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;IBI)V
    .registers 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p4, :cond_14f

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_18

    if-nez p2, :cond_10

    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_10
    const-string p1, "FRAME_SIZE_ERROR ack frame should be empty!"

    new-array p2, v1, [Ljava/lang/Object;

    .line 2
    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_18
    rem-int/lit8 p3, p2, 0x6

    if-nez p3, :cond_141

    new-instance p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-direct {p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;-><init>()V

    const/4 v2, 0x0

    :goto_22
    if-ge v2, p2, :cond_7a

    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v3}, Lぺぁあねじ/ぁごぐすすぃ;->ぶでにく〼〳()S

    move-result v3

    const v4, 0xffff

    and-int/2addr v3, v4

    iget-object v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v4}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-eq v3, v5, :cond_67

    const/4 v5, 0x3

    if-eq v3, v5, :cond_65

    if-eq v3, v6, :cond_59

    const/4 v5, 0x5

    if-eq v3, v5, :cond_41

    goto :goto_74

    :cond_41
    const/16 v5, 0x4000

    if-lt v4, v5, :cond_4b

    const v5, 0xffffff

    if-gt v4, v5, :cond_4b

    goto :goto_74

    :cond_4b
    const-string p1, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    new-array p2, p4, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_59
    const/4 v3, 0x7

    if-ltz v4, :cond_5d

    goto :goto_74

    :cond_5d
    const-string p1, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_65
    const/4 v3, 0x4

    goto :goto_74

    :cond_67
    if-eqz v4, :cond_74

    if-ne v4, p4, :cond_6c

    goto :goto_74

    :cond_6c
    const-string p1, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_74
    :goto_74
    invoke-virtual {p3, v3, v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ(II)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    add-int/lit8 v2, v2, 0x6

    goto :goto_22

    :cond_7a
    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 3
    iget-object v2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    monitor-enter v2

    :try_start_7f
    iget-object p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object p2, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぇぬぎばつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-virtual {p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ()I

    move-result p2

    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v3, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぇぬぎばつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    .line 4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    :goto_8f
    const/16 v5, 0xa

    if-ge v4, v5, :cond_aa

    shl-int v5, p4, v4

    .line 5
    iget v6, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:I

    and-int/2addr v5, v6

    if-eqz v5, :cond_9c

    const/4 v5, 0x1

    goto :goto_9d

    :cond_9c
    const/4 v5, 0x0

    :goto_9d
    if-nez v5, :cond_a0

    goto :goto_a7

    .line 6
    :cond_a0
    iget-object v5, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ:[I

    aget v5, v5, v4

    .line 7
    invoke-virtual {v3, v4, v5}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ(II)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;
    :try_end_a7
    .catchall {:try_start_7f .. :try_end_a7} :catchall_13e

    :goto_a7
    add-int/lit8 v4, v4, 0x1

    goto :goto_8f

    .line 8
    :cond_aa
    :try_start_aa
    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 9
    iget-object v4, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    new-instance v5, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/へぬ〴づぞ;

    const-string v6, "OkHttp %s ACK Settings"

    new-array v7, p4, [Ljava/lang/Object;

    iget-object v3, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object v3, v7, v1

    invoke-direct {v5, p1, v6, v7, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/へぬ〴づぞ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;Ljava/lang/String;[Ljava/lang/Object;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_be
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_aa .. :try_end_be} :catch_be
    .catchall {:try_start_aa .. :try_end_be} :catchall_13e

    .line 11
    :catch_be
    :try_start_be
    iget-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object p3, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぇぬぎばつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-virtual {p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ()I

    move-result p3

    const/4 v3, -0x1

    const-wide/16 v4, 0x0

    if-eq p3, v3, :cond_108

    if-eq p3, p2, :cond_108

    sub-int/2addr p3, p2

    int-to-long p2, p3

    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-boolean v6, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぉざぅち〻:Z

    if-nez v6, :cond_e5

    .line 12
    iget-wide v6, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->へぬ〴づぞ:J

    add-long/2addr v6, p2

    iput-wide v6, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->へぬ〴づぞ:J

    cmp-long v6, p2, v4

    if-lez v6, :cond_e1

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 13
    :cond_e1
    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iput-boolean p4, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぉざぅち〻:Z

    :cond_e5
    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v3, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_109

    iget-object v0, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v3, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    new-array v3, v3, [L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    goto :goto_109

    :cond_108
    move-wide p2, v4

    .line 14
    :cond_109
    :goto_109
    sget-object v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->でどあくず:Ljava/util/concurrent/ExecutorService;

    .line 15
    new-instance v6, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/のぷのちつ;

    const-string v7, "OkHttp %s settings"

    new-array p4, p4, [Ljava/lang/Object;

    iget-object v8, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v8, v8, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object v8, p4, v1

    invoke-direct {v6, p1, v7, p4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/のぷのちつ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v3, v6}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit v2
    :try_end_11e
    .catchall {:try_start_be .. :try_end_11e} :catchall_13e

    if-eqz v0, :cond_13d

    cmp-long p1, p2, v4

    if-eqz p1, :cond_13d

    array-length p1, v0

    :goto_125
    if-ge v1, p1, :cond_13d

    aget-object p4, v0, v1

    monitor-enter p4

    .line 16
    :try_start_12a
    iget-wide v2, p4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->〺つふすそ:J

    add-long/2addr v2, p2

    iput-wide v2, p4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->〺つふすそ:J

    cmp-long v2, p2, v4

    if-lez v2, :cond_136

    invoke-virtual {p4}, Ljava/lang/Object;->notifyAll()V

    .line 17
    :cond_136
    monitor-exit p4

    add-int/lit8 v1, v1, 0x1

    goto :goto_125

    :catchall_13a
    move-exception p1

    monitor-exit p4
    :try_end_13c
    .catchall {:try_start_12a .. :try_end_13c} :catchall_13a

    throw p1

    :cond_13d
    return-void

    :catchall_13e
    move-exception p1

    :try_start_13f
    monitor-exit v2
    :try_end_140
    .catchall {:try_start_13f .. :try_end_140} :catchall_13e

    throw p1

    :cond_141
    const-string p1, "TYPE_SETTINGS length %% 6 != 0: %s"

    new-array p3, p4, [Ljava/lang/Object;

    .line 18
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v1

    invoke-static {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_14f
    const-string p1, "TYPE_SETTINGS streamId != 0"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    goto :goto_158

    :goto_157
    throw v0

    :goto_158
    goto :goto_157
.end method

.method public final せづっ〸ちね(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;II)V
    .registers 10

    const/16 v0, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt p2, v0, :cond_93

    if-nez p3, :cond_8b

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p3}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result p3

    iget-object v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v4}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result v4

    sub-int/2addr p2, v0

    invoke-static {v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->げつ〴ぬぐ(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    move-result-object v0

    if-eqz v0, :cond_7d

    sget-object v0, Lぺぁあねじ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lぺぁあねじ/〳ぜぞぜべっ;

    if-lez p2, :cond_27

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    int-to-long v4, p2

    invoke-interface {v0, v4, v5}, Lぺぁあねじ/ぁごぐすすぃ;->なぎぱいぢぎ(J)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object v0

    :cond_27
    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->ぺふねづ〺()I

    iget-object p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    monitor-enter p2

    :try_start_32
    iget-object v0, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v1, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iput-boolean v3, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->〳ぜぞぜべっ:Z

    monitor-exit p2
    :try_end_4f
    .catchall {:try_start_32 .. :try_end_4f} :catchall_7a

    array-length p2, v0

    :goto_50
    if-ge v2, p2, :cond_79

    aget-object v1, v0, v2

    .line 2
    iget v3, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->くし〴〺ぅ:I

    if-le v3, p3, :cond_76

    .line 3
    invoke-virtual {v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->ぁごぐすすぃ()Z

    move-result v3

    if-eqz v3, :cond_76

    sget-object v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    .line 4
    monitor-enter v1

    :try_start_61
    iget-object v4, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->てぜきぽく:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    if-nez v4, :cond_6a

    iput-object v3, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->てぜきぽく:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_6a
    .catchall {:try_start_61 .. :try_end_6a} :catchall_73

    :cond_6a
    monitor-exit v1

    .line 5
    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 6
    iget v1, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->くし〴〺ぅ:I

    .line 7
    invoke-virtual {v3, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->けときぜと(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    goto :goto_76

    :catchall_73
    move-exception p1

    .line 8
    monitor-exit v1

    throw p1

    :cond_76
    :goto_76
    add-int/lit8 v2, v2, 0x1

    goto :goto_50

    :cond_79
    return-void

    :catchall_7a
    move-exception p1

    .line 9
    :try_start_7b
    monitor-exit p2
    :try_end_7c
    .catchall {:try_start_7b .. :try_end_7c} :catchall_7a

    throw p1

    :cond_7d
    const-string p1, "TYPE_GOAWAY unexpected error code: %d"

    new-array p2, v3, [Ljava/lang/Object;

    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v2

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v1

    :cond_8b
    const-string p1, "TYPE_GOAWAY streamId != 0"

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v1

    :cond_93
    const-string p1, "TYPE_GOAWAY length < 8: %s"

    new-array p3, v3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v2

    invoke-static {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    goto :goto_a2

    :goto_a1
    throw v1

    :goto_a2
    goto :goto_a1
.end method

.method public final ながふずは(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;II)V
    .registers 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-ne p2, v3, :cond_54

    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p2}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result p2

    int-to-long v3, p2

    const-wide/32 v5, 0x7fffffff

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long p2, v3, v5

    if-eqz p2, :cond_46

    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 1
    iget-object p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    if-nez p3, :cond_2d

    monitor-enter p2

    :try_start_1e
    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-wide v0, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->へぬ〴づぞ:J

    add-long/2addr v0, v3

    iput-wide v0, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->へぬ〴づぞ:J

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p2

    goto :goto_45

    :catchall_2a
    move-exception p1

    monitor-exit p2
    :try_end_2c
    .catchall {:try_start_1e .. :try_end_2c} :catchall_2a

    throw p1

    :cond_2d
    invoke-virtual {p2, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぉひのべい(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    move-result-object p1

    if-eqz p1, :cond_45

    monitor-enter p1

    .line 2
    :try_start_34
    iget-wide p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->〺つふすそ:J

    add-long/2addr p2, v3

    iput-wide p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->〺つふすそ:J

    cmp-long p2, v3, v5

    if-lez p2, :cond_40

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 3
    :cond_40
    monitor-exit p1

    goto :goto_45

    :catchall_42
    move-exception p2

    monitor-exit p1
    :try_end_44
    .catchall {:try_start_34 .. :try_end_44} :catchall_42

    throw p2

    :cond_45
    :goto_45
    return-void

    :cond_46
    const-string p1, "windowSizeIncrement was 0"

    new-array p2, v2, [Ljava/lang/Object;

    .line 4
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0

    :cond_54
    const-string p1, "TYPE_WINDOW_UPDATE length !=4: %s"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v1

    invoke-static {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v0
.end method

.method public final ぷぞてのほき(ISBI)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ISBI)",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u307a\u3041\u3042\u306d\u3058/\u304f\u3057\u3034\u303a\u3045;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;

    iput p1, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->なぎぱいぢぎ:I

    iput p1, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->くし〴〺ぅ:I

    iput-short p2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->ぁごぐすすぃ:S

    iput-byte p3, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->びぐびあび:B

    iput p4, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->づざかべべ:I

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;

    .line 1
    :cond_e
    :goto_e
    iget-object p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p2}, Lぺぁあねじ/ぁごぐすすぃ;->のぷのちつ()Z

    move-result p2

    if-nez p2, :cond_126

    iget-object p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p2}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result p2

    and-int/lit16 p2, p2, 0xff

    const/16 p3, 0x80

    if-eq p2, p3, :cond_11e

    and-int/lit16 p4, p2, 0x80

    if-ne p4, p3, :cond_73

    const/16 p3, 0x7f

    invoke-virtual {p1, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    if-ltz p2, :cond_39

    .line 2
    sget-object p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび;->げつ〴ぬぐ:[L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;

    array-length p3, p3

    add-int/lit8 p3, p3, -0x1

    if-gt p2, p3, :cond_39

    const/4 p3, 0x1

    goto :goto_3a

    :cond_39
    const/4 p3, 0x0

    :goto_3a
    if-eqz p3, :cond_46

    .line 3
    sget-object p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび;->げつ〴ぬぐ:[L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;

    aget-object p2, p3, p2

    iget-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_46
    sget-object p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび;->げつ〴ぬぐ:[L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;

    array-length p3, p3

    sub-int p3, p2, p3

    invoke-virtual {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ(I)I

    move-result p3

    if-ltz p3, :cond_5e

    iget-object p4, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->づざかべべ:[L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;

    array-length v0, p4

    if-ge p3, v0, :cond_5e

    iget-object p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    aget-object p3, p4, p3

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_5e
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Header index too large "

    invoke-static {p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_73
    const/4 p3, -0x1

    const/16 p4, 0x40

    if-ne p2, p4, :cond_8c

    .line 4
    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ()Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p2

    invoke-static {p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび;->げつ〴ぬぐ(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ()Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p4

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;

    invoke-direct {v0, p2, p4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;-><init>(Lぺぁあねじ/〳ぜぞぜべっ;Lぺぁあねじ/〳ぜぞぜべっ;)V

    invoke-virtual {p1, p3, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->づざかべべ(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;)V

    goto :goto_e

    :cond_8c
    and-int/lit8 v0, p2, 0x40

    if-ne v0, p4, :cond_aa

    const/16 p4, 0x3f

    .line 5
    invoke-virtual {p1, p2, p4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    .line 6
    invoke-virtual {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->びぐびあび(I)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p2

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ()Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p4

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;

    invoke-direct {v0, p2, p4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;-><init>(Lぺぁあねじ/〳ぜぞぜべっ;Lぺぁあねじ/〳ぜぞぜべっ;)V

    invoke-virtual {p1, p3, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->づざかべべ(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;)V

    goto/16 :goto_e

    :cond_aa
    and-int/lit8 p3, p2, 0x20

    const/16 p4, 0x20

    if-ne p3, p4, :cond_e4

    const/16 p3, 0x1f

    .line 7
    invoke-virtual {p1, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ(II)I

    move-result p2

    iput p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->びぐびあび:I

    if-ltz p2, :cond_cf

    iget p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-gt p2, p3, :cond_cf

    .line 8
    iget p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〳ぜぞぜべっ:I

    if-ge p2, p3, :cond_e

    if-nez p2, :cond_c9

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ()V

    goto/16 :goto_e

    :cond_c9
    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->くし〴〺ぅ(I)I

    goto/16 :goto_e

    .line 9
    :cond_cf
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Invalid dynamic table size update "

    invoke-static {p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    iget p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->びぐびあび:I

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_e4
    const/16 p3, 0x10

    if-eq p2, p3, :cond_107

    if-nez p2, :cond_eb

    goto :goto_107

    :cond_eb
    const/16 p3, 0xf

    invoke-virtual {p1, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    .line 10
    invoke-virtual {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->びぐびあび(I)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p2

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ()Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p3

    iget-object p4, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;

    invoke-direct {v0, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;-><init>(Lぺぁあねじ/〳ぜぞぜべっ;Lぺぁあねじ/〳ぜぞぜべっ;)V

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    .line 11
    :cond_107
    :goto_107
    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ()Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p2

    invoke-static {p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび;->げつ〴ぬぐ(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ()Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p3

    iget-object p4, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;

    invoke-direct {v0, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/くし〴〺ぅ;-><init>(Lぺぁあねじ/〳ぜぞぜべっ;Lぺぁあねじ/〳ぜぞぜべっ;)V

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    .line 12
    :cond_11e
    new-instance p1, Ljava/io/IOException;

    const-string p2, "index == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_126
    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Ljava/util/ArrayList;

    iget-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-object p2
.end method

.method public ぺづげぺが(ZL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;)Z
    .registers 21

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const/4 v2, 0x0

    :try_start_5
    iget-object v3, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    const-wide/16 v4, 0x9

    invoke-interface {v3, v4, v5}, Lぺぁあねじ/ぁごぐすすぃ;->〻ぞまぎな〻(J)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_c} :catch_2d8

    iget-object v3, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-static {v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->けときぜと(Lぺぁあねじ/ぁごぐすすぃ;)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ltz v3, :cond_2ca

    const/16 v6, 0x4000

    if-gt v3, v6, :cond_2ca

    iget-object v6, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v6}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v6

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    if-eqz p1, :cond_37

    const/4 v7, 0x4

    if-ne v6, v7, :cond_29

    goto :goto_37

    :cond_29
    const-string v0, "Expected a SETTINGS frame but was %s"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-static {v0, v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v4

    :cond_37
    :goto_37
    iget-object v7, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v7}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v7

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    iget-object v8, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v8}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result v8

    const v9, 0x7fffffff

    and-int/2addr v8, v9

    sget-object v9, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/logging/Logger;

    sget-object v10, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v9, v10}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v10

    if-eqz v10, :cond_5b

    invoke-static {v5, v8, v3, v6, v7}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->げつ〴ぬぐ(ZIIBB)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_5b
    const/4 v9, 0x2

    packed-switch v6, :pswitch_data_2da

    iget-object v0, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    int-to-long v2, v3

    invoke-interface {v0, v2, v3}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    goto/16 :goto_2c9

    :pswitch_67
    invoke-virtual {v1, v0, v3, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->ながふずは(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;II)V

    goto/16 :goto_2c9

    :pswitch_6c
    invoke-virtual {v1, v0, v3, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->せづっ〸ちね(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;II)V

    goto/16 :goto_2c9

    :pswitch_71
    invoke-virtual {v1, v0, v3, v7, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->おかぷせ〱(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;IBI)V

    goto/16 :goto_2c9

    :pswitch_76
    invoke-virtual {v1, v0, v3, v7, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺でおいここ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;IBI)V

    goto/16 :goto_2c9

    :pswitch_7b
    invoke-virtual {v1, v0, v3, v7, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->げがぴうあだ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;IBI)V

    goto/16 :goto_2c9

    :pswitch_80
    invoke-virtual {v1, v0, v3, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->ぇとしたべど(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$〺つふすそ;II)V

    goto/16 :goto_2c9

    :pswitch_85
    const/4 v6, 0x5

    if-ne v3, v6, :cond_a3

    if-eqz v8, :cond_9b

    .line 1
    iget-object v2, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v2}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    iget-object v2, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v2}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    check-cast v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_2c9

    :cond_9b
    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "TYPE_PRIORITY streamId == 0"

    .line 3
    invoke-static {v2, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v4

    :cond_a3
    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    const-string v2, "TYPE_PRIORITY length: %d != 5"

    invoke-static {v2, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v4

    :pswitch_b1
    if-eqz v8, :cond_1a2

    and-int/lit8 v6, v7, 0x1

    if-eqz v6, :cond_b9

    const/4 v6, 0x1

    goto :goto_ba

    :cond_b9
    const/4 v6, 0x0

    :goto_ba
    and-int/lit8 v10, v7, 0x8

    if-eqz v10, :cond_c8

    .line 4
    iget-object v10, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v10}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    int-to-short v10, v10

    goto :goto_c9

    :cond_c8
    const/4 v10, 0x0

    :goto_c9
    and-int/lit8 v11, v7, 0x20

    if-eqz v11, :cond_df

    .line 5
    iget-object v11, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v11}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    iget-object v11, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v11}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-object v11, v0

    check-cast v11, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 6
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v3, v3, -0x5

    .line 7
    :cond_df
    invoke-static {v3, v7, v10}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->じぜこほぱ(IBS)I

    move-result v3

    invoke-virtual {v1, v3, v10, v7, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->ぷぞてのほき(ISBI)Ljava/util/List;

    move-result-object v15

    check-cast v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 8
    iget-object v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v3, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぷぞてのほき(I)Z

    move-result v3

    if-eqz v3, :cond_114

    iget-object v11, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 9
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_f6
    iget-object v0, v11, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぺぁあねじ;

    const-string v12, "OkHttp %s Push Headers[%s]"

    new-array v13, v9, [Ljava/lang/Object;

    iget-object v4, v11, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object v4, v13, v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v13, v5

    move-object v10, v3

    move v14, v8

    move/from16 v16, v6

    invoke-direct/range {v10 .. v16}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぺぁあねじ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_112
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_f6 .. :try_end_112} :catch_2c9

    goto/16 :goto_2c9

    .line 10
    :cond_114
    iget-object v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    monitor-enter v3

    :try_start_117
    iget-object v7, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v7, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぉひのべい(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    move-result-object v7

    if-nez v7, :cond_166

    iget-object v12, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-boolean v4, v12, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->〳ぜぞぜべっ:Z

    if-eqz v4, :cond_126

    goto :goto_163

    :cond_126
    iget v4, v12, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->なぎぱいぢぎ:I

    if-gt v8, v4, :cond_12b

    goto :goto_163

    :cond_12b
    rem-int/lit8 v4, v8, 0x2

    iget v7, v12, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ:I

    rem-int/2addr v7, v9

    if-ne v4, v7, :cond_133

    goto :goto_163

    :cond_133
    new-instance v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    const/4 v13, 0x0

    move-object v10, v4

    move v11, v8

    move v14, v6

    invoke-direct/range {v10 .. v15}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;-><init>(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;ZZLjava/util/List;)V

    iget-object v6, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iput v8, v6, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->なぎぱいぢぎ:I

    iget-object v6, v6, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    sget-object v6, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->でどあくず:Ljava/util/concurrent/ExecutorService;

    .line 12
    new-instance v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;

    const-string v10, "OkHttp %s stream %d"

    new-array v9, v9, [Ljava/lang/Object;

    iget-object v11, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v11, v11, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object v11, v9, v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v9, v5

    invoke-direct {v7, v0, v10, v9, v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;Ljava/lang/String;[Ljava/lang/Object;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :goto_163
    monitor-exit v3

    goto/16 :goto_2c9

    :cond_166
    monitor-exit v3
    :try_end_167
    .catchall {:try_start_117 .. :try_end_167} :catchall_19f

    .line 13
    monitor-enter v7

    :try_start_168
    iput-boolean v5, v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->ぁごぐすすぃ:Z

    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->なぎぱいぢぎ:Ljava/util/List;

    if-nez v0, :cond_178

    iput-object v15, v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-virtual {v7}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->〳ぜぞぜべっ()Z

    move-result v0

    invoke-virtual {v7}, Ljava/lang/Object;->notifyAll()V

    goto :goto_18b

    :cond_178
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iput-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->なぎぱいぢぎ:Ljava/util/List;

    const/4 v0, 0x1

    :goto_18b
    monitor-exit v7
    :try_end_18c
    .catchall {:try_start_168 .. :try_end_18c} :catchall_19c

    if-nez v0, :cond_195

    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget v2, v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->くし〴〺ぅ:I

    invoke-virtual {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->けときぜと(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    :cond_195
    if-eqz v6, :cond_2c9

    .line 14
    invoke-virtual {v7}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->ぺぁあねじ()V

    goto/16 :goto_2c9

    :catchall_19c
    move-exception v0

    .line 15
    :try_start_19d
    monitor-exit v7
    :try_end_19e
    .catchall {:try_start_19d .. :try_end_19e} :catchall_19c

    throw v0

    :catchall_19f
    move-exception v0

    .line 16
    :try_start_1a0
    monitor-exit v3
    :try_end_1a1
    .catchall {:try_start_1a0 .. :try_end_1a1} :catchall_19f

    throw v0

    :cond_1a2
    const-string v0, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    invoke-static {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v4

    :pswitch_1aa
    if-eqz v8, :cond_2c1

    and-int/lit8 v6, v7, 0x1

    if-eqz v6, :cond_1b3

    const/16 v17, 0x1

    goto :goto_1b5

    :cond_1b3
    const/16 v17, 0x0

    :goto_1b5
    and-int/lit8 v6, v7, 0x20

    if-eqz v6, :cond_1bb

    const/4 v6, 0x1

    goto :goto_1bc

    :cond_1bb
    const/4 v6, 0x0

    :goto_1bc
    if-nez v6, :cond_2b9

    and-int/lit8 v4, v7, 0x8

    if-eqz v4, :cond_1cc

    .line 18
    iget-object v4, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v4}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    int-to-short v4, v4

    goto :goto_1cd

    :cond_1cc
    const/4 v4, 0x0

    :goto_1cd
    invoke-static {v3, v7, v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->じぜこほぱ(IBS)I

    move-result v3

    iget-object v6, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    check-cast v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    .line 19
    iget-object v7, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v7, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぷぞてのほき(I)Z

    move-result v7

    if-eqz v7, :cond_22e

    iget-object v11, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 20
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v15, Lぺぁあねじ/づざかべべ;

    invoke-direct {v15}, Lぺぁあねじ/づざかべべ;-><init>()V

    int-to-long v12, v3

    invoke-interface {v6, v12, v13}, Lぺぁあねじ/ぁごぐすすぃ;->〻ぞまぎな〻(J)V

    invoke-interface {v6, v15, v12, v13}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    .line 21
    iget-wide v6, v15, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v0, v6, v12

    if-nez v0, :cond_212

    .line 22
    iget-object v0, v11, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/concurrent/ExecutorService;

    new-instance v6, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/いいにぽつ;

    new-array v13, v9, [Ljava/lang/Object;

    iget-object v7, v11, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object v7, v13, v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v13, v5

    const-string v12, "OkHttp %s Push Data[%s]"

    move-object v10, v6

    move v14, v8

    move/from16 v16, v3

    invoke-direct/range {v10 .. v17}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/いいにぽつ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;Ljava/lang/String;[Ljava/lang/Object;ILぺぁあねじ/づざかべべ;IZ)V

    invoke-interface {v0, v6}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_2b2

    :cond_212
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    iget-wide v4, v15, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    .line 24
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " != "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_22e
    iget-object v7, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v7, v8}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぉひのべい(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    move-result-object v7

    if-nez v7, :cond_243

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    sget-object v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {v0, v8, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぇとしたべど(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    int-to-long v2, v3

    invoke-interface {v6, v2, v3}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    goto/16 :goto_2b2

    .line 26
    :cond_243
    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;

    int-to-long v8, v3

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_249
    const-wide/16 v10, 0x0

    cmp-long v3, v8, v10

    if-lez v3, :cond_2ad

    iget-object v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    monitor-enter v3

    :try_start_252
    iget-boolean v12, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->なぎぱいぢぎ:Z

    iget-object v13, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/づざかべべ;

    .line 28
    iget-wide v13, v13, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    add-long/2addr v13, v8

    .line 29
    iget-wide v10, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->びぐびあび:J

    cmp-long v15, v13, v10

    if-lez v15, :cond_261

    const/4 v10, 0x1

    goto :goto_262

    :cond_261
    const/4 v10, 0x0

    :goto_262
    monitor-exit v3
    :try_end_263
    .catchall {:try_start_252 .. :try_end_263} :catchall_2aa

    if-eqz v10, :cond_270

    invoke-interface {v6, v8, v9}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    sget-object v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->づざかべべ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    goto :goto_2ad

    :cond_270
    if-eqz v12, :cond_276

    invoke-interface {v6, v8, v9}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    goto :goto_2ad

    :cond_276
    iget-object v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-interface {v6, v3, v8, v9}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v10

    const-wide/16 v12, -0x1

    cmp-long v3, v10, v12

    if-eqz v3, :cond_2a4

    sub-long/2addr v8, v10

    iget-object v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    monitor-enter v3

    :try_start_286
    iget-object v10, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/づざかべべ;

    .line 30
    iget-wide v11, v10, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v13, 0x0

    cmp-long v15, v11, v13

    if-nez v15, :cond_292

    const/4 v11, 0x1

    goto :goto_293

    :cond_292
    const/4 v11, 0x0

    .line 31
    :goto_293
    iget-object v12, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v10, v12}, Lぺぁあねじ/づざかべべ;->えがぐせほち(Lぺぁあねじ/ぶでにく〼〳;)J

    if-eqz v11, :cond_29f

    iget-object v10, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-virtual {v10}, Ljava/lang/Object;->notifyAll()V

    :cond_29f
    monitor-exit v3

    goto :goto_249

    :catchall_2a1
    move-exception v0

    monitor-exit v3
    :try_end_2a3
    .catchall {:try_start_286 .. :try_end_2a3} :catchall_2a1

    throw v0

    :cond_2a4
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :catchall_2aa
    move-exception v0

    :try_start_2ab
    monitor-exit v3
    :try_end_2ac
    .catchall {:try_start_2ab .. :try_end_2ac} :catchall_2aa

    throw v0

    :cond_2ad
    :goto_2ad
    if-eqz v17, :cond_2b2

    .line 32
    invoke-virtual {v7}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->ぺぁあねじ()V

    .line 33
    :cond_2b2
    :goto_2b2
    iget-object v0, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    int-to-long v2, v4

    invoke-interface {v0, v2, v3}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    goto :goto_2c9

    :cond_2b9
    const-string v0, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v4

    :cond_2c1
    const-string v0, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v4

    :catch_2c9
    :cond_2c9
    :goto_2c9
    return v5

    :cond_2ca
    const-string v0, "FRAME_SIZE_ERROR: %s"

    new-array v5, v5, [Ljava/lang/Object;

    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v2

    invoke-static {v0, v5}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v4

    :catch_2d8
    return v2

    nop

    :pswitch_data_2da
    .packed-switch 0x0
        :pswitch_1aa
        :pswitch_b1
        :pswitch_85
        :pswitch_80
        :pswitch_7b
        :pswitch_76
        :pswitch_71
        :pswitch_6c
        :pswitch_67
    .end packed-switch
.end method
