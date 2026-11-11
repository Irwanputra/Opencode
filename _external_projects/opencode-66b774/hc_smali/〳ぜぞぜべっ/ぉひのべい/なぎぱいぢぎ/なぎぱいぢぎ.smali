.class public final L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3058\u305c\u3053\u307b\u3071;",
            ">;"
        }
    .end annotation
.end field

.field public final 〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;

.field public ぁごぐすすぃ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/net/InetSocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:L〳ぜぞぜべっ/びぐびあび;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

.field public づざかべべ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/net/Proxy;",
            ">;"
        }
    .end annotation
.end field

.field public なぎぱいぢぎ:I

.field public final びぐびあび:L〳ぜぞぜべっ/のぷのちつ;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;L〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->づざかべべ:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->ぁごぐすすぃ:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->〳ぜぞぜべっ:Ljava/util/List;

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;

    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:L〳ぜぞぜべっ/びぐびあび;

    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/のぷのちつ;

    .line 1
    iget-object p2, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 2
    iget-object p3, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/net/Proxy;

    const/4 p4, 0x0

    if-eqz p3, :cond_2a

    .line 3
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_4c

    .line 4
    :cond_2a
    iget-object p1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/net/ProxySelector;

    .line 5
    invoke-virtual {p2}, L〳ぜぞぜべっ/ざとぅぼこ〺;->ぉざぅち〻()Ljava/net/URI;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_41

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_41

    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->おぐぴう〸ず(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_4c

    :cond_41
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/net/Proxy;

    sget-object p2, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    aput-object p2, p1, p4

    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぇぬぎばつ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_4c
    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->づざかべべ:Ljava/util/List;

    iput p4, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Z
    .registers 2

    invoke-virtual {p0}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->〳ぜぞぜべっ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_11

    :cond_f
    const/4 v0, 0x0

    goto :goto_12

    :cond_11
    :goto_11
    const/4 v0, 0x1

    :goto_12
    return v0
.end method

.method public final くし〴〺ぅ()Z
    .registers 3

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->づざかべべ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    return v0
.end method

.method public げつ〴ぬぐ(L〳ぜぞぜべっ/じぜこほぱ;Ljava/io/IOException;)V
    .registers 6

    .line 1
    iget-object v0, p1, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    .line 2
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_1f

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 3
    iget-object v1, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/net/ProxySelector;

    if-eqz v1, :cond_1f

    .line 4
    iget-object v0, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 5
    invoke-virtual {v0}, L〳ぜぞぜべっ/ざとぅぼこ〺;->ぉざぅち〻()Ljava/net/URI;

    move-result-object v0

    .line 6
    iget-object v2, p1, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    .line 7
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_1f
    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;

    .line 8
    monitor-enter p2

    :try_start_22
    iget-object v0, p2, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_27
    .catchall {:try_start_22 .. :try_end_27} :catchall_29

    monitor-exit p2

    return-void

    :catchall_29
    move-exception p1

    monitor-exit p2

    throw p1
.end method
