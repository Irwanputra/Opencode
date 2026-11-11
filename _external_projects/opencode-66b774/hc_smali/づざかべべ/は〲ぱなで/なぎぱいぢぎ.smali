.class public Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;-><init>()V

    return-void
.end method

.method public static でどあくず(Landroidx/transition/Transition;)Z
    .registers 2

    .line 1
    iget-object p0, p0, Landroidx/transition/Transition;->なぎぱいぢぎ:Ljava/util/ArrayList;

    .line 2
    invoke-static {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;->ぺふねづ〺(Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_18

    const/4 p0, 0x0

    invoke-static {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;->ぺふねづ〺(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;->ぺふねづ〺(Ljava/util/List;)Z

    move-result p0

    if-nez p0, :cond_16

    goto :goto_18

    :cond_16
    const/4 p0, 0x0

    goto :goto_19

    :cond_18
    :goto_18
    const/4 p0, 0x1

    :goto_19
    return p0
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/Object;Ljava/util/ArrayList;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Landroidx/transition/Transition;

    if-nez p1, :cond_5

    return-void

    :cond_5
    instance-of v0, p1, Landroidx/transition/TransitionSet;

    const/4 v1, 0x0

    if-eqz v0, :cond_1e

    check-cast p1, Landroidx/transition/TransitionSet;

    .line 1
    iget-object v0, p1, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_12
    if-ge v1, v0, :cond_3e

    .line 2
    invoke-virtual {p1, v1}, Landroidx/transition/TransitionSet;->けときぜと(I)Landroidx/transition/Transition;

    move-result-object v2

    invoke-virtual {p0, v2, p2}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;->〺つふすそ(Ljava/lang/Object;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_12

    :cond_1e
    invoke-static {p1}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;->でどあくず(Landroidx/transition/Transition;)Z

    move-result v0

    if-nez v0, :cond_3e

    .line 3
    iget-object v0, p1, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    .line 4
    invoke-static {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;->ぺふねづ〺(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_30
    if-ge v1, v0, :cond_3e

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p1, v2}, Landroidx/transition/Transition;->〺つふすそ(Landroid/view/View;)Landroidx/transition/Transition;

    add-int/lit8 v1, v1, 0x1

    goto :goto_30

    :cond_3e
    return-void
.end method

.method public ぁごぐすすぃ(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    if-eqz p1, :cond_9

    check-cast p1, Landroidx/transition/Transition;

    invoke-virtual {p1}, Landroidx/transition/Transition;->いいにぽつ()Landroidx/transition/Transition;

    move-result-object p1

    goto :goto_a

    :cond_9
    const/4 p1, 0x0

    :goto_a
    return-object p1
.end method

.method public ぇぬぎばつ(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .registers 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Landroidx/transition/Transition;

    new-instance v9, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$くし〴〺ぅ;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$くし〴〺ぅ;-><init>(Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v9}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    return-void
.end method

.method public ぉざぅち〻(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .registers 4

    if-eqz p1, :cond_c

    check-cast p1, Landroidx/transition/Transition;

    new-instance v0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$びぐびあび;

    invoke-direct {v0, p0, p2}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$びぐびあび;-><init>(Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->なぶひせが(Landroidx/transition/Transition$くし〴〺ぅ;)V

    :cond_c
    return-void
.end method

.method public おぐぴう〸ず(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Landroid/view/View;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Landroidx/transition/Transition;

    new-instance v0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$〺つふすそ;

    invoke-direct {v0, p0, p2, p3}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$〺つふすそ;-><init>(Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;Landroid/view/View;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, Landroidx/transition/Transition;

    invoke-static {p1, p2}, Lづざかべべ/は〲ぱなで/でどあくず;->げつ〴ぬぐ(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    return-void
.end method

.method public げつ〴ぬぐ(Ljava/lang/Object;Landroid/view/View;)V
    .registers 3

    if-eqz p1, :cond_7

    check-cast p1, Landroidx/transition/Transition;

    invoke-virtual {p1, p2}, Landroidx/transition/Transition;->〺つふすそ(Landroid/view/View;)Landroidx/transition/Transition;

    :cond_7
    return-void
.end method

.method public ごづごきえ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Landroidx/transition/TransitionSet;

    if-eqz p1, :cond_11

    .line 1
    iget-object v0, p1, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    .line 2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    iget-object v0, p1, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    .line 4
    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, p1, p2, p3}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;->へぬ〴づぞ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_11
    return-void
.end method

.method public ざっざへづ(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    new-instance v0, Landroidx/transition/TransitionSet;

    invoke-direct {v0}, Landroidx/transition/TransitionSet;-><init>()V

    check-cast p1, Landroidx/transition/Transition;

    invoke-virtual {v0, p1}, Landroidx/transition/TransitionSet;->ぷぞてのほき(Landroidx/transition/Transition;)Landroidx/transition/TransitionSet;

    return-object v0
.end method

.method public ざとぅぼこ〺(Ljava/lang/Object;Landroid/view/View;)V
    .registers 4

    if-eqz p2, :cond_14

    check-cast p1, Landroidx/transition/Transition;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, p2, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;->いいにぽつ(Landroid/view/View;Landroid/graphics/Rect;)V

    new-instance p2, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {p2, p0, v0}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$げつ〴ぬぐ;-><init>(Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;Landroid/graphics/Rect;)V

    invoke-virtual {p1, p2}, Landroidx/transition/Transition;->なぶひせが(Landroidx/transition/Transition$くし〴〺ぅ;)V

    :cond_14
    return-void
.end method

.method public づざかべべ(Ljava/lang/Object;)Z
    .registers 2

    instance-of p1, p1, Landroidx/transition/Transition;

    return p1
.end method

.method public てぜきぽく(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    new-instance v0, Landroidx/transition/TransitionSet;

    invoke-direct {v0}, Landroidx/transition/TransitionSet;-><init>()V

    if-eqz p1, :cond_c

    check-cast p1, Landroidx/transition/Transition;

    invoke-virtual {v0, p1}, Landroidx/transition/TransitionSet;->ぷぞてのほき(Landroidx/transition/Transition;)Landroidx/transition/TransitionSet;

    :cond_c
    if-eqz p2, :cond_13

    check-cast p2, Landroidx/transition/Transition;

    invoke-virtual {v0, p2}, Landroidx/transition/TransitionSet;->ぷぞてのほき(Landroidx/transition/Transition;)Landroidx/transition/TransitionSet;

    :cond_13
    if-eqz p3, :cond_1a

    check-cast p3, Landroidx/transition/Transition;

    invoke-virtual {v0, p3}, Landroidx/transition/TransitionSet;->ぷぞてのほき(Landroidx/transition/Transition;)Landroidx/transition/TransitionSet;

    :cond_1a
    return-object v0
.end method

.method public のぷのちつ(Ljava/lang/Object;Landroid/view/View;)V
    .registers 3

    if-eqz p1, :cond_7

    check-cast p1, Landroidx/transition/Transition;

    invoke-virtual {p1, p2}, Landroidx/transition/Transition;->〻ぞまぎな〻(Landroid/view/View;)Landroidx/transition/Transition;

    :cond_7
    return-void
.end method

.method public は〲ぱなで(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Landroid/view/View;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Landroidx/transition/TransitionSet;

    .line 1
    iget-object v0, p1, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    .line 2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_c
    if-ge v2, v1, :cond_1a

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-static {v0, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;->びぐびあび(Ljava/util/List;Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_1a
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, p3}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;->〺つふすそ(Ljava/lang/Object;Ljava/util/ArrayList;)V

    return-void
.end method

.method public へぬ〴づぞ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Landroidx/transition/Transition;

    instance-of v0, p1, Landroidx/transition/TransitionSet;

    const/4 v1, 0x0

    if-eqz v0, :cond_1b

    check-cast p1, Landroidx/transition/TransitionSet;

    .line 1
    iget-object v0, p1, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_f
    if-ge v1, v0, :cond_5b

    .line 2
    invoke-virtual {p1, v1}, Landroidx/transition/TransitionSet;->けときぜと(I)Landroidx/transition/Transition;

    move-result-object v2

    invoke-virtual {p0, v2, p2, p3}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;->へぬ〴づぞ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_1b
    invoke-static {p1}, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;->でどあくず(Landroidx/transition/Transition;)Z

    move-result v0

    if-nez v0, :cond_5b

    .line 3
    iget-object v0, p1, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v2, v3, :cond_5b

    invoke-interface {v0, p2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_5b

    if-nez p3, :cond_37

    const/4 v0, 0x0

    goto :goto_3b

    :cond_37
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_3b
    if-ge v1, v0, :cond_49

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p1, v2}, Landroidx/transition/Transition;->〺つふすそ(Landroid/view/View;)Landroidx/transition/Transition;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3b

    :cond_49
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    :goto_4d
    add-int/lit8 p3, p3, -0x1

    if-ltz p3, :cond_5b

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->〻ぞまぎな〻(Landroid/view/View;)Landroidx/transition/Transition;

    goto :goto_4d

    :cond_5b
    return-void
.end method
