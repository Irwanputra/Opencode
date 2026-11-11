.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;


# instance fields
.field public 〺つふすそ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final げつ〴ぬぐ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u3073\u3050\u3073\u3042\u3073;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->〺つふすそ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static 〺つふすそ()Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;
    .registers 2

    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    if-nez v0, :cond_17

    const-class v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    monitor-enter v0

    :try_start_7
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    if-nez v1, :cond_12

    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    invoke-direct {v1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;-><init>()V

    sput-object v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    :cond_12
    monitor-exit v0

    goto :goto_17

    :catchall_14
    move-exception v1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_7 .. :try_end_16} :catchall_14

    throw v1

    :cond_17
    :goto_17
    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    return-object v0
.end method


# virtual methods
.method public げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;
    .registers 4

    :try_start_0
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_5} :catch_5

    .line 1
    :catch_5
    :try_start_5
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->〺つふすそ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 2
    iput v0, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->づざかべべ:I

    .line 3
    iget-object v0, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

    .line 4
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

    if-ne v0, v1, :cond_23

    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    move-result-object v0

    .line 5
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/びぐびあび;

    .line 6
    check-cast v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;

    .line 7
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;

    .line 8
    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;

    invoke-direct {v1, p1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;-><init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    goto :goto_32

    :cond_23
    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    move-result-object v0

    .line 9
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/びぐびあび;

    .line 10
    check-cast v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;

    .line 11
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;

    .line 12
    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;

    invoke-direct {v1, p1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;-><init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    :goto_32
    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 13
    iput-object v0, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぉざぅち〻:Ljava/util/concurrent/Future;
    :try_end_38
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_38} :catch_38

    :catch_38
    return-object p1
.end method
