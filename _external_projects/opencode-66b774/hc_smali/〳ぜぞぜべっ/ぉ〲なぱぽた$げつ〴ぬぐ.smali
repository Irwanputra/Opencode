.class public L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉ〲なぱぽた;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/lang/String;

.field public くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

.field public げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

.field public づざかべべ:Ljava/lang/Object;

.field public びぐびあび:L〳ぜぞぜべっ/びえぁぜい;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GET"

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    new-instance v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    return-void
.end method

.method public constructor <init>(L〳ぜぞぜべっ/ぉ〲なぱぽた;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/String;

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->づざかべべ:Ljava/lang/Object;

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->づざかべべ:Ljava/lang/Object;

    iget-object p1, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉざぅち〻;->くし〴〺ぅ()L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    move-result-object p1

    iput-object p1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()L〳ぜぞぜべっ/ぉ〲なぱぽた;
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    if-eqz v0, :cond_a

    new-instance v0, L〳ぜぞぜべっ/ぉ〲なぱぽた;

    invoke-direct {v0, p0}, L〳ぜぞぜべっ/ぉ〲なぱぽた;-><init>(L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;)V

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;
    .registers 5

    iget-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 1
    invoke-virtual {v0, p1, p2}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 2
    iget-object v1, v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;
    .registers 5

    iget-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 1
    invoke-virtual {v0, p1, p2}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v1, v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public づざかべべ(Ljava/lang/String;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;
    .registers 10

    if-eqz p1, :cond_59

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x3

    const-string v3, "ws:"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_17

    const-string v0, "http:"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x3

    goto :goto_2b

    :cond_17
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x4

    const-string v5, "wss:"

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_36

    const-string v0, "https:"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    :goto_2b
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1
    :cond_36
    new-instance v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ(L〳ぜぞぜべっ/ざとぅぼこ〺;Ljava/lang/String;)L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    move-result-object v2

    sget-object v3, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    if-ne v2, v3, :cond_48

    invoke-virtual {v0}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/ざとぅぼこ〺;

    move-result-object v1

    :cond_48
    if-eqz v1, :cond_4d

    .line 2
    iput-object v1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    return-object p0

    .line 3
    :cond_4d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unexpected url: "

    invoke-static {v1, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public なぎぱいぢぎ(L〳ぜぞぜべっ/ざとぅぼこ〺;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;
    .registers 3

    if-eqz p1, :cond_5

    iput-object p1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    return-object p0

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;
    .registers 5
    .param p2    # L〳ぜぞぜべっ/びえぁぜい;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_5f

    const-string v0, "method "

    if-eqz p2, :cond_1d

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->な〱ちぉじ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_1d

    :cond_11
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, " must not have a request body."

    invoke-static {v0, p1, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1d
    :goto_1d
    if-nez p2, :cond_5a

    const-string v1, "POST"

    .line 1
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4a

    const-string v1, "PUT"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4a

    const-string v1, "PATCH"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4a

    const-string v1, "PROPPATCH"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4a

    const-string v1, "REPORT"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_48

    goto :goto_4a

    :cond_48
    const/4 v1, 0x0

    goto :goto_4b

    :cond_4a
    :goto_4a
    const/4 v1, 0x1

    :goto_4b
    if-nez v1, :cond_4e

    goto :goto_5a

    .line 2
    :cond_4e
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, " must have a request body."

    invoke-static {v0, p1, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5a
    :goto_5a
    iput-object p1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    iput-object p2, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    return-object p0

    :cond_5f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.length() == 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
