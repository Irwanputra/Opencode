.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final 〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

.field public final くし〴〺ぅ:I

.field public final びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 1
    iget v0, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->づざかべべ:I

    .line 2
    iput v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->くし〴〺ぅ:I

    .line 3
    iget-object p1, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

    .line 4
    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 10

    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;

    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 3
    iget v2, v1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->くし〴〺ぅ:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x190

    if-eqz v2, :cond_c2

    if-eq v2, v3, :cond_6f

    const/4 v7, 0x2

    if-eq v2, v7, :cond_19

    goto/16 :goto_110

    .line 4
    :cond_19
    :try_start_19
    invoke-static {v1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->びぐびあび(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)L〳ぜぞぜべっ/なぶひせが;

    move-result-object v5

    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 5
    iget-object v2, v1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;

    if-ne v2, v0, :cond_27

    .line 6
    invoke-virtual {v1, v5}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->びぐびあび(L〳ぜぞぜべっ/なぶひせが;)V

    goto :goto_62

    .line 7
    :cond_27
    iget v0, v5, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    if-lt v0, v6, :cond_38

    .line 8
    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v0, v5}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/なぶひせが;)V

    iget-object v2, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 9
    iget v3, v5, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    .line 10
    invoke-static {v0, v2, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぺづげぺが(Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;I)Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    goto :goto_49

    :cond_38
    invoke-virtual {v1, v5}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぺふねづ〺(L〳ぜぞぜべっ/なぶひせが;)Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;

    move-result-object v0

    .line 11
    iget-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    if-nez v1, :cond_41

    goto :goto_42

    :cond_41
    const/4 v3, 0x0

    :goto_42
    if-nez v3, :cond_4d

    .line 12
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    :goto_49
    invoke-virtual {p0, v1, v0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V

    goto :goto_62

    .line 13
    :cond_4d
    iput-object v5, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;->くし〴〺ぅ:L〳ぜぞぜべっ/なぶひせが;

    .line 14
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-virtual {v1, v0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->づざかべべ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;)V
    :try_end_54
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_54} :catch_57
    .catchall {:try_start_19 .. :try_end_54} :catchall_55

    goto :goto_62

    :catchall_55
    move-exception v0

    goto :goto_69

    :catch_57
    move-exception v0

    :try_start_58
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    new-instance v2, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v2, v0}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1, v2}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V
    :try_end_62
    .catchall {:try_start_58 .. :try_end_62} :catchall_55

    :goto_62
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-static {v5, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->なぎぱいぢぎ(L〳ぜぞぜべっ/なぶひせが;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    goto/16 :goto_110

    :goto_69
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-static {v5, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->なぎぱいぢぎ(L〳ぜぞぜべっ/なぶひせが;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    throw v0

    .line 15
    :cond_6f
    :try_start_6f
    invoke-static {v1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->〺つふすそ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)L〳ぜぞぜべっ/なぶひせが;

    move-result-object v0

    .line 16
    iget v1, v0, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    if-lt v1, v6, :cond_8a

    .line 17
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    new-instance v2, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v2, v0}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/なぶひせが;)V

    iget-object v3, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 18
    iget v0, v0, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    .line 19
    invoke-static {v2, v3, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぺづげぺが(Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;I)Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-virtual {p0, v1, v2}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V

    goto/16 :goto_110

    :cond_8a
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 20
    iput-boolean v3, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざっざへづ:Z

    iget-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぉ〲なぱぽた:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;

    if-eqz v1, :cond_b2

    iget-boolean v1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ごづごきえ:Z

    if-nez v1, :cond_aa

    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    move-result-object v1

    .line 21
    iget-object v1, v1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/びぐびあび;

    .line 22
    check-cast v1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;

    .line 23
    iget-object v1, v1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/util/concurrent/Executor;

    .line 24
    new-instance v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;

    invoke-direct {v2, v0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;-><init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_110

    :cond_aa
    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v1}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>()V

    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->〺つふすそ(Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V

    :cond_b2
    invoke-virtual {v0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぁごぐすすぃ()V
    :try_end_b5
    .catch Ljava/lang/Exception; {:try_start_6f .. :try_end_b5} :catch_b6

    goto :goto_110

    :catch_b6
    move-exception v0

    .line 25
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    new-instance v2, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v2, v0}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1, v2}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V

    goto :goto_110

    .line 26
    :cond_c2
    :try_start_c2
    invoke-static {v1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)L〳ぜぞぜべっ/なぶひせが;

    move-result-object v5

    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 27
    iget-object v2, v1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;

    if-ne v2, v0, :cond_d0

    .line 28
    invoke-virtual {v1, v5}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->びぐびあび(L〳ぜぞぜべっ/なぶひせが;)V

    goto :goto_10b

    .line 29
    :cond_d0
    iget v0, v5, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    if-lt v0, v6, :cond_e1

    .line 30
    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v0, v5}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/なぶひせが;)V

    iget-object v2, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 31
    iget v3, v5, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    .line 32
    invoke-static {v0, v2, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぺづげぺが(Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;I)Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    goto :goto_f2

    :cond_e1
    invoke-virtual {v1, v5}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぺふねづ〺(L〳ぜぞぜべっ/なぶひせが;)Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;

    move-result-object v0

    .line 33
    iget-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    if-nez v1, :cond_ea

    goto :goto_eb

    :cond_ea
    const/4 v3, 0x0

    :goto_eb
    if-nez v3, :cond_f6

    .line 34
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    :goto_f2
    invoke-virtual {p0, v1, v0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V

    goto :goto_10b

    .line 35
    :cond_f6
    iput-object v5, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;->くし〴〺ぅ:L〳ぜぞぜべっ/なぶひせが;

    .line 36
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-virtual {v1, v0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->づざかべべ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/づざかべべ;)V
    :try_end_fd
    .catch Ljava/lang/Exception; {:try_start_c2 .. :try_end_fd} :catch_100
    .catchall {:try_start_c2 .. :try_end_fd} :catchall_fe

    goto :goto_10b

    :catchall_fe
    move-exception v0

    goto :goto_116

    :catch_100
    move-exception v0

    :try_start_101
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    new-instance v2, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v2, v0}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1, v2}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V
    :try_end_10b
    .catchall {:try_start_101 .. :try_end_10b} :catchall_fe

    :goto_10b
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-static {v5, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->なぎぱいぢぎ(L〳ぜぞぜべっ/なぶひせが;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    .line 37
    :goto_110
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 39
    :goto_116
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-static {v5, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->なぎぱいぢぎ(L〳ぜぞぜべっ/なぶひせが;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    throw v0
.end method

.method public final げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V
    .registers 5

    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    move-result-object v0

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/びぐびあび;

    .line 2
    check-cast v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;

    .line 3
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/util/concurrent/Executor;

    .line 4
    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {v1, p0, p1, p2}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
