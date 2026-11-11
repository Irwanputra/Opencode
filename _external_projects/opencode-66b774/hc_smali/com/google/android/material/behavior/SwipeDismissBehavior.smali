.class public Lcom/google/android/material/behavior/SwipeDismissBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;
    }
.end annotation

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
.field public 〺つふすそ:Z

.field public final ぁごぐすすぃ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

.field public づざかべべ:F

.field public なぎぱいぢぎ:F

.field public びぐびあび:F


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->くし〴〺ぅ:I

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->びぐびあび:F

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->づざかべべ:F

    iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->なぎぱいぢぎ:F

    new-instance v0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;-><init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;)V

    iput-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->ぁごぐすすぃ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    return-void
.end method

.method public static どぇぞほだ(FFF)F
    .registers 3

    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {p0, p2}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public いいにぽつ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->〺つふすそ:Z

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_13

    const/4 p2, 0x1

    if-eq v1, p2, :cond_10

    const/4 p2, 0x3

    if-eq v1, p2, :cond_10

    goto :goto_23

    :cond_10
    iput-boolean v2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->〺つふすそ:Z

    goto :goto_23

    :cond_13
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1, p2, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ(Landroid/view/View;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->〺つふすそ:Z

    :goto_23
    if-eqz v0, :cond_3d

    .line 1
    iget-object p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->げつ〴ぬぐ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-nez p2, :cond_36

    iget-object p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->ぁごぐすすぃ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    .line 2
    new-instance v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;)V

    .line 3
    iput-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->げつ〴ぬぐ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 4
    :cond_36
    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->げつ〴ぬぐ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉ〲なぱぽた(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_3d
    return v2
.end method

.method public なぶひせが(Landroid/view/View;)Z
    .registers 2

    const/4 p1, 0x1

    return p1
.end method

.method public びえぁぜい(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->げつ〴ぬぐ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-eqz p1, :cond_9

    invoke-virtual {p1, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺(Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1

    :cond_9
    const/4 p1, 0x0

    return p1
.end method

.method public ぺふねづ〺(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)Z"
        }
    .end annotation

    invoke-static {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->へぬ〴づぞ(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_20

    const/4 p1, 0x1

    invoke-static {p2, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    const/high16 p1, 0x100000

    .line 1
    invoke-static {p2, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    invoke-virtual {p0, p2}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->なぶひせが(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->てぜきぽく:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    const/4 p3, 0x0

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;-><init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;)V

    invoke-static {p2, p1, p3, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->せづっ〸ちね(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;)V

    :cond_20
    const/4 p1, 0x0

    return p1
.end method
