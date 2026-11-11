.class public Lteam/dev/epro/apkcustom/widgets/SnackBarBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "Lcom/github/clans/fab/FloatingActionMenu;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>()V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)V
    .registers 4

    check-cast p2, Lcom/github/clans/fab/FloatingActionMenu;

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getBottom()I

    move-result p1

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getBottom()I

    move-result p3

    sub-int/2addr p1, p3

    const/4 p3, 0x0

    invoke-static {p3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->setTranslationY(F)V

    return-void
.end method

.method public ぁごぐすすぃ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .registers 4

    check-cast p2, Lcom/github/clans/fab/FloatingActionMenu;

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getTranslationY()F

    move-result p1

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    int-to-float p3, p3

    sub-float/2addr p1, p3

    const/4 p3, 0x0

    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->setTranslationY(F)V

    const/4 p1, 0x0

    return p1
.end method

.method public なぶひせが(Landroid/view/View;)Z
    .registers 2

    instance-of p1, p1, Lcom/google/android/material/snackbar/Snackbar$SnackbarLayout;

    return p1
.end method

.method public bridge synthetic びぐびあび(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .registers 4

    check-cast p2, Lcom/github/clans/fab/FloatingActionMenu;

    invoke-virtual {p0, p3}, Lteam/dev/epro/apkcustom/widgets/SnackBarBehavior;->なぶひせが(Landroid/view/View;)Z

    move-result p1

    return p1
.end method
