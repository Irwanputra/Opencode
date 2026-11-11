.class public Landroidx/coordinatorlayout/widget/CoordinatorLayout$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぅみぱぎぎ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout;


# direct methods
.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .registers 2

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 7

    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 1
    iget-object v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-static {v0, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぉ〲なぱぽた(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_58

    iput-object p2, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぇぬぎばつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_16

    const/4 v0, 0x1

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    :goto_17
    iput-boolean v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぉざぅち〻:Z

    if-nez v0, :cond_22

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_22

    goto :goto_23

    :cond_22
    const/4 v1, 0x0

    :goto_23
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    .line 2
    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〳ぜぞぜべっ()Z

    move-result v0

    if-eqz v0, :cond_2d

    goto :goto_55

    :cond_2d
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :goto_31
    if-ge v2, v0, :cond_55

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_52

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 3
    iget-object v1, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v1, :cond_52

    .line 4
    invoke-virtual {v1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->づざかべべ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object p2

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〳ぜぞぜべっ()Z

    move-result v1

    if-eqz v1, :cond_52

    goto :goto_55

    :cond_52
    add-int/lit8 v2, v2, 0x1

    goto :goto_31

    .line 5
    :cond_55
    :goto_55
    invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_58
    return-object p2
.end method
