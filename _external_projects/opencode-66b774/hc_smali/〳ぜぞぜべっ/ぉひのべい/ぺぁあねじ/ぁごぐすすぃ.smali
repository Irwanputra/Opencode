.class public final L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;,
        L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;,
        L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;,
        L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;
    }
.end annotation


# static fields
.field public static final でどあくず:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public final 〺つふすそ:Z

.field public ぁごぐすすぃ:I

.field public final いいにぽつ:Ljava/util/concurrent/ExecutorService;

.field public final ぇぬぎばつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

.field public ぉざぅち〻:Z

.field public おぐぴう〸ず:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

.field public final くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;

.field public final ごづごきえ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

.field public final ざっざへづ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final ざとぅぼこ〺:Ljava/net/Socket;

.field public final づざかべべ:Ljava/lang/String;

.field public てぜきぽく:Z

.field public なぎぱいぢぎ:I

.field public のぷのちつ:J

.field public final は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

.field public final びぐびあび:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u307a\u3041\u3042\u306d\u3058/\u3047\u306c\u304e\u3070\u3064;",
            ">;"
        }
    .end annotation
.end field

.field public へぬ〴づぞ:J

.field public final ぺぁあねじ:Ljava/util/concurrent/ScheduledExecutorService;

.field public final ぺふねづ〺:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/は〲ぱなで;


