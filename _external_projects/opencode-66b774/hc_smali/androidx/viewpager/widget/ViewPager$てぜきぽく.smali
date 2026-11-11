.class public Landroidx/viewpager/widget/ViewPager$てぜきぽく;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3066\u305c\u304d\u307d\u304f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 5

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    iget-boolean v0, p1, Landroidx/viewpager/widget/ViewPager$LayoutParams;->げつ〴ぬぐ:Z

    iget-boolean v1, p2, Landroidx/viewpager/widget/ViewPager$LayoutParams;->げつ〴ぬぐ:Z

    if-eq v0, v1, :cond_1c

    if-eqz v0, :cond_1a

    const/4 p1, 0x1

    goto :goto_21

    :cond_1a
    const/4 p1, -0x1

    goto :goto_21

    :cond_1c
    iget p1, p1, Landroidx/viewpager/widget/ViewPager$LayoutParams;->づざかべべ:I

    iget p2, p2, Landroidx/viewpager/widget/ViewPager$LayoutParams;->づざかべべ:I

    sub-int/2addr p1, p2

    :goto_21
    return p1
.end method
