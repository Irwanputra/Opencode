.class public Landroidx/transition/TransitionSet;
.super Landroidx/transition/Transition;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/TransitionSet$〺つふすそ;
    }
.end annotation


# instance fields
.field public ぅみぱぎぎ:I

.field public ぇ〳〲〺すっ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/transition/Transition;",
            ">;"
        }
    .end annotation
.end field

.field public どぇぞほだ:Z

.field public なぶひせが:I

.field public びえぁぜい:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->びえぁぜい:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->どぇぞほだ:Z

    iput v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->びえぁぜい:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->どぇぞほだ:Z

    iput v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    sget-object v1, Lづざかべべ/は〲ぱなで/ざとぅぼこ〺;->ぁごぐすすぃ:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v1, "transitionOrdering"

    invoke-static {p1, p2, v1, v0, v0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->びぐびあび(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/transition/TransitionSet;->ぇとしたべど(I)Landroidx/transition/TransitionSet;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Landroidx/transition/TransitionSet;->いいにぽつ()Landroidx/transition/Transition;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(Landroid/view/View;)Landroidx/transition/Transition;
    .registers 4

    const/4 v0, 0x0

    .line 1
    :goto_1
    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_17

    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->〺つふすそ(Landroid/view/View;)Landroidx/transition/Transition;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2
    :cond_17
    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public 〺でおいここ(Landroid/animation/TimeInterpolator;)Landroidx/transition/TransitionSet;
    .registers 5

    iget v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_f
    if-ge v1, v0, :cond_1f

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->どぇぞほだ(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    .line 1
    :cond_1f
    iput-object p1, p0, Landroidx/transition/Transition;->づざかべべ:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method public 〻ぞまぎな〻(Landroid/view/View;)Landroidx/transition/Transition;
    .registers 4

    const/4 v0, 0x0

    .line 1
    :goto_1
    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_17

    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->〻ぞまぎな〻(Landroid/view/View;)Landroidx/transition/Transition;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2
    :cond_17
    iget-object v0, p0, Landroidx/transition/Transition;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 5

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2b

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_2b
    return-void
.end method

.method public いいにぽつ()Landroidx/transition/Transition;
    .registers 6

    invoke-super {p0}, Landroidx/transition/Transition;->いいにぽつ()Landroidx/transition/Transition;

    move-result-object v0

    check-cast v0, Landroidx/transition/TransitionSet;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_14
    if-ge v2, v1, :cond_2c

    iget-object v3, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/Transition;

    invoke-virtual {v3}, Landroidx/transition/Transition;->いいにぽつ()Landroidx/transition/Transition;

    move-result-object v3

    .line 1
    iget-object v4, v0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v0, v3, Landroidx/transition/Transition;->いいにぽつ:Landroidx/transition/TransitionSet;

    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_2c
    return-object v0
.end method

.method public ぅみぱぎぎ(Landroidx/transition/PathMotion;)V
    .registers 4

    if-nez p1, :cond_5

    .line 1
    sget-object v0, Landroidx/transition/Transition;->〻ぞまぎな〻:Landroidx/transition/PathMotion;

    goto :goto_6

    :cond_5
    move-object v0, p1

    :goto_6
    iput-object v0, p0, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    .line 2
    iget v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    if-eqz v0, :cond_29

    const/4 v0, 0x0

    :goto_13
    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_29

    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->ぅみぱぎぎ(Landroidx/transition/PathMotion;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_13

    :cond_29
    return-void
.end method

.method public ぇ〳〲〺すっ()V
    .registers 5

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Landroidx/transition/Transition;->ぉひのべい()V

    invoke-virtual {p0}, Landroidx/transition/Transition;->のぷのちつ()V

    return-void

    .line 1
    :cond_f
    new-instance v0, Landroidx/transition/TransitionSet$〺つふすそ;

    invoke-direct {v0, p0}, Landroidx/transition/TransitionSet$〺つふすそ;-><init>(Landroidx/transition/TransitionSet;)V

    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, v0}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    goto :goto_1a

    :cond_2a
    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Landroidx/transition/TransitionSet;->なぶひせが:I

    .line 2
    iget-boolean v0, p0, Landroidx/transition/TransitionSet;->びえぁぜい:Z

    if-nez v0, :cond_6b

    const/4 v0, 0x1

    :goto_37
    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_5c

    iget-object v1, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    new-instance v3, Landroidx/transition/TransitionSet$げつ〴ぬぐ;

    invoke-direct {v3, p0, v2}, Landroidx/transition/TransitionSet$げつ〴ぬぐ;-><init>(Landroidx/transition/TransitionSet;Landroidx/transition/Transition;)V

    invoke-virtual {v1, v3}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    add-int/lit8 v0, v0, 0x1

    goto :goto_37

    :cond_5c
    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/Transition;

    if-eqz v0, :cond_81

    invoke-virtual {v0}, Landroidx/transition/Transition;->ぇ〳〲〺すっ()V

    goto :goto_81

    :cond_6b
    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_71
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_81

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    invoke-virtual {v1}, Landroidx/transition/Transition;->ぇ〳〲〺すっ()V

    goto :goto_71

    :cond_81
    :goto_81
    return-void
.end method

.method public ぇとしたべど(I)Landroidx/transition/TransitionSet;
    .registers 4

    const/4 v0, 0x1

    if-eqz p1, :cond_15

    if-ne p1, v0, :cond_9

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/transition/TransitionSet;->びえぁぜい:Z

    goto :goto_17

    :cond_9
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Invalid parameter for TransitionSet ordering: "

    invoke-static {v1, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->びえぁぜい:Z

    :goto_17
    return-object p0
.end method

.method public ぉ〲なぱぽた(Landroid/view/View;)V
    .registers 5

    invoke-super {p0, p1}, Landroidx/transition/Transition;->ぉ〲なぱぽた(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_1a

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->ぉ〲なぱぽた(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1a
    return-void
.end method

.method public おかぷせ〱(J)Landroidx/transition/TransitionSet;
    .registers 6

    .line 1
    iput-wide p1, p0, Landroidx/transition/Transition;->びぐびあび:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_21

    .line 2
    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_11
    if-ge v1, v0, :cond_21

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1, p2}, Landroidx/transition/Transition;->びえぁぜい(J)Landroidx/transition/Transition;

    add-int/lit8 v1, v1, 0x1

    goto :goto_11

    :cond_21
    return-object p0
.end method

.method public けときぜと(I)Landroidx/transition/Transition;
    .registers 3

    if-ltz p1, :cond_14

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_b

    goto :goto_14

    :cond_b
    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/transition/Transition;

    return-object p1

    :cond_14
    :goto_14
    const/4 p1, 0x0

    return-object p1
.end method

.method public げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/transition/Transition;->げつ〴ぬぐ(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    return-object p0
.end method

.method public じぜこほぱ(Lづざかべべ/は〲ぱなで/ぶでにく〼〳;)V
    .registers 5

    .line 1
    iput-object p1, p0, Landroidx/transition/Transition;->ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

    .line 2
    iget v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_f
    if-ge v1, v0, :cond_1f

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->じぜこほぱ(Lづざかべべ/は〲ぱなで/ぶでにく〼〳;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_1f
    return-void
.end method

.method public せづっ〸ちね(Ljava/lang/String;)Ljava/lang/String;
    .registers 7

    invoke-super {p0, p1}, Landroidx/transition/Transition;->せづっ〸ちね(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_5
    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3a

    const-string v2, "\n"

    invoke-static {v0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/transition/Transition;->せづっ〸ちね(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_3a
    return-object v0
.end method

.method public てぜきぽく(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3047\u3033\u3032\u303a\u3059\u3063;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3047\u3033\u3032\u303a\u3059\u3063;",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306f\u3032\u3071\u306a\u3067/\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    iget-wide v1, v0, Landroidx/transition/Transition;->くし〴〺ぅ:J

    .line 2
    iget-object v3, v0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_a
    if-ge v4, v3, :cond_3c

    iget-object v5, v0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroidx/transition/Transition;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2f

    iget-boolean v5, v0, Landroidx/transition/TransitionSet;->びえぁぜい:Z

    if-nez v5, :cond_21

    if-nez v4, :cond_2f

    .line 3
    :cond_21
    iget-wide v9, v6, Landroidx/transition/Transition;->くし〴〺ぅ:J

    cmp-long v5, v9, v7

    if-lez v5, :cond_2c

    add-long/2addr v9, v1

    .line 4
    invoke-virtual {v6, v9, v10}, Landroidx/transition/Transition;->ぺづげぺが(J)Landroidx/transition/Transition;

    goto :goto_2f

    :cond_2c
    invoke-virtual {v6, v1, v2}, Landroidx/transition/Transition;->ぺづげぺが(J)Landroidx/transition/Transition;

    :cond_2f
    :goto_2f
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual/range {v6 .. v11}, Landroidx/transition/Transition;->てぜきぽく(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Lづざかべべ/は〲ぱなで/ぇ〳〲〺すっ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_3c
    return-void
.end method

.method public でどあくず(Landroid/view/View;)V
    .registers 5

    invoke-super {p0, p1}, Landroidx/transition/Transition;->でどあくず(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_1a

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->でどあくず(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1a
    return-void
.end method

.method public bridge synthetic どぇぞほだ(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/transition/TransitionSet;->〺でおいここ(Landroid/animation/TimeInterpolator;)Landroidx/transition/TransitionSet;

    return-object p0
.end method

.method public なぎぱいぢぎ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 5

    invoke-super {p0, p1}, Landroidx/transition/Transition;->なぎぱいぢぎ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_1a

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->なぎぱいぢぎ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1a
    return-void
.end method

.method public なぶひせが(Landroidx/transition/Transition$くし〴〺ぅ;)V
    .registers 5

    .line 1
    iput-object p1, p0, Landroidx/transition/Transition;->ざっざへづ:Landroidx/transition/Transition$くし〴〺ぅ;

    .line 2
    iget v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_f
    if-ge v1, v0, :cond_1f

    iget-object v2, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->なぶひせが(Landroidx/transition/Transition$くし〴〺ぅ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_1f
    return-void
.end method

.method public bridge synthetic びえぁぜい(J)Landroidx/transition/Transition;
    .registers 3

    invoke-virtual {p0, p1, p2}, Landroidx/transition/TransitionSet;->おかぷせ〱(J)Landroidx/transition/TransitionSet;

    return-object p0
.end method

.method public びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 5

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2b

    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroidx/transition/Transition;->ごづごきえ(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    iget-object v2, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_2b
    return-void
.end method

.method public ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/transition/Transition;->ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    return-object p0
.end method

.method public ぷぞてのほき(Landroidx/transition/Transition;)Landroidx/transition/TransitionSet;
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/transition/TransitionSet;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, Landroidx/transition/Transition;->いいにぽつ:Landroidx/transition/TransitionSet;

    .line 2
    iget-wide v0, p0, Landroidx/transition/Transition;->びぐびあび:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_12

    invoke-virtual {p1, v0, v1}, Landroidx/transition/Transition;->びえぁぜい(J)Landroidx/transition/Transition;

    :cond_12
    iget v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1d

    .line 3
    iget-object v0, p0, Landroidx/transition/Transition;->づざかべべ:Landroid/animation/TimeInterpolator;

    .line 4
    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->どぇぞほだ(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    :cond_1d
    iget v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_28

    .line 5
    iget-object v0, p0, Landroidx/transition/Transition;->ごづごきえ:Lづざかべべ/は〲ぱなで/ぶでにく〼〳;

    .line 6
    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->じぜこほぱ(Lづざかべべ/は〲ぱなで/ぶでにく〼〳;)V

    :cond_28
    iget v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_33

    .line 7
    iget-object v0, p0, Landroidx/transition/Transition;->でどあくず:Landroidx/transition/PathMotion;

    .line 8
    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->ぅみぱぎぎ(Landroidx/transition/PathMotion;)V

    :cond_33
    iget v0, p0, Landroidx/transition/TransitionSet;->ぅみぱぎぎ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3e

    .line 9
    iget-object v0, p0, Landroidx/transition/Transition;->ざっざへづ:Landroidx/transition/Transition$くし〴〺ぅ;

    .line 10
    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->なぶひせが(Landroidx/transition/Transition$くし〴〺ぅ;)V

    :cond_3e
    return-object p0
.end method

.method public ぺづげぺが(J)Landroidx/transition/Transition;
    .registers 3

    .line 1
    iput-wide p1, p0, Landroidx/transition/Transition;->くし〴〺ぅ:J

    return-object p0
.end method
