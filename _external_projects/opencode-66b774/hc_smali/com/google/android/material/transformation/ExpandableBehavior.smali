.class public abstract Lcom/google/android/material/transformation/ExpandableBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public げつ〴ぬぐ:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->げつ〴ぬぐ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->げつ〴ぬぐ:I

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .registers 5

    check-cast p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇ〳〲〺すっ/げつ〴ぬぐ;

    invoke-interface {p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇ〳〲〺すっ/げつ〴ぬぐ;->げつ〴ぬぐ()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/transformation/ExpandableBehavior;->なぶひせが(Z)Z

    move-result p1

    if-eqz p1, :cond_24

    invoke-interface {p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇ〳〲〺すっ/げつ〴ぬぐ;->げつ〴ぬぐ()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_15

    const/4 p1, 0x1

    goto :goto_16

    :cond_15
    const/4 p1, 0x2

    :goto_16
    iput p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->げつ〴ぬぐ:I

    move-object p1, p3

    check-cast p1, Landroid/view/View;

    invoke-interface {p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇ〳〲〺すっ/げつ〴ぬぐ;->げつ〴ぬぐ()Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/material/transformation/ExpandableBehavior;->どぇぞほだ(Landroid/view/View;Landroid/view/View;ZZ)Z

    move-result p1

    return p1

    :cond_24
    const/4 p1, 0x0

    return p1
.end method

.method public abstract どぇぞほだ(Landroid/view/View;Landroid/view/View;ZZ)Z
.end method

.method public final なぶひせが(Z)Z
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_d

    iget p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->げつ〴ぬぐ:I

    if-eqz p1, :cond_b

    const/4 v2, 0x2

    if-ne p1, v2, :cond_c

    :cond_b
    const/4 v0, 0x1

    :cond_c
    return v0

    :cond_d
    iget p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->げつ〴ぬぐ:I

    if-ne p1, v1, :cond_12

    const/4 v0, 0x1

    :cond_12
    return v0
.end method

.method public ぺふねづ〺(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .registers 9

    invoke-static {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result p3

    const/4 v0, 0x0

    if-nez p3, :cond_48

    .line 1
    invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->おぐぴう〸ず(Landroid/view/View;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_10
    if-ge v2, v1, :cond_24

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {p0, p1, p2, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->びぐびあび(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_21

    check-cast v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇ〳〲〺すっ/げつ〴ぬぐ;

    goto :goto_25

    :cond_21
    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_24
    const/4 v3, 0x0

    :goto_25
    if-eqz v3, :cond_48

    .line 2
    invoke-interface {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇ〳〲〺すっ/げつ〴ぬぐ;->げつ〴ぬぐ()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/transformation/ExpandableBehavior;->なぶひせが(Z)Z

    move-result p1

    if-eqz p1, :cond_48

    invoke-interface {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇ〳〲〺すっ/げつ〴ぬぐ;->げつ〴ぬぐ()Z

    move-result p1

    if-eqz p1, :cond_39

    const/4 p1, 0x1

    goto :goto_3a

    :cond_39
    const/4 p1, 0x2

    :goto_3a
    iput p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->げつ〴ぬぐ:I

    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p3

    new-instance v1, Lcom/google/android/material/transformation/ExpandableBehavior$げつ〴ぬぐ;

    invoke-direct {v1, p0, p2, p1, v3}, Lcom/google/android/material/transformation/ExpandableBehavior$げつ〴ぬぐ;-><init>(Lcom/google/android/material/transformation/ExpandableBehavior;Landroid/view/View;ILなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇ〳〲〺すっ/げつ〴ぬぐ;)V

    invoke-virtual {p3, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_48
    return v0
.end method
