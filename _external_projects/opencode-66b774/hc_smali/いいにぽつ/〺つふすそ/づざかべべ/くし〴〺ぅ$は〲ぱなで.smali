.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ$は〲ぱなで;
.super Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/String;ILいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ$ぺふねづ〺;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z
    .registers 12

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->づざかべべ:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_d

    invoke-virtual {p2, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    goto :goto_41

    :cond_d
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->なぎぱいぢぎ()Z

    move-result v1

    if-eqz v1, :cond_29

    .line 1
    move-object v1, p1

    check-cast v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

    .line 2
    iget-object v1, v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    const-string v3, "html"

    .line 3
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->〳ぜぞぜべっ:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    .line 4
    iput-object p1, p2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v0, p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result p1

    return p1

    .line 5
    :cond_29
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->づざかべべ()Z

    move-result v1

    const-string v3, "noscript"

    if-eqz v1, :cond_42

    .line 6
    move-object v1, p1

    check-cast v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    .line 7
    iget-object v1, v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    .line 8
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_42

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->じぜこほぱ()Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    .line 9
    iput-object v0, p2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    :goto_41
    return v2

    .line 10
    :cond_42
    invoke-static {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)Z

    move-result v1

    if-nez v1, :cond_d1

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ()Z

    move-result v1

    if-nez v1, :cond_d1

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->なぎぱいぢぎ()Z

    move-result v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v1, :cond_80

    .line 11
    move-object v1, p1

    check-cast v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

    .line 12
    iget-object v1, v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    const/4 v6, 0x6

    new-array v6, v6, [Ljava/lang/String;

    const-string v7, "basefont"

    aput-object v7, v6, v5

    const-string v7, "bgsound"

    aput-object v7, v6, v2

    const-string v7, "link"

    aput-object v7, v6, v4

    const/4 v7, 0x3

    const-string v8, "meta"

    aput-object v8, v6, v7

    const/4 v7, 0x4

    const-string v8, "noframes"

    aput-object v8, v6, v7

    const/4 v7, 0x5

    const-string v8, "style"

    aput-object v8, v6, v7

    .line 13
    invoke-static {v1, v6}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_80

    goto :goto_d1

    :cond_80
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_a5

    .line 14
    move-object v0, p1

    check-cast v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    .line 15
    iget-object v0, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    const-string v1, "br"

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a5

    .line 17
    invoke-virtual {p2, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;-><init>()V

    :goto_9b
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 18
    iput-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    .line 19
    invoke-virtual {p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ごづごきえ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;)V

    return v2

    .line 20
    :cond_a5
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_be

    .line 21
    move-object v0, p1

    check-cast v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

    .line 22
    iget-object v0, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    new-array v1, v4, [Ljava/lang/String;

    const-string v4, "head"

    aput-object v4, v1, v5

    aput-object v3, v1, v2

    .line 23
    invoke-static {v0, v1}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c4

    :cond_be
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_c8

    :cond_c4
    invoke-virtual {p2, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    return v5

    .line 24
    :cond_c8
    invoke-virtual {p2, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;-><init>()V

    goto :goto_9b

    .line 25
    :cond_d1
    :goto_d1
    iput-object p1, p2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v0, p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result p1

    return p1
.end method
