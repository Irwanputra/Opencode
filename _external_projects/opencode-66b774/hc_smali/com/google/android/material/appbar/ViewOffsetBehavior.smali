.class public Lcom/google/android/material/appbar/ViewOffsetBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->〺つふすそ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public ぅみぱぎぎ(I)Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->〺つふすそ(I)Z

    move-result p1

    return p1

    :cond_9
    iput p1, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->〺つふすそ:I

    const/4 p1, 0x0

    return p1
.end method

.method public どぇぞほだ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)V"
        }
    .end annotation

    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぶでにく〼〳(Landroid/view/View;I)V

    return-void
.end method

.method public なぶひせが()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    if-eqz v0, :cond_7

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->びぐびあび:I

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return v0
.end method

.method public ぺふねづ〺(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/appbar/ViewOffsetBehavior;->どぇぞほだ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    iget-object p1, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    if-nez p1, :cond_e

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    invoke-direct {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    :cond_e
    iget-object p1, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    .line 1
    iget-object p2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    iput p2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->〺つふすそ:I

    iget-object p2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result p2

    iput p2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->くし〴〺ぅ:I

    .line 2
    iget-object p1, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ()V

    iget p1, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->〺つふすそ:I

    const/4 p2, 0x0

    if-eqz p1, :cond_31

    iget-object p3, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    invoke-virtual {p3, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->〺つふすそ(I)Z

    iput p2, p0, Lcom/google/android/material/appbar/ViewOffsetBehavior;->〺つふすそ:I

    :cond_31
    const/4 p1, 0x1

    return p1
.end method
