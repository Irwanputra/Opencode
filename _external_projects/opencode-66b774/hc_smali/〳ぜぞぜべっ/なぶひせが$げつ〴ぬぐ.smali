.class public L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/なぶひせが;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:L〳ぜぞぜべっ/なぶひせが;

.field public 〺つふすそ:L〳ぜぞぜべっ/ぶでにく〼〳;

.field public ぁごぐすすぃ:L〳ぜぞぜべっ/ぅみぱぎぎ;

.field public いいにぽつ:L〳ぜぞぜべっ/なぶひせが;

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

.field public づざかべべ:L〳ぜぞぜべっ/ぇぬぎばつ;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public てぜきぽく:J

.field public なぎぱいぢぎ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

.field public びぐびあび:Ljava/lang/String;

.field public ぺぁあねじ:L〳ぜぞぜべっ/なぶひせが;

.field public ぺふねづ〺:J


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->くし〴〺ぅ:I

    new-instance v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    return-void
.end method

.method public constructor <init>(L〳ぜぞぜべっ/なぶひせが;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->くし〴〺ぅ:L〳ぜぞぜべっ/ぶでにく〼〳;

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぶでにく〼〳;

    iget v0, p1, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    iput v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->づざかべべ:Ljava/lang/String;

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->づざかべべ:L〳ぜぞぜべっ/ぇぬぎばつ;

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉざぅち〻;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉざぅち〻;->くし〴〺ぅ()L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    move-result-object v0

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->ぺぁあねじ:L〳ぜぞぜべっ/なぶひせが;

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/なぶひせが;

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->いいにぽつ:L〳ぜぞぜべっ/なぶひせが;

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->ぺぁあねじ:L〳ぜぞぜべっ/なぶひせが;

    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->ぺふねづ〺:L〳ぜぞぜべっ/なぶひせが;

    iput-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->いいにぽつ:L〳ぜぞぜべっ/なぶひせが;

    iget-wide v0, p1, L〳ぜぞぜべっ/なぶひせが;->てぜきぽく:J

    iput-wide v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->ぺふねづ〺:J

    iget-wide v0, p1, L〳ぜぞぜべっ/なぶひせが;->のぷのちつ:J

    iput-wide v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->てぜきぽく:J

    return-void
.end method


# virtual methods
.method public 〺つふすそ(L〳ぜぞぜべっ/なぶひせが;)L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;
    .registers 3
    .param p1    # L〳ぜぞぜべっ/なぶひせが;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_7

    const-string v0, "cacheResponse"

    invoke-virtual {p0, v0, p1}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;L〳ぜぞぜべっ/なぶひせが;)V

    :cond_7
    iput-object p1, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->ぺぁあねじ:L〳ぜぞぜべっ/なぶひせが;

    return-object p0
.end method

.method public final くし〴〺ぅ(Ljava/lang/String;L〳ぜぞぜべっ/なぶひせが;)V
    .registers 4

    iget-object v0, p2, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    if-nez v0, :cond_35

    iget-object v0, p2, L〳ぜぞぜべっ/なぶひせが;->ぺぁあねじ:L〳ぜぞぜべっ/なぶひせが;

    if-nez v0, :cond_29

    iget-object v0, p2, L〳ぜぞぜべっ/なぶひせが;->いいにぽつ:L〳ぜぞぜべっ/なぶひせが;

    if-nez v0, :cond_1d

    iget-object p2, p2, L〳ぜぞぜべっ/なぶひせが;->ぺふねづ〺:L〳ぜぞぜべっ/なぶひせが;

    if-nez p2, :cond_11

    return-void

    :cond_11
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, ".priorResponse != null"

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1d
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, ".cacheResponse != null"

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_29
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, ".networkResponse != null"

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_35
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, ".body != null"

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;
    .registers 4

    iget-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    if-eqz v0, :cond_3b

    iget-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぶでにく〼〳;

    if-eqz v0, :cond_33

    iget v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ltz v0, :cond_1e

    iget-object v0, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    if-eqz v0, :cond_16

    new-instance v0, L〳ぜぞぜべっ/なぶひせが;

    invoke-direct {v0, p0}, L〳ぜぞぜべっ/なぶひせが;-><init>(L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;)V

    return-object v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "code < 0: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public びぐびあび(L〳ぜぞぜべっ/ぉざぅち〻;)L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;
    .registers 2

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉざぅち〻;->くし〴〺ぅ()L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    move-result-object p1

    iput-object p1, p0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    return-object p0
.end method
