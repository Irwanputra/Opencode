.class public final L〳ぜぞぜべっ/ぺふねづ〺;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u303b\u305e\u307e\u304e\u306a\u303b$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u303b\u305e\u307e\u304e\u306a\u303b$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public げつ〴ぬぐ:Ljava/util/concurrent/ExecutorService;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final びぐびあび:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u303b\u305e\u307e\u304e\u306a\u303b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, L〳ぜぞぜべっ/ぺふねづ〺;->〺つふすそ:Ljava/util/Deque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, L〳ぜぞぜべっ/ぺふねづ〺;->くし〴〺ぅ:Ljava/util/Deque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, L〳ぜぞぜべっ/ぺふねづ〺;->びぐびあび:Ljava/util/Deque;

    return-void
.end method


# virtual methods
.method public final 〺つふすそ()V
    .registers 14

    iget-object v0, p0, L〳ぜぞぜべっ/ぺふねづ〺;->くし〴〺ぅ:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    const/16 v1, 0x40

    if-lt v0, v1, :cond_b

    return-void

    :cond_b
    iget-object v0, p0, L〳ぜぞぜべっ/ぺふねづ〺;->〺つふすそ:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    return-void

    :cond_14
    iget-object v0, p0, L〳ぜぞぜべっ/ぺふねづ〺;->〺つふすそ:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, L〳ぜぞぜべっ/〻ぞまぎな〻$げつ〴ぬぐ;

    .line 1
    iget-object v3, p0, L〳ぜぞぜべっ/ぺふねづ〺;->くし〴〺ぅ:Ljava/util/Deque;

    invoke-interface {v3}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_71

    .line 2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    iget-object v3, p0, L〳ぜぞぜべっ/ぺふねづ〺;->くし〴〺ぅ:Ljava/util/Deque;

    invoke-interface {v3, v2}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 3
    monitor-enter p0

    :try_start_3b
    iget-object v3, p0, L〳ぜぞぜべっ/ぺふねづ〺;->げつ〴ぬぐ:Ljava/util/concurrent/ExecutorService;

    if-nez v3, :cond_5f

    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v5, 0x0

    const v6, 0x7fffffff

    const-wide/16 v7, 0x3c

    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v10, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v10}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v4, "OkHttp Dispatcher"

    const/4 v11, 0x0

    .line 4
    sget-object v12, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ:[B

    new-instance v12, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;

    invoke-direct {v12, v4, v11}, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;-><init>(Ljava/lang/String;Z)V

    move-object v4, v3

    move-object v11, v12

    .line 5
    invoke-direct/range {v4 .. v11}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v3, p0, L〳ぜぞぜべっ/ぺふねづ〺;->げつ〴ぬぐ:Ljava/util/concurrent/ExecutorService;

    :cond_5f
    iget-object v3, p0, L〳ぜぞぜべっ/ぺふねづ〺;->げつ〴ぬぐ:Ljava/util/concurrent/ExecutorService;
    :try_end_61
    .catchall {:try_start_3b .. :try_end_61} :catchall_6e

    monitor-exit p0

    .line 6
    invoke-interface {v3, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    iget-object v2, p0, L〳ぜぞぜべっ/ぺふねづ〺;->くし〴〺ぅ:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->size()I

    move-result v2

    if-lt v2, v1, :cond_1a

    return-void

    :catchall_6e
    move-exception v0

    .line 7
    monitor-exit p0

    throw v0

    .line 8
    :cond_71
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, L〳ぜぞぜべっ/〻ぞまぎな〻$げつ〴ぬぐ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0

    :cond_7c
    return-void
.end method

.method public final げつ〴ぬぐ(Ljava/util/Deque;Ljava/lang/Object;Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Deque<",
            "TT;>;TT;Z)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_1
    invoke-interface {p1, p2}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_20

    if-eqz p3, :cond_c

    invoke-virtual {p0}, L〳ぜぞぜべっ/ぺふねづ〺;->〺つふすそ()V

    .line 1
    :cond_c
    monitor-enter p0
    :try_end_d
    .catchall {:try_start_1 .. :try_end_d} :catchall_28

    :try_start_d
    iget-object p1, p0, L〳ぜぞぜべっ/ぺふねづ〺;->くし〴〺ぅ:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->size()I

    move-result p1

    iget-object p2, p0, L〳ぜぞぜべっ/ぺふねづ〺;->びぐびあび:Ljava/util/Deque;

    invoke-interface {p2}, Ljava/util/Deque;->size()I

    move-result p2
    :try_end_19
    .catchall {:try_start_d .. :try_end_19} :catchall_1d

    add-int/2addr p1, p2

    :try_start_1a
    monitor-exit p0

    .line 2
    monitor-exit p0

    return-void

    :catchall_1d
    move-exception p1

    .line 3
    monitor-exit p0

    throw p1

    .line 4
    :cond_20
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Call wasn\'t in-flight!"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :catchall_28
    move-exception p1

    monitor-exit p0
    :try_end_2a
    .catchall {:try_start_1a .. :try_end_2a} :catchall_28

    throw p1
.end method