# direct methods
.method public static constructor <clinit>()V
    .registers 10

    const-class v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v1, 0x1

    .line 1
    sget-object v8, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ:[B

    new-instance v8, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;

    const-string v9, "OkHttp Http2Connection"

    invoke-direct {v8, v9, v1}, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;-><init>(Ljava/lang/String;Z)V

    move-object v1, v0

    .line 2
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->でどあくず:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;)V
    .registers 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->のぷのちつ:J

    new-instance v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-direct {v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;-><init>()V

    iput-object v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->おぐぴう〸ず:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    new-instance v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-direct {v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;-><init>()V

    iput-object v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぇぬぎばつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    const/4 v3, 0x0

    iput-boolean v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぉざぅち〻:Z

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v4, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ざっざへづ:Ljava/util/Set;

    sget-object v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/は〲ぱなで;

    iput-object v4, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺふねづ〺:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/は〲ぱなで;

    const/4 v4, 0x1

    iput-boolean v4, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->〺つふすそ:Z

    iget-object v5, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;

    iput-object v5, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;

    iput v4, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ:I

    const/4 v5, 0x3

    iput v5, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ:I

    const/4 v5, 0x7

    iget-object v6, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->おぐぴう〸ず:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    const/high16 v7, 0x1000000

    invoke-virtual {v6, v5, v7}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ(II)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    iget-object v6, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    iput-object v6, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    new-instance v7, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-array v8, v4, [Ljava/lang/Object;

    aput-object v6, v8, v3

    const-string v9, "OkHttp %s Writer"

    invoke-static {v9, v8}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 1
    new-instance v9, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;

    invoke-direct {v9, v8, v3}, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;-><init>(Ljava/lang/String;Z)V

    .line 2
    invoke-direct {v7, v4, v9}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v7, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/util/concurrent/ScheduledExecutorService;

    iget v8, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->なぎぱいぢぎ:I

    if-eqz v8, :cond_6e

    new-instance v8, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;

    invoke-direct {v8, v0, v3, v3, v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;ZII)V

    iget v9, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->なぎぱいぢぎ:I

    int-to-long v11, v9

    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v9, v11

    invoke-virtual/range {v7 .. v13}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_6e
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v15, 0x0

    const/16 v16, 0x1

    const-wide/16 v17, 0x3c

    sget-object v19, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v20, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-array v8, v4, [Ljava/lang/Object;

    aput-object v6, v8, v3

    const-string v3, "OkHttp %s Push Observer"

    invoke-static {v3, v8}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 3
    new-instance v6, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;

    invoke-direct {v6, v3, v4}, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;-><init>(Ljava/lang/String;Z)V

    move-object v14, v7

    move-object/from16 v21, v6

    .line 4
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v7, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/concurrent/ExecutorService;

    const v3, 0xffff

    invoke-virtual {v2, v5, v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ(II)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    const/4 v3, 0x5

    const/16 v5, 0x4000

    invoke-virtual {v2, v3, v5}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ(II)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-virtual {v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ()I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->へぬ〴づぞ:J

    iget-object v2, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/net/Socket;

    iput-object v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ざとぅぼこ〺:Ljava/net/Socket;

    new-instance v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    iget-object v3, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-direct {v2, v3, v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;-><init>(Lぺぁあねじ/なぎぱいぢぎ;Z)V

    iput-object v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    new-instance v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    new-instance v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;

    iget-object v1, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-direct {v3, v1, v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;-><init>(Lぺぁあねじ/ぁごぐすすぃ;Z)V

    invoke-direct {v2, v0, v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;)V

    iput-object v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ごづごきえ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    return-void
.end method

.method public static じぜこほぱ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_3
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {p0, v0, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺづげぺが(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_8} :catch_8

    :catch_8
    return-void
.end method


# virtual methods
.method public close()V
    .registers 3

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    sget-object v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {p0, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺづげぺが(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    return-void
.end method

.method public flush()V
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->flush()V

    return-void
.end method

.method public 〺でおいここ(IZLぺぁあねじ/づざかべべ;J)V
    .registers 14

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-nez v3, :cond_d

    iget-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    invoke-virtual {p4, p2, p1, p3, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぺづげぺが(ZILぺぁあねじ/づざかべべ;I)V

    return-void

    :cond_d
    :goto_d
    cmp-long v3, p4, v1

    if-lez v3, :cond_5e

    monitor-enter p0

    :goto_12
    :try_start_12
    iget-wide v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->へぬ〴づぞ:J

    cmp-long v5, v3, v1

    if-gtz v5, :cond_30

    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_12

    :cond_28
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_30
    .catch Ljava/lang/InterruptedException; {:try_start_12 .. :try_end_30} :catch_56
    .catchall {:try_start_12 .. :try_end_30} :catchall_54

    :cond_30
    :try_start_30
    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    .line 1
    iget v3, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->づざかべべ:I

    .line 2
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-wide v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->へぬ〴づぞ:J

    int-to-long v6, v3

    sub-long/2addr v4, v6

    iput-wide v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->へぬ〴づぞ:J

    monitor-exit p0
    :try_end_44
    .catchall {:try_start_30 .. :try_end_44} :catchall_54

    sub-long/2addr p4, v6

    iget-object v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    if-eqz p2, :cond_4f

    cmp-long v5, p4, v1

    if-nez v5, :cond_4f

    const/4 v5, 0x1

    goto :goto_50

    :cond_4f
    const/4 v5, 0x0

    :goto_50
    invoke-virtual {v4, v5, p1, p3, v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぺづげぺが(ZILぺぁあねじ/づざかべべ;I)V

    goto :goto_d

    :catchall_54
    move-exception p1

    goto :goto_5c

    :catch_56
    :try_start_56
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    :goto_5c
    monitor-exit p0
    :try_end_5d
    .catchall {:try_start_56 .. :try_end_5d} :catchall_54

    throw p1

    :cond_5e
    return-void
.end method

.method public ぇとしたべど(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    .registers 11

    :try_start_0
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    const-string v3, "OkHttp %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v7

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;Ljava/lang/String;[Ljava/lang/Object;IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1f
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_1f} :catch_1f

    :catch_1f
    return-void
.end method

.method public declared-synchronized ぉひのべい(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;
    :try_end_d
    .catchall {:try_start_1 .. :try_end_d} :catchall_f

    monitor-exit p0

    return-object p1

    :catchall_f
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public おかぷせ〱(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    .registers 6

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    monitor-enter v0

    :try_start_3
    monitor-enter p0
    :try_end_4
    .catchall {:try_start_3 .. :try_end_4} :catchall_1d

    :try_start_4
    iget-boolean v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->〳ぜぞぜべっ:Z

    if-eqz v1, :cond_b

    monitor-exit p0
    :try_end_9
    .catchall {:try_start_4 .. :try_end_9} :catchall_1a

    :try_start_9
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_9 .. :try_end_a} :catchall_1d

    return-void

    :cond_b
    const/4 v1, 0x1

    :try_start_c
    iput-boolean v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->〳ぜぞぜべっ:Z

    iget v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->なぎぱいぢぎ:I

    monitor-exit p0
    :try_end_11
    .catchall {:try_start_c .. :try_end_11} :catchall_1a

    :try_start_11
    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    sget-object v3, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ:[B

    invoke-virtual {v2, v1, p1, v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->せづっ〸ちね(IL〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;[B)V

    monitor-exit v0
    :try_end_19
    .catchall {:try_start_11 .. :try_end_19} :catchall_1d

    return-void

    :catchall_1a
    move-exception p1

    :try_start_1b
    monitor-exit p0
    :try_end_1c
    .catchall {:try_start_1b .. :try_end_1c} :catchall_1a

    :try_start_1c
    throw p1

    :catchall_1d
    move-exception p1

    monitor-exit v0
    :try_end_1f
    .catchall {:try_start_1c .. :try_end_1f} :catchall_1d

    throw p1
.end method

.method public declared-synchronized けときぜと(I)L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_12

    monitor-exit p0

    return-object p1

    :catchall_12
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public げがぴうあだ(IJ)V
    .registers 13

    :try_start_0
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v8, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$〺つふすそ;

    const-string v3, "OkHttp Window Update %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v8

    move-object v2, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$〺つふすそ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;Ljava/lang/String;[Ljava/lang/Object;IJ)V

    invoke-interface {v0, v8}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1f
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_1f} :catch_1f

    :catch_1f
    return-void
.end method

.method public declared-synchronized せづっ〸ちね()I
    .registers 4

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぇぬぎばつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    const v1, 0x7fffffff

    .line 1
    iget v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_11

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ:[I

    const/4 v1, 0x4

    aget v1, v0, v1
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_13

    .line 2
    :cond_11
    monitor-exit p0

    return v1

    :catchall_13
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public ぷぞてのほき(I)Z
    .registers 3

    const/4 v0, 0x1

    if-eqz p1, :cond_7

    and-int/2addr p1, v0

    if-nez p1, :cond_7

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public ぺづげぺが(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    .registers 7

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->おかぷせ〱(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_4} :catch_6

    move-object p1, v0

    goto :goto_7

    :catch_6
    move-exception p1

    :goto_7
    monitor-enter p0

    :try_start_8
    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_29

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    :cond_29
    monitor-exit p0
    :try_end_2a
    .catchall {:try_start_8 .. :try_end_2a} :catchall_5c

    if-eqz v0, :cond_3d

    array-length v1, v0

    const/4 v2, 0x0

    :goto_2e
    if-ge v2, v1, :cond_3d

    aget-object v3, v0, v2

    :try_start_32
    invoke-virtual {v3, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->くし〴〺ぅ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    :try_end_35
    .catch Ljava/io/IOException; {:try_start_32 .. :try_end_35} :catch_36

    goto :goto_3a

    :catch_36
    move-exception v3

    if-eqz p1, :cond_3a

    move-object p1, v3

    :cond_3a
    :goto_3a
    add-int/lit8 v2, v2, 0x1

    goto :goto_2e

    :cond_3d
    :try_start_3d
    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    invoke-virtual {p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->close()V
    :try_end_42
    .catch Ljava/io/IOException; {:try_start_3d .. :try_end_42} :catch_43

    goto :goto_47

    :catch_43
    move-exception p2

    if-nez p1, :cond_47

    move-object p1, p2

    :cond_47
    :goto_47
    :try_start_47
    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ざとぅぼこ〺:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_4c
    .catch Ljava/io/IOException; {:try_start_47 .. :try_end_4c} :catch_4d

    goto :goto_4e

    :catch_4d
    move-exception p1

    :goto_4e
    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p2}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    if-nez p1, :cond_5b

    return-void

    :cond_5b
    throw p1

    :catchall_5c
    move-exception p1

    :try_start_5d
    monitor-exit p0
    :try_end_5e
    .catchall {:try_start_5d .. :try_end_5e} :catchall_5c

    goto :goto_60

    :goto_5f
    throw p1

    :goto_60
    goto :goto_5f
.end method
