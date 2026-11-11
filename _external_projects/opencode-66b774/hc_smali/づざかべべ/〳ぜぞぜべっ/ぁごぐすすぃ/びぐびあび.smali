.class public Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# static fields
.field public static final 〺つふすそ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public static final げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_c

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-direct {v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぺぁあねじ;-><init>()V

    goto :goto_42

    :cond_c
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_16

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〳ぜぞぜべっ;

    invoke-direct {v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〳ぜぞぜべっ;-><init>()V

    goto :goto_42

    :cond_16
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_20

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;

    invoke-direct {v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;-><init>()V

    goto :goto_42

    :cond_20
    const/16 v1, 0x18

    if-lt v0, v1, :cond_33

    .line 1
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_2a

    const/4 v1, 0x1

    goto :goto_2b

    :cond_2a
    const/4 v1, 0x0

    :goto_2b
    if-eqz v1, :cond_33

    .line 2
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;

    invoke-direct {v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;-><init>()V

    goto :goto_42

    :cond_33
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3d

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;

    invoke-direct {v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;-><init>()V

    goto :goto_42

    :cond_3d
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;

    invoke-direct {v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;-><init>()V

    .line 3
    :goto_42
    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;

    .line 4
    new-instance v0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lづざかべべ/づざかべべ/なぎぱいぢぎ;-><init>(I)V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->〺つふすそ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    return-void
.end method

.method public static 〺つふすそ(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .registers 11

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz p0, :cond_16

    invoke-static {p1, p2, p4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->くし〴〺ぅ(Landroid/content/res/Resources;II)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->〺つふすそ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    invoke-virtual {p2, p1, p0}, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_16
    return-object p0
.end method

.method public static くし〴〺ぅ(Landroid/content/res/Resources;II)Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〺つふすそ;Landroid/content/res/Resources;IILづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
    .registers 12

    instance-of v0, p1, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/づざかべべ;

    if-eqz v0, :cond_ba

    check-cast p1, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/づざかべべ;

    const/4 v0, 0x1

    if-eqz p7, :cond_e

    .line 1
    iget v1, p1, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->くし〴〺ぅ:I

    if-nez v1, :cond_11

    goto :goto_12

    :cond_e
    if-nez p5, :cond_11

    goto :goto_12

    :cond_11
    const/4 v0, 0x0

    :goto_12
    const/4 v1, -0x1

    if-eqz p7, :cond_18

    .line 2
    iget p7, p1, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->〺つふすそ:I

    goto :goto_19

    :cond_18
    const/4 p7, -0x1

    .line 3
    :goto_19
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;

    .line 4
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    iget-object v3, p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    .line 6
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    invoke-virtual {v3, v2}, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Typeface;

    if-eqz v3, :cond_44

    if-eqz p5, :cond_ce

    invoke-virtual {p5, v3}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->びぐびあび(Landroid/graphics/Typeface;)V

    goto/16 :goto_ce

    :cond_44
    if-eqz v0, :cond_5f

    if-ne p7, v1, :cond_5f

    invoke-static {p0, p1, p4}, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->〺つふすそ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;I)Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;

    move-result-object p0

    if-eqz p5, :cond_5b

    iget p1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;->〺つふすそ:I

    if-nez p1, :cond_58

    iget-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Typeface;

    invoke-virtual {p5, p1, p6}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_5b

    :cond_58
    invoke-virtual {p5, p1, p6}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ(ILandroid/os/Handler;)V

    :cond_5b
    :goto_5b
    iget-object v3, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Typeface;

    goto/16 :goto_ce

    :cond_5f
    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;

    invoke-direct {v1, p0, p1, p4, v2}, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;-><init>(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;ILjava/lang/String;)V

    const/4 v3, 0x0

    if-eqz v0, :cond_74

    :try_start_67
    sget-object p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;

    invoke-virtual {p0, v1, p7}, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->〺つふすそ(Ljava/util/concurrent/Callable;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;

    iget-object v3, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Typeface;
    :try_end_71
    .catch Ljava/lang/InterruptedException; {:try_start_67 .. :try_end_71} :catch_72

    goto :goto_ce

    :catch_72
    nop

    goto :goto_ce

    :cond_74
    if-nez p5, :cond_78

    move-object p0, v3

    goto :goto_7d

    :cond_78
    new-instance p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;

    invoke-direct {p0, p5, p6}, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;-><init>(Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;Landroid/os/Handler;)V

    :goto_7d
    sget-object p7, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->くし〴〺ぅ:Ljava/lang/Object;

    monitor-enter p7

    :try_start_80
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->びぐびあび:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 7
    invoke-virtual {p1, v2, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    .line 8
    check-cast p5, Ljava/util/ArrayList;

    if-eqz p5, :cond_91

    if-eqz p0, :cond_8f

    invoke-virtual {p5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8f
    monitor-exit p7

    goto :goto_ce

    :cond_91
    if-eqz p0, :cond_9e

    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2, p5}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9e
    monitor-exit p7
    :try_end_9f
    .catchall {:try_start_80 .. :try_end_9f} :catchall_b7

    sget-object p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;

    new-instance p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/びぐびあび;

    invoke-direct {p1, v2}, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/びぐびあび;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p5, Landroid/os/Handler;

    invoke-direct {p5}, Landroid/os/Handler;-><init>()V

    new-instance p6, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/ぁごぐすすぃ;

    invoke-direct {p6, p0, v1, p5, p1}, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/ぁごぐすすぃ;-><init>(Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;Ljava/util/concurrent/Callable;Landroid/os/Handler;Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ$くし〴〺ぅ;)V

    invoke-virtual {p0, p6}, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto :goto_ce

    :catchall_b7
    move-exception p0

    .line 10
    :try_start_b8
    monitor-exit p7
    :try_end_b9
    .catchall {:try_start_b8 .. :try_end_b9} :catchall_b7

    throw p0

    .line 11
    :cond_ba
    sget-object p7, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;

    check-cast p1, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;

    invoke-virtual {p7, p0, p1, p2, p4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz p5, :cond_ce

    if-eqz v3, :cond_ca

    invoke-virtual {p5, v3, p6}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_ce

    :cond_ca
    const/4 p0, -0x3

    invoke-virtual {p5, p0, p6}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ(ILandroid/os/Handler;)V

    :cond_ce
    :goto_ce
    if-eqz v3, :cond_d9

    sget-object p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->〺つふすそ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    invoke-static {p2, p3, p4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->くし〴〺ぅ(Landroid/content/res/Resources;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d9
    return-object v3
.end method
