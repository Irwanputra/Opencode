.class public Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ$なぎぱいぢぎ;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u306a\u304e\u3071\u3044\u3062\u304e"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public constructor <init>(Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ$げつ〴ぬぐ;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 19

    .line 1
    sget-object v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->は〲ぱなで:Ljava/lang/ThreadLocal;

    .line 2
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 3
    sget-object v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->ざっざへづ:Ljava/lang/ThreadLocal;

    .line 4
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    move-object/from16 v2, p1

    iget v2, v2, Landroid/os/Message;->what:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_22

    if-eq v2, v6, :cond_20

    :cond_1c
    move-object/from16 v2, p0

    goto/16 :goto_12c

    :cond_20
    const/4 v7, 0x1

    goto :goto_66

    .line 5
    :cond_22
    sget-object v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->ごづごきえ:Ljava/lang/ThreadLocal;

    .line 6
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-gtz v7, :cond_39

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lez v7, :cond_37

    goto :goto_39

    :cond_37
    const/4 v7, 0x1

    goto :goto_3a

    :cond_39
    :goto_39
    const/4 v7, 0x0

    :cond_3a
    :goto_3a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-lez v8, :cond_66

    invoke-virtual {v2}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_4e
    if-ge v10, v9, :cond_3a

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;

    .line 7
    iget-wide v12, v11, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->のぷのちつ:J

    cmp-long v14, v12, v3

    if-nez v14, :cond_60

    .line 8
    invoke-virtual {v11}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->へぬ〴づぞ()V

    goto :goto_63

    .line 9
    :cond_60
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_63
    add-int/lit8 v10, v10, 0x1

    goto :goto_4e

    :cond_66
    :goto_66
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v8

    .line 10
    sget-object v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->ぶでにく〼〳:Ljava/lang/ThreadLocal;

    .line 11
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 12
    sget-object v10, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->でどあくず:Ljava/lang/ThreadLocal;

    .line 13
    invoke-virtual {v10}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_7f
    if-ge v12, v11, :cond_ae

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;

    .line 14
    iget-boolean v14, v13, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->ぁごぐすすぃ:Z

    if-nez v14, :cond_90

    iput-boolean v6, v13, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->ぁごぐすすぃ:Z

    iput-wide v8, v13, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->〳ぜぞぜべっ:J

    goto :goto_a3

    :cond_90
    iget-wide v14, v13, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->〳ぜぞぜべっ:J

    sub-long v14, v8, v14

    iget-wide v3, v13, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->のぷのちつ:J

    cmp-long v16, v14, v3

    if-lez v16, :cond_a3

    sub-long/2addr v14, v3

    sub-long v3, v8, v14

    iput-wide v3, v13, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->くし〴〺ぅ:J

    iput v6, v13, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->ぺぁあねじ:I

    const/4 v3, 0x1

    goto :goto_a4

    :cond_a3
    :goto_a3
    const/4 v3, 0x0

    :goto_a4
    if-eqz v3, :cond_a9

    .line 15
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a9
    add-int/lit8 v12, v12, 0x1

    const-wide/16 v3, 0x0

    goto :goto_7f

    :cond_ae
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_cb

    const/4 v4, 0x0

    :goto_b5
    if-ge v4, v3, :cond_c8

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;

    .line 16
    invoke-virtual {v11}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->へぬ〴づぞ()V

    .line 17
    iput-boolean v6, v11, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->いいにぽつ:Z

    .line 18
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_b5

    :cond_c8
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    :cond_cb
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_d0
    if-ge v3, v2, :cond_f0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;

    invoke-virtual {v4, v8, v9}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->〳ぜぞぜべっ(J)Z

    move-result v11

    if-eqz v11, :cond_e1

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ne v11, v2, :cond_ea

    add-int/lit8 v3, v3, 0x1

    goto :goto_d0

    :cond_ea
    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_d0

    :cond_f0
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_10b

    :goto_f6
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v5, v2, :cond_108

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;

    .line 19
    invoke-virtual {v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->いいにぽつ()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_f6

    .line 20
    :cond_108
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    :cond_10b
    if-eqz v7, :cond_1c

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_119

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    .line 21
    :cond_119
    sget-wide v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/のぷのちつ;->ぉ〲なぱぽた:J

    .line 22
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v8

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    move-object/from16 v2, p0

    invoke-virtual {v2, v6, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_12c
    return-void
.end method
