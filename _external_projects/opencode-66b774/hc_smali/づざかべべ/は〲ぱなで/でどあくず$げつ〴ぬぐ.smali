.class public Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/は〲ぱなで/でどあくず;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Landroidx/transition/Transition;

.field public くし〴〺ぅ:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroidx/transition/Transition;Landroid/view/ViewGroup;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->〺つふすそ:Landroidx/transition/Transition;

    iput-object p2, p0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .registers 19

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    iget-object v1, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 2
    sget-object v1, Lづざかべべ/は〲ぱなで/でどあくず;->くし〴〺ぅ:Ljava/util/ArrayList;

    iget-object v2, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    invoke-static {}, Lづざかべべ/は〲ぱなで/でどあくず;->〺つふすそ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-result-object v1

    iget-object v3, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {v1, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    const/4 v4, 0x0

    if-nez v3, :cond_36

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {v1, v5, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_42

    :cond_36
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_42

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_43

    :cond_42
    :goto_42
    move-object v5, v4

    :goto_43
    iget-object v6, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->〺つふすそ:Landroidx/transition/Transition;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->〺つふすそ:Landroidx/transition/Transition;

    new-instance v6, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v6, v0, v1}, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V

    invoke-virtual {v3, v6}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    iget-object v1, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->〺つふすそ:Landroidx/transition/Transition;

    iget-object v3, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    const/4 v6, 0x0

    invoke-virtual {v1, v3, v6}, Landroidx/transition/Transition;->〳ぜぞぜべっ(Landroid/view/ViewGroup;Z)V

    if-eqz v5, :cond_72

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_60
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_72

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/Transition;

    iget-object v5, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {v3, v5}, Landroidx/transition/Transition;->ぉ〲なぱぽた(Landroid/view/View;)V

    goto :goto_60

    :cond_72
    iget-object v1, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->〺つふすそ:Landroidx/transition/Transition;

    iget-object v8, v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    iget-object v3, v1, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object v5, v1, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    .line 4
    new-instance v7, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iget-object v9, v3, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v7, v9}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>(Lづざかべべ/づざかべべ/〳ぜぞぜべっ;)V

    new-instance v9, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iget-object v10, v5, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v9, v10}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>(Lづざかべべ/づざかべべ/〳ぜぞぜべっ;)V

    const/4 v10, 0x0

    :goto_9a
    iget-object v11, v1, Landroidx/transition/Transition;->ぺふねづ〺:[I

    array-length v12, v11

    if-ge v10, v12, :cond_1f4

    aget v11, v11, v10

    if-eq v11, v2, :cond_1b4

    const/4 v12, 0x2

    if-eq v11, v12, :cond_166

    const/4 v12, 0x3

    if-eq v11, v12, :cond_112

    const/4 v12, 0x4

    if-eq v11, v12, :cond_af

    :cond_ac
    move-object/from16 v17, v3

    goto :goto_10e

    :cond_af
    iget-object v11, v3, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    iget-object v12, v5, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/づざかべべ;

    .line 5
    invoke-virtual {v11}, Lづざかべべ/づざかべべ/づざかべべ;->〳ぜぞぜべっ()I

    move-result v13

    const/4 v14, 0x0

    :goto_b8
    if-ge v14, v13, :cond_ac

    invoke-virtual {v11, v14}, Lづざかべべ/づざかべべ/づざかべべ;->ぺぁあねじ(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    if-eqz v15, :cond_104

    invoke-virtual {v1, v15}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v16

    if-eqz v16, :cond_104

    .line 6
    iget-boolean v6, v11, Lづざかべべ/づざかべべ/づざかべべ;->〺つふすそ:Z

    if-eqz v6, :cond_cf

    invoke-virtual {v11}, Lづざかべべ/づざかべべ/づざかべべ;->びぐびあび()V

    :cond_cf
    iget-object v6, v11, Lづざかべべ/づざかべべ/づざかべべ;->くし〴〺ぅ:[J

    move-object/from16 v17, v3

    aget-wide v2, v6, v14

    .line 7
    invoke-virtual {v12, v2, v3}, Lづざかべべ/づざかべべ/づざかべべ;->づざかべべ(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_106

    invoke-virtual {v1, v2}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_106

    .line 8
    invoke-virtual {v7, v15, v4}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 9
    check-cast v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    .line 10
    invoke-virtual {v9, v2, v4}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 11
    check-cast v6, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    if-eqz v3, :cond_106

    if-eqz v6, :cond_106

    iget-object v4, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v15}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_106

    :cond_104
    move-object/from16 v17, v3

    :cond_106
    :goto_106
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v3, v17

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    goto :goto_b8

    :goto_10e
    move-object/from16 v2, v17

    goto/16 :goto_1ea

    :cond_112
    move-object v2, v3

    .line 12
    iget-object v3, v2, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->〺つふすそ:Landroid/util/SparseArray;

    iget-object v4, v5, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->〺つふすそ:Landroid/util/SparseArray;

    .line 13
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v6

    const/4 v11, 0x0

    :goto_11c
    if-ge v11, v6, :cond_1ea

    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_161

    invoke-virtual {v1, v12}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_161

    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v13

    invoke-virtual {v4, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    if-eqz v13, :cond_161

    invoke-virtual {v1, v13}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v14

    if-eqz v14, :cond_161

    const/4 v14, 0x0

    .line 14
    invoke-virtual {v7, v12, v14}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .line 15
    check-cast v15, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    .line 16
    invoke-virtual {v9, v13, v14}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    .line 17
    move-object/from16 v14, v17

    check-cast v14, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    if-eqz v15, :cond_161

    if-eqz v14, :cond_161

    iget-object v0, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v12}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v13}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_161
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    goto :goto_11c

    :cond_166
    move-object v2, v3

    .line 18
    iget-object v0, v2, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->びぐびあび:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iget-object v3, v5, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->びぐびあび:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    .line 19
    iget v4, v0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    const/4 v6, 0x0

    :goto_16e
    if-ge v6, v4, :cond_1ea

    .line 20
    invoke-virtual {v0, v6}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    if-eqz v11, :cond_1b1

    invoke-virtual {v1, v11}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_1b1

    invoke-virtual {v0, v6}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v3, v12}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_1b1

    invoke-virtual {v1, v12}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_1b1

    const/4 v13, 0x0

    .line 21
    invoke-virtual {v7, v11, v13}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    .line 22
    check-cast v14, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    .line 23
    invoke-virtual {v9, v12, v13}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .line 24
    check-cast v15, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    if-eqz v14, :cond_1b1

    if-eqz v15, :cond_1b1

    iget-object v13, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v11}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v12}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1b1
    add-int/lit8 v6, v6, 0x1

    goto :goto_16e

    :cond_1b4
    move-object v2, v3

    .line 25
    iget v0, v7, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    :cond_1b7
    :goto_1b7
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1ea

    .line 26
    invoke-virtual {v7, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_1b7

    invoke-virtual {v1, v3}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_1b7

    invoke-virtual {v9, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    if-eqz v3, :cond_1b7

    iget-object v4, v3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_1b7

    invoke-virtual {v7, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺぁあねじ(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    iget-object v6, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1b7

    :cond_1ea
    :goto_1ea
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object v3, v2

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    goto/16 :goto_9a

    :cond_1f4
    const/4 v0, 0x0

    .line 27
    :goto_1f5
    iget v2, v7, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    if-ge v0, v2, :cond_215

    .line 28
    invoke-virtual {v7, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    iget-object v3, v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_212

    iget-object v3, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_212
    add-int/lit8 v0, v0, 0x1

    goto :goto_1f5

    :cond_215
    const/4 v0, 0x0

    .line 29
    :goto_216
    iget v2, v9, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    if-ge v0, v2, :cond_236

    .line 30
    invoke-virtual {v9, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    iget-object v3, v2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_233

    iget-object v3, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_233
    add-int/lit8 v0, v0, 0x1

    goto :goto_216

    .line 31
    :cond_236
    invoke-static {}, Landroidx/transition/Transition;->ぇぬぎばつ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    .line 32
    iget v2, v0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    .line 33
    invoke-static {v8}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->〺つふすそ(Landroid/view/View;)Lづざかべべ/は〲ぱなで/えがぐせほち;

    move-result-object v3

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    :goto_242
    if-ltz v2, :cond_2a5

    invoke-virtual {v0, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    const/4 v5, 0x0

    if-eqz v4, :cond_2a2

    .line 34
    invoke-virtual {v0, v4, v5}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 35
    check-cast v6, Landroidx/transition/Transition$〺つふすそ;

    if-eqz v6, :cond_2a2

    iget-object v7, v6, Landroidx/transition/Transition$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    if-eqz v7, :cond_2a2

    iget-object v7, v6, Landroidx/transition/Transition$〺つふすそ;->びぐびあび:Lづざかべべ/は〲ぱなで/えがぐせほち;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2a2

    iget-object v7, v6, Landroidx/transition/Transition$〺つふすそ;->くし〴〺ぅ:Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    iget-object v9, v6, Landroidx/transition/Transition$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    const/4 v10, 0x1

    invoke-virtual {v1, v9, v10}, Landroidx/transition/Transition;->ざとぅぼこ〺(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object v11

    invoke-virtual {v1, v9, v10}, Landroidx/transition/Transition;->おぐぴう〸ず(Landroid/view/View;Z)Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    move-result-object v12

    if-nez v11, :cond_27d

    if-nez v12, :cond_27d

    iget-object v10, v1, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object v10, v10, Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v10, v9}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;

    :cond_27d
    if-nez v11, :cond_281

    if-eqz v12, :cond_28b

    :cond_281
    iget-object v6, v6, Landroidx/transition/Transition$〺つふすそ;->づざかべべ:Landroidx/transition/Transition;

    invoke-virtual {v6, v7, v12}, Landroidx/transition/Transition;->は〲ぱなで(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Z

    move-result v6

    if-eqz v6, :cond_28b

    const/4 v6, 0x1

    goto :goto_28c

    :cond_28b
    const/4 v6, 0x0

    :goto_28c
    if-eqz v6, :cond_2a2

    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    move-result v6

    if-nez v6, :cond_29f

    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    move-result v6

    if-eqz v6, :cond_29b

    goto :goto_29f

    :cond_29b
    invoke-virtual {v0, v4}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2a2

    :cond_29f
    :goto_29f
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    :cond_2a2
    :goto_2a2
    add-int/lit8 v2, v2, -0x1

    goto :goto_242

    :cond_2a5
    iget-object v9, v1, Landroidx/transition/Transition;->〳ぜぞぜべっ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object v10, v1, Landroidx/transition/Transition;->ぺぁあねじ:Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;

    iget-object v11, v1, Landroidx/transition/Transition;->てぜきぽく:Ljava/util/ArrayList;

    iget-object v12, v1, Landroidx/transition/Transition;->のぷのちつ:Ljava/util/ArrayList;

    move-object v7, v1

    invoke-virtual/range {v7 .. v12}, Landroidx/transition/Transition;->てぜきぽく(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v1}, Landroidx/transition/Transition;->ぇ〳〲〺すっ()V

    const/4 v0, 0x1

    return v0
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 2
    sget-object p1, Lづざかべべ/は〲ぱなで/でどあくず;->くし〴〺ぅ:Ljava/util/ArrayList;

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lづざかべべ/は〲ぱなで/でどあくず;->〺つふすそ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_3f

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3f

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/Transition;

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroidx/transition/Transition;->ぉ〲なぱぽた(Landroid/view/View;)V

    goto :goto_2d

    :cond_3f
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;->〺つふすそ:Landroidx/transition/Transition;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->ぺぁあねじ(Z)V

    return-void
.end method
