.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/graphics/Bitmap;

.field public くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

.field public final げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

.field public final びぐびあび:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3041\u3054\u3050\u3059\u3059\u3043/\u303a\u3064\u3075\u3059\u305d$\u3073\u3050\u3073\u3042\u3073;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/LinkedList;

    iput-object p2, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-virtual {p1, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;)Z
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result p1

    if-nez p1, :cond_6b

    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    :try_start_13
    iput-boolean v0, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ごづごきえ:Z

    iget-object v1, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざとぅぼこ〺:L〳ぜぞぜべっ/びぐびあび;

    if-eqz v1, :cond_3e

    check-cast v1, L〳ぜぞぜべっ/〻ぞまぎな〻;

    .line 2
    iget-object v1, v1, L〳ぜぞぜべっ/〻ぞまぎな〻;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;

    .line 3
    iput-boolean v0, v1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->づざかべべ:Z

    iget-object v1, v1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    if-eqz v1, :cond_3e

    .line 4
    iget-object v2, v1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->びぐびあび:L〳ぜぞぜべっ/ぁごぐすすぃ;

    monitor-enter v2
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_26} :catch_52

    :try_start_26
    iput-boolean v0, v1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->のぷのちつ:Z

    iget-object v3, v1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->へぬ〴づぞ:L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;

    iget-object v1, v1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->いいにぽつ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;

    monitor-exit v2
    :try_end_2d
    .catchall {:try_start_26 .. :try_end_2d} :catchall_3b

    if-eqz v3, :cond_33

    :try_start_2f
    invoke-interface {v3}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->cancel()V

    goto :goto_3e

    :cond_33
    if-eqz v1, :cond_3e

    .line 5
    iget-object v1, v1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    invoke-static {v1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->なぎぱいぢぎ(Ljava/net/Socket;)V
    :try_end_3a
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_3a} :catch_52

    goto :goto_3e

    :catchall_3b
    move-exception p1

    .line 6
    :try_start_3c
    monitor-exit v2
    :try_end_3d
    .catchall {:try_start_3c .. :try_end_3d} :catchall_3b

    :try_start_3d
    throw p1

    .line 7
    :cond_3e
    :goto_3e
    iget-object v1, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぉざぅち〻:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_45

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_45
    iget-boolean v1, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざっざへづ:Z

    if-nez v1, :cond_53

    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v1}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>()V

    invoke-virtual {p1, v1}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->〺つふすそ(Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V
    :try_end_51
    .catch Ljava/lang/Exception; {:try_start_3d .. :try_end_51} :catch_52

    goto :goto_53

    :catch_52
    nop

    .line 8
    :cond_53
    :goto_53
    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 9
    iget-boolean v1, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ごづごきえ:Z

    if-eqz v1, :cond_6a

    .line 10
    invoke-virtual {p1}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->なぎぱいぢぎ()V

    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->〺つふすそ()Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    move-result-object p1

    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_65
    iget-object p1, p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {p1, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_6a
    .catch Ljava/lang/Exception; {:try_start_65 .. :try_end_6a} :catch_6a

    :catch_6a
    :cond_6a
    return v0

    :cond_6b
    const/4 p1, 0x0

    return p1
.end method
