.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/view/ViewParent;

.field public final くし〴〺ぅ:Landroid/view/View;

.field public げつ〴ぬぐ:Landroid/view/ViewParent;

.field public づざかべべ:[I

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(I)Z
    .registers 2

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    const/4 p1, 0x0

    :goto_9
    return p1
.end method

.method public 〺つふすそ(FF)Z
    .registers 8

    .line 1
    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->びぐびあび:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_38

    .line 2
    invoke-virtual {p0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_38

    iget-object v2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    .line 3
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_2e

    :try_start_13
    invoke-interface {v0, v2, p1, p2}, Landroid/view/ViewParent;->onNestedPreFling(Landroid/view/View;FF)Z

    move-result v1
    :try_end_17
    .catch Ljava/lang/AbstractMethodError; {:try_start_13 .. :try_end_17} :catch_18

    goto :goto_38

    :catch_18
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ViewParent "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " does not implement interface method onNestedPreFling"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto :goto_38

    :cond_2e
    instance-of v3, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    if-eqz v3, :cond_38

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    invoke-interface {v0, v2, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;->onNestedPreFling(Landroid/view/View;FF)Z

    move-result v1

    :cond_38
    :goto_38
    return v1
.end method

.method public final ぁごぐすすぃ(I)Landroid/view/ViewParent;
    .registers 3

    if-eqz p1, :cond_a

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    const/4 p1, 0x0

    return-object p1

    :cond_7
    iget-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->〺つふすそ:Landroid/view/ViewParent;

    return-object p1

    :cond_a
    iget-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/ViewParent;

    return-object p1
.end method

.method public いいにぽつ(II)Z
    .registers 12

    .line 1
    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ(I)Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    if-eqz v0, :cond_e

    return v1

    .line 2
    :cond_e
    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->びぐびあび:Z

    if-eqz v0, :cond_a5

    .line 3
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v3, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    :goto_1a
    if-eqz v0, :cond_a5

    iget-object v4, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    .line 4
    instance-of v5, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    const-string v6, "ViewParent "

    const/16 v7, 0x15

    if-eqz v5, :cond_2e

    move-object v8, v0

    check-cast v8, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    invoke-interface {v8, v3, v4, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;->のぷのちつ(Landroid/view/View;Landroid/view/View;II)Z

    move-result v4

    goto :goto_5a

    :cond_2e
    if-nez p2, :cond_59

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v8, v7, :cond_4d

    :try_start_34
    invoke-interface {v0, v3, v4, p1}, Landroid/view/ViewParent;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result v4
    :try_end_38
    .catch Ljava/lang/AbstractMethodError; {:try_start_34 .. :try_end_38} :catch_39

    goto :goto_5a

    :catch_39
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " does not implement interface method onStartNestedScroll"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto :goto_59

    :cond_4d
    instance-of v8, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    if-eqz v8, :cond_59

    move-object v8, v0

    check-cast v8, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    invoke-interface {v8, v3, v4, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result v4

    goto :goto_5a

    :cond_59
    :goto_59
    const/4 v4, 0x0

    :goto_5a
    if-eqz v4, :cond_98

    if-eqz p2, :cond_64

    if-eq p2, v1, :cond_61

    goto :goto_66

    .line 5
    :cond_61
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->〺つふすそ:Landroid/view/ViewParent;

    goto :goto_66

    :cond_64
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/ViewParent;

    .line 6
    :goto_66
    iget-object v2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    if-eqz v5, :cond_70

    .line 7
    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    invoke-interface {v0, v3, v2, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Landroid/view/View;Landroid/view/View;II)V

    goto :goto_97

    :cond_70
    if-nez p2, :cond_97

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v7, :cond_8e

    :try_start_76
    invoke-interface {v0, v3, v2, p1}, Landroid/view/ViewParent;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    :try_end_79
    .catch Ljava/lang/AbstractMethodError; {:try_start_76 .. :try_end_79} :catch_7a

    goto :goto_97

    :catch_7a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " does not implement interface method onNestedScrollAccepted"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto :goto_97

    :cond_8e
    instance-of p2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    if-eqz p2, :cond_97

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    invoke-interface {v0, v3, v2, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_97
    :goto_97
    return v1

    .line 8
    :cond_98
    instance-of v4, v0, Landroid/view/View;

    if-eqz v4, :cond_9f

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    :cond_9f
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto/16 :goto_1a

    :cond_a5
    return v2
.end method

.method public くし〴〺ぅ(II[I[II)Z
    .registers 19

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object/from16 v7, p4

    move/from16 v6, p5

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->びぐびあび:Z

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_9c

    .line 2
    invoke-virtual {p0, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ(I)Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_14

    return v9

    :cond_14
    if-nez v3, :cond_21

    if-eqz v4, :cond_19

    goto :goto_21

    :cond_19
    if-eqz v7, :cond_9c

    aput v9, v7, v9

    aput v9, v7, v8

    goto/16 :goto_9c

    :cond_21
    :goto_21
    if-eqz v7, :cond_2f

    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v2, v7}, Landroid/view/View;->getLocationInWindow([I)V

    aget v2, v7, v9

    aget v5, v7, v8

    move v10, v2

    move v11, v5

    goto :goto_31

    :cond_2f
    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_31
    if-nez p3, :cond_40

    .line 3
    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:[I

    if-nez v2, :cond_3c

    const/4 v2, 0x2

    new-array v2, v2, [I

    iput-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:[I

    :cond_3c
    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:[I

    move-object v12, v2

    goto :goto_42

    :cond_40
    move-object/from16 v12, p3

    .line 4
    :goto_42
    aput v9, v12, v9

    aput v9, v12, v8

    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    .line 5
    instance-of v5, v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    if-eqz v5, :cond_57

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    move v3, p1

    move v4, p2

    move-object v5, v12

    move/from16 v6, p5

    invoke-interface/range {v1 .. v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;->〳ぜぞぜべっ(Landroid/view/View;II[II)V

    goto :goto_82

    :cond_57
    if-nez v6, :cond_82

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x15

    if-lt v5, v6, :cond_79

    :try_start_5f
    invoke-interface {v1, v2, p1, p2, v12}, Landroid/view/ViewParent;->onNestedPreScroll(Landroid/view/View;II[I)V
    :try_end_62
    .catch Ljava/lang/AbstractMethodError; {:try_start_5f .. :try_end_62} :catch_63

    goto :goto_82

    :catch_63
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ViewParent "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " does not implement interface method onNestedPreScroll"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto :goto_82

    :cond_79
    instance-of v5, v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    if-eqz v5, :cond_82

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    invoke-interface {v1, v2, p1, p2, v12}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_82
    :goto_82
    if-eqz v7, :cond_93

    .line 6
    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v1, v7}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v7, v9

    sub-int/2addr v1, v10

    aput v1, v7, v9

    aget v1, v7, v8

    sub-int/2addr v1, v11

    aput v1, v7, v8

    :cond_93
    aget v1, v12, v9

    if-nez v1, :cond_9d

    aget v1, v12, v8

    if-eqz v1, :cond_9c

    goto :goto_9d

    :cond_9c
    :goto_9c
    const/4 v8, 0x0

    :cond_9d
    :goto_9d
    return v8
.end method

.method public げつ〴ぬぐ(FFZ)Z
    .registers 9

    .line 1
    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->びぐびあび:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_38

    .line 2
    invoke-virtual {p0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_38

    iget-object v2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    .line 3
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_2e

    :try_start_13
    invoke-interface {v0, v2, p1, p2, p3}, Landroid/view/ViewParent;->onNestedFling(Landroid/view/View;FFZ)Z

    move-result v1
    :try_end_17
    .catch Ljava/lang/AbstractMethodError; {:try_start_13 .. :try_end_17} :catch_18

    goto :goto_38

    :catch_18
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ViewParent "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " does not implement interface method onNestedFling"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto :goto_38

    :cond_2e
    instance-of v3, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    if-eqz v3, :cond_38

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    invoke-interface {v0, v2, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;->onNestedFling(Landroid/view/View;FFZ)Z

    move-result v1

    :cond_38
    :goto_38
    return v1
.end method

.method public づざかべべ(IIII[I)Z
    .registers 14

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->なぎぱいぢぎ(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public final なぎぱいぢぎ(IIII[II[I)Z
    .registers 23

    move-object v0, p0

    move-object/from16 v9, p5

    move/from16 v7, p6

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->びぐびあび:Z

    const/4 v10, 0x0

    if-eqz v1, :cond_d0

    .line 2
    invoke-virtual {p0, v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ(I)Landroid/view/ViewParent;

    move-result-object v8

    if-nez v8, :cond_11

    return v10

    :cond_11
    const/4 v11, 0x1

    if-nez p1, :cond_23

    if-nez p2, :cond_23

    if-nez p3, :cond_23

    if-eqz p4, :cond_1b

    goto :goto_23

    :cond_1b
    if-eqz v9, :cond_d0

    aput v10, v9, v10

    aput v10, v9, v11

    goto/16 :goto_d0

    :cond_23
    :goto_23
    if-eqz v9, :cond_31

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v1, v9}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v9, v10

    aget v2, v9, v11

    move v12, v1

    move v13, v2

    goto :goto_33

    :cond_31
    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_33
    if-nez p7, :cond_46

    .line 3
    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:[I

    if-nez v1, :cond_3e

    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:[I

    :cond_3e
    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:[I

    .line 4
    aput v10, v1, v10

    aput v10, v1, v11

    move-object v14, v1

    goto :goto_48

    :cond_46
    move-object/from16 v14, p7

    :goto_48
    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    .line 5
    instance-of v1, v8, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〳ぜぞぜべっ;

    if-eqz v1, :cond_60

    move-object v1, v8

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〳ぜぞぜべっ;

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p6

    move-object v8, v14

    invoke-interface/range {v1 .. v8}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〳ぜぞぜべっ;->ぺふねづ〺(Landroid/view/View;IIIII[I)V

    goto :goto_be

    :cond_60
    aget v1, v14, v10

    add-int v1, v1, p3

    aput v1, v14, v10

    aget v1, v14, v11

    add-int v1, v1, p4

    aput v1, v14, v11

    instance-of v1, v8, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    if-eqz v1, :cond_81

    move-object v1, v8

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p6

    invoke-interface/range {v1 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;->てぜきぽく(Landroid/view/View;IIIII)V

    goto :goto_be

    :cond_81
    if-nez v7, :cond_be

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v1, v3, :cond_ac

    move-object v1, v8

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    :try_start_92
    invoke-interface/range {v1 .. v6}, Landroid/view/ViewParent;->onNestedScroll(Landroid/view/View;IIII)V
    :try_end_95
    .catch Ljava/lang/AbstractMethodError; {:try_start_92 .. :try_end_95} :catch_96

    goto :goto_be

    :catch_96
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ViewParent "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " does not implement interface method onNestedScroll"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto :goto_be

    :cond_ac
    instance-of v1, v8, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    if-eqz v1, :cond_be

    move-object v1, v8

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    invoke-interface/range {v1 .. v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;->onNestedScroll(Landroid/view/View;IIII)V

    :cond_be
    :goto_be
    if-eqz v9, :cond_cf

    .line 6
    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v1, v9}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v9, v10

    sub-int/2addr v1, v12

    aput v1, v9, v10

    aget v1, v9, v11

    sub-int/2addr v1, v13

    aput v1, v9, v11

    :cond_cf
    return v11

    :cond_d0
    :goto_d0
    return v10
.end method

.method public びぐびあび(IIII[II[I)V
    .registers 16

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->なぎぱいぢぎ(IIII[II[I)Z

    return-void
.end method

.method public ぺぁあねじ(Z)V
    .registers 5

    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->びぐびあび:Z

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    .line 1
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_12

    invoke-virtual {v0}, Landroid/view/View;->stopNestedScroll()V

    goto :goto_1b

    :cond_12
    instance-of v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/づざかべべ;

    if-eqz v1, :cond_1b

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/づざかべべ;

    invoke-interface {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/づざかべべ;->stopNestedScroll()V

    .line 2
    :cond_1b
    :goto_1b
    iput-boolean p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->びぐびあび:Z

    return-void
.end method

.method public ぺふねづ〺(I)V
    .registers 6

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_49

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    .line 1
    instance-of v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    if-eqz v2, :cond_12

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;

    invoke-interface {v0, v1, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;->ぁごぐすすぃ(Landroid/view/View;I)V

    goto :goto_3d

    :cond_12
    if-nez p1, :cond_3d

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_34

    :try_start_1a
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->onStopNestedScroll(Landroid/view/View;)V
    :try_end_1d
    .catch Ljava/lang/AbstractMethodError; {:try_start_1a .. :try_end_1d} :catch_1e

    goto :goto_3d

    :catch_1e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ViewParent "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not implement interface method onStopNestedScroll"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto :goto_3d

    :cond_34
    instance-of v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    if-eqz v2, :cond_3d

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;

    invoke-interface {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;->onStopNestedScroll(Landroid/view/View;)V

    :cond_3d
    :goto_3d
    const/4 v0, 0x0

    if-eqz p1, :cond_47

    const/4 v1, 0x1

    if-eq p1, v1, :cond_44

    goto :goto_49

    .line 2
    :cond_44
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->〺つふすそ:Landroid/view/ViewParent;

    goto :goto_49

    :cond_47
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/ViewParent;

    :cond_49
    :goto_49
    return-void
.end method
